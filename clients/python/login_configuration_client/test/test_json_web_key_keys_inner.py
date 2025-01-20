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

from affinidi_tdk_login_configuration_client.models.json_web_key_keys_inner import JsonWebKeyKeysInner  # noqa: E501

class TestJsonWebKeyKeysInner(unittest.TestCase):
    """JsonWebKeyKeysInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> JsonWebKeyKeysInner:
        """Test JsonWebKeyKeysInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `JsonWebKeyKeysInner`
        """
        model = JsonWebKeyKeysInner()  # noqa: E501
        if include_optional:
            return JsonWebKeyKeysInner(
                alg = '',
                crv = '',
                d = '',
                dp = '',
                dq = '',
                e = '',
                k = '',
                kid = '',
                kty = '',
                n = '',
                p = '',
                q = '',
                qi = '',
                use = '',
                x = '',
                x5c = [
                    ''
                    ],
                y = ''
            )
        else:
            return JsonWebKeyKeysInner(
                alg = '',
                kid = '',
                kty = '',
                use = '',
                x5c = [
                    ''
                    ],
        )
        """

    def testJsonWebKeyKeysInner(self):
        """Test JsonWebKeyKeysInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
