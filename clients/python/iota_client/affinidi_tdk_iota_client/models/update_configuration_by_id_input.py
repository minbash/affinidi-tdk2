# coding: utf-8

"""
    IotaService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional, Union
from pydantic import BaseModel, Field, StrictBool, StrictFloat, StrictInt, StrictStr, validator
from affinidi_tdk_iota_client.models.iota_configuration_dto_client_metadata import IotaConfigurationDtoClientMetadata

class UpdateConfigurationByIdInput(BaseModel):
    """
    UpdateConfigurationByIdInput
    """
    name: Optional[StrictStr] = Field(default=None, description="The name of the config")
    wallet_ari: Optional[StrictStr] = Field(default=None, alias="walletAri", description="The wallet Ari that will be used to sign")
    iota_response_webhook_url: Optional[StrictStr] = Field(default=None, alias="iotaResponseWebhookURL", description="webhook to call when data is ready")
    enable_verification: Optional[StrictBool] = Field(default=None, alias="enableVerification")
    enable_consent_audit_log: Optional[StrictBool] = Field(default=None, alias="enableConsentAuditLog")
    token_max_age: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="tokenMaxAge", description="token time to live in seconds")
    description: Optional[StrictStr] = Field(default=None, description="The description of the config")
    client_metadata: Optional[IotaConfigurationDtoClientMetadata] = Field(default=None, alias="clientMetadata")
    mode: Optional[StrictStr] = Field(default=None, description="indicates whether the flow is a WebSocket flow or a Redirect flow. This value is used in Vault to determine how to process the data flow request.")
    redirect_uri: Optional[StrictStr] = Field(default=None, alias="redirectUri", description="the URL that the user will be redirected to after the request has been processed; should be provided by the developer of the client application. Required only if mode is Redirect.")
    __properties = ["name", "walletAri", "iotaResponseWebhookURL", "enableVerification", "enableConsentAuditLog", "tokenMaxAge", "description", "clientMetadata", "mode", "redirectUri"]

    @validator('mode')
    def mode_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('redirect', 'websocket'):
            raise ValueError("must be one of enum values ('redirect', 'websocket')")
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
    def from_json(cls, json_str: str) -> UpdateConfigurationByIdInput:
        """Create an instance of UpdateConfigurationByIdInput from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of client_metadata
        if self.client_metadata:
            _dict['clientMetadata'] = self.client_metadata.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> UpdateConfigurationByIdInput:
        """Create an instance of UpdateConfigurationByIdInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return UpdateConfigurationByIdInput.parse_obj(obj)

        _obj = UpdateConfigurationByIdInput.parse_obj({
            "name": obj.get("name"),
            "wallet_ari": obj.get("walletAri"),
            "iota_response_webhook_url": obj.get("iotaResponseWebhookURL"),
            "enable_verification": obj.get("enableVerification"),
            "enable_consent_audit_log": obj.get("enableConsentAuditLog"),
            "token_max_age": obj.get("tokenMaxAge"),
            "description": obj.get("description"),
            "client_metadata": IotaConfigurationDtoClientMetadata.from_dict(obj.get("clientMetadata")) if obj.get("clientMetadata") is not None else None,
            "mode": obj.get("mode"),
            "redirect_uri": obj.get("redirectUri")
        })
        return _obj


