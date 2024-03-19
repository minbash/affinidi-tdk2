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

from affinidi_tdk_client_vpa.models.list_login_configuration_output import ListLoginConfigurationOutput  # noqa: E501

class TestListLoginConfigurationOutput(unittest.TestCase):
    """ListLoginConfigurationOutput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListLoginConfigurationOutput:
        """Test ListLoginConfigurationOutput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListLoginConfigurationOutput`
        """
        model = ListLoginConfigurationOutput()  # noqa: E501
        if include_optional:
            return ListLoginConfigurationOutput(
                configurations = [
                    { }
                    ],
                last_evaluated_key = ''
            )
        else:
            return ListLoginConfigurationOutput(
                configurations = [
                    { }
                    ],
        )
        """

    def testListLoginConfigurationOutput(self):
        """Test ListLoginConfigurationOutput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
