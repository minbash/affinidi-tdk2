/*
 * OidcVpAdapterBackend
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.login.configuration.client.models;

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
 * OIDC Auth Credentials
 */
@JsonPropertyOrder({
  CreateLoginConfigurationOutputAuth.JSON_PROPERTY_CLIENT_ID,
  CreateLoginConfigurationOutputAuth.JSON_PROPERTY_CLIENT_SECRET,
  CreateLoginConfigurationOutputAuth.JSON_PROPERTY_SCOPE,
  CreateLoginConfigurationOutputAuth.JSON_PROPERTY_ISSUER
})
@JsonTypeName("CreateLoginConfigurationOutput_auth")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:20:45.285025567Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateLoginConfigurationOutputAuth {
  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  private String clientSecret;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public CreateLoginConfigurationOutputAuth() {
  }

  public CreateLoginConfigurationOutputAuth clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth 2.0 Client ID
   * @return clientId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CreateLoginConfigurationOutputAuth clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * OAuth 2.0 Client Secret
   * @return clientSecret
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public CreateLoginConfigurationOutputAuth scope(String scope) {
    
    this.scope = scope;
    return this;
  }

  /**
   * OAuth 2.0 Client Scope
   * @return scope
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(String scope) {
    this.scope = scope;
  }

  public CreateLoginConfigurationOutputAuth issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

  /**
   * Issuer URL
   * @return issuer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoginConfigurationOutputAuth createLoginConfigurationOutputAuth = (CreateLoginConfigurationOutputAuth) o;
    return Objects.equals(this.clientId, createLoginConfigurationOutputAuth.clientId) &&
        Objects.equals(this.clientSecret, createLoginConfigurationOutputAuth.clientSecret) &&
        Objects.equals(this.scope, createLoginConfigurationOutputAuth.scope) &&
        Objects.equals(this.issuer, createLoginConfigurationOutputAuth.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, scope, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoginConfigurationOutputAuth {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

    // add `clientId` to the URL query string
    if (getClientId() != null) {
      try {
        joiner.add(String.format("%sclientId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `clientSecret` to the URL query string
    if (getClientSecret() != null) {
      try {
        joiner.add(String.format("%sclientSecret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      try {
        joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScope()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `issuer` to the URL query string
    if (getIssuer() != null) {
      try {
        joiner.add(String.format("%sissuer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuer()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

