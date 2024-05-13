# coding: utf-8

"""
    VerificationService

    Affinidi VerificationService Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
from inspect import getfullargspec
import json
import pprint
import re  # noqa: F401

from typing import Any, Dict, List, Optional
from pydantic import BaseModel, Field, StrictStr, ValidationError, conlist, validator
from affinidi_tdk_credential_verification_client.models.w3c_presentation_context_one_of_inner import W3cPresentationContextOneOfInner
from typing import Union, Any, List, TYPE_CHECKING
from pydantic import StrictStr, Field

W3CPRESENTATIONCONTEXT_ONE_OF_SCHEMAS = ["Dict[str, object]", "List[W3cPresentationContextOneOfInner]", "str"]

class W3cPresentationContext(BaseModel):
    """
    W3cPresentationContext
    """
    # data type: str
    oneof_schema_1_validator: Optional[StrictStr] = None
    # data type: Dict[str, object]
    oneof_schema_2_validator: Optional[Dict[str, Any]] = None
    # data type: List[W3cPresentationContextOneOfInner]
    oneof_schema_3_validator: Optional[conlist(W3cPresentationContextOneOfInner)] = None
    if TYPE_CHECKING:
        actual_instance: Union[Dict[str, object], List[W3cPresentationContextOneOfInner], str]
    else:
        actual_instance: Any
    one_of_schemas: List[str] = Field(W3CPRESENTATIONCONTEXT_ONE_OF_SCHEMAS, const=True)

    class Config:
        validate_assignment = True

    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = W3cPresentationContext.construct()
        error_messages = []
        match = 0
        # validate data type: str
        try:
            instance.oneof_schema_1_validator = v
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # validate data type: Dict[str, object]
        try:
            instance.oneof_schema_2_validator = v
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # validate data type: List[W3cPresentationContextOneOfInner]
        try:
            instance.oneof_schema_3_validator = v
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in W3cPresentationContext with oneOf schemas: Dict[str, object], List[W3cPresentationContextOneOfInner], str. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in W3cPresentationContext with oneOf schemas: Dict[str, object], List[W3cPresentationContextOneOfInner], str. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: dict) -> W3cPresentationContext:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> W3cPresentationContext:
        """Returns the object represented by the json string"""
        instance = W3cPresentationContext.construct()
        error_messages = []
        match = 0

        # deserialize data into str
        try:
            # validation
            instance.oneof_schema_1_validator = json.loads(json_str)
            # assign value to actual_instance
            instance.actual_instance = instance.oneof_schema_1_validator
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into Dict[str, object]
        try:
            # validation
            instance.oneof_schema_2_validator = json.loads(json_str)
            # assign value to actual_instance
            instance.actual_instance = instance.oneof_schema_2_validator
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into List[W3cPresentationContextOneOfInner]
        try:
            # validation
            instance.oneof_schema_3_validator = json.loads(json_str)
            # assign value to actual_instance
            instance.actual_instance = instance.oneof_schema_3_validator
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into W3cPresentationContext with oneOf schemas: Dict[str, object], List[W3cPresentationContextOneOfInner], str. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into W3cPresentationContext with oneOf schemas: Dict[str, object], List[W3cPresentationContextOneOfInner], str. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        to_json = getattr(self.actual_instance, "to_json", None)
        if callable(to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> dict:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        to_dict = getattr(self.actual_instance, "to_dict", None)
        if callable(to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.dict())


