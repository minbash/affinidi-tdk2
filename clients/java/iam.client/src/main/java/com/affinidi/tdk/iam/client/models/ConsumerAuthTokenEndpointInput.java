/*
 * Iam
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iam.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ConsumerAuthTokenEndpointInput
 */
@JsonPropertyOrder({
  ConsumerAuthTokenEndpointInput.JSON_PROPERTY_GRANT_TYPE,
  ConsumerAuthTokenEndpointInput.JSON_PROPERTY_CODE,
  ConsumerAuthTokenEndpointInput.JSON_PROPERTY_REFRESH_TOKEN,
  ConsumerAuthTokenEndpointInput.JSON_PROPERTY_REDIRECT_URI,
  ConsumerAuthTokenEndpointInput.JSON_PROPERTY_CLIENT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:21:47.313409253Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConsumerAuthTokenEndpointInput extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_GRANT_TYPE = "grant_type";
  private String grantType;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refresh_token";
  private String refreshToken;

  public static final String JSON_PROPERTY_REDIRECT_URI = "redirect_uri";
  private String redirectUri;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public ConsumerAuthTokenEndpointInput() {

  }

  public ConsumerAuthTokenEndpointInput grantType(String grantType) {
    
    this.grantType = grantType;
    return this;
  }

  /**
   * Get grantType
   * @return grantType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGrantType() {
    return grantType;
  }


  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public ConsumerAuthTokenEndpointInput code(String code) {
    
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }

  public ConsumerAuthTokenEndpointInput refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public ConsumerAuthTokenEndpointInput redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Get redirectUri
   * @return redirectUri
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedirectUri() {
    return redirectUri;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ConsumerAuthTokenEndpointInput clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerAuthTokenEndpointInput consumerAuthTokenEndpointInput = (ConsumerAuthTokenEndpointInput) o;
    return Objects.equals(this.grantType, consumerAuthTokenEndpointInput.grantType) &&
        Objects.equals(this.code, consumerAuthTokenEndpointInput.code) &&
        Objects.equals(this.refreshToken, consumerAuthTokenEndpointInput.refreshToken) &&
        Objects.equals(this.redirectUri, consumerAuthTokenEndpointInput.redirectUri) &&
        Objects.equals(this.clientId, consumerAuthTokenEndpointInput.clientId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, code, refreshToken, redirectUri, clientId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerAuthTokenEndpointInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

    // add `grant_type` to the URL query string
    if (getGrantType() != null) {
      try {
        joiner.add(String.format("%sgrant_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGrantType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refresh_token` to the URL query string
    if (getRefreshToken() != null) {
      try {
        joiner.add(String.format("%srefresh_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefreshToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirect_uri` to the URL query string
    if (getRedirectUri() != null) {
      try {
        joiner.add(String.format("%sredirect_uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectUri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `client_id` to the URL query string
    if (getClientId() != null) {
      try {
        joiner.add(String.format("%sclient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

