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

from affinidi_tdk_iam_client.models.create_project_scoped_token_input import CreateProjectScopedTokenInput  # noqa: E501

class TestCreateProjectScopedTokenInput(unittest.TestCase):
    """CreateProjectScopedTokenInput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateProjectScopedTokenInput:
        """Test CreateProjectScopedTokenInput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateProjectScopedTokenInput`
        """
        model = CreateProjectScopedTokenInput()  # noqa: E501
        if include_optional:
            return CreateProjectScopedTokenInput(
                project_id = ''
            )
        else:
            return CreateProjectScopedTokenInput(
                project_id = '',
        )
        """

    def testCreateProjectScopedTokenInput(self):
        """Test CreateProjectScopedTokenInput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
