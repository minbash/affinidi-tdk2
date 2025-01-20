# coding: utf-8

"""
    CloudWalletEssentials

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_wallets_client.models.entity_not_found_error import EntityNotFoundError  # noqa: E501

class TestEntityNotFoundError(unittest.TestCase):
    """EntityNotFoundError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EntityNotFoundError:
        """Test EntityNotFoundError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EntityNotFoundError`
        """
        model = EntityNotFoundError()  # noqa: E501
        if include_optional:
            return EntityNotFoundError(
                name = 'EntityNotFoundError',
                message = 'Entity not found',
                http_status_code = 404,
                trace_id = '',
                details = [
                    affinidi_tdk_wallets_client.models.service_error_response_details_inner.ServiceErrorResponse_details_inner(
                        issue = '', 
                        field = '', 
                        value = '', 
                        location = '', )
                    ]
            )
        else:
            return EntityNotFoundError(
                name = 'EntityNotFoundError',
                message = 'Entity not found',
                http_status_code = 404,
                trace_id = '',
        )
        """

    def testEntityNotFoundError(self):
        """Test EntityNotFoundError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
