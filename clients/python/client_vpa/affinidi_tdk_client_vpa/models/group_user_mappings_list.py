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


from typing import List, Optional, Union
from pydantic import BaseModel, Field, StrictFloat, StrictInt, StrictStr, conlist
from affinidi_tdk_client_vpa.models.group_user_mapping_dto import GroupUserMappingDto

class GroupUserMappingsList(BaseModel):
    """
    GroupUserMappingsList
    """
    users: Optional[conlist(GroupUserMappingDto)] = None
    last_evaluated_key: Optional[StrictStr] = Field(None, alias="lastEvaluatedKey")
    total_user_count: Optional[Union[StrictFloat, StrictInt]] = Field(None, alias="totalUserCount")
    __properties = ["users", "lastEvaluatedKey", "totalUserCount"]

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
    def from_json(cls, json_str: str) -> GroupUserMappingsList:
        """Create an instance of GroupUserMappingsList from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in users (list)
        _items = []
        if self.users:
            for _item in self.users:
                if _item:
                    _items.append(_item.to_dict())
            _dict['users'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GroupUserMappingsList:
        """Create an instance of GroupUserMappingsList from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GroupUserMappingsList.parse_obj(obj)

        _obj = GroupUserMappingsList.parse_obj({
            "users": [GroupUserMappingDto.from_dict(_item) for _item in obj.get("users")] if obj.get("users") is not None else None,
            "last_evaluated_key": obj.get("lastEvaluatedKey"),
            "total_user_count": obj.get("totalUserCount")
        })
        return _obj


