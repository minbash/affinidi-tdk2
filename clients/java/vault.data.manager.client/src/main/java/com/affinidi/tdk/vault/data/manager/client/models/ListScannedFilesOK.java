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
import com.affinidi.tdk.vault.data.manager.client.models.ListScannedFilesOKScannedFilesInner;
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
 * ListScannedFilesOK
 */
@JsonPropertyOrder({
  ListScannedFilesOK.JSON_PROPERTY_SCANNED_FILES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ListScannedFilesOK {
  public static final String JSON_PROPERTY_SCANNED_FILES = "scannedFiles";
  private List<ListScannedFilesOKScannedFilesInner> scannedFiles = new ArrayList<>();

  public ListScannedFilesOK() {
  }

  public ListScannedFilesOK scannedFiles(List<ListScannedFilesOKScannedFilesInner> scannedFiles) {
    
    this.scannedFiles = scannedFiles;
    return this;
  }

  public ListScannedFilesOK addScannedFilesItem(ListScannedFilesOKScannedFilesInner scannedFilesItem) {
    if (this.scannedFiles == null) {
      this.scannedFiles = new ArrayList<>();
    }
    this.scannedFiles.add(scannedFilesItem);
    return this;
  }

  /**
   * Get scannedFiles
   * @return scannedFiles
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCANNED_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ListScannedFilesOKScannedFilesInner> getScannedFiles() {
    return scannedFiles;
  }


  @JsonProperty(JSON_PROPERTY_SCANNED_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScannedFiles(List<ListScannedFilesOKScannedFilesInner> scannedFiles) {
    this.scannedFiles = scannedFiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListScannedFilesOK listScannedFilesOK = (ListScannedFilesOK) o;
    return Objects.equals(this.scannedFiles, listScannedFilesOK.scannedFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scannedFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListScannedFilesOK {\n");
    sb.append("    scannedFiles: ").append(toIndentedString(scannedFiles)).append("\n");
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

    // add `scannedFiles` to the URL query string
    if (getScannedFiles() != null) {
      for (int i = 0; i < getScannedFiles().size(); i++) {
        if (getScannedFiles().get(i) != null) {
          joiner.add(getScannedFiles().get(i).toUrlQueryString(String.format("%sscannedFiles%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

