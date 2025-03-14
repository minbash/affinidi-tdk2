/*
 * VaultFileSystem
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.vault.data.manager.client.models;

import java.util.Objects;
import java.util.Arrays;
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
 * CreateAccountInput
 */
@JsonPropertyOrder({
  CreateAccountInput.JSON_PROPERTY_ACCOUNT_INDEX,
  CreateAccountInput.JSON_PROPERTY_PROFILE_DID,
  CreateAccountInput.JSON_PROPERTY_DID_PROOF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateAccountInput {
  public static final String JSON_PROPERTY_ACCOUNT_INDEX = "accountIndex";
  private String accountIndex;

  public static final String JSON_PROPERTY_PROFILE_DID = "profileDid";
  private String profileDid;

  public static final String JSON_PROPERTY_DID_PROOF = "didProof";
  private String didProof;

  public CreateAccountInput() {
  }

  public CreateAccountInput accountIndex(String accountIndex) {
    
    this.accountIndex = accountIndex;
    return this;
  }

  /**
   * number that is used for profile DID derivation
   * @return accountIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountIndex() {
    return accountIndex;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountIndex(String accountIndex) {
    this.accountIndex = accountIndex;
  }

  public CreateAccountInput profileDid(String profileDid) {
    
    this.profileDid = profileDid;
    return this;
  }

  /**
   * DID that is associated with the account number
   * @return profileDid
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROFILE_DID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileDid() {
    return profileDid;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_DID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileDid(String profileDid) {
    this.profileDid = profileDid;
  }

  public CreateAccountInput didProof(String didProof) {
    
    this.didProof = didProof;
    return this;
  }

  /**
   * JWT that proves ownership of profile DID by requester
   * @return didProof
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DID_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDidProof() {
    return didProof;
  }


  @JsonProperty(JSON_PROPERTY_DID_PROOF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDidProof(String didProof) {
    this.didProof = didProof;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountInput createAccountInput = (CreateAccountInput) o;
    return Objects.equals(this.accountIndex, createAccountInput.accountIndex) &&
        Objects.equals(this.profileDid, createAccountInput.profileDid) &&
        Objects.equals(this.didProof, createAccountInput.didProof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIndex, profileDid, didProof);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountInput {\n");
    sb.append("    accountIndex: ").append(toIndentedString(accountIndex)).append("\n");
    sb.append("    profileDid: ").append(toIndentedString(profileDid)).append("\n");
    sb.append("    didProof: ").append(toIndentedString(didProof)).append("\n");
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

    // add `accountIndex` to the URL query string
    if (getAccountIndex() != null) {
      try {
        joiner.add(String.format("%saccountIndex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileDid` to the URL query string
    if (getProfileDid() != null) {
      try {
        joiner.add(String.format("%sprofileDid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileDid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `didProof` to the URL query string
    if (getDidProof() != null) {
      try {
        joiner.add(String.format("%sdidProof%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDidProof()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

