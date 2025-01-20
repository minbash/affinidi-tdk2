/*
 * CredentialIssuanceService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.credential.issuance.client.apis;

import com.affinidi.tdk.credential.issuance.client.ApiException;
import com.affinidi.tdk.credential.issuance.client.models.WellKnownOpenIdCredentialIssuerResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WellKnownApi
 */
@Disabled
public class WellKnownApiTest {

    private final WellKnownApi api = new WellKnownApi();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWellKnownOpenIdCredentialIssuerTest() throws ApiException {
        String projectId = null;
        WellKnownOpenIdCredentialIssuerResponse response = api.getWellKnownOpenIdCredentialIssuer(projectId);

        // TODO: test validations
    }
}
