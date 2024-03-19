# coding: utf-8

"""
    KeyManagementService

    Affinidi Key Management Service

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_client_kms.models.get_seed_result_dto import GetSeedResultDto  # noqa: E501

class TestGetSeedResultDto(unittest.TestCase):
    """GetSeedResultDto unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetSeedResultDto:
        """Test GetSeedResultDto
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetSeedResultDto`
        """
        model = GetSeedResultDto()  # noqa: E501
        if include_optional:
            return GetSeedResultDto(
                id = '',
                project_id = '',
                ari = ''
            )
        else:
            return GetSeedResultDto(
        )
        """

    def testGetSeedResultDto(self):
        """Test GetSeedResultDto"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
