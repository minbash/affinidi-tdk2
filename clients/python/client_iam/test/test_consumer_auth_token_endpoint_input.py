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

from affinidi_tdk_client_iam.models.consumer_auth_token_endpoint_input import ConsumerAuthTokenEndpointInput  # noqa: E501

class TestConsumerAuthTokenEndpointInput(unittest.TestCase):
    """ConsumerAuthTokenEndpointInput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConsumerAuthTokenEndpointInput:
        """Test ConsumerAuthTokenEndpointInput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConsumerAuthTokenEndpointInput`
        """
        model = ConsumerAuthTokenEndpointInput()  # noqa: E501
        if include_optional:
            return ConsumerAuthTokenEndpointInput(
                grant_type = '',
                code = '',
                refresh_token = '',
                redirect_uri = '',
                client_id = ''
            )
        else:
            return ConsumerAuthTokenEndpointInput(
                grant_type = '',
        )
        """

    def testConsumerAuthTokenEndpointInput(self):
        """Test ConsumerAuthTokenEndpointInput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
