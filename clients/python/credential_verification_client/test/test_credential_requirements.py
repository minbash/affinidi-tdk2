# coding: utf-8

"""
    VerificationService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_credential_verification_client.models.credential_requirements import CredentialRequirements  # noqa: E501

class TestCredentialRequirements(unittest.TestCase):
    """CredentialRequirements unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CredentialRequirements:
        """Test CredentialRequirements
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CredentialRequirements`
        """
        model = CredentialRequirements()  # noqa: E501
        if include_optional:
            return CredentialRequirements(
                type = [
                    ''
                    ],
                constraints = None
            )
        else:
            return CredentialRequirements(
                type = [
                    ''
                    ],
        )
        """

    def testCredentialRequirements(self):
        """Test CredentialRequirements"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
