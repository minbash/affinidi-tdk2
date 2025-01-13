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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * OIDCConfigCredentialsSupportedDraft00Inner
 */
@JsonPropertyOrder({
  OIDCConfigCredentialsSupportedDraft00Inner.JSON_PROPERTY_CRYPTOGRAPHIC_BINDING_METHODS_SUPPORTED,
  OIDCConfigCredentialsSupportedDraft00Inner.JSON_PROPERTY_CRYPTOGRAPHIC_SUITES_SUPPORTED,
  OIDCConfigCredentialsSupportedDraft00Inner.JSON_PROPERTY_FORMAT,
  OIDCConfigCredentialsSupportedDraft00Inner.JSON_PROPERTY_TYPES
})
@JsonTypeName("OIDCConfig_credentials_supported_draft_00_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:20:45.285025567Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OIDCConfigCredentialsSupportedDraft00Inner {
  public static final String JSON_PROPERTY_CRYPTOGRAPHIC_BINDING_METHODS_SUPPORTED = "cryptographic_binding_methods_supported";
  private List<String> cryptographicBindingMethodsSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_CRYPTOGRAPHIC_SUITES_SUPPORTED = "cryptographic_suites_supported";
  private List<String> cryptographicSuitesSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_TYPES = "types";
  private List<String> types = new ArrayList<>();

  public OIDCConfigCredentialsSupportedDraft00Inner() {
  }

  public OIDCConfigCredentialsSupportedDraft00Inner cryptographicBindingMethodsSupported(List<String> cryptographicBindingMethodsSupported) {
    
    this.cryptographicBindingMethodsSupported = cryptographicBindingMethodsSupported;
    return this;
  }

  public OIDCConfigCredentialsSupportedDraft00Inner addCryptographicBindingMethodsSupportedItem(String cryptographicBindingMethodsSupportedItem) {
    if (this.cryptographicBindingMethodsSupported == null) {
      this.cryptographicBindingMethodsSupported = new ArrayList<>();
    }
    this.cryptographicBindingMethodsSupported.add(cryptographicBindingMethodsSupportedItem);
    return this;
  }

  /**
   * Get cryptographicBindingMethodsSupported
   * @return cryptographicBindingMethodsSupported
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRYPTOGRAPHIC_BINDING_METHODS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCryptographicBindingMethodsSupported() {
    return cryptographicBindingMethodsSupported;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTOGRAPHIC_BINDING_METHODS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCryptographicBindingMethodsSupported(List<String> cryptographicBindingMethodsSupported) {
    this.cryptographicBindingMethodsSupported = cryptographicBindingMethodsSupported;
  }

  public OIDCConfigCredentialsSupportedDraft00Inner cryptographicSuitesSupported(List<String> cryptographicSuitesSupported) {
    
    this.cryptographicSuitesSupported = cryptographicSuitesSupported;
    return this;
  }

  public OIDCConfigCredentialsSupportedDraft00Inner addCryptographicSuitesSupportedItem(String cryptographicSuitesSupportedItem) {
    if (this.cryptographicSuitesSupported == null) {
      this.cryptographicSuitesSupported = new ArrayList<>();
    }
    this.cryptographicSuitesSupported.add(cryptographicSuitesSupportedItem);
    return this;
  }

  /**
   * Get cryptographicSuitesSupported
   * @return cryptographicSuitesSupported
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRYPTOGRAPHIC_SUITES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCryptographicSuitesSupported() {
    return cryptographicSuitesSupported;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTOGRAPHIC_SUITES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCryptographicSuitesSupported(List<String> cryptographicSuitesSupported) {
    this.cryptographicSuitesSupported = cryptographicSuitesSupported;
  }

  public OIDCConfigCredentialsSupportedDraft00Inner format(String format) {
    
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(String format) {
    this.format = format;
  }

  public OIDCConfigCredentialsSupportedDraft00Inner types(List<String> types) {
    
    this.types = types;
    return this;
  }

  public OIDCConfigCredentialsSupportedDraft00Inner addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(List<String> types) {
    this.types = types;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCConfigCredentialsSupportedDraft00Inner oiDCConfigCredentialsSupportedDraft00Inner = (OIDCConfigCredentialsSupportedDraft00Inner) o;
    return Objects.equals(this.cryptographicBindingMethodsSupported, oiDCConfigCredentialsSupportedDraft00Inner.cryptographicBindingMethodsSupported) &&
        Objects.equals(this.cryptographicSuitesSupported, oiDCConfigCredentialsSupportedDraft00Inner.cryptographicSuitesSupported) &&
        Objects.equals(this.format, oiDCConfigCredentialsSupportedDraft00Inner.format) &&
        Objects.equals(this.types, oiDCConfigCredentialsSupportedDraft00Inner.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptographicBindingMethodsSupported, cryptographicSuitesSupported, format, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCConfigCredentialsSupportedDraft00Inner {\n");
    sb.append("    cryptographicBindingMethodsSupported: ").append(toIndentedString(cryptographicBindingMethodsSupported)).append("\n");
    sb.append("    cryptographicSuitesSupported: ").append(toIndentedString(cryptographicSuitesSupported)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

    // add `cryptographic_binding_methods_supported` to the URL query string
    if (getCryptographicBindingMethodsSupported() != null) {
      for (int i = 0; i < getCryptographicBindingMethodsSupported().size(); i++) {
        try {
          joiner.add(String.format("%scryptographic_binding_methods_supported%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getCryptographicBindingMethodsSupported().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `cryptographic_suites_supported` to the URL query string
    if (getCryptographicSuitesSupported() != null) {
      for (int i = 0; i < getCryptographicSuitesSupported().size(); i++) {
        try {
          joiner.add(String.format("%scryptographic_suites_supported%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getCryptographicSuitesSupported().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `format` to the URL query string
    if (getFormat() != null) {
      try {
        joiner.add(String.format("%sformat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `types` to the URL query string
    if (getTypes() != null) {
      for (int i = 0; i < getTypes().size(); i++) {
        try {
          joiner.add(String.format("%stypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTypes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

