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
import com.affinidi.tdk.vault.data.manager.client.models.NodeStatus;
import com.affinidi.tdk.vault.data.manager.client.models.NodeType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ConsumerMetadataDto
 */
@JsonPropertyOrder({
  ConsumerMetadataDto.JSON_PROPERTY_NODE_ID,
  ConsumerMetadataDto.JSON_PROPERTY_STATUS,
  ConsumerMetadataDto.JSON_PROPERTY_FILE_COUNT,
  ConsumerMetadataDto.JSON_PROPERTY_FOLDER_COUNT,
  ConsumerMetadataDto.JSON_PROPERTY_PROFILE_COUNT,
  ConsumerMetadataDto.JSON_PROPERTY_NAME,
  ConsumerMetadataDto.JSON_PROPERTY_CONSUMER_ID,
  ConsumerMetadataDto.JSON_PROPERTY_CREATED_AT,
  ConsumerMetadataDto.JSON_PROPERTY_MODIFIED_AT,
  ConsumerMetadataDto.JSON_PROPERTY_CREATED_BY,
  ConsumerMetadataDto.JSON_PROPERTY_MODIFIED_BY,
  ConsumerMetadataDto.JSON_PROPERTY_DESCRIPTION,
  ConsumerMetadataDto.JSON_PROPERTY_TYPE,
  ConsumerMetadataDto.JSON_PROPERTY_CONSUMED_FILE_STORAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ConsumerMetadataDto {
  public static final String JSON_PROPERTY_NODE_ID = "nodeId";
  private String nodeId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NodeStatus status;

  public static final String JSON_PROPERTY_FILE_COUNT = "fileCount";
  private BigDecimal fileCount;

  public static final String JSON_PROPERTY_FOLDER_COUNT = "folderCount";
  private BigDecimal folderCount;

  public static final String JSON_PROPERTY_PROFILE_COUNT = "profileCount";
  private BigDecimal profileCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONSUMER_ID = "consumerId";
  private String consumerId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private String modifiedAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NodeType type;

  public static final String JSON_PROPERTY_CONSUMED_FILE_STORAGE = "consumedFileStorage";
  private BigDecimal consumedFileStorage;

  public ConsumerMetadataDto() {
  }

  public ConsumerMetadataDto nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

  /**
   * Get nodeId
   * @return nodeId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNodeId() {
    return nodeId;
  }


  @JsonProperty(JSON_PROPERTY_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public ConsumerMetadataDto status(NodeStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NodeStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(NodeStatus status) {
    this.status = status;
  }

  public ConsumerMetadataDto fileCount(BigDecimal fileCount) {
    
    this.fileCount = fileCount;
    return this;
  }

  /**
   * Get fileCount
   * @return fileCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFileCount() {
    return fileCount;
  }


  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileCount(BigDecimal fileCount) {
    this.fileCount = fileCount;
  }

  public ConsumerMetadataDto folderCount(BigDecimal folderCount) {
    
    this.folderCount = folderCount;
    return this;
  }

  /**
   * Get folderCount
   * @return folderCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFolderCount() {
    return folderCount;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderCount(BigDecimal folderCount) {
    this.folderCount = folderCount;
  }

  public ConsumerMetadataDto profileCount(BigDecimal profileCount) {
    
    this.profileCount = profileCount;
    return this;
  }

  /**
   * Get profileCount
   * @return profileCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getProfileCount() {
    return profileCount;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileCount(BigDecimal profileCount) {
    this.profileCount = profileCount;
  }

  public ConsumerMetadataDto name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
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

  public ConsumerMetadataDto consumerId(String consumerId) {
    
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Get consumerId
   * @return consumerId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSUMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConsumerId() {
    return consumerId;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public ConsumerMetadataDto createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * creation date/time
   * @return createdAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ConsumerMetadataDto modifiedAt(String modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * modification date/time
   * @return modifiedAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public ConsumerMetadataDto createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Identifier of the user who created
   * @return createdBy
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ConsumerMetadataDto modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Identifier of the user who last updated
   * @return modifiedBy
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModifiedBy() {
    return modifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public ConsumerMetadataDto description(String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Description of the node
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  public ConsumerMetadataDto type(NodeType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NodeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(NodeType type) {
    this.type = type;
  }

  public ConsumerMetadataDto consumedFileStorage(BigDecimal consumedFileStorage) {
    
    this.consumedFileStorage = consumedFileStorage;
    return this;
  }

  /**
   * Tracks the amount of bytes used by the stored data.
   * @return consumedFileStorage
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSUMED_FILE_STORAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getConsumedFileStorage() {
    return consumedFileStorage;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMED_FILE_STORAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumedFileStorage(BigDecimal consumedFileStorage) {
    this.consumedFileStorage = consumedFileStorage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerMetadataDto consumerMetadataDto = (ConsumerMetadataDto) o;
    return Objects.equals(this.nodeId, consumerMetadataDto.nodeId) &&
        Objects.equals(this.status, consumerMetadataDto.status) &&
        Objects.equals(this.fileCount, consumerMetadataDto.fileCount) &&
        Objects.equals(this.folderCount, consumerMetadataDto.folderCount) &&
        Objects.equals(this.profileCount, consumerMetadataDto.profileCount) &&
        Objects.equals(this.name, consumerMetadataDto.name) &&
        Objects.equals(this.consumerId, consumerMetadataDto.consumerId) &&
        Objects.equals(this.createdAt, consumerMetadataDto.createdAt) &&
        Objects.equals(this.modifiedAt, consumerMetadataDto.modifiedAt) &&
        Objects.equals(this.createdBy, consumerMetadataDto.createdBy) &&
        Objects.equals(this.modifiedBy, consumerMetadataDto.modifiedBy) &&
        Objects.equals(this.description, consumerMetadataDto.description) &&
        Objects.equals(this.type, consumerMetadataDto.type) &&
        Objects.equals(this.consumedFileStorage, consumerMetadataDto.consumedFileStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, status, fileCount, folderCount, profileCount, name, consumerId, createdAt, modifiedAt, createdBy, modifiedBy, description, type, consumedFileStorage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerMetadataDto {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
    sb.append("    folderCount: ").append(toIndentedString(folderCount)).append("\n");
    sb.append("    profileCount: ").append(toIndentedString(profileCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    consumedFileStorage: ").append(toIndentedString(consumedFileStorage)).append("\n");
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

    // add `nodeId` to the URL query string
    if (getNodeId() != null) {
      try {
        joiner.add(String.format("%snodeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileCount` to the URL query string
    if (getFileCount() != null) {
      try {
        joiner.add(String.format("%sfileCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folderCount` to the URL query string
    if (getFolderCount() != null) {
      try {
        joiner.add(String.format("%sfolderCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileCount` to the URL query string
    if (getProfileCount() != null) {
      try {
        joiner.add(String.format("%sprofileCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `consumerId` to the URL query string
    if (getConsumerId() != null) {
      try {
        joiner.add(String.format("%sconsumerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifiedAt` to the URL query string
    if (getModifiedAt() != null) {
      try {
        joiner.add(String.format("%smodifiedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifiedBy` to the URL query string
    if (getModifiedBy() != null) {
      try {
        joiner.add(String.format("%smodifiedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `consumedFileStorage` to the URL query string
    if (getConsumedFileStorage() != null) {
      try {
        joiner.add(String.format("%sconsumedFileStorage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumedFileStorage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

