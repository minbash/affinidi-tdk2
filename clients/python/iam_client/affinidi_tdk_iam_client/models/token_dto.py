# coding: utf-8

"""
    Iam

    Affinidi IAM

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import List
from pydantic import BaseModel, Field, StrictStr, conlist
from affinidi_tdk_iam_client.models.token_authentication_method_dto import TokenAuthenticationMethodDto

class TokenDto(BaseModel):
    """
    TokenDto
    """
    id: StrictStr = Field(..., description="Token Id")
    ari: StrictStr = Field(..., description="Token ARI")
    owner_ari: StrictStr = Field(..., alias="ownerAri", description="The Token owner's ARI")
    name: StrictStr = Field(..., description="Owner defined Token display name")
    authentication_method: TokenAuthenticationMethodDto = Field(..., alias="authenticationMethod")
    scopes: conlist(StrictStr) = Field(..., description="Scopes that will be assigned to the Token on authentication")
    __properties = ["id", "ari", "ownerAri", "name", "authenticationMethod", "scopes"]

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
    def from_json(cls, json_str: str) -> TokenDto:
        """Create an instance of TokenDto from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of authentication_method
        if self.authentication_method:
            _dict['authenticationMethod'] = self.authentication_method.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> TokenDto:
        """Create an instance of TokenDto from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return TokenDto.parse_obj(obj)

        _obj = TokenDto.parse_obj({
            "id": obj.get("id"),
            "ari": obj.get("ari"),
            "owner_ari": obj.get("ownerAri"),
            "name": obj.get("name"),
            "authentication_method": TokenAuthenticationMethodDto.from_dict(obj.get("authenticationMethod")) if obj.get("authenticationMethod") is not None else None,
            "scopes": obj.get("scopes")
        })
        return _obj


