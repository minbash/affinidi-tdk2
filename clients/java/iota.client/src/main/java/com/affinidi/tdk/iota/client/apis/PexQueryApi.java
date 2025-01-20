/*
 * IotaService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.affinidi.tdk.iota.client.apis;

import com.fasterxml.jackson.core.type.TypeReference;

import com.affinidi.tdk.iota.client.ApiException;
import com.affinidi.tdk.iota.client.ApiClient;
import com.affinidi.tdk.iota.client.BaseApi;
import com.affinidi.tdk.iota.client.Configuration;
import com.affinidi.tdk.iota.client.Pair;

import com.affinidi.tdk.iota.client.models.AlreadyExistsError;
import com.affinidi.tdk.iota.client.models.CreatePexQueryInput;
import com.affinidi.tdk.iota.client.models.DeletePexQueriesInput;
import com.affinidi.tdk.iota.client.models.InvalidParameterError;
import com.affinidi.tdk.iota.client.models.ListPexQueriesOK;
import com.affinidi.tdk.iota.client.models.NotFoundError;
import com.affinidi.tdk.iota.client.models.OperationForbiddenError;
import com.affinidi.tdk.iota.client.models.PexQueryDto;
import com.affinidi.tdk.iota.client.models.ResourceLimitExceededError;
import com.affinidi.tdk.iota.client.models.SavePexQueriesUpdateInput;
import com.affinidi.tdk.iota.client.models.UpdatePexQueryInput;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class PexQueryApi extends BaseApi {

  public PexQueryApi() {
    super(Configuration.getDefaultApiClient());
  }

  public PexQueryApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * Creates a new Presentation Definition in the configuration to query data.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param createPexQueryInput CreatePexQuery (required)
   * @return PexQueryDto
   * @throws ApiException if fails to make API call
   */
  public PexQueryDto createPexQuery(String configurationId, CreatePexQueryInput createPexQueryInput) throws ApiException {
    return this.createPexQuery(configurationId, createPexQueryInput, Collections.emptyMap());
  }


  /**
   * 
   * Creates a new Presentation Definition in the configuration to query data.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param createPexQueryInput CreatePexQuery (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return PexQueryDto
   * @throws ApiException if fails to make API call
   */
  public PexQueryDto createPexQuery(String configurationId, CreatePexQueryInput createPexQueryInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createPexQueryInput;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling createPexQuery");
    }
    
    // verify the required parameter 'createPexQueryInput' is set
    if (createPexQueryInput == null) {
      throw new ApiException(400, "Missing the required parameter 'createPexQueryInput' when calling createPexQuery");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}/pex-queries"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<PexQueryDto> localVarReturnType = new TypeReference<PexQueryDto>() {};
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

  /**
   * 
   * Deletes all Presentation Definition queries of a configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param deletePexQueriesInput DeletePexQueriesInput (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deletePexQueries(String configurationId, DeletePexQueriesInput deletePexQueriesInput) throws ApiException {
    return this.deletePexQueries(configurationId, deletePexQueriesInput, Collections.emptyMap());
  }


  /**
   * 
   * Deletes all Presentation Definition queries of a configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param deletePexQueriesInput DeletePexQueriesInput (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deletePexQueries(String configurationId, DeletePexQueriesInput deletePexQueriesInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = deletePexQueriesInput;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling deletePexQueries");
    }
    
    // verify the required parameter 'deletePexQueriesInput' is set
    if (deletePexQueriesInput == null) {
      throw new ApiException(400, "Missing the required parameter 'deletePexQueriesInput' when calling deletePexQueries");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}/delete-queries"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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

  /**
   * 
   * Deletes a Presentation Definition in the configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param queryId The ID of the query. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePexQueryById(String configurationId, String queryId) throws ApiException {
    this.deletePexQueryById(configurationId, queryId, Collections.emptyMap());
  }


  /**
   * 
   * Deletes a Presentation Definition in the configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param queryId The ID of the query. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deletePexQueryById(String configurationId, String queryId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling deletePexQueryById");
    }
    
    // verify the required parameter 'queryId' is set
    if (queryId == null) {
      throw new ApiException(400, "Missing the required parameter 'queryId' when calling deletePexQueryById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}/pex-queries/{queryId}"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)))
      .replaceAll("\\{" + "queryId" + "\\}", apiClient.escapeString(apiClient.parameterToString(queryId)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
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
        null
    );
  }

  /**
   * 
   * Retrieves a Presentation Definition in the configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param queryId The ID of the query. (required)
   * @return PexQueryDto
   * @throws ApiException if fails to make API call
   */
  public PexQueryDto getPexQueryById(String configurationId, String queryId) throws ApiException {
    return this.getPexQueryById(configurationId, queryId, Collections.emptyMap());
  }


  /**
   * 
   * Retrieves a Presentation Definition in the configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param queryId The ID of the query. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return PexQueryDto
   * @throws ApiException if fails to make API call
   */
  public PexQueryDto getPexQueryById(String configurationId, String queryId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling getPexQueryById");
    }
    
    // verify the required parameter 'queryId' is set
    if (queryId == null) {
      throw new ApiException(400, "Missing the required parameter 'queryId' when calling getPexQueryById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}/pex-queries/{queryId}"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)))
      .replaceAll("\\{" + "queryId" + "\\}", apiClient.escapeString(apiClient.parameterToString(queryId)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<PexQueryDto> localVarReturnType = new TypeReference<PexQueryDto>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
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

  /**
   * 
   * Lists all Presentation Definitions in the configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param limit Maximum number of records to fetch in a list (optional)
   * @param exclusiveStartKey The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation. (optional)
   * @return ListPexQueriesOK
   * @throws ApiException if fails to make API call
   */
  public ListPexQueriesOK listPexQueries(String configurationId, Integer limit, String exclusiveStartKey) throws ApiException {
    return this.listPexQueries(configurationId, limit, exclusiveStartKey, Collections.emptyMap());
  }


  /**
   * 
   * Lists all Presentation Definitions in the configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param limit Maximum number of records to fetch in a list (optional)
   * @param exclusiveStartKey The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return ListPexQueriesOK
   * @throws ApiException if fails to make API call
   */
  public ListPexQueriesOK listPexQueries(String configurationId, Integer limit, String exclusiveStartKey, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling listPexQueries");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}/pex-queries"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("exclusiveStartKey", exclusiveStartKey));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<ListPexQueriesOK> localVarReturnType = new TypeReference<ListPexQueriesOK>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
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

  /**
   * 
   * Saves all Presentation Definition queries of a configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param savePexQueriesUpdateInput SavePexQueriesInput (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object savePexQueries(String configurationId, SavePexQueriesUpdateInput savePexQueriesUpdateInput) throws ApiException {
    return this.savePexQueries(configurationId, savePexQueriesUpdateInput, Collections.emptyMap());
  }


  /**
   * 
   * Saves all Presentation Definition queries of a configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param savePexQueriesUpdateInput SavePexQueriesInput (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object savePexQueries(String configurationId, SavePexQueriesUpdateInput savePexQueriesUpdateInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = savePexQueriesUpdateInput;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling savePexQueries");
    }
    
    // verify the required parameter 'savePexQueriesUpdateInput' is set
    if (savePexQueriesUpdateInput == null) {
      throw new ApiException(400, "Missing the required parameter 'savePexQueriesUpdateInput' when calling savePexQueries");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}/save-queries"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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

  /**
   * 
   * Updates the Presentation Definition in the configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param queryId The ID of the query. (required)
   * @param updatePexQueryInput UpdatePexQueryById (required)
   * @return PexQueryDto
   * @throws ApiException if fails to make API call
   */
  public PexQueryDto updatePexQueryById(String configurationId, String queryId, UpdatePexQueryInput updatePexQueryInput) throws ApiException {
    return this.updatePexQueryById(configurationId, queryId, updatePexQueryInput, Collections.emptyMap());
  }


  /**
   * 
   * Updates the Presentation Definition in the configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param queryId The ID of the query. (required)
   * @param updatePexQueryInput UpdatePexQueryById (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return PexQueryDto
   * @throws ApiException if fails to make API call
   */
  public PexQueryDto updatePexQueryById(String configurationId, String queryId, UpdatePexQueryInput updatePexQueryInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updatePexQueryInput;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling updatePexQueryById");
    }
    
    // verify the required parameter 'queryId' is set
    if (queryId == null) {
      throw new ApiException(400, "Missing the required parameter 'queryId' when calling updatePexQueryById");
    }
    
    // verify the required parameter 'updatePexQueryInput' is set
    if (updatePexQueryInput == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePexQueryInput' when calling updatePexQueryById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}/pex-queries/{queryId}"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)))
      .replaceAll("\\{" + "queryId" + "\\}", apiClient.escapeString(apiClient.parameterToString(queryId)));

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

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<PexQueryDto> localVarReturnType = new TypeReference<PexQueryDto>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

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
