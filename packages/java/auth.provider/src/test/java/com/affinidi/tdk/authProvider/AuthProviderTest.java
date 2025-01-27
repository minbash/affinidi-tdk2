package com.affinidi.tdk.authProvider;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.affinidi.tdk.authProvider.exception.AccessTokenGenerationException;
import com.affinidi.tdk.authProvider.exception.ConfigurationException;
import com.affinidi.tdk.authProvider.exception.InvalidPublicKeyException;
import com.affinidi.tdk.authProvider.exception.JwtGenerationException;
import com.affinidi.tdk.authProvider.exception.PSTGenerationException;
import com.affinidi.tdk.authProvider.helper.AuthProviderConstants;
import com.affinidi.tdk.authProvider.helper.JwtUtil;
import com.affinidi.tdk.authProvider.types.IotaJwtOutput;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.givenThat;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import com.github.tomakehurst.wiremock.http.Fault;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;

public class AuthProviderTest {
    @Nested
    @DisplayName("setting values to the authProvider configurations")
    class ConfigurationsTest {
        @Test
        void testAuthProviderConfiguration() throws Exception {
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey("test-key").build();

            assertNotNull(provider);
            assertEquals("test-project", provider.getProjectId());
            assertEquals("test-token", provider.getTokenId());
            assertEquals("test-key", provider.getPrivateKey());
        }
    }

    @WireMockTest(proxyMode = true)
    @Nested
    @DisplayName("fetchProjectScopedToken method")
    class FetchProjectScopedTokenTest {
        @ParameterizedTest
        @DisplayName("given an invalid private-key and a empty or non-empty passphrase, the it throws")
        @EmptySource
        @ValueSource(strings = { "complicated-word" })
        void givenInvalidPrivateKey_thenThrows(String phrase) {
            Exception exception = assertThrows(PSTGenerationException.class, () -> {
                AuthProvider provider = new AuthProvider.Configurations().projectId("test-project")
                        .tokenId("test-token").privateKey("invalid-key").passphrase(phrase).build();
                provider.fetchProjectScopedToken();
            });

            assertTrue(exception.getMessage().startsWith("Could not derive private key out of the configurations."));
        }

        @Test
        @DisplayName("given the failing api-key endpoint call and failing to sign the payload, then it throws")
        void givenInvalidApiGatewayUrl_thenThrows() {
            // arrange
            String mockErrorMessage = "mock-exception-message";
            try (MockedStatic<JwtUtil> utilsMock = Mockito.mockStatic(JwtUtil.class)) {
                utilsMock.when(() -> JwtUtil.fetchPublicKey(any())).thenThrow(InvalidPublicKeyException.class);
                utilsMock.when(() -> JwtUtil.signPayload(any(), any(), any(), any(), any()))
                        .thenThrow(new JwtGenerationException(mockErrorMessage));

                // act
                Exception exception = assertThrows(PSTGenerationException.class, () -> {
                    AuthProvider provider = new AuthProvider.Configurations().projectId("test-project")
                            .tokenId("test-token").privateKey("test-key").build();
                    provider.fetchProjectScopedToken();
                });

                // assert
                assertEquals(mockErrorMessage, exception.getMessage());
            }
        }

        @Test
        @DisplayName("given an invalid private-key, when the api-key endpoint returns a response and it fails to sign the payload, then it throws")
        void givenInvalidPrivateKey_AndApiKeyResponse_thenThrows(WireMockRuntimeInfo wmRuntimeInfo)
                throws IOException, URISyntaxException {
            // arrange
            String apiUrl = wmRuntimeInfo.getHttpBaseUrl();
            URI uri = new URI(apiUrl);
            String host = uri.getHost();
            String apiKeyJson = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/api-key-response.json")));
            givenThat(
                    get(AuthProviderConstants.PUBLIC_KEY_PATH).withHost(equalTo(host)).willReturn(okJson(apiKeyJson)));

            // act
            Exception exception = assertThrows(PSTGenerationException.class, () -> {
                AuthProvider provider = new AuthProvider.Configurations().projectId("test-project")
                        .tokenId("test-token").privateKey("test-key").passphrase("").build();
                provider.setApiGatewayUrl(apiUrl);
                provider.setProjectScopeToken("test-project-scope-token");
                provider.fetchProjectScopedToken();
            });

            // assert
            assertTrue(exception.getMessage()
                    .startsWith(AuthProviderConstants.COULD_NOT_DERIVE_PRIVATE_KEY_ERROR_MSG + " Exception : "));
        }

        @Test
        @DisplayName("happy path: given a valid private-key, when all the endponts succesfully returns 200, then it returns a JWT")
        void givenValidApiKeyResponse_AndSuccessfulApiCalls_thenReturnsAJWT(WireMockRuntimeInfo wmRuntimeInfo)
                throws IOException, URISyntaxException, ConfigurationException {
            // arrange
            String apiUrl = wmRuntimeInfo.getHttpBaseUrl();
            URI uri = new URI(apiUrl);
            String host = uri.getHost();
            String fakeTokenUrl = apiUrl + "/auth-token";
            String apiKeyJson = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/api-key-response.json")));
            String testPrivateKey = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/test-private-key.txt")));
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey(testPrivateKey).passphrase("").build();
            provider.setApiGatewayUrl(apiUrl);
            provider.setTokenEndPoint(fakeTokenUrl);
            givenThat(
                    get(AuthProviderConstants.PUBLIC_KEY_PATH).withHost(equalTo(host)).willReturn(okJson(apiKeyJson)));
            givenThat(post("/auth-token").withHost(equalTo(host))
                    .willReturn(okJson("{access_token: \"some-access-token\"}")));
            givenThat(post(AuthProviderConstants.PROJECT_SCOPE_TOKEN_API_PATH).withHost(equalTo(host))
                    .willReturn(okJson("{accessToken: \"some-project-scope-token\"}")));

            // act and assert
            String token = assertDoesNotThrow(() -> provider.fetchProjectScopedToken());
            assertEquals("some-project-scope-token", token);
        }
    }

    @WireMockTest(proxyMode = true)
    @Nested
    @DisplayName("shouldRefreshToken method")
    class ShouldRefreshTokenTest {
        @Test
        @DisplayName("given no project-token, then it returns true")
        void givenNoProjectToken_thenReturnsTrue() throws ConfigurationException {
            // arrange
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey("test-key").build();

            // act and assert
            assertTrue(provider.shouldRefreshToken());
        }

        @Test
        @DisplayName("given a project-token, when the api-key endpoint call fails, then it returns true")
        void givenProjectToken_whenTheApiKeyEndpointCallFails_thenReturnsTrue(WireMockRuntimeInfo wmRuntimeInfo)
                throws ConfigurationException, URISyntaxException {
            // arrange
            String apiUrl = wmRuntimeInfo.getHttpBaseUrl();
            URI uri = new URI(apiUrl);
            String host = uri.getHost();
            givenThat(get(AuthProviderConstants.PUBLIC_KEY_PATH).withHost(equalTo(host))
                    .willReturn(aResponse().withFault(Fault.MALFORMED_RESPONSE_CHUNK)));

            // act
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey("test-key").passphrase("").build();
            provider.setApiGatewayUrl(apiUrl);
            provider.setProjectScopeToken("test-project-scope-token");

            // assert
            assertTrue(provider.shouldRefreshToken());
        }

        @Test
        @DisplayName("given an invalid project-token, when the api-key endpoint call succeeds, then it returns true")
        void givenInvalidPrivateKey_WhenTheApiKeyEndpointCallSucceeds_thenReturnsTrue(WireMockRuntimeInfo wmRuntimeInfo)
                throws URISyntaxException, IOException, ConfigurationException {
            // arrange
            String apiUrl = wmRuntimeInfo.getHttpBaseUrl();
            URI uri = new URI(apiUrl);
            String host = uri.getHost();
            String apiKeyJson = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/api-key-response.json")));
            givenThat(
                    get(AuthProviderConstants.PUBLIC_KEY_PATH).withHost(equalTo(host)).willReturn(okJson(apiKeyJson)));
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey("test-key").passphrase("").build();
            provider.setApiGatewayUrl(apiUrl);
            provider.setProjectScopeToken("test-project-scope-token");

            // act and assert
            assertTrue(provider.shouldRefreshToken());
        }
    }

    @WireMockTest(proxyMode = true)
    @Nested
    @DisplayName("getUserAccessToken method")
    class GetUserAccessTokenTest {
        @Test
        @DisplayName("given an invalid private-key, then it throws")
        void givenInvalidPrivateKey_thenThrows() {
            Exception exception = assertThrows(AccessTokenGenerationException.class, () -> {
                AuthProvider provider = new AuthProvider.Configurations().projectId("test-project")
                        .tokenId("test-token").privateKey("invalid-key").passphrase("").build();
                provider.getUserAccessToken();
            });

            assertTrue(exception.getMessage().startsWith(AuthProviderConstants.COULD_NOT_DERIVE_PRIVATE_KEY_ERROR_MSG));
        }

        @Test
        @DisplayName("given a valid private-key, when the token-endpoint call fails, then it throws")
        void givenValidPrivateKey_WhenTheTokenEndpointCallFails_thenThrows(WireMockRuntimeInfo wmRuntimeInfo)
                throws URISyntaxException, IOException, ConfigurationException {
            // arrange
            String apiUrl = wmRuntimeInfo.getHttpBaseUrl();
            URI uri = new URI(apiUrl);
            String host = uri.getHost();
            String fakeTokenUrl = apiUrl + "/auth-token";
            String testPrivateKey = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/test-private-key.txt")));
            givenThat(post("/auth-token").withHost(equalTo(host))
                    // .willReturn(aResponse().withFault(Fault.MALFORMED_RESPONSE_CHUNK)));
                    .willReturn(aResponse().withStatus(400)));
            Exception exception = assertThrows(AccessTokenGenerationException.class, () -> {
                AuthProvider provider = new AuthProvider.Configurations().projectId("test-project")
                        .tokenId("test-token").privateKey(testPrivateKey).passphrase("").build();
                provider.setTokenEndPoint(fakeTokenUrl);
                provider.getUserAccessToken();
            });

            // assert
            assertTrue(exception.getMessage().contains("Could not retrieve access_token from the token end point"));
        }

        @Test
        @DisplayName("given a valid private-key, when the token-endpoint call succeeds, then it returns a JWT")
        void givenValidPrivateKey_WhenTheTokenEndpointCallSucceeds_thenReturnsAJWT(WireMockRuntimeInfo wmRuntimeInfo)
                throws URISyntaxException, IOException, ConfigurationException {
            // arrange
            String apiUrl = wmRuntimeInfo.getHttpBaseUrl();
            URI uri = new URI(apiUrl);
            String host = uri.getHost();
            String fakeTokenUrl = apiUrl + "/auth-token";
            String testPrivateKey = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/test-private-key.txt")));
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey(testPrivateKey).passphrase("").build();
            provider.setTokenEndPoint(fakeTokenUrl);
            givenThat(post("/auth-token").withHost(equalTo(host))
                    .willReturn(okJson("{access_token: \"some-access-token\"}")));

            // act and assert
            String token = assertDoesNotThrow(() -> provider.getUserAccessToken());
            assertEquals("some-access-token", token);
        }

        @Test
        @DisplayName("given a valid encrypted private-key, when the token-endpoint call succeeds, then it returns a JWT")
        void givenValidEncryptedPrivateKey_WhenTheTokenEndpointCallSucceeds_thenReturnsAJWT(
                WireMockRuntimeInfo wmRuntimeInfo) throws URISyntaxException, IOException, ConfigurationException {
            // arrange
            String apiUrl = wmRuntimeInfo.getHttpBaseUrl();
            URI uri = new URI(apiUrl);
            String host = uri.getHost();
            String fakeTokenUrl = apiUrl + "/auth-token";
            String testPrivateKey = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/test-encrypted-private-key.txt")));
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey(testPrivateKey).passphrase("test-pass-phrase").build();
            provider.setTokenEndPoint(fakeTokenUrl);
            givenThat(post("/auth-token").withHost(equalTo(host))
                    .willReturn(okJson("{access_token: \"some-access-token\"}")));

            // act and assert
            String token = assertDoesNotThrow(() -> provider.getUserAccessToken());
            assertEquals("some-access-token", token);
        }
    }

    @Nested
    @DisplayName("signIotaJwt method")
    class SignIotaJwtTest {
        @Test
        @DisplayName("given an invalid private-key, then it throws")
        void givenInvalidPrivateKey_thenThrows() {
            Exception exception = assertThrows(JwtGenerationException.class, () -> {
                AuthProvider provider = new AuthProvider.Configurations().projectId("test-project")
                        .tokenId("test-token").privateKey("invalid-key").passphrase("").build();
                provider.signIotaJwt("test-iota-config-id", "test-did", "test-session-id");
            });
            assertTrue(exception.getMessage().startsWith(AuthProviderConstants.COULD_NOT_DERIVE_PRIVATE_KEY_ERROR_MSG));
        }

        @Test
        @DisplayName("given a valid private-key, then it returns a IotaJwtOutput")
        void givenValidPrivateKey_thenReturnsIotaJwtOutput() throws ConfigurationException, IOException {
            // arrange
            String testPrivateKey = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/test-private-key.txt")));
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey(testPrivateKey).passphrase("").build();

            // act and assert
            IotaJwtOutput iotaJwtOutput = assertDoesNotThrow(
                    () -> provider.signIotaJwt("test-iota-config-id", "test-did", "test-session-id"));
            assertNotNull(iotaJwtOutput);
            assertNotNull(iotaJwtOutput.getIotaSessionId());
            assertNotNull(iotaJwtOutput.getIotaJwt());
        }

        @Test
        @DisplayName("given a valid encrypted private-key, then it returns a IotaJwtOutput")
        void givenValidEncryptedPrivateKey_thenReturnsIotaJwtOutput() throws ConfigurationException, IOException {
            // arrange
            String testPrivateKey = new String(Files.readAllBytes(
                    Paths.get("src/test/java/com/affinidi/tdk/authProvider/resources/test-encrypted-private-key.txt")));
            AuthProvider provider = new AuthProvider.Configurations().projectId("test-project").tokenId("test-token")
                    .privateKey(testPrivateKey).passphrase("test-pass-phrase").build();

            // act and assert
            IotaJwtOutput iotaJwtOutput = assertDoesNotThrow(
                    () -> provider.signIotaJwt("test-iota-config-id", "test-did", "test-session-id"));
            assertNotNull(iotaJwtOutput);
            assertNotNull(iotaJwtOutput.getIotaSessionId());
            assertNotNull(iotaJwtOutput.getIotaJwt());
        }
    }
}
