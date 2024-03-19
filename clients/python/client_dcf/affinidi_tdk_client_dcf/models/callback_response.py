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
from inspect import getfullargspec
import json
import pprint
import re  # noqa: F401

from typing import Any, List, Optional
from pydantic import BaseModel, Field, StrictStr, ValidationError, validator
from affinidi_tdk_client_dcf.models.callback_response_one_of import CallbackResponseOneOf
from affinidi_tdk_client_dcf.models.patch_data_source_config_status_response import PatchDataSourceConfigStatusResponse
from affinidi_tdk_client_dcf.models.patch_data_source_status_response import PatchDataSourceStatusResponse
from typing import Union, Any, List, TYPE_CHECKING
from pydantic import StrictStr, Field

CALLBACKRESPONSE_ONE_OF_SCHEMAS = ["CallbackResponseOneOf", "PatchDataSourceConfigStatusResponse", "PatchDataSourceStatusResponse"]

class CallbackResponse(BaseModel):
    """
    CallbackResponse
    """
    # data type: CallbackResponseOneOf
    oneof_schema_1_validator: Optional[CallbackResponseOneOf] = None
    # data type: PatchDataSourceConfigStatusResponse
    oneof_schema_2_validator: Optional[PatchDataSourceConfigStatusResponse] = None
    # data type: PatchDataSourceStatusResponse
    oneof_schema_3_validator: Optional[PatchDataSourceStatusResponse] = None
    if TYPE_CHECKING:
        actual_instance: Union[CallbackResponseOneOf, PatchDataSourceConfigStatusResponse, PatchDataSourceStatusResponse]
    else:
        actual_instance: Any
    one_of_schemas: List[str] = Field(CALLBACKRESPONSE_ONE_OF_SCHEMAS, const=True)

    class Config:
        validate_assignment = True

    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = CallbackResponse.construct()
        error_messages = []
        match = 0
        # validate data type: CallbackResponseOneOf
        if not isinstance(v, CallbackResponseOneOf):
            error_messages.append(f"Error! Input type `{type(v)}` is not `CallbackResponseOneOf`")
        else:
            match += 1
        # validate data type: PatchDataSourceConfigStatusResponse
        if not isinstance(v, PatchDataSourceConfigStatusResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PatchDataSourceConfigStatusResponse`")
        else:
            match += 1
        # validate data type: PatchDataSourceStatusResponse
        if not isinstance(v, PatchDataSourceStatusResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PatchDataSourceStatusResponse`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in CallbackResponse with oneOf schemas: CallbackResponseOneOf, PatchDataSourceConfigStatusResponse, PatchDataSourceStatusResponse. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in CallbackResponse with oneOf schemas: CallbackResponseOneOf, PatchDataSourceConfigStatusResponse, PatchDataSourceStatusResponse. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: dict) -> CallbackResponse:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> CallbackResponse:
        """Returns the object represented by the json string"""
        instance = CallbackResponse.construct()
        error_messages = []
        match = 0

        # deserialize data into CallbackResponseOneOf
        try:
            instance.actual_instance = CallbackResponseOneOf.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into PatchDataSourceConfigStatusResponse
        try:
            instance.actual_instance = PatchDataSourceConfigStatusResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into PatchDataSourceStatusResponse
        try:
            instance.actual_instance = PatchDataSourceStatusResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into CallbackResponse with oneOf schemas: CallbackResponseOneOf, PatchDataSourceConfigStatusResponse, PatchDataSourceStatusResponse. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into CallbackResponse with oneOf schemas: CallbackResponseOneOf, PatchDataSourceConfigStatusResponse, PatchDataSourceStatusResponse. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        to_json = getattr(self.actual_instance, "to_json", None)
        if callable(to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> dict:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        to_dict = getattr(self.actual_instance, "to_dict", None)
        if callable(to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.dict())


