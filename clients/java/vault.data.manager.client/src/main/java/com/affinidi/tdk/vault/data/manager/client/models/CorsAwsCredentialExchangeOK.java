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
 * CorsAwsCredentialExchangeOK
 */
@JsonPropertyOrder({
  CorsAwsCredentialExchangeOK.JSON_PROPERTY_CORS_AWS_CREDENTIAL_EXCHANGE_OK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:23:40.721253515Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CorsAwsCredentialExchangeOK {
  public static final String JSON_PROPERTY_CORS_AWS_CREDENTIAL_EXCHANGE_OK = "corsAwsCredentialExchangeOk";
  private String corsAwsCredentialExchangeOk;

  public CorsAwsCredentialExchangeOK() {
  }

  public CorsAwsCredentialExchangeOK corsAwsCredentialExchangeOk(String corsAwsCredentialExchangeOk) {
    
    this.corsAwsCredentialExchangeOk = corsAwsCredentialExchangeOk;
    return this;
  }

  /**
   * Get corsAwsCredentialExchangeOk
   * @return corsAwsCredentialExchangeOk
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORS_AWS_CREDENTIAL_EXCHANGE_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCorsAwsCredentialExchangeOk() {
    return corsAwsCredentialExchangeOk;
  }


  @JsonProperty(JSON_PROPERTY_CORS_AWS_CREDENTIAL_EXCHANGE_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorsAwsCredentialExchangeOk(String corsAwsCredentialExchangeOk) {
    this.corsAwsCredentialExchangeOk = corsAwsCredentialExchangeOk;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorsAwsCredentialExchangeOK corsAwsCredentialExchangeOK = (CorsAwsCredentialExchangeOK) o;
    return Objects.equals(this.corsAwsCredentialExchangeOk, corsAwsCredentialExchangeOK.corsAwsCredentialExchangeOk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corsAwsCredentialExchangeOk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorsAwsCredentialExchangeOK {\n");
    sb.append("    corsAwsCredentialExchangeOk: ").append(toIndentedString(corsAwsCredentialExchangeOk)).append("\n");
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

    // add `corsAwsCredentialExchangeOk` to the URL query string
    if (getCorsAwsCredentialExchangeOk() != null) {
      try {
        joiner.add(String.format("%scorsAwsCredentialExchangeOk%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCorsAwsCredentialExchangeOk()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

