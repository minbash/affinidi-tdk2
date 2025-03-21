# affinidi_tdk_credential_issuance_client.IssuanceApi

All URIs are relative to *https://apse1.api.affinidi.io/cis*

| Method                                                    | HTTP request                                        | Description |
| --------------------------------------------------------- | --------------------------------------------------- | ----------- |
| [**issuance_state**](IssuanceApi.md#issuance_state)       | **GET** /v1/{projectId}/issuance/state/{issuanceId} |
| [**issue_credentials**](IssuanceApi.md#issue_credentials) | **POST** /v1/{projectId}/credential/issue           |
| [**list_issuance**](IssuanceApi.md#list_issuance)         | **GET** /v1/{projectId}/issuance                    |
| [**start_issuance**](IssuanceApi.md#start_issuance)       | **POST** /v1/{projectId}/issuance/start             |

# **issuance_state**

> IssuanceStateResponse issuance_state(issuance_id, project_id)

Get issuance status

### Example

- Api Key Authentication (ProjectTokenAuth):

```python
import time
import os
import affinidi_tdk_credential_issuance_client
from affinidi_tdk_credential_issuance_client.models.issuance_state_response import IssuanceStateResponse
from affinidi_tdk_credential_issuance_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apse1.api.affinidi.io/cis
# See configuration.py for a list of all supported configuration parameters.
configuration = affinidi_tdk_credential_issuance_client.Configuration(
    host = "https://apse1.api.affinidi.io/cis"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ProjectTokenAuth
configuration.api_key['ProjectTokenAuth'] = os.environ["API_KEY"]

# Configure a hook to auto-refresh API key for your personal access token (PAT), if expired
import affinidi_tdk_auth_provider

stats = {
  apiGatewayUrl,
  keyId,
  passphrase,
  privateKey,
  projectId,
  tokenEndpoint,
  tokenId,
}
authProvider = affinidi_tdk_auth_provider.AuthProvider(stats)
configuration.refresh_api_key_hook = lambda api_client: authProvider.fetch_project_scoped_token()

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ProjectTokenAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with affinidi_tdk_credential_issuance_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = affinidi_tdk_credential_issuance_client.IssuanceApi(api_client)
    issuance_id = 'issuance_id_example' # str |
    project_id = 'project_id_example' # str | Affinidi project id

    try:
        api_response = api_instance.issuance_state(issuance_id, project_id)
        print("The response of IssuanceApi->issuance_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuanceApi->issuance_state: %s\n" % e)
```

### Parameters

| Name            | Type    | Description         | Notes |
| --------------- | ------- | ------------------- | ----- |
| **issuance_id** | **str** |                     |
| **project_id**  | **str** | Affinidi project id |

### Return type

[**IssuanceStateResponse**](IssuanceStateResponse.md)

### Authorization

[ProjectTokenAuth](../README.md#ProjectTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description     | Response headers |
| ----------- | --------------- | ---------------- |
| **200**     | Ok              | -                |
| **400**     | BadRequestError | -                |
| **403**     | ForbiddenError  | -                |
| **404**     | NotFoundError   | -                |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issue_credentials**

> CredentialResponse issue_credentials(project_id, start_issuance_input)

Endpoint to issue credentials directly without following OID4VCI flow

### Example

- Api Key Authentication (ProjectTokenAuth):

```python
import time
import os
import affinidi_tdk_credential_issuance_client
from affinidi_tdk_credential_issuance_client.models.credential_response import CredentialResponse
from affinidi_tdk_credential_issuance_client.models.start_issuance_input import StartIssuanceInput
from affinidi_tdk_credential_issuance_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apse1.api.affinidi.io/cis
# See configuration.py for a list of all supported configuration parameters.
configuration = affinidi_tdk_credential_issuance_client.Configuration(
    host = "https://apse1.api.affinidi.io/cis"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ProjectTokenAuth
configuration.api_key['ProjectTokenAuth'] = os.environ["API_KEY"]

# Configure a hook to auto-refresh API key for your personal access token (PAT), if expired
import affinidi_tdk_auth_provider

stats = {
  apiGatewayUrl,
  keyId,
  passphrase,
  privateKey,
  projectId,
  tokenEndpoint,
  tokenId,
}
authProvider = affinidi_tdk_auth_provider.AuthProvider(stats)
configuration.refresh_api_key_hook = lambda api_client: authProvider.fetch_project_scoped_token()

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ProjectTokenAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with affinidi_tdk_credential_issuance_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = affinidi_tdk_credential_issuance_client.IssuanceApi(api_client)
    project_id = 'project_id_example' # str | Affinidi project id
    start_issuance_input = affinidi_tdk_credential_issuance_client.StartIssuanceInput() # StartIssuanceInput | Request body to start issuance

    try:
        api_response = api_instance.issue_credentials(project_id, start_issuance_input)
        print("The response of IssuanceApi->issue_credentials:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuanceApi->issue_credentials: %s\n" % e)
```

### Parameters

| Name                     | Type                                            | Description                    | Notes |
| ------------------------ | ----------------------------------------------- | ------------------------------ | ----- |
| **project_id**           | **str**                                         | Affinidi project id            |
| **start_issuance_input** | [**StartIssuanceInput**](StartIssuanceInput.md) | Request body to start issuance |

### Return type

[**CredentialResponse**](CredentialResponse.md)

### Authorization

[ProjectTokenAuth](../README.md#ProjectTokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers                                                                                                  |
| ----------- | ----------------- | ----------------------------------------------------------------------------------------------------------------- |
| **200**     | Ok                | _ Access-Control-Allow-Origin - <br> _ Access-Control-Allow-Methods - <br> \* Access-Control-Allow-Headers - <br> |
| **401**     | UnauthorizedError | -                                                                                                                 |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_issuance**

> ListIssuanceResponse list_issuance(project_id)

List all issuances for Project

### Example

- Api Key Authentication (ProjectTokenAuth):

```python
import time
import os
import affinidi_tdk_credential_issuance_client
from affinidi_tdk_credential_issuance_client.models.list_issuance_response import ListIssuanceResponse
from affinidi_tdk_credential_issuance_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apse1.api.affinidi.io/cis
# See configuration.py for a list of all supported configuration parameters.
configuration = affinidi_tdk_credential_issuance_client.Configuration(
    host = "https://apse1.api.affinidi.io/cis"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ProjectTokenAuth
configuration.api_key['ProjectTokenAuth'] = os.environ["API_KEY"]

# Configure a hook to auto-refresh API key for your personal access token (PAT), if expired
import affinidi_tdk_auth_provider

stats = {
  apiGatewayUrl,
  keyId,
  passphrase,
  privateKey,
  projectId,
  tokenEndpoint,
  tokenId,
}
authProvider = affinidi_tdk_auth_provider.AuthProvider(stats)
configuration.refresh_api_key_hook = lambda api_client: authProvider.fetch_project_scoped_token()

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ProjectTokenAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with affinidi_tdk_credential_issuance_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = affinidi_tdk_credential_issuance_client.IssuanceApi(api_client)
    project_id = 'project_id_example' # str | Affinidi project id

    try:
        api_response = api_instance.list_issuance(project_id)
        print("The response of IssuanceApi->list_issuance:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuanceApi->list_issuance: %s\n" % e)
```

### Parameters

| Name           | Type    | Description         | Notes |
| -------------- | ------- | ------------------- | ----- |
| **project_id** | **str** | Affinidi project id |

### Return type

[**ListIssuanceResponse**](ListIssuanceResponse.md)

### Authorization

[ProjectTokenAuth](../README.md#ProjectTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description    | Response headers |
| ----------- | -------------- | ---------------- |
| **200**     | Ok             | -                |
| **403**     | ForbiddenError | -                |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_issuance**

> StartIssuanceResponse start_issuance(project_id, start_issuance_input)

Endpoint used b websites to start the issuance process

### Example

- Api Key Authentication (ProjectTokenAuth):

```python
import time
import os
import affinidi_tdk_credential_issuance_client
from affinidi_tdk_credential_issuance_client.models.start_issuance_input import StartIssuanceInput
from affinidi_tdk_credential_issuance_client.models.start_issuance_response import StartIssuanceResponse
from affinidi_tdk_credential_issuance_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apse1.api.affinidi.io/cis
# See configuration.py for a list of all supported configuration parameters.
configuration = affinidi_tdk_credential_issuance_client.Configuration(
    host = "https://apse1.api.affinidi.io/cis"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ProjectTokenAuth
configuration.api_key['ProjectTokenAuth'] = os.environ["API_KEY"]

# Configure a hook to auto-refresh API key for your personal access token (PAT), if expired
import affinidi_tdk_auth_provider

stats = {
  apiGatewayUrl,
  keyId,
  passphrase,
  privateKey,
  projectId,
  tokenEndpoint,
  tokenId,
}
authProvider = affinidi_tdk_auth_provider.AuthProvider(stats)
configuration.refresh_api_key_hook = lambda api_client: authProvider.fetch_project_scoped_token()

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ProjectTokenAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with affinidi_tdk_credential_issuance_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = affinidi_tdk_credential_issuance_client.IssuanceApi(api_client)
    project_id = 'project_id_example' # str | Affinidi project id
    start_issuance_input = affinidi_tdk_credential_issuance_client.StartIssuanceInput() # StartIssuanceInput | Request body to start issuance

    try:
        api_response = api_instance.start_issuance(project_id, start_issuance_input)
        print("The response of IssuanceApi->start_issuance:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IssuanceApi->start_issuance: %s\n" % e)
```

### Parameters

| Name                     | Type                                            | Description                    | Notes |
| ------------------------ | ----------------------------------------------- | ------------------------------ | ----- |
| **project_id**           | **str**                                         | Affinidi project id            |
| **start_issuance_input** | [**StartIssuanceInput**](StartIssuanceInput.md) | Request body to start issuance |

### Return type

[**StartIssuanceResponse**](StartIssuanceResponse.md)

### Authorization

[ProjectTokenAuth](../README.md#ProjectTokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description     | Response headers |
| ----------- | --------------- | ---------------- |
| **200**     | Ok              | -                |
| **400**     | BadRequestError | -                |
| **403**     | ForbiddenError  | -                |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
