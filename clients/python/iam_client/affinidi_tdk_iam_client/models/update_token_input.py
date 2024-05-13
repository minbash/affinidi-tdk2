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


from typing import Optional
from pydantic import BaseModel, Field, constr, validator
from affinidi_tdk_iam_client.models.update_token_private_key_authentication_method_dto import UpdateTokenPrivateKeyAuthenticationMethodDto

class UpdateTokenInput(BaseModel):
    """
    UpdateTokenInput
    """
    name: Optional[constr(strict=True)] = None
    authentication_method: Optional[UpdateTokenPrivateKeyAuthenticationMethodDto] = Field(None, alias="authenticationMethod")
    __properties = ["name", "authenticationMethod"]

    @validator('name')
    def name_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r".{3,}", value):
            raise ValueError(r"must validate the regular expression /.{3,}/")
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
    def from_json(cls, json_str: str) -> UpdateTokenInput:
        """Create an instance of UpdateTokenInput from a JSON string"""
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
    def from_dict(cls, obj: dict) -> UpdateTokenInput:
        """Create an instance of UpdateTokenInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return UpdateTokenInput.parse_obj(obj)

        _obj = UpdateTokenInput.parse_obj({
            "name": obj.get("name"),
            "authentication_method": UpdateTokenPrivateKeyAuthenticationMethodDto.from_dict(obj.get("authenticationMethod")) if obj.get("authenticationMethod") is not None else None
        })
        return _obj


