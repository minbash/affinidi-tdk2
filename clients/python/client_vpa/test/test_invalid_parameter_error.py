# coding: utf-8

"""
    OidcVpAdapterBackend

    Affinidi OIDC VP Adapter Backend  An authorization token is necessary to create or obtain a project Access Token and access Admin APIs. Follow these step-by-step [instructions](https://lemmatree.atlassian.net/wiki/spaces/NETCORE/pages/2735317648020/ASA+Developer+Flow#Instructions-on-how-to-create-the-Project.)  to set up an authorization token 

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_client_vpa.models.invalid_parameter_error import InvalidParameterError  # noqa: E501

class TestInvalidParameterError(unittest.TestCase):
    """InvalidParameterError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> InvalidParameterError:
        """Test InvalidParameterError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `InvalidParameterError`
        """
        model = InvalidParameterError()  # noqa: E501
        if include_optional:
            return InvalidParameterError(
                name = 'InvalidParameterError',
                message = 'Invalid parameter: ${param}.',
                http_status_code = 400,
                trace_id = '',
                details = [
                    affinidi_tdk_client_vpa.models.invalid_parameter_error_details_inner.InvalidParameterError_details_inner(
                        issue = '', 
                        field = '', 
                        value = '', 
                        location = '', )
                    ]
            )
        else:
            return InvalidParameterError(
                name = 'InvalidParameterError',
                message = 'Invalid parameter: ${param}.',
                http_status_code = 400,
                trace_id = '',
        )
        """

    def testInvalidParameterError(self):
        """Test InvalidParameterError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
