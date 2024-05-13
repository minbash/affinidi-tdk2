# coding: utf-8

# flake8: noqa

"""
    CredentialIssuanceService

    Affinidi Credential Issuance Service Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


__version__ = "1.0.0"

# import apis into sdk package
from affinidi_tdk_credential_issuance_client.api.configuration_api import ConfigurationApi
from affinidi_tdk_credential_issuance_client.api.credentials_api import CredentialsApi
from affinidi_tdk_credential_issuance_client.api.issuance_api import IssuanceApi
from affinidi_tdk_credential_issuance_client.api.offer_api import OfferApi
from affinidi_tdk_credential_issuance_client.api.well_known_api import WellKnownApi

# import ApiClient
from affinidi_tdk_credential_issuance_client.api_response import ApiResponse
from affinidi_tdk_credential_issuance_client.api_client import ApiClient
from affinidi_tdk_credential_issuance_client.configuration import Configuration
from affinidi_tdk_credential_issuance_client.exceptions import OpenApiException
from affinidi_tdk_credential_issuance_client.exceptions import ApiTypeError
from affinidi_tdk_credential_issuance_client.exceptions import ApiValueError
from affinidi_tdk_credential_issuance_client.exceptions import ApiKeyError
from affinidi_tdk_credential_issuance_client.exceptions import ApiAttributeError
from affinidi_tdk_credential_issuance_client.exceptions import ApiException

# import models into sdk package
from affinidi_tdk_credential_issuance_client.models.action_forbidden_error import ActionForbiddenError
from affinidi_tdk_credential_issuance_client.models.action_forbidden_error_details_inner import ActionForbiddenErrorDetailsInner
from affinidi_tdk_credential_issuance_client.models.create_credential_input import CreateCredentialInput
from affinidi_tdk_credential_issuance_client.models.create_issuance_config400_response import CreateIssuanceConfig400Response
from affinidi_tdk_credential_issuance_client.models.create_issuance_config_input import CreateIssuanceConfigInput
from affinidi_tdk_credential_issuance_client.models.create_issuance_config_input_credential_supported_inner import CreateIssuanceConfigInputCredentialSupportedInner
from affinidi_tdk_credential_issuance_client.models.credential_issuance_id_exist_error import CredentialIssuanceIdExistError
from affinidi_tdk_credential_issuance_client.models.credential_offer_expired_error import CredentialOfferExpiredError
from affinidi_tdk_credential_issuance_client.models.credential_offer_response import CredentialOfferResponse
from affinidi_tdk_credential_issuance_client.models.credential_offer_response_grants import CredentialOfferResponseGrants
from affinidi_tdk_credential_issuance_client.models.credential_offer_response_grants_urn_ietf_params_oauth_grant_type_pre_authorized_code import CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode
from affinidi_tdk_credential_issuance_client.models.credential_offer_response_grants_urn_ietf_params_oauth_grant_type_pre_authorized_code_tx_code import CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCodeTxCode
from affinidi_tdk_credential_issuance_client.models.credential_proof import CredentialProof
from affinidi_tdk_credential_issuance_client.models.credential_response import CredentialResponse
from affinidi_tdk_credential_issuance_client.models.credential_response_deferred import CredentialResponseDeferred
from affinidi_tdk_credential_issuance_client.models.credential_response_immediate import CredentialResponseImmediate
from affinidi_tdk_credential_issuance_client.models.credential_subject_not_valid_error import CredentialSubjectNotValidError
from affinidi_tdk_credential_issuance_client.models.deferred_credential_input import DeferredCredentialInput
from affinidi_tdk_credential_issuance_client.models.generate_credentials400_response import GenerateCredentials400Response
from affinidi_tdk_credential_issuance_client.models.get_credential_offer400_response import GetCredentialOffer400Response
from affinidi_tdk_credential_issuance_client.models.invalid_credential_request_error import InvalidCredentialRequestError
from affinidi_tdk_credential_issuance_client.models.invalid_credential_type_error import InvalidCredentialTypeError
from affinidi_tdk_credential_issuance_client.models.invalid_issuer_wallet_error import InvalidIssuerWalletError
from affinidi_tdk_credential_issuance_client.models.invalid_jwt_token_error import InvalidJwtTokenError
from affinidi_tdk_credential_issuance_client.models.invalid_parameter_error import InvalidParameterError
from affinidi_tdk_credential_issuance_client.models.invalid_proof_error import InvalidProofError
from affinidi_tdk_credential_issuance_client.models.issuance_config_dto import IssuanceConfigDto
from affinidi_tdk_credential_issuance_client.models.issuance_config_list_response import IssuanceConfigListResponse
from affinidi_tdk_credential_issuance_client.models.issuance_config_mini_dto import IssuanceConfigMiniDto
from affinidi_tdk_credential_issuance_client.models.issuance_state_response import IssuanceStateResponse
from affinidi_tdk_credential_issuance_client.models.list_issuance_response import ListIssuanceResponse
from affinidi_tdk_credential_issuance_client.models.not_found_error import NotFoundError
from affinidi_tdk_credential_issuance_client.models.project_credential_config_exist_error import ProjectCredentialConfigExistError
from affinidi_tdk_credential_issuance_client.models.project_credential_config_not_exist_error import ProjectCredentialConfigNotExistError
from affinidi_tdk_credential_issuance_client.models.start_issuance400_response import StartIssuance400Response
from affinidi_tdk_credential_issuance_client.models.start_issuance_input import StartIssuanceInput
from affinidi_tdk_credential_issuance_client.models.start_issuance_input_data_inner import StartIssuanceInputDataInner
from affinidi_tdk_credential_issuance_client.models.start_issuance_response import StartIssuanceResponse
from affinidi_tdk_credential_issuance_client.models.update_issuance_config_input import UpdateIssuanceConfigInput
from affinidi_tdk_credential_issuance_client.models.well_known_open_id_credential_issuer_response import WellKnownOpenIdCredentialIssuerResponse
