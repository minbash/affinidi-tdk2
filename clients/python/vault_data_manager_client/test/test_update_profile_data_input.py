# coding: utf-8

"""
    VaultFileSystem

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_vault_data_manager_client.models.update_profile_data_input import UpdateProfileDataInput  # noqa: E501

class TestUpdateProfileDataInput(unittest.TestCase):
    """UpdateProfileDataInput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateProfileDataInput:
        """Test UpdateProfileDataInput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateProfileDataInput`
        """
        model = UpdateProfileDataInput()  # noqa: E501
        if include_optional:
            return UpdateProfileDataInput(
                dek = '',
                data = None
            )
        else:
            return UpdateProfileDataInput(
                dek = '',
                data = None,
        )
        """

    def testUpdateProfileDataInput(self):
        """Test UpdateProfileDataInput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
