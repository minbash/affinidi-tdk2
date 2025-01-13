/*
 * OidcVpAdapterBackend
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.login.configuration.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * OAuth2Token
 */
@JsonPropertyOrder({
  OAuth2Token.JSON_PROPERTY_ACCESS_TOKEN,
  OAuth2Token.JSON_PROPERTY_EXPIRES_IN,
  OAuth2Token.JSON_PROPERTY_ID_TOKEN,
  OAuth2Token.JSON_PROPERTY_REFRESH_TOKEN,
  OAuth2Token.JSON_PROPERTY_SCOPE,
  OAuth2Token.JSON_PROPERTY_TOKEN_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:20:45.285025567Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OAuth2Token {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  private String accessToken;

  public static final String JSON_PROPERTY_EXPIRES_IN = "expires_in";
  private Integer expiresIn;

  public static final String JSON_PROPERTY_ID_TOKEN = "id_token";
  private Integer idToken;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refresh_token";
  private String refreshToken;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TOKEN_TYPE = "token_type";
  private String tokenType;

  public OAuth2Token() {
  }

  public OAuth2Token accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

  /**
   * The access token issued by the authorization server. 
   * @return accessToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessToken() {
    return accessToken;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OAuth2Token expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * The lifetime in seconds of the access token.  For example, the value \&quot;3600\&quot; denotes that the access  token will expire in one hour from the time the response was generated. 
   * @return expiresIn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiresIn() {
    return expiresIn;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OAuth2Token idToken(Integer idToken) {
    
    this.idToken = idToken;
    return this;
  }

  /**
   * To retrieve a refresh token request the id_token scope. 
   * @return idToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdToken() {
    return idToken;
  }


  @JsonProperty(JSON_PROPERTY_ID_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdToken(Integer idToken) {
    this.idToken = idToken;
  }

  public OAuth2Token refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * The refresh token, which can be used to obtain new access tokens. To retrieve it add the scope \&quot;offline\&quot; to your access token request. 
   * @return refreshToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OAuth2Token scope(String scope) {
    
    this.scope = scope;
    return this;
  }

  /**
   * The scope of the access token 
   * @return scope
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(String scope) {
    this.scope = scope;
  }

  public OAuth2Token tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

  /**
   * The type of the token issued 
   * @return tokenType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenType() {
    return tokenType;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Token oauth2Token = (OAuth2Token) o;
    return Objects.equals(this.accessToken, oauth2Token.accessToken) &&
        Objects.equals(this.expiresIn, oauth2Token.expiresIn) &&
        Objects.equals(this.idToken, oauth2Token.idToken) &&
        Objects.equals(this.refreshToken, oauth2Token.refreshToken) &&
        Objects.equals(this.scope, oauth2Token.scope) &&
        Objects.equals(this.tokenType, oauth2Token.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, idToken, refreshToken, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Token {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `access_token` to the URL query string
    if (getAccessToken() != null) {
      try {
        joiner.add(String.format("%saccess_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expires_in` to the URL query string
    if (getExpiresIn() != null) {
      try {
        joiner.add(String.format("%sexpires_in%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresIn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id_token` to the URL query string
    if (getIdToken() != null) {
      try {
        joiner.add(String.format("%sid_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refresh_token` to the URL query string
    if (getRefreshToken() != null) {
      try {
        joiner.add(String.format("%srefresh_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefreshToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      try {
        joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScope()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token_type` to the URL query string
    if (getTokenType() != null) {
      try {
        joiner.add(String.format("%stoken_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

