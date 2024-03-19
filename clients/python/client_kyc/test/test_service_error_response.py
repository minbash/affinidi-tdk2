# coding: utf-8

"""
    KnowYourCustomer

    Affinidi KnowYourCustomer Structure

    The version of the OpenAPI document: 1.0.0
    Contact: consumer-eng@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_client_kyc.models.service_error_response import ServiceErrorResponse  # noqa: E501

class TestServiceErrorResponse(unittest.TestCase):
    """ServiceErrorResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ServiceErrorResponse:
        """Test ServiceErrorResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ServiceErrorResponse`
        """
        model = ServiceErrorResponse()  # noqa: E501
        if include_optional:
            return ServiceErrorResponse(
                trace_id = '',
                name = '',
                code = '',
                details = [
                    affinidi_tdk_client_kyc.models.service_error_response_details_inner.ServiceErrorResponse_details_inner(
                        issue = '', 
                        field = '', 
                        value = '', 
                        location = 'BODY', )
                    ]
            )
        else:
            return ServiceErrorResponse(
                trace_id = '',
                name = '',
                code = '',
        )
        """

    def testServiceErrorResponse(self):
        """Test ServiceErrorResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
