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

from affinidi_tdk_client_ver.models.nested_descriptor import NestedDescriptor  # noqa: E501

class TestNestedDescriptor(unittest.TestCase):
    """NestedDescriptor unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> NestedDescriptor:
        """Test NestedDescriptor
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `NestedDescriptor`
        """
        model = NestedDescriptor()  # noqa: E501
        if include_optional:
            return NestedDescriptor(
                id = '',
                path = '',
                path_nested = affinidi_tdk_client_ver.models.nested_descriptor.NestedDescriptor(
                    id = '', 
                    path = '', 
                    path_nested = affinidi_tdk_client_ver.models.nested_descriptor.NestedDescriptor(
                        id = '', 
                        path = '', 
                        format = '', ), 
                    format = '', ),
                format = ''
            )
        else:
            return NestedDescriptor(
                path = '',
                format = '',
        )
        """

    def testNestedDescriptor(self):
        """Test NestedDescriptor"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
