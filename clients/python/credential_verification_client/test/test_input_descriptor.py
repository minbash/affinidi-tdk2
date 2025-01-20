# coding: utf-8

"""
    VerificationService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_credential_verification_client.models.input_descriptor import InputDescriptor  # noqa: E501

class TestInputDescriptor(unittest.TestCase):
    """InputDescriptor unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> InputDescriptor:
        """Test InputDescriptor
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `InputDescriptor`
        """
        model = InputDescriptor()  # noqa: E501
        if include_optional:
            return InputDescriptor(
                id = '',
                constraints = affinidi_tdk_credential_verification_client.models.constraints.Constraints(
                    limit_disclosure = 'required', 
                    statuses = affinidi_tdk_credential_verification_client.models.constraints_statuses.Constraints_statuses(
                        active = affinidi_tdk_credential_verification_client.models.pd_status.PdStatus(
                            directive = 'required', ), 
                        suspended = affinidi_tdk_credential_verification_client.models.pd_status.PdStatus(
                            directive = 'required', ), 
                        revoked = , ), 
                    fields = [
                        affinidi_tdk_credential_verification_client.models.field.Field(
                            id = '', 
                            path = [
                                ''
                                ], 
                            purpose = '', 
                            filter = affinidi_tdk_credential_verification_client.models.filter.Filter(
                                _const = null, 
                                _enum = [
                                    null
                                    ], 
                                exclusive_minimum = null, 
                                exclusive_maximum = null, 
                                format = '', 
                                format_maximum = '', 
                                format_minimum = '', 
                                format_exclusive_maximum = '', 
                                format_exclusive_minimum = '', 
                                min_length = 56, 
                                max_length = 56, 
                                minimum = null, 
                                maximum = null, 
                                not = affinidi_tdk_credential_verification_client.models.not.not(), 
                                pattern = '', 
                                contains = affinidi_tdk_credential_verification_client.models.filter.Filter(
                                    format = '', 
                                    format_maximum = '', 
                                    format_minimum = '', 
                                    format_exclusive_maximum = '', 
                                    format_exclusive_minimum = '', 
                                    min_length = 56, 
                                    max_length = 56, 
                                    not = affinidi_tdk_credential_verification_client.models.not.not(), 
                                    pattern = '', 
                                    items = null, 
                                    type = '', ), 
                                items = null, 
                                type = '', ), 
                            predicate = 'required', )
                        ], 
                    subject_is_issuer = 'required', 
                    is_holder = [
                        affinidi_tdk_credential_verification_client.models.holder_subject.HolderSubject(
                            field_id = [
                                ''
                                ], 
                            directive = 'required', )
                        ], 
                    same_subject = [
                        affinidi_tdk_credential_verification_client.models.holder_subject.HolderSubject(
                            field_id = [
                                ''
                                ], 
                            directive = 'required', )
                        ], ),
                name = '',
                purpose = '',
                format = affinidi_tdk_credential_verification_client.models.format.Format(
                    jwt = affinidi_tdk_credential_verification_client.models.jwt_object.JwtObject(
                        alg = [
                            ''
                            ], ), 
                    jwt_vc = affinidi_tdk_credential_verification_client.models.jwt_object.JwtObject(
                        alg = [
                            ''
                            ], ), 
                    jwt_vp = , 
                    ldp = affinidi_tdk_credential_verification_client.models.ldp_object.LdpObject(
                        proof_type = [
                            ''
                            ], ), 
                    ldp_vc = affinidi_tdk_credential_verification_client.models.ldp_object.LdpObject(
                        proof_type = [
                            ''
                            ], ), 
                    ldp_vp = , ),
                group = [
                    ''
                    ]
            )
        else:
            return InputDescriptor(
                id = '',
                constraints = affinidi_tdk_credential_verification_client.models.constraints.Constraints(
                    limit_disclosure = 'required', 
                    statuses = affinidi_tdk_credential_verification_client.models.constraints_statuses.Constraints_statuses(
                        active = affinidi_tdk_credential_verification_client.models.pd_status.PdStatus(
                            directive = 'required', ), 
                        suspended = affinidi_tdk_credential_verification_client.models.pd_status.PdStatus(
                            directive = 'required', ), 
                        revoked = , ), 
                    fields = [
                        affinidi_tdk_credential_verification_client.models.field.Field(
                            id = '', 
                            path = [
                                ''
                                ], 
                            purpose = '', 
                            filter = affinidi_tdk_credential_verification_client.models.filter.Filter(
                                _const = null, 
                                _enum = [
                                    null
                                    ], 
                                exclusive_minimum = null, 
                                exclusive_maximum = null, 
                                format = '', 
                                format_maximum = '', 
                                format_minimum = '', 
                                format_exclusive_maximum = '', 
                                format_exclusive_minimum = '', 
                                min_length = 56, 
                                max_length = 56, 
                                minimum = null, 
                                maximum = null, 
                                not = affinidi_tdk_credential_verification_client.models.not.not(), 
                                pattern = '', 
                                contains = affinidi_tdk_credential_verification_client.models.filter.Filter(
                                    format = '', 
                                    format_maximum = '', 
                                    format_minimum = '', 
                                    format_exclusive_maximum = '', 
                                    format_exclusive_minimum = '', 
                                    min_length = 56, 
                                    max_length = 56, 
                                    not = affinidi_tdk_credential_verification_client.models.not.not(), 
                                    pattern = '', 
                                    items = null, 
                                    type = '', ), 
                                items = null, 
                                type = '', ), 
                            predicate = 'required', )
                        ], 
                    subject_is_issuer = 'required', 
                    is_holder = [
                        affinidi_tdk_credential_verification_client.models.holder_subject.HolderSubject(
                            field_id = [
                                ''
                                ], 
                            directive = 'required', )
                        ], 
                    same_subject = [
                        affinidi_tdk_credential_verification_client.models.holder_subject.HolderSubject(
                            field_id = [
                                ''
                                ], 
                            directive = 'required', )
                        ], ),
        )
        """

    def testInputDescriptor(self):
        """Test InputDescriptor"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
