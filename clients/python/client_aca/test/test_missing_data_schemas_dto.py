# coding: utf-8

"""
    AivCloudApi

    Affinidi AivCloudApi Structure

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_client_aca.models.missing_data_schemas_dto import MissingDataSchemasDto  # noqa: E501

class TestMissingDataSchemasDto(unittest.TestCase):
    """MissingDataSchemasDto unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MissingDataSchemasDto:
        """Test MissingDataSchemasDto
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MissingDataSchemasDto`
        """
        model = MissingDataSchemasDto()  # noqa: E501
        if include_optional:
            return MissingDataSchemasDto(
                schema_list = None
            )
        else:
            return MissingDataSchemasDto(
        )
        """

    def testMissingDataSchemasDto(self):
        """Test MissingDataSchemasDto"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
