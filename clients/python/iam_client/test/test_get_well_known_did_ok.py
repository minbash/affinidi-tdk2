# coding: utf-8

"""
    Iam

    Affinidi IAM

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_iam_client.models.get_well_known_did_ok import GetWellKnownDidOK  # noqa: E501

class TestGetWellKnownDidOK(unittest.TestCase):
    """GetWellKnownDidOK unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetWellKnownDidOK:
        """Test GetWellKnownDidOK
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetWellKnownDidOK`
        """
        model = GetWellKnownDidOK()  # noqa: E501
        if include_optional:
            return GetWellKnownDidOK(
            )
        else:
            return GetWellKnownDidOK(
        )
        """

    def testGetWellKnownDidOK(self):
        """Test GetWellKnownDidOK"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
