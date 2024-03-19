# coding: utf-8

"""
    OidcVpAdapterBackend

    Affinidi OIDC VP Adapter Backend  An authorization token is necessary to create or obtain a project Access Token and access Admin APIs. Follow these step-by-step [instructions](https://lemmatree.atlassian.net/wiki/spaces/NETCORE/pages/2735317648020/ASA+Developer+Flow#Instructions-on-how-to-create-the-Project.)  to set up an authorization token 

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Any, Dict, List, Optional
from pydantic import BaseModel, Field, StrictBool, StrictStr, conlist
from affinidi_tdk_client_vpa.models.id_token_mapping import IdTokenMapping
from affinidi_tdk_client_vpa.models.login_configuration_client_metadata import LoginConfigurationClientMetadata
from affinidi_tdk_client_vpa.models.token_endpoint_auth_method import TokenEndpointAuthMethod

class UpdateLoginConfigurationInput(BaseModel):
    """
    UpdateLoginConfigurationInput
    """
    name: Optional[StrictStr] = Field(None, description="User defined login configuration name")
    redirect_uris: Optional[conlist(StrictStr)] = Field(None, alias="redirectUris", description="OAuth 2.0 Redirect URIs")
    client_secret: Optional[StrictStr] = Field(None, alias="clientSecret", description="OAuth2 client secret")
    vp_definition: Optional[StrictStr] = Field(None, alias="vpDefinition", description="VP definition in JSON stringify format")
    presentation_definition: Optional[Dict[str, Any]] = Field(None, alias="presentationDefinition", description="Presentation Definition")
    id_token_mapping: Optional[IdTokenMapping] = Field(None, alias="idTokenMapping")
    client_metadata: Optional[LoginConfigurationClientMetadata] = Field(None, alias="clientMetadata")
    token_endpoint_auth_method: Optional[TokenEndpointAuthMethod] = Field(None, alias="tokenEndpointAuthMethod")
    fail_on_mapping_conflict: Optional[StrictBool] = Field(None, alias="failOnMappingConflict", description="Interrupts login process if duplications of data fields names will be found")
    __properties = ["name", "redirectUris", "clientSecret", "vpDefinition", "presentationDefinition", "idTokenMapping", "clientMetadata", "tokenEndpointAuthMethod", "failOnMappingConflict"]

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
    def from_json(cls, json_str: str) -> UpdateLoginConfigurationInput:
        """Create an instance of UpdateLoginConfigurationInput from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of id_token_mapping
        if self.id_token_mapping:
            _dict['idTokenMapping'] = self.id_token_mapping.to_dict()
        # override the default output from pydantic by calling `to_dict()` of client_metadata
        if self.client_metadata:
            _dict['clientMetadata'] = self.client_metadata.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> UpdateLoginConfigurationInput:
        """Create an instance of UpdateLoginConfigurationInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return UpdateLoginConfigurationInput.parse_obj(obj)

        _obj = UpdateLoginConfigurationInput.parse_obj({
            "name": obj.get("name"),
            "redirect_uris": obj.get("redirectUris"),
            "client_secret": obj.get("clientSecret"),
            "vp_definition": obj.get("vpDefinition"),
            "presentation_definition": obj.get("presentationDefinition"),
            "id_token_mapping": IdTokenMapping.from_dict(obj.get("idTokenMapping")) if obj.get("idTokenMapping") is not None else None,
            "client_metadata": LoginConfigurationClientMetadata.from_dict(obj.get("clientMetadata")) if obj.get("clientMetadata") is not None else None,
            "token_endpoint_auth_method": obj.get("tokenEndpointAuthMethod"),
            "fail_on_mapping_conflict": obj.get("failOnMappingConflict")
        })
        return _obj


