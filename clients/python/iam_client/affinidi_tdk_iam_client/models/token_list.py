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
from pydantic import BaseModel, Field, conlist
from affinidi_tdk_iam_client.models.token_dto import TokenDto

class TokenList(BaseModel):
    """
    TokenList
    """
    tokens: conlist(TokenDto) = Field(...)
    __properties = ["tokens"]

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
    def from_json(cls, json_str: str) -> TokenList:
        """Create an instance of TokenList from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in tokens (list)
        _items = []
        if self.tokens:
            for _item in self.tokens:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tokens'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> TokenList:
        """Create an instance of TokenList from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return TokenList.parse_obj(obj)

        _obj = TokenList.parse_obj({
            "tokens": [TokenDto.from_dict(_item) for _item in obj.get("tokens")] if obj.get("tokens") is not None else None
        })
        return _obj


