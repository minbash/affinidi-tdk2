# coding: utf-8

"""
    VaultFileSystem

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import json
import pprint
import re  # noqa: F401
from aenum import Enum, no_arg





class NodeType(str, Enum):
    """
    type of the Node
    """

    """
    allowed enum values
    """
    VC_ROOT = 'VC_ROOT'
    VC = 'VC'
    FILE = 'FILE'
    FOLDER = 'FOLDER'
    PROFILE = 'PROFILE'
    ROOT_ELEMENT = 'ROOT_ELEMENT'
    TRASH_BIN = 'TRASH_BIN'

    @classmethod
    def from_json(cls, json_str: str) -> NodeType:
        """Create an instance of NodeType from a JSON string"""
        return NodeType(json.loads(json_str))


