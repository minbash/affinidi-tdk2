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

from affinidi_tdk_client_ver.models.error_detail import ErrorDetail  # noqa: E501

class TestErrorDetail(unittest.TestCase):
    """ErrorDetail unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ErrorDetail:
        """Test ErrorDetail
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ErrorDetail`
        """
        model = ErrorDetail()  # noqa: E501
        if include_optional:
            return ErrorDetail(
                message = ''
            )
        else:
            return ErrorDetail(
        )
        """

    def testErrorDetail(self):
        """Test ErrorDetail"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
