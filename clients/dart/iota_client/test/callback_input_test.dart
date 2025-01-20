import 'package:test/test.dart';
import 'package:affinidi_tdk_iota_client/affinidi_tdk_iota_client.dart';

// tests for CallbackInput
void main() {
  final instance = CallbackInputBuilder();
  // TODO add properties to the builder and call build()

  group(CallbackInput, () {
    // A randomly generated string that follows a valid UUID (version 1-5) format to validate the session.
    // String state
    test('to test the property `state`', () async {
      // TODO
    });

    // A JSON string format that describes the link between the Verifiable Presentation and Presentation Definition for the verifier. The presentation submission follows the OID4VP standard.
    // String presentationSubmission
    test('to test the property `presentationSubmission`', () async {
      // TODO
    });

    // A JSON string format containing the data the user consented to share in a Verifiable Presentation format. The VP Token follows the OID4VP standard.
    // String vpToken
    test('to test the property `vpToken`', () async {
      // TODO
    });

    // A short string indicating the error code reported by the service. It follows the OAuth 2.0 error code format (e.g., invalid_request, access_denied). The default is access_denied.
    // String error
    test('to test the property `error`', () async {
      // TODO
    });

    // A human-readable description that provides detailed information about the error.
    // String errorDescription
    test('to test the property `errorDescription`', () async {
      // TODO
    });

    // It specifies whether the data sharing flow triggered an onboarding process to the Affinidi Vault [New User].
    // bool onboarded
    test('to test the property `onboarded`', () async {
      // TODO
    });

  });
}
