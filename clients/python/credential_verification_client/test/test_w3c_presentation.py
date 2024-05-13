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

from affinidi_tdk_credential_verification_client.models.w3c_presentation import W3cPresentation  # noqa: E501

class TestW3cPresentation(unittest.TestCase):
    """W3cPresentation unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> W3cPresentation:
        """Test W3cPresentation
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `W3cPresentation`
        """
        model = W3cPresentation()  # noqa: E501
        if include_optional:
            return W3cPresentation(
                context = None,
                id = '',
                type = [
                    ''
                    ],
                holder = affinidi_tdk_credential_verification_client.models.holder.holder(),
                verifiable_credential = [
                    affinidi_tdk_credential_verification_client.models.w3c_credential.W3cCredential(
                        @context = null, 
                        id = '', 
                        type = [
                            ''
                            ], 
                        holder = null, 
                        credential_subject = null, 
                        credential_status = affinidi_tdk_credential_verification_client.models.w3c_credential_status.W3cCredentialStatus(
                            id = '', 
                            type = '', 
                            revocation_list_index = '', 
                            revocation_list_credential = '', ), 
                        issuance_date = '', 
                        issuer = '', 
                        expiration_date = '', 
                        proof = affinidi_tdk_credential_verification_client.models.w3c_proof.W3cProof(
                            created = '', 
                            verification_method = '', 
                            proof_purpose = '', 
                            jws = '', 
                            proof_value = '', 
                            nonce = '', ), 
                        credential_schema = affinidi_tdk_credential_verification_client.models.w3c_credential_credential_schema.W3cCredential_credentialSchema(
                            id = '', ), )
                    ],
                presentation_submission = affinidi_tdk_credential_verification_client.models.presentation_submission.PresentationSubmission(
                    id = '', 
                    definition_id = '', 
                    descriptor_map = [
                        affinidi_tdk_credential_verification_client.models.descriptor.Descriptor(
                            id = '', 
                            path = '', 
                            path_nested = affinidi_tdk_credential_verification_client.models.nested_descriptor.NestedDescriptor(
                                id = '', 
                                path = '', 
                                format = '', ), 
                            format = '', )
                        ], ),
                proof = affinidi_tdk_credential_verification_client.models.proof.proof()
            )
        else:
            return W3cPresentation(
                context = None,
                type = [
                    ''
                    ],
                holder = affinidi_tdk_credential_verification_client.models.holder.holder(),
                verifiable_credential = [
                    affinidi_tdk_credential_verification_client.models.w3c_credential.W3cCredential(
                        @context = null, 
                        id = '', 
                        type = [
                            ''
                            ], 
                        holder = null, 
                        credential_subject = null, 
                        credential_status = affinidi_tdk_credential_verification_client.models.w3c_credential_status.W3cCredentialStatus(
                            id = '', 
                            type = '', 
                            revocation_list_index = '', 
                            revocation_list_credential = '', ), 
                        issuance_date = '', 
                        issuer = '', 
                        expiration_date = '', 
                        proof = affinidi_tdk_credential_verification_client.models.w3c_proof.W3cProof(
                            created = '', 
                            verification_method = '', 
                            proof_purpose = '', 
                            jws = '', 
                            proof_value = '', 
                            nonce = '', ), 
                        credential_schema = affinidi_tdk_credential_verification_client.models.w3c_credential_credential_schema.W3cCredential_credentialSchema(
                            id = '', ), )
                    ],
                proof = affinidi_tdk_credential_verification_client.models.proof.proof(),
        )
        """

    def testW3cPresentation(self):
        """Test W3cPresentation"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
