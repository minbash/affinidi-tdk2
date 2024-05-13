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

from affinidi_tdk_credential_verification_client.models.filter import Filter  # noqa: E501

class TestFilter(unittest.TestCase):
    """Filter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Filter:
        """Test Filter
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Filter`
        """
        model = Filter()  # noqa: E501
        if include_optional:
            return Filter(
                const = None,
                enum = [
                    null
                    ],
                exclusive_minimum = None,
                exclusive_maximum = None,
                format = '',
                format_maximum = '',
                format_minimum = '',
                format_exclusive_maximum = '',
                format_exclusive_minimum = '',
                min_length = 56,
                max_length = 56,
                minimum = None,
                maximum = None,
                var_not = affinidi_tdk_credential_verification_client.models.not.not(),
                pattern = '',
                contains = affinidi_tdk_credential_verification_client.models.filter.Filter(
                    _const = null, 
                    _enum = [
                        null
                        ], 
                    exclusive_minimum = null, 
                    exclusive_maximum = null, 
                    format = '', 
                    format_maximum = '', 
                    format_minimum = '', 
                    format_exclusive_maximum = '', 
                    format_exclusive_minimum = '', 
                    min_length = 56, 
                    max_length = 56, 
                    minimum = null, 
                    maximum = null, 
                    not = affinidi_tdk_credential_verification_client.models.not.not(), 
                    pattern = '', 
                    items = null, 
                    type = '', ),
                items = None,
                type = ''
            )
        else:
            return Filter(
        )
        """

    def testFilter(self):
        """Test Filter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
