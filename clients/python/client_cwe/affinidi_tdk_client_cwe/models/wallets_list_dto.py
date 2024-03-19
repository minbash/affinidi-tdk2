# coding: utf-8

"""
    CloudWalletEssentials

    Cloud Wallet For Enterprise Structure

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
from affinidi_tdk_client_cwe.models.wallet_dto import WalletDto

class WalletsListDto(BaseModel):
    """
    list of wallets  # noqa: E501
    """
    wallets: Optional[conlist(WalletDto)] = None
    __properties = ["wallets"]

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
    def from_json(cls, json_str: str) -> WalletsListDto:
        """Create an instance of WalletsListDto from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in wallets (list)
        _items = []
        if self.wallets:
            for _item in self.wallets:
                if _item:
                    _items.append(_item.to_dict())
            _dict['wallets'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> WalletsListDto:
        """Create an instance of WalletsListDto from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return WalletsListDto.parse_obj(obj)

        _obj = WalletsListDto.parse_obj({
            "wallets": [WalletDto.from_dict(_item) for _item in obj.get("wallets")] if obj.get("wallets") is not None else None
        })
        return _obj


