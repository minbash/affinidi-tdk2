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

from affinidi_tdk_credential_verification_client.models.w3c_credential_credential_subject import W3cCredentialCredentialSubject  # noqa: E501

class TestW3cCredentialCredentialSubject(unittest.TestCase):
    """W3cCredentialCredentialSubject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> W3cCredentialCredentialSubject:
        """Test W3cCredentialCredentialSubject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `W3cCredentialCredentialSubject`
        """
        model = W3cCredentialCredentialSubject()  # noqa: E501
        if include_optional:
            return W3cCredentialCredentialSubject(
            )
        else:
            return W3cCredentialCredentialSubject(
        )
        """

    def testW3cCredentialCredentialSubject(self):
        """Test W3cCredentialCredentialSubject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
