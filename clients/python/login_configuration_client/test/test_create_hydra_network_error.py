# coding: utf-8

"""
    OidcVpAdapterBackend

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_login_configuration_client.models.create_hydra_network_error import CreateHydraNetworkError  # noqa: E501

class TestCreateHydraNetworkError(unittest.TestCase):
    """CreateHydraNetworkError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateHydraNetworkError:
        """Test CreateHydraNetworkError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateHydraNetworkError`
        """
        model = CreateHydraNetworkError()  # noqa: E501
        if include_optional:
            return CreateHydraNetworkError(
                name = 'CreateHydraNetworkError',
                message = 'CreateHydraNetworkError',
                http_status_code = 400,
                trace_id = '',
                details = [
                    affinidi_tdk_login_configuration_client.models.invalid_parameter_error_details_inner.InvalidParameterError_details_inner(
                        issue = '', 
                        field = '', 
                        value = '', 
                        location = '', )
                    ]
            )
        else:
            return CreateHydraNetworkError(
                name = 'CreateHydraNetworkError',
                message = 'CreateHydraNetworkError',
                http_status_code = 400,
                trace_id = '',
        )
        """

    def testCreateHydraNetworkError(self):
        """Test CreateHydraNetworkError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
