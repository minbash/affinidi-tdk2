# coding: utf-8

"""
    DcfOrchestrator

    # Affinidi Data Connector Framework (DCF) Affinidi DCF is a developer/contributor-focused suite of tools that enables contributors to configure, create, validate and manage data connectors for public consumption. This involves configuring connections to a third party data source and configuring transformation mapping from the data source to a target, “canonical” schema. After setup, DCF validates the configuration of the data connectors and transformation mapping. Following successful validation, created connectors are published.  The Affinidi DCF Orchestrator API covers every step of the data ingestion process, enabling builders to onboard new third-party services as connectors, create authenticated user connections, and pull data to be streamed to Affinidi Vault. It provides a standardized approach to interact with REST APIs, which is also configuration-driven, allowing builders to easily customise the connector's behaviour by modifying configuration files.  The DCF Orchestrator API is organised around three main concepts: Data Source & Configuration, Connector, and User Connection. Below you will find a brief explanation of these and other useful terms:  *Data Source & Configuration* Data Sources represent the third-party service API in our framework. They consist of two entities: the details on how to authenticate with the third-party service are mapped to DataSourceConfig, while the service’s endpoints and data transformation templates are mapped to  DataSource .  Builders can list available DataSourceConfigs and DataSources, create new ones and modify them using our API.  *Connector* This is the building block of our framework. It brings together a Data Source and its Configuration with the builder credentials necessary for connections to be made, for example client ID or client secret. Our endpoints allow builders to list available Connectors, create new ones and modify them.  *User Connection* A user connection is created each time an end user authenticates with a data source via DCF. It holds user specific information relative to a connector and application, including credentials. Our API enables builders to list, create and delete available Connections as well as to execute them to pull data.  *Templates* Builder-defined configuration objects that describe how to interact with a specific third-party service's API, allowing developers to easily connect to and interact with a variety of sources, as well as customising the connector's behaviour. 

    The version of the OpenAPI document: 1.0.0
    Contact: robert.k@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_client_dcf.models.connector_dto import ConnectorDTO  # noqa: E501

class TestConnectorDTO(unittest.TestCase):
    """ConnectorDTO unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConnectorDTO:
        """Test ConnectorDTO
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConnectorDTO`
        """
        model = ConnectorDTO()  # noqa: E501
        if include_optional:
            return ConnectorDTO(
                id = '',
                name = '',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                data_source_ids = [
                    ''
                    ],
                config = affinidi_tdk_client_dcf.models.connector_auth_config.ConnectorAuthConfig(
                    client_id = 'zA9LCSLv1C1ylmgd0.Y2TA0', 
                    custom_fields = [
                        affinidi_tdk_client_dcf.models.config_template_dto_inner.ConfigTemplateDto_inner(
                            key = '', 
                            value = '', 
                            description = '', )
                        ], ),
                status = 'DRAFT',
                icon = 'YQ==',
                website_uri = ''
            )
        else:
            return ConnectorDTO(
                id = '',
                name = '',
                data_source_ids = [
                    ''
                    ],
                config = affinidi_tdk_client_dcf.models.connector_auth_config.ConnectorAuthConfig(
                    client_id = 'zA9LCSLv1C1ylmgd0.Y2TA0', 
                    custom_fields = [
                        affinidi_tdk_client_dcf.models.config_template_dto_inner.ConfigTemplateDto_inner(
                            key = '', 
                            value = '', 
                            description = '', )
                        ], ),
                icon = 'YQ==',
        )
        """

    def testConnectorDTO(self):
        """Test ConnectorDTO"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
