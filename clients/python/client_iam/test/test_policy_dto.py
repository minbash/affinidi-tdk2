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

from affinidi_tdk_client_iam.models.policy_dto import PolicyDto  # noqa: E501

class TestPolicyDto(unittest.TestCase):
    """PolicyDto unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PolicyDto:
        """Test PolicyDto
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PolicyDto`
        """
        model = PolicyDto()  # noqa: E501
        if include_optional:
            return PolicyDto(
                principal_id = '',
                project_id = '',
                version = '',
                statement = [
                    affinidi_tdk_client_iam.models.policy_statement_dto.PolicyStatementDto(
                        action = [
                            ''
                            ], 
                        effect = '', 
                        principal = [
                            ''
                            ], 
                        resource = [
                            ''
                            ], )
                    ]
            )
        else:
            return PolicyDto(
                version = '',
                statement = [
                    affinidi_tdk_client_iam.models.policy_statement_dto.PolicyStatementDto(
                        action = [
                            ''
                            ], 
                        effect = '', 
                        principal = [
                            ''
                            ], 
                        resource = [
                            ''
                            ], )
                    ],
        )
        """

    def testPolicyDto(self):
        """Test PolicyDto"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
