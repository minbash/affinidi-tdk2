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
from pydantic import BaseModel, conlist
from affinidi_tdk_login_configuration_client.models.group_dto import GroupDto

class GroupsList(BaseModel):
    """
    GroupsList
    """
    groups: Optional[conlist(GroupDto)] = None
    __properties = ["groups"]

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
    def from_json(cls, json_str: str) -> GroupsList:
        """Create an instance of GroupsList from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in groups (list)
        _items = []
        if self.groups:
            for _item in self.groups:
                if _item:
                    _items.append(_item.to_dict())
            _dict['groups'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GroupsList:
        """Create an instance of GroupsList from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GroupsList.parse_obj(obj)

        _obj = GroupsList.parse_obj({
            "groups": [GroupDto.from_dict(_item) for _item in obj.get("groups")] if obj.get("groups") is not None else None
        })
        return _obj


