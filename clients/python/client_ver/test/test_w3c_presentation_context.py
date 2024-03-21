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

from affinidi_tdk_client_ver.models.w3c_presentation_context import W3cPresentationContext  # noqa: E501

class TestW3cPresentationContext(unittest.TestCase):
    """W3cPresentationContext unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> W3cPresentationContext:
        """Test W3cPresentationContext
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `W3cPresentationContext`
        """
        model = W3cPresentationContext()  # noqa: E501
        if include_optional:
            return W3cPresentationContext(
            )
        else:
            return W3cPresentationContext(
        )
        """

    def testW3cPresentationContext(self):
        """Test W3cPresentationContext"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
