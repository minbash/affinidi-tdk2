# coding: utf-8

"""
    CloudWalletEssentials

    Cloud Wallet For Enterprise Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_wallets_client.models.update_wallet_input import UpdateWalletInput  # noqa: E501

class TestUpdateWalletInput(unittest.TestCase):
    """UpdateWalletInput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateWalletInput:
        """Test UpdateWalletInput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateWalletInput`
        """
        model = UpdateWalletInput()  # noqa: E501
        if include_optional:
            return UpdateWalletInput(
                name = '',
                description = ''
            )
        else:
            return UpdateWalletInput(
        )
        """

    def testUpdateWalletInput(self):
        """Test UpdateWalletInput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
