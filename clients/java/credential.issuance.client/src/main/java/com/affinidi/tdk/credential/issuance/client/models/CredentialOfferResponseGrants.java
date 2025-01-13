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


package com.affinidi.tdk.credential.issuance.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.credential.issuance.client.models.CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object indicating to the Wallet the Grant Types the Credential Issuer&#39;s Authorization Server is prepared to process for this Credential Offer.
 */
@JsonPropertyOrder({
  CredentialOfferResponseGrants.JSON_PROPERTY_URN_COLON_IETF_COLON_PARAMS_COLON_OAUTH_COLON_GRANT_TYPE_COLON_PRE_AUTHORIZED_CODE
})
@JsonTypeName("CredentialOfferResponse_grants")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:21:17.954698072Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CredentialOfferResponseGrants {
  public static final String JSON_PROPERTY_URN_COLON_IETF_COLON_PARAMS_COLON_OAUTH_COLON_GRANT_TYPE_COLON_PRE_AUTHORIZED_CODE = "urn:ietf:params:oauth:grant-type:pre-authorized_code";
  private CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode;

  public CredentialOfferResponseGrants() {
  }

  public CredentialOfferResponseGrants urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode(CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode) {
    
    this.urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode = urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode;
    return this;
  }

  /**
   * Get urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode
   * @return urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URN_COLON_IETF_COLON_PARAMS_COLON_OAUTH_COLON_GRANT_TYPE_COLON_PRE_AUTHORIZED_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode getUrnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode() {
    return urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode;
  }


  @JsonProperty(JSON_PROPERTY_URN_COLON_IETF_COLON_PARAMS_COLON_OAUTH_COLON_GRANT_TYPE_COLON_PRE_AUTHORIZED_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode(CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode) {
    this.urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode = urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialOfferResponseGrants credentialOfferResponseGrants = (CredentialOfferResponseGrants) o;
    return Objects.equals(this.urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode, credentialOfferResponseGrants.urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialOfferResponseGrants {\n");
    sb.append("    urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode: ").append(toIndentedString(urnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `urn:ietf:params:oauth:grant-type:pre-authorized_code` to the URL query string
    if (getUrnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode() != null) {
      joiner.add(getUrnColonIetfColonParamsColonOauthColonGrantTypeColonPreAuthorizedCode().toUrlQueryString(prefix + "urn:ietf:params:oauth:grant-type:pre-authorized_code" + suffix));
    }

    return joiner.toString();
  }

}

