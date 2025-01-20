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

from affinidi_tdk_login_configuration_client.models.get_user_info import GetUserInfo  # noqa: E501

class TestGetUserInfo(unittest.TestCase):
    """GetUserInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetUserInfo:
        """Test GetUserInfo
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetUserInfo`
        """
        model = GetUserInfo()  # noqa: E501
        if include_optional:
            return GetUserInfo(
                birthdate = '',
                email = '',
                email_verified = True,
                family_name = '',
                gender = '',
                given_name = '',
                locale = '',
                middle_name = '',
                name = '',
                nickname = '',
                phone_number = '',
                phone_number_verified = True,
                picture = '',
                preferred_username = '',
                profile = '',
                sub = '',
                updated_at = 56,
                website = '',
                zoneinfo = ''
            )
        else:
            return GetUserInfo(
        )
        """

    def testGetUserInfo(self):
        """Test GetUserInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
