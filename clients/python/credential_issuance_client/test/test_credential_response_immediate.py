# coding: utf-8

"""
    CredentialIssuanceService

    Affinidi Credential Issuance Service Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_credential_issuance_client.models.credential_response_immediate import CredentialResponseImmediate  # noqa: E501

class TestCredentialResponseImmediate(unittest.TestCase):
    """CredentialResponseImmediate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CredentialResponseImmediate:
        """Test CredentialResponseImmediate
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CredentialResponseImmediate`
        """
        model = CredentialResponseImmediate()  # noqa: E501
        if include_optional:
            return CredentialResponseImmediate(
                credential = { },
                c_nonce = '',
                c_nonce_expires_in = 1.337
            )
        else:
            return CredentialResponseImmediate(
                credential = { },
                c_nonce = '',
                c_nonce_expires_in = 1.337,
        )
        """

    def testCredentialResponseImmediate(self):
        """Test CredentialResponseImmediate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
