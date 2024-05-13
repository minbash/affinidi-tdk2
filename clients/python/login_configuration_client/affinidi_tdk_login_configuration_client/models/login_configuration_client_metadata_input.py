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



from pydantic import BaseModel, Field, StrictStr

class LoginConfigurationClientMetadataInput(BaseModel):
    """
    login configuration client metadata  # noqa: E501
    """
    name: StrictStr = Field(..., description="application name that will be displayed in consent page")
    origin: StrictStr = Field(..., description="origin url that will be displayed in consent page")
    logo: StrictStr = Field(..., description="logo url that will be displayed in consent page")
    __properties = ["name", "origin", "logo"]

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
    def from_json(cls, json_str: str) -> LoginConfigurationClientMetadataInput:
        """Create an instance of LoginConfigurationClientMetadataInput from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> LoginConfigurationClientMetadataInput:
        """Create an instance of LoginConfigurationClientMetadataInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return LoginConfigurationClientMetadataInput.parse_obj(obj)

        _obj = LoginConfigurationClientMetadataInput.parse_obj({
            "name": obj.get("name"),
            "origin": obj.get("origin"),
            "logo": obj.get("logo")
        })
        return _obj


