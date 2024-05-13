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

from affinidi_tdk_wallets_client.models.wallet_dto import WalletDto  # noqa: E501

class TestWalletDto(unittest.TestCase):
    """WalletDto unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> WalletDto:
        """Test WalletDto
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `WalletDto`
        """
        model = WalletDto()  # noqa: E501
        if include_optional:
            return WalletDto(
                id = '',
                did = '',
                name = '',
                description = '',
                did_document = None,
                ari = '',
                keys = [
                    affinidi_tdk_wallets_client.models.wallet_dto_keys_inner.WalletDto_keys_inner(
                        id = '', 
                        ari = '', )
                    ]
            )
        else:
            return WalletDto(
        )
        """

    def testWalletDto(self):
        """Test WalletDto"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
