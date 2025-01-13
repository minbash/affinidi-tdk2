/*
 * VerificationService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.credential.verification.client.models;

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
 * SubmissionRequirement
 */
@JsonPropertyOrder({
  SubmissionRequirement.JSON_PROPERTY_NAME,
  SubmissionRequirement.JSON_PROPERTY_PURPOSE,
  SubmissionRequirement.JSON_PROPERTY_RULE,
  SubmissionRequirement.JSON_PROPERTY_COUNT,
  SubmissionRequirement.JSON_PROPERTY_MIN,
  SubmissionRequirement.JSON_PROPERTY_MAX,
  SubmissionRequirement.JSON_PROPERTY_FROM,
  SubmissionRequirement.JSON_PROPERTY_FROM_NESTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:22:13.913964654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SubmissionRequirement {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private String purpose;

  /**
   * Gets or Sets rule
   */
  public enum RuleEnum {
    ALL("all"),
    
    PICK("pick");

    private String value;

    RuleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RuleEnum fromValue(String value) {
      for (RuleEnum b : RuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RULE = "rule";
  private RuleEnum rule;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_MIN = "min";
  private Integer min;

  public static final String JSON_PROPERTY_MAX = "max";
  private Integer max;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_FROM_NESTED = "from_nested";
  private List<SubmissionRequirement> fromNested = new ArrayList<>();

  public SubmissionRequirement() {
  }

  public SubmissionRequirement name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public SubmissionRequirement purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SubmissionRequirement rule(RuleEnum rule) {
    
    this.rule = rule;
    return this;
  }

  /**
   * Get rule
   * @return rule
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RuleEnum getRule() {
    return rule;
  }


  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRule(RuleEnum rule) {
    this.rule = rule;
  }

  public SubmissionRequirement count(Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }

  public SubmissionRequirement min(Integer min) {
    
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(Integer min) {
    this.min = min;
  }

  public SubmissionRequirement max(Integer max) {
    
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(Integer max) {
    this.max = max;
  }

  public SubmissionRequirement from(String from) {
    
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(String from) {
    this.from = from;
  }

  public SubmissionRequirement fromNested(List<SubmissionRequirement> fromNested) {
    
    this.fromNested = fromNested;
    return this;
  }

  public SubmissionRequirement addFromNestedItem(SubmissionRequirement fromNestedItem) {
    if (this.fromNested == null) {
      this.fromNested = new ArrayList<>();
    }
    this.fromNested.add(fromNestedItem);
    return this;
  }

  /**
   * Get fromNested
   * @return fromNested
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_NESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubmissionRequirement> getFromNested() {
    return fromNested;
  }


  @JsonProperty(JSON_PROPERTY_FROM_NESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromNested(List<SubmissionRequirement> fromNested) {
    this.fromNested = fromNested;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionRequirement submissionRequirement = (SubmissionRequirement) o;
    return Objects.equals(this.name, submissionRequirement.name) &&
        Objects.equals(this.purpose, submissionRequirement.purpose) &&
        Objects.equals(this.rule, submissionRequirement.rule) &&
        Objects.equals(this.count, submissionRequirement.count) &&
        Objects.equals(this.min, submissionRequirement.min) &&
        Objects.equals(this.max, submissionRequirement.max) &&
        Objects.equals(this.from, submissionRequirement.from) &&
        Objects.equals(this.fromNested, submissionRequirement.fromNested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, purpose, rule, count, min, max, from, fromNested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionRequirement {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromNested: ").append(toIndentedString(fromNested)).append("\n");
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

    // add `purpose` to the URL query string
    if (getPurpose() != null) {
      try {
        joiner.add(String.format("%spurpose%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPurpose()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rule` to the URL query string
    if (getRule() != null) {
      try {
        joiner.add(String.format("%srule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRule()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `min` to the URL query string
    if (getMin() != null) {
      try {
        joiner.add(String.format("%smin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max` to the URL query string
    if (getMax() != null) {
      try {
        joiner.add(String.format("%smax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `from` to the URL query string
    if (getFrom() != null) {
      try {
        joiner.add(String.format("%sfrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `from_nested` to the URL query string
    if (getFromNested() != null) {
      for (int i = 0; i < getFromNested().size(); i++) {
        if (getFromNested().get(i) != null) {
          joiner.add(getFromNested().get(i).toUrlQueryString(String.format("%sfrom_nested%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

