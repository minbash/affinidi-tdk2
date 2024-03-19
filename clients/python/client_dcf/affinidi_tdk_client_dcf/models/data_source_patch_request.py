# coding: utf-8

"""
    DcfOrchestrator

    # Affinidi Data Connector Framework (DCF) Affinidi DCF is a developer/contributor-focused suite of tools that enables contributors to configure, create, validate and manage data connectors for public consumption. This involves configuring connections to a third party data source and configuring transformation mapping from the data source to a target, “canonical” schema. After setup, DCF validates the configuration of the data connectors and transformation mapping. Following successful validation, created connectors are published.  The Affinidi DCF Orchestrator API covers every step of the data ingestion process, enabling builders to onboard new third-party services as connectors, create authenticated user connections, and pull data to be streamed to Affinidi Vault. It provides a standardized approach to interact with REST APIs, which is also configuration-driven, allowing builders to easily customise the connector's behaviour by modifying configuration files.  The DCF Orchestrator API is organised around three main concepts: Data Source & Configuration, Connector, and User Connection. Below you will find a brief explanation of these and other useful terms:  *Data Source & Configuration* Data Sources represent the third-party service API in our framework. They consist of two entities: the details on how to authenticate with the third-party service are mapped to DataSourceConfig, while the service’s endpoints and data transformation templates are mapped to  DataSource .  Builders can list available DataSourceConfigs and DataSources, create new ones and modify them using our API.  *Connector* This is the building block of our framework. It brings together a Data Source and its Configuration with the builder credentials necessary for connections to be made, for example client ID or client secret. Our endpoints allow builders to list available Connectors, create new ones and modify them.  *User Connection* A user connection is created each time an end user authenticates with a data source via DCF. It holds user specific information relative to a connector and application, including credentials. Our API enables builders to list, create and delete available Connections as well as to execute them to pull data.  *Templates* Builder-defined configuration objects that describe how to interact with a specific third-party service's API, allowing developers to easily connect to and interact with a variety of sources, as well as customising the connector's behaviour. 

    The version of the OpenAPI document: 1.0.0
    Contact: robert.k@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, constr, validator
from affinidi_tdk_client_dcf.models.endpoint_config_patch_request import EndpointConfigPatchRequest
from affinidi_tdk_client_dcf.models.transformation_template_dto import TransformationTemplateDto

class DataSourcePatchRequest(BaseModel):
    """
    Request payload for updating of a data source.   # noqa: E501
    """
    data_source_name: Optional[constr(strict=True, max_length=255, min_length=1)] = Field(None, alias="dataSourceName", description="The name of the data source. ")
    description: Optional[constr(strict=True, max_length=36, min_length=32)] = Field(None, description="The human readable description of the data source. ")
    scope: Optional[constr(strict=True, max_length=1024, min_length=1)] = Field(None, description="Data-scoped permissions as string, requested from the third-party service API so that DCF can access that data on behalf of end users. ")
    endpoint_config: Optional[EndpointConfigPatchRequest] = Field(None, alias="endpointConfig")
    transformation_template: Optional[TransformationTemplateDto] = Field(None, alias="transformationTemplate")
    __properties = ["dataSourceName", "description", "scope", "endpointConfig", "transformationTemplate"]

    @validator('data_source_name')
    def data_source_name_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^(.*?)$", value):
            raise ValueError(r"must validate the regular expression /^(.*?)$/")
        return value

    @validator('description')
    def description_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$", value):
            raise ValueError(r"must validate the regular expression /^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$/")
        return value

    @validator('scope')
    def scope_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^(.*?)$", value):
            raise ValueError(r"must validate the regular expression /^(.*?)$/")
        return value

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> DataSourcePatchRequest:
        """Create an instance of DataSourcePatchRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of endpoint_config
        if self.endpoint_config:
            _dict['endpointConfig'] = self.endpoint_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of transformation_template
        if self.transformation_template:
            _dict['transformationTemplate'] = self.transformation_template.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> DataSourcePatchRequest:
        """Create an instance of DataSourcePatchRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return DataSourcePatchRequest.parse_obj(obj)

        _obj = DataSourcePatchRequest.parse_obj({
            "data_source_name": obj.get("dataSourceName"),
            "description": obj.get("description"),
            "scope": obj.get("scope"),
            "endpoint_config": EndpointConfigPatchRequest.from_dict(obj.get("endpointConfig")) if obj.get("endpointConfig") is not None else None,
            "transformation_template": TransformationTemplateDto.from_dict(obj.get("transformationTemplate")) if obj.get("transformationTemplate") is not None else None
        })
        return _obj


