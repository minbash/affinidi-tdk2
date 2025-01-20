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

from affinidi_tdk_vault_data_manager_client.models.get_detailed_node_info_ok import GetDetailedNodeInfoOK  # noqa: E501

class TestGetDetailedNodeInfoOK(unittest.TestCase):
    """GetDetailedNodeInfoOK unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetDetailedNodeInfoOK:
        """Test GetDetailedNodeInfoOK
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetDetailedNodeInfoOK`
        """
        model = GetDetailedNodeInfoOK()  # noqa: E501
        if include_optional:
            return GetDetailedNodeInfoOK(
                node_id = '',
                status = 'NOT_SET',
                file_count = 1.337,
                profile_count = 1.337,
                folder_count = 1.337,
                vc_count = 1.337,
                name = '',
                consumer_id = '',
                parent_node_id = '',
                profile_id = '',
                created_at = '',
                modified_at = '',
                created_by = '',
                modified_by = '',
                description = '',
                type = 'VC_ROOT',
                link = '',
                var_schema = '',
                consumed_file_storage = 1.337,
                edek_info = affinidi_tdk_vault_data_manager_client.models.edek_info.EdekInfo(
                    edek = '', 
                    dekek_id = '', ),
                metadata = '',
                get_url = ''
            )
        else:
            return GetDetailedNodeInfoOK(
                node_id = '',
                status = 'NOT_SET',
                name = '',
                consumer_id = '',
                parent_node_id = '',
                profile_id = '',
                created_at = '',
                modified_at = '',
                created_by = '',
                modified_by = '',
                description = '',
                type = 'VC_ROOT',
        )
        """

    def testGetDetailedNodeInfoOK(self):
        """Test GetDetailedNodeInfoOK"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
