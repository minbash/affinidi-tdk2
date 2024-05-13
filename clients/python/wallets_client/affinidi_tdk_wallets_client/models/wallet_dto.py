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


from typing import Any, Dict, List, Optional
from pydantic import BaseModel, Field, StrictStr, conlist
from affinidi_tdk_wallets_client.models.wallet_dto_keys_inner import WalletDtoKeysInner

class WalletDto(BaseModel):
    """
    wallet dto  # noqa: E501
    """
    id: Optional[StrictStr] = Field(None, description="id of the wallet in uuidV4 format")
    did: Optional[StrictStr] = Field(None, description="did of the wallet")
    name: Optional[StrictStr] = Field(None, description="The name of the wallet")
    description: Optional[StrictStr] = Field(None, description="The description of the wallet")
    did_document: Optional[Dict[str, Any]] = Field(None, alias="didDocument", description="did document of the wallet")
    ari: Optional[StrictStr] = Field(None, description="ARI of the wallet")
    keys: Optional[conlist(WalletDtoKeysInner)] = None
    __properties = ["id", "did", "name", "description", "didDocument", "ari", "keys"]

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
    def from_json(cls, json_str: str) -> WalletDto:
        """Create an instance of WalletDto from a JSON string"""
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
    def from_dict(cls, obj: dict) -> WalletDto:
        """Create an instance of WalletDto from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return WalletDto.parse_obj(obj)

        _obj = WalletDto.parse_obj({
            "id": obj.get("id"),
            "did": obj.get("did"),
            "name": obj.get("name"),
            "description": obj.get("description"),
            "did_document": obj.get("didDocument"),
            "ari": obj.get("ari"),
            "keys": [WalletDtoKeysInner.from_dict(_item) for _item in obj.get("keys")] if obj.get("keys") is not None else None
        })
        return _obj


