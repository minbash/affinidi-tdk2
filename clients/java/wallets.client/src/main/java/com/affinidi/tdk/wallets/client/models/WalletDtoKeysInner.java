/*
 * CloudWalletEssentials
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.wallets.client.models;

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
 * WalletDtoKeysInner
 */
@JsonPropertyOrder({
  WalletDtoKeysInner.JSON_PROPERTY_ID,
  WalletDtoKeysInner.JSON_PROPERTY_ARI
})
@JsonTypeName("WalletDto_keys_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:22:40.907513725Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class WalletDtoKeysInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ARI = "ari";
  private String ari;

  public WalletDtoKeysInner() {
  }

  public WalletDtoKeysInner id(String id) {
    
    this.id = id;
    return this;
  }

  /**
   * id of linked key
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  public WalletDtoKeysInner ari(String ari) {
    
    this.ari = ari;
    return this;
  }

  /**
   * ari of linked key
   * @return ari
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAri() {
    return ari;
  }


  @JsonProperty(JSON_PROPERTY_ARI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAri(String ari) {
    this.ari = ari;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletDtoKeysInner walletDtoKeysInner = (WalletDtoKeysInner) o;
    return Objects.equals(this.id, walletDtoKeysInner.id) &&
        Objects.equals(this.ari, walletDtoKeysInner.ari);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ari);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletDtoKeysInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ari: ").append(toIndentedString(ari)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ari` to the URL query string
    if (getAri() != null) {
      try {
        joiner.add(String.format("%sari%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

