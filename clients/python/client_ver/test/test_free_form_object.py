# coding: utf-8

"""
    VerificationService

    Affinidi VerificationService Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_client_ver.models.free_form_object import FreeFormObject  # noqa: E501

class TestFreeFormObject(unittest.TestCase):
    """FreeFormObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FreeFormObject:
        """Test FreeFormObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FreeFormObject`
        """
        model = FreeFormObject()  # noqa: E501
        if include_optional:
            return FreeFormObject(
            )
        else:
            return FreeFormObject(
        )
        """

    def testFreeFormObject(self):
        """Test FreeFormObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
