# coding: utf-8

# flake8: noqa
"""
    DcfOrchestrator

    # Affinidi Data Connector Framework (DCF) Affinidi DCF is a developer/contributor-focused suite of tools that enables contributors to configure, create, validate and manage data connectors for public consumption. This involves configuring connections to a third party data source and configuring transformation mapping from the data source to a target, “canonical” schema. After setup, DCF validates the configuration of the data connectors and transformation mapping. Following successful validation, created connectors are published.  The Affinidi DCF Orchestrator API covers every step of the data ingestion process, enabling builders to onboard new third-party services as connectors, create authenticated user connections, and pull data to be streamed to Affinidi Vault. It provides a standardized approach to interact with REST APIs, which is also configuration-driven, allowing builders to easily customise the connector's behaviour by modifying configuration files.  The DCF Orchestrator API is organised around three main concepts: Data Source & Configuration, Connector, and User Connection. Below you will find a brief explanation of these and other useful terms:  *Data Source & Configuration* Data Sources represent the third-party service API in our framework. They consist of two entities: the details on how to authenticate with the third-party service are mapped to DataSourceConfig, while the service’s endpoints and data transformation templates are mapped to  DataSource .  Builders can list available DataSourceConfigs and DataSources, create new ones and modify them using our API.  *Connector* This is the building block of our framework. It brings together a Data Source and its Configuration with the builder credentials necessary for connections to be made, for example client ID or client secret. Our endpoints allow builders to list available Connectors, create new ones and modify them.  *User Connection* A user connection is created each time an end user authenticates with a data source via DCF. It holds user specific information relative to a connector and application, including credentials. Our API enables builders to list, create and delete available Connections as well as to execute them to pull data.  *Templates* Builder-defined configuration objects that describe how to interact with a specific third-party service's API, allowing developers to easily connect to and interact with a variety of sources, as well as customising the connector's behaviour. 

    The version of the OpenAPI document: 1.0.0
    Contact: robert.k@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


# import models into model package
from affinidi_tdk_client_dcf.models.active_connections_dto import ActiveConnectionsDto
from affinidi_tdk_client_dcf.models.active_connections_response import ActiveConnectionsResponse
from affinidi_tdk_client_dcf.models.auth_config import AuthConfig
from affinidi_tdk_client_dcf.models.auth_config_dto import AuthConfigDto
from affinidi_tdk_client_dcf.models.auth_config_info_dto import AuthConfigInfoDto
from affinidi_tdk_client_dcf.models.auth_config_info_dto_auth_details import AuthConfigInfoDtoAuthDetails
from affinidi_tdk_client_dcf.models.auth_config_info_dto_exchange_token_template import AuthConfigInfoDtoExchangeTokenTemplate
from affinidi_tdk_client_dcf.models.auth_config_info_dto_exchange_token_template_operations_inner import AuthConfigInfoDtoExchangeTokenTemplateOperationsInner
from affinidi_tdk_client_dcf.models.auth_config_info_dto_exchange_token_template_operations_inner_functions import AuthConfigInfoDtoExchangeTokenTemplateOperationsInnerFunctions
from affinidi_tdk_client_dcf.models.auth_config_info_dto_refresh_token_template import AuthConfigInfoDtoRefreshTokenTemplate
from affinidi_tdk_client_dcf.models.auth_config_info_dto_refresh_token_template_operations_inner import AuthConfigInfoDtoRefreshTokenTemplateOperationsInner
from affinidi_tdk_client_dcf.models.auth_config_info_dto_refresh_token_template_operations_inner_functions import AuthConfigInfoDtoRefreshTokenTemplateOperationsInnerFunctions
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto import AuthConfigInfoPatchDto
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto_auth_details import AuthConfigInfoPatchDtoAuthDetails
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto_exchange_token_template import AuthConfigInfoPatchDtoExchangeTokenTemplate
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto_exchange_token_template_operations_inner import AuthConfigInfoPatchDtoExchangeTokenTemplateOperationsInner
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto_exchange_token_template_operations_inner_functions import AuthConfigInfoPatchDtoExchangeTokenTemplateOperationsInnerFunctions
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto_refresh_token_template import AuthConfigInfoPatchDtoRefreshTokenTemplate
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto_refresh_token_template_operations_inner import AuthConfigInfoPatchDtoRefreshTokenTemplateOperationsInner
from affinidi_tdk_client_dcf.models.auth_config_info_patch_dto_refresh_token_template_operations_inner_functions import AuthConfigInfoPatchDtoRefreshTokenTemplateOperationsInnerFunctions
from affinidi_tdk_client_dcf.models.available_connector_dto import AvailableConnectorDTO
from affinidi_tdk_client_dcf.models.available_connectors_response import AvailableConnectorsResponse
from affinidi_tdk_client_dcf.models.basic_connector_dto import BasicConnectorDTO
from affinidi_tdk_client_dcf.models.callback_response import CallbackResponse
from affinidi_tdk_client_dcf.models.callback_response_one_of import CallbackResponseOneOf
from affinidi_tdk_client_dcf.models.config_template_dto import ConfigTemplateDto
from affinidi_tdk_client_dcf.models.config_template_dto_inner import ConfigTemplateDtoInner
from affinidi_tdk_client_dcf.models.connection_creation_request import ConnectionCreationRequest
from affinidi_tdk_client_dcf.models.connection_creation_response import ConnectionCreationResponse
from affinidi_tdk_client_dcf.models.connection_executed_temp_response import ConnectionExecutedTempResponse
from affinidi_tdk_client_dcf.models.connector_auth_config import ConnectorAuthConfig
from affinidi_tdk_client_dcf.models.connector_dto import ConnectorDTO
from affinidi_tdk_client_dcf.models.connectors_by_id_response import ConnectorsByIdResponse
from affinidi_tdk_client_dcf.models.connectors_creation_request import ConnectorsCreationRequest
from affinidi_tdk_client_dcf.models.connectors_response import ConnectorsResponse
from affinidi_tdk_client_dcf.models.create_transformation_template_request import CreateTransformationTemplateRequest
from affinidi_tdk_client_dcf.models.data_source import DataSource
from affinidi_tdk_client_dcf.models.data_source_config import DataSourceConfig
from affinidi_tdk_client_dcf.models.data_source_config_by_id_response import DataSourceConfigByIdResponse
from affinidi_tdk_client_dcf.models.data_source_config_by_id_response_one_of import DataSourceConfigByIdResponseOneOf
from affinidi_tdk_client_dcf.models.data_source_config_patch_request import DataSourceConfigPatchRequest
from affinidi_tdk_client_dcf.models.data_source_config_patch_status_request import DataSourceConfigPatchStatusRequest
from affinidi_tdk_client_dcf.models.data_source_config_response import DataSourceConfigResponse
from affinidi_tdk_client_dcf.models.data_source_config_validation_result import DataSourceConfigValidationResult
from affinidi_tdk_client_dcf.models.data_source_config_validation_result_validation_result import DataSourceConfigValidationResultValidationResult
from affinidi_tdk_client_dcf.models.data_source_creation_response import DataSourceCreationResponse
from affinidi_tdk_client_dcf.models.data_source_patch_request import DataSourcePatchRequest
from affinidi_tdk_client_dcf.models.data_source_patch_status_request import DataSourcePatchStatusRequest
from affinidi_tdk_client_dcf.models.data_source_response import DataSourceResponse
from affinidi_tdk_client_dcf.models.data_source_response_dto import DataSourceResponseDto
from affinidi_tdk_client_dcf.models.data_source_validation_result import DataSourceValidationResult
from affinidi_tdk_client_dcf.models.data_source_validation_result_validation_result import DataSourceValidationResultValidationResult
from affinidi_tdk_client_dcf.models.endpoint_config_dto import EndpointConfigDto
from affinidi_tdk_client_dcf.models.endpoint_config_dto_operations_inner import EndpointConfigDtoOperationsInner
from affinidi_tdk_client_dcf.models.endpoint_config_patch_request import EndpointConfigPatchRequest
from affinidi_tdk_client_dcf.models.endpoint_config_patch_request_operations_inner import EndpointConfigPatchRequestOperationsInner
from affinidi_tdk_client_dcf.models.executed_connection_request_response import ExecutedConnectionRequestResponse
from affinidi_tdk_client_dcf.models.generic_response import GenericResponse
from affinidi_tdk_client_dcf.models.get_data_sourceby_id_response import GetDataSourcebyIdResponse
from affinidi_tdk_client_dcf.models.invalid_parameter_error import InvalidParameterError
from affinidi_tdk_client_dcf.models.invalid_parameters_error import InvalidParametersError
from affinidi_tdk_client_dcf.models.item_already_exists_error import ItemAlreadyExistsError
from affinidi_tdk_client_dcf.models.mappings_response import MappingsResponse
from affinidi_tdk_client_dcf.models.not_found_error import NotFoundError
from affinidi_tdk_client_dcf.models.patch_connector_request import PatchConnectorRequest
from affinidi_tdk_client_dcf.models.patch_data_source_config_status_response import PatchDataSourceConfigStatusResponse
from affinidi_tdk_client_dcf.models.patch_data_source_status_response import PatchDataSourceStatusResponse
from affinidi_tdk_client_dcf.models.post_connectors_response import PostConnectorsResponse
from affinidi_tdk_client_dcf.models.referential_integrity_error import ReferentialIntegrityError
from affinidi_tdk_client_dcf.models.resource_not_found_error import ResourceNotFoundError
from affinidi_tdk_client_dcf.models.service_error_response import ServiceErrorResponse
from affinidi_tdk_client_dcf.models.service_error_response_details_inner import ServiceErrorResponseDetailsInner
from affinidi_tdk_client_dcf.models.transformation_template_dto import TransformationTemplateDto
from affinidi_tdk_client_dcf.models.transformation_template_dto_schema_mapping import TransformationTemplateDtoSchemaMapping
from affinidi_tdk_client_dcf.models.transformation_template_dto_schema_mapping_aggregations_inner import TransformationTemplateDtoSchemaMappingAggregationsInner
from affinidi_tdk_client_dcf.models.transformation_template_dto_schema_mapping_transformations_inner import TransformationTemplateDtoSchemaMappingTransformationsInner
from affinidi_tdk_client_dcf.models.unauthorized_error import UnauthorizedError
