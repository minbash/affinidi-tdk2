/*
 * IotaService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iota.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.iota.client.models.IotaConfigurationDto;
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
 * ListConfigurationOK
 */
@JsonPropertyOrder({
  ListConfigurationOK.JSON_PROPERTY_CONFIGURATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ListConfigurationOK {
  public static final String JSON_PROPERTY_CONFIGURATIONS = "configurations";
  private List<IotaConfigurationDto> configurations = new ArrayList<>();

  public ListConfigurationOK() {
  }

  public ListConfigurationOK configurations(List<IotaConfigurationDto> configurations) {
    
    this.configurations = configurations;
    return this;
  }

  public ListConfigurationOK addConfigurationsItem(IotaConfigurationDto configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

  /**
   * Get configurations
   * @return configurations
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<IotaConfigurationDto> getConfigurations() {
    return configurations;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigurations(List<IotaConfigurationDto> configurations) {
    this.configurations = configurations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListConfigurationOK listConfigurationOK = (ListConfigurationOK) o;
    return Objects.equals(this.configurations, listConfigurationOK.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConfigurationOK {\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

    // add `configurations` to the URL query string
    if (getConfigurations() != null) {
      for (int i = 0; i < getConfigurations().size(); i++) {
        if (getConfigurations().get(i) != null) {
          joiner.add(getConfigurations().get(i).toUrlQueryString(String.format("%sconfigurations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

