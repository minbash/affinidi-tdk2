/*
 * CredentialIssuanceService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.affinidi.tdk.credential.issuance.client.apis;

import com.fasterxml.jackson.core.type.TypeReference;

import com.affinidi.tdk.credential.issuance.client.ApiException;
import com.affinidi.tdk.credential.issuance.client.ApiClient;
import com.affinidi.tdk.credential.issuance.client.BaseApi;
import com.affinidi.tdk.credential.issuance.client.Configuration;
import com.affinidi.tdk.credential.issuance.client.Pair;

import com.affinidi.tdk.credential.issuance.client.models.CreateCredentialInput;
import com.affinidi.tdk.credential.issuance.client.models.CredentialResponse;
import com.affinidi.tdk.credential.issuance.client.models.GenerateCredentials400Response;
import com.affinidi.tdk.credential.issuance.client.models.InvalidJwtTokenError;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:21:17.954698072Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CredentialsApi extends BaseApi {

  public CredentialsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public CredentialsApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * Issue credential for end user upon presentation a valid access token. Since we don&#39;t immediate issue credential It&#39;s expected to return &#x60;transaction_id&#x60; and use this &#x60;transaction_id&#x60; to get the deferred credentials
   * @param projectId Affinidi project id (required)
   * @param createCredentialInput Request body to issue credentials (required)
   * @return CredentialResponse
   * @throws ApiException if fails to make API call
   */
  public CredentialResponse generateCredentials(String projectId, CreateCredentialInput createCredentialInput) throws ApiException {
    return this.generateCredentials(projectId, createCredentialInput, Collections.emptyMap());
  }


  /**
   * 
   * Issue credential for end user upon presentation a valid access token. Since we don&#39;t immediate issue credential It&#39;s expected to return &#x60;transaction_id&#x60; and use this &#x60;transaction_id&#x60; to get the deferred credentials
   * @param projectId Affinidi project id (required)
   * @param createCredentialInput Request body to issue credentials (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CredentialResponse
   * @throws ApiException if fails to make API call
   */
  public CredentialResponse generateCredentials(String projectId, CreateCredentialInput createCredentialInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createCredentialInput;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling generateCredentials");
    }
    
    // verify the required parameter 'createCredentialInput' is set
    if (createCredentialInput == null) {
      throw new ApiException(400, "Missing the required parameter 'createCredentialInput' when calling generateCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{projectId}/credential"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    TypeReference<CredentialResponse> localVarReturnType = new TypeReference<CredentialResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
