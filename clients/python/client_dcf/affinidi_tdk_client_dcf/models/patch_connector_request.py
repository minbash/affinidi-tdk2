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


from typing import List, Optional, Union
from pydantic import BaseModel, Field, StrictBytes, StrictStr, conlist, constr, validator
from affinidi_tdk_client_dcf.models.connector_auth_config import ConnectorAuthConfig

class PatchConnectorRequest(BaseModel):
    """
    Updates a connector's data source IDs or configuration.   # noqa: E501
    """
    data_source_ids: Optional[conlist(constr(strict=True, max_length=36, min_length=32))] = Field(None, alias="dataSourceIds", description="The updated list of data source IDs for the connector. ")
    config: Optional[ConnectorAuthConfig] = None
    name: Optional[constr(strict=True, max_length=255, min_length=1)] = Field(None, description="The name of the connector. ")
    status: Optional[StrictStr] = Field(None, description="The new status of the connector. ")
    icon: Optional[Union[StrictBytes, StrictStr]] = Field(None, description="The icon of the connector as base64 encoded string. ")
    website_uri: Optional[StrictStr] = Field(None, alias="websiteUri", description="The URL of the website for the connector. ")
    __properties = ["dataSourceIds", "config", "name", "status", "icon", "websiteUri"]

    @validator('name')
    def name_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^\w*$", value):
            raise ValueError(r"must validate the regular expression /^\w*$/")
        return value

    @validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('DRAFT', 'READY'):
            raise ValueError("must be one of enum values ('DRAFT', 'READY')")
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
    def from_json(cls, json_str: str) -> PatchConnectorRequest:
        """Create an instance of PatchConnectorRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of config
        if self.config:
            _dict['config'] = self.config.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> PatchConnectorRequest:
        """Create an instance of PatchConnectorRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return PatchConnectorRequest.parse_obj(obj)

        _obj = PatchConnectorRequest.parse_obj({
            "data_source_ids": obj.get("dataSourceIds"),
            "config": ConnectorAuthConfig.from_dict(obj.get("config")) if obj.get("config") is not None else None,
            "name": obj.get("name"),
            "status": obj.get("status"),
            "icon": obj.get("icon"),
            "website_uri": obj.get("websiteUri")
        })
        return _obj


