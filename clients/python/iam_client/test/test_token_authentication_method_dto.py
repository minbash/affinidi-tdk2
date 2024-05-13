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

from affinidi_tdk_iam_client.models.token_authentication_method_dto import TokenAuthenticationMethodDto  # noqa: E501

class TestTokenAuthenticationMethodDto(unittest.TestCase):
    """TokenAuthenticationMethodDto unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TokenAuthenticationMethodDto:
        """Test TokenAuthenticationMethodDto
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TokenAuthenticationMethodDto`
        """
        model = TokenAuthenticationMethodDto()  # noqa: E501
        if include_optional:
            return TokenAuthenticationMethodDto(
                type = 'PRIVATE_KEY',
                signing_algorithm = 'RS256',
                public_key_info = None
            )
        else:
            return TokenAuthenticationMethodDto(
                type = 'PRIVATE_KEY',
                signing_algorithm = 'RS256',
                public_key_info = None,
        )
        """

    def testTokenAuthenticationMethodDto(self):
        """Test TokenAuthenticationMethodDto"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
