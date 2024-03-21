# coding: utf-8

"""
    VerificationService

    Affinidi VerificationService Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_client_ver.models.verify_presentation_input import VerifyPresentationInput  # noqa: E501

class TestVerifyPresentationInput(unittest.TestCase):
    """VerifyPresentationInput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VerifyPresentationInput:
        """Test VerifyPresentationInput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VerifyPresentationInput`
        """
        model = VerifyPresentationInput()  # noqa: E501
        if include_optional:
            return VerifyPresentationInput(
                verifiable_presentation = affinidi_tdk_client_ver.models.w3c_presentation.W3cPresentation(
                    @context = null, 
                    id = '', 
                    type = [
                        ''
                        ], 
                    holder = affinidi_tdk_client_ver.models.holder.holder(), 
                    verifiable_credential = [
                        affinidi_tdk_client_ver.models.w3c_credential.W3cCredential(
                            @context = null, 
                            id = '', 
                            type = [
                                ''
                                ], 
                            holder = null, 
                            credential_subject = null, 
                            credential_status = affinidi_tdk_client_ver.models.w3c_credential_status.W3cCredentialStatus(
                                id = '', 
                                type = '', 
                                revocation_list_index = '', 
                                revocation_list_credential = '', ), 
                            issuance_date = '', 
                            issuer = '', 
                            expiration_date = '', 
                            proof = affinidi_tdk_client_ver.models.w3c_proof.W3cProof(
                                created = '', 
                                verification_method = '', 
                                proof_purpose = '', 
                                jws = '', 
                                proof_value = '', 
                                nonce = '', ), 
                            credential_schema = affinidi_tdk_client_ver.models.w3c_credential_credential_schema.W3cCredential_credentialSchema(
                                id = '', ), )
                        ], 
                    presentation_submission = affinidi_tdk_client_ver.models.presentation_submission.PresentationSubmission(
                        id = '', 
                        definition_id = '', 
                        descriptor_map = [
                            affinidi_tdk_client_ver.models.descriptor.Descriptor(
                                id = '', 
                                path = '', 
                                path_nested = affinidi_tdk_client_ver.models.nested_descriptor.NestedDescriptor(
                                    id = '', 
                                    path = '', 
                                    format = '', ), 
                                format = '', )
                            ], ), 
                    proof = affinidi_tdk_client_ver.models.proof.proof(), ),
                signed_presentation = affinidi_tdk_client_ver.models.w3c_presentation.W3cPresentation(
                    @context = null, 
                    id = '', 
                    type = [
                        ''
                        ], 
                    holder = affinidi_tdk_client_ver.models.holder.holder(), 
                    verifiable_credential = [
                        affinidi_tdk_client_ver.models.w3c_credential.W3cCredential(
                            @context = null, 
                            id = '', 
                            type = [
                                ''
                                ], 
                            holder = null, 
                            credential_subject = null, 
                            credential_status = affinidi_tdk_client_ver.models.w3c_credential_status.W3cCredentialStatus(
                                id = '', 
                                type = '', 
                                revocation_list_index = '', 
                                revocation_list_credential = '', ), 
                            issuance_date = '', 
                            issuer = '', 
                            expiration_date = '', 
                            proof = affinidi_tdk_client_ver.models.w3c_proof.W3cProof(
                                created = '', 
                                verification_method = '', 
                                proof_purpose = '', 
                                jws = '', 
                                proof_value = '', 
                                nonce = '', ), 
                            credential_schema = affinidi_tdk_client_ver.models.w3c_credential_credential_schema.W3cCredential_credentialSchema(
                                id = '', ), )
                        ], 
                    presentation_submission = affinidi_tdk_client_ver.models.presentation_submission.PresentationSubmission(
                        id = '', 
                        definition_id = '', 
                        descriptor_map = [
                            affinidi_tdk_client_ver.models.descriptor.Descriptor(
                                id = '', 
                                path = '', 
                                path_nested = affinidi_tdk_client_ver.models.nested_descriptor.NestedDescriptor(
                                    id = '', 
                                    path = '', 
                                    format = '', ), 
                                format = '', )
                            ], ), 
                    proof = affinidi_tdk_client_ver.models.proof.proof(), ),
                presentation_definition = affinidi_tdk_client_ver.models.presentation_definition.PresentationDefinition(
                    id = '', 
                    name = '', 
                    purpose = '', 
                    format = affinidi_tdk_client_ver.models.format.Format(
                        jwt = affinidi_tdk_client_ver.models.jwt_object.JwtObject(
                            alg = [
                                ''
                                ], ), 
                        jwt_vc = affinidi_tdk_client_ver.models.jwt_object.JwtObject(
                            alg = [
                                ''
                                ], ), 
                        jwt_vp = , 
                        ldp = affinidi_tdk_client_ver.models.ldp_object.LdpObject(
                            proof_type = [
                                ''
                                ], ), 
                        ldp_vc = affinidi_tdk_client_ver.models.ldp_object.LdpObject(
                            proof_type = [
                                ''
                                ], ), 
                        ldp_vp = , ), 
                    submission_requirements = [
                        affinidi_tdk_client_ver.models.submission_requirement.SubmissionRequirement(
                            name = '', 
                            purpose = '', 
                            rule = 'all', 
                            count = 56, 
                            min = 56, 
                            max = 56, 
                            from = '', 
                            from_nested = [
                                affinidi_tdk_client_ver.models.submission_requirement.SubmissionRequirement(
                                    name = '', 
                                    purpose = '', 
                                    rule = 'all', 
                                    count = 56, 
                                    min = 56, 
                                    max = 56, 
                                    from = '', )
                                ], )
                        ], 
                    input_descriptors = [
                        affinidi_tdk_client_ver.models.input_descriptor.InputDescriptor(
                            id = '', 
                            constraints = affinidi_tdk_client_ver.models.constraints.Constraints(
                                limit_disclosure = 'required', 
                                statuses = affinidi_tdk_client_ver.models.constraints_statuses.Constraints_statuses(
                                    active = affinidi_tdk_client_ver.models.pd_status.PdStatus(
                                        directive = 'required', ), 
                                    suspended = affinidi_tdk_client_ver.models.pd_status.PdStatus(
                                        directive = 'required', ), 
                                    revoked = , ), 
                                fields = [
                                    affinidi_tdk_client_ver.models.field.Field(
                                        id = '', 
                                        path = [
                                            ''
                                            ], 
                                        purpose = '', 
                                        filter = affinidi_tdk_client_ver.models.filter.Filter(
                                            _const = null, 
                                            _enum = [
                                                null
                                                ], 
                                            exclusive_minimum = null, 
                                            exclusive_maximum = null, 
                                            format_maximum = '', 
                                            format_minimum = '', 
                                            format_exclusive_maximum = '', 
                                            format_exclusive_minimum = '', 
                                            min_length = 56, 
                                            max_length = 56, 
                                            minimum = null, 
                                            maximum = null, 
                                            not = affinidi_tdk_client_ver.models.not.not(), 
                                            pattern = '', 
                                            contains = affinidi_tdk_client_ver.models.filter.Filter(
                                                format_maximum = '', 
                                                format_minimum = '', 
                                                format_exclusive_maximum = '', 
                                                format_exclusive_minimum = '', 
                                                min_length = 56, 
                                                max_length = 56, 
                                                not = affinidi_tdk_client_ver.models.not.not(), 
                                                pattern = '', 
                                                items = null, 
                                                type = '', ), 
                                            items = null, 
                                            type = '', ), 
                                        predicate = 'required', )
                                    ], 
                                subject_is_issuer = 'required', 
                                is_holder = [
                                    affinidi_tdk_client_ver.models.holder_subject.HolderSubject(
                                        field_id = [
                                            ''
                                            ], 
                                        directive = 'required', )
                                    ], 
                                same_subject = [
                                    affinidi_tdk_client_ver.models.holder_subject.HolderSubject(
                                        field_id = [
                                            ''
                                            ], 
                                        directive = 'required', )
                                    ], ), 
                            name = '', 
                            purpose = '', 
                            group = [
                                ''
                                ], )
                        ], 
                    frame = {
                        'key' : null
                        }, ),
                presentation_submission = affinidi_tdk_client_ver.models.presentation_submission.PresentationSubmission(
                    id = '', 
                    definition_id = '', 
                    descriptor_map = [
                        affinidi_tdk_client_ver.models.descriptor.Descriptor(
                            id = '', 
                            path = '', 
                            path_nested = affinidi_tdk_client_ver.models.nested_descriptor.NestedDescriptor(
                                id = '', 
                                path = '', 
                                format = '', ), 
                            format = '', )
                        ], ),
                challenge = ''
            )
        else:
            return VerifyPresentationInput(
        )
        """

    def testVerifyPresentationInput(self):
        """Test VerifyPresentationInput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
