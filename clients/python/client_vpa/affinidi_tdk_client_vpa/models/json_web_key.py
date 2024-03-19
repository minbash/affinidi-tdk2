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


from typing import List, Optional
from pydantic import BaseModel, Field, conlist
from affinidi_tdk_client_vpa.models.json_web_key_keys_inner import JsonWebKeyKeysInner

class JsonWebKey(BaseModel):
    """
    JsonWebKey
    """
    keys: Optional[conlist(JsonWebKeyKeysInner)] = Field(None, description="The value of the \"keys\" parameter is an array of JSON Web Key (JWK) values.  By default, the order of the JWK values within the array does not imply an  order of preference among them, although applications of JWK Sets can choose  to assign a meaning to the order for their purposes, if desired. ")
    __properties = ["keys"]

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
    def from_json(cls, json_str: str) -> JsonWebKey:
        """Create an instance of JsonWebKey from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in keys (list)
        _items = []
        if self.keys:
            for _item in self.keys:
                if _item:
                    _items.append(_item.to_dict())
            _dict['keys'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> JsonWebKey:
        """Create an instance of JsonWebKey from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return JsonWebKey.parse_obj(obj)

        _obj = JsonWebKey.parse_obj({
            "keys": [JsonWebKeyKeysInner.from_dict(_item) for _item in obj.get("keys")] if obj.get("keys") is not None else None
        })
        return _obj


