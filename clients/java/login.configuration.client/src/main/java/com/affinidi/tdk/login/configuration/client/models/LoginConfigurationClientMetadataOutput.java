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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * login configuration client metadata
 */
@JsonPropertyOrder({
  LoginConfigurationClientMetadataOutput.JSON_PROPERTY_NAME,
  LoginConfigurationClientMetadataOutput.JSON_PROPERTY_ORIGIN,
  LoginConfigurationClientMetadataOutput.JSON_PROPERTY_LOGO,
  LoginConfigurationClientMetadataOutput.JSON_PROPERTY_DOMAIN_VERIFIED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:20:45.285025567Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LoginConfigurationClientMetadataOutput extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private String origin;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private String logo;

  public static final String JSON_PROPERTY_DOMAIN_VERIFIED = "domainVerified";
  private Boolean domainVerified;

  public LoginConfigurationClientMetadataOutput() {

  }

  public LoginConfigurationClientMetadataOutput name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * application name that will be displayed in consent page
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }

  public LoginConfigurationClientMetadataOutput origin(String origin) {
    
    this.origin = origin;
    return this;
  }

  /**
   * origin url that will be displayed in consent page
   * @return origin
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrigin() {
    return origin;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public LoginConfigurationClientMetadataOutput logo(String logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * logo url that will be displayed in consent page
   * @return logo
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogo(String logo) {
    this.logo = logo;
  }

  public LoginConfigurationClientMetadataOutput domainVerified(Boolean domainVerified) {
    
    this.domainVerified = domainVerified;
    return this;
  }

  /**
   * indicates if the developer&#39;s ownership of the domain has been verified
   * @return domainVerified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDomainVerified() {
    return domainVerified;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainVerified(Boolean domainVerified) {
    this.domainVerified = domainVerified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginConfigurationClientMetadataOutput loginConfigurationClientMetadataOutput = (LoginConfigurationClientMetadataOutput) o;
    return Objects.equals(this.name, loginConfigurationClientMetadataOutput.name) &&
        Objects.equals(this.origin, loginConfigurationClientMetadataOutput.origin) &&
        Objects.equals(this.logo, loginConfigurationClientMetadataOutput.logo) &&
        Objects.equals(this.domainVerified, loginConfigurationClientMetadataOutput.domainVerified) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, origin, logo, domainVerified, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginConfigurationClientMetadataOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    domainVerified: ").append(toIndentedString(domainVerified)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `origin` to the URL query string
    if (getOrigin() != null) {
      try {
        joiner.add(String.format("%sorigin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrigin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      try {
        joiner.add(String.format("%slogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `domainVerified` to the URL query string
    if (getDomainVerified() != null) {
      try {
        joiner.add(String.format("%sdomainVerified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomainVerified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

