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
import com.affinidi.tdk.iam.client.models.ProjectWithPolicyDto;
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
 * ProjectWithPolicyList
 */
@JsonPropertyOrder({
  ProjectWithPolicyList.JSON_PROPERTY_PROJECTS,
  ProjectWithPolicyList.JSON_PROPERTY_LAST_EVALUATED_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:21:47.313409253Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProjectWithPolicyList {
  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<ProjectWithPolicyDto> projects = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_EVALUATED_KEY = "lastEvaluatedKey";
  private String lastEvaluatedKey;

  public ProjectWithPolicyList() {
  }

  public ProjectWithPolicyList projects(List<ProjectWithPolicyDto> projects) {
    
    this.projects = projects;
    return this;
  }

  public ProjectWithPolicyList addProjectsItem(ProjectWithPolicyDto projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ProjectWithPolicyDto> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjects(List<ProjectWithPolicyDto> projects) {
    this.projects = projects;
  }

  public ProjectWithPolicyList lastEvaluatedKey(String lastEvaluatedKey) {
    
    this.lastEvaluatedKey = lastEvaluatedKey;
    return this;
  }

  /**
   * Get lastEvaluatedKey
   * @return lastEvaluatedKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_EVALUATED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastEvaluatedKey() {
    return lastEvaluatedKey;
  }


  @JsonProperty(JSON_PROPERTY_LAST_EVALUATED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastEvaluatedKey(String lastEvaluatedKey) {
    this.lastEvaluatedKey = lastEvaluatedKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectWithPolicyList projectWithPolicyList = (ProjectWithPolicyList) o;
    return Objects.equals(this.projects, projectWithPolicyList.projects) &&
        Objects.equals(this.lastEvaluatedKey, projectWithPolicyList.lastEvaluatedKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projects, lastEvaluatedKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectWithPolicyList {\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    lastEvaluatedKey: ").append(toIndentedString(lastEvaluatedKey)).append("\n");
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

    // add `projects` to the URL query string
    if (getProjects() != null) {
      for (int i = 0; i < getProjects().size(); i++) {
        if (getProjects().get(i) != null) {
          joiner.add(getProjects().get(i).toUrlQueryString(String.format("%sprojects%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `lastEvaluatedKey` to the URL query string
    if (getLastEvaluatedKey() != null) {
      try {
        joiner.add(String.format("%slastEvaluatedKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastEvaluatedKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

