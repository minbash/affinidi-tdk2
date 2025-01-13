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
import com.affinidi.tdk.iota.client.models.IotaConfigurationDtoClientMetadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * UpdateConfigurationByIdInput
 */
@JsonPropertyOrder({
  UpdateConfigurationByIdInput.JSON_PROPERTY_NAME,
  UpdateConfigurationByIdInput.JSON_PROPERTY_WALLET_ARI,
  UpdateConfigurationByIdInput.JSON_PROPERTY_IOTA_RESPONSE_WEBHOOK_U_R_L,
  UpdateConfigurationByIdInput.JSON_PROPERTY_ENABLE_VERIFICATION,
  UpdateConfigurationByIdInput.JSON_PROPERTY_ENABLE_CONSENT_AUDIT_LOG,
  UpdateConfigurationByIdInput.JSON_PROPERTY_TOKEN_MAX_AGE,
  UpdateConfigurationByIdInput.JSON_PROPERTY_DESCRIPTION,
  UpdateConfigurationByIdInput.JSON_PROPERTY_CLIENT_METADATA,
  UpdateConfigurationByIdInput.JSON_PROPERTY_MODE,
  UpdateConfigurationByIdInput.JSON_PROPERTY_REDIRECT_URIS,
  UpdateConfigurationByIdInput.JSON_PROPERTY_ENABLE_IDV_PROVIDERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:23:09.759834929Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateConfigurationByIdInput {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WALLET_ARI = "walletAri";
  private String walletAri;

  public static final String JSON_PROPERTY_IOTA_RESPONSE_WEBHOOK_U_R_L = "iotaResponseWebhookURL";
  private String iotaResponseWebhookURL;

  public static final String JSON_PROPERTY_ENABLE_VERIFICATION = "enableVerification";
  private Boolean enableVerification;

  public static final String JSON_PROPERTY_ENABLE_CONSENT_AUDIT_LOG = "enableConsentAuditLog";
  private Boolean enableConsentAuditLog;

  public static final String JSON_PROPERTY_TOKEN_MAX_AGE = "tokenMaxAge";
  private BigDecimal tokenMaxAge;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CLIENT_METADATA = "clientMetadata";
  private IotaConfigurationDtoClientMetadata clientMetadata;

  /**
   * Determines whether to handle the data-sharing request using the WebSocket or Redirect flow.
   */
  public enum ModeEnum {
    REDIRECT("redirect"),
    
    WEBSOCKET("websocket");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODE = "mode";
  private ModeEnum mode;

  public static final String JSON_PROPERTY_REDIRECT_URIS = "redirectUris";
  private List<String> redirectUris = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLE_IDV_PROVIDERS = "enableIdvProviders";
  private Boolean enableIdvProviders;

  public UpdateConfigurationByIdInput() {
  }

  public UpdateConfigurationByIdInput name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name of the configuration to quickly identify the resource.
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

  public UpdateConfigurationByIdInput walletAri(String walletAri) {
    
    this.walletAri = walletAri;
    return this;
  }

  /**
   * The unique resource identifier of the Wallet used to sign the request token.
   * @return walletAri
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WALLET_ARI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWalletAri() {
    return walletAri;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_ARI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWalletAri(String walletAri) {
    this.walletAri = walletAri;
  }

  public UpdateConfigurationByIdInput iotaResponseWebhookURL(String iotaResponseWebhookURL) {
    
    this.iotaResponseWebhookURL = iotaResponseWebhookURL;
    return this;
  }

  /**
   * The webhook URL is used for callback when the data is ready.
   * @return iotaResponseWebhookURL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOTA_RESPONSE_WEBHOOK_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIotaResponseWebhookURL() {
    return iotaResponseWebhookURL;
  }


  @JsonProperty(JSON_PROPERTY_IOTA_RESPONSE_WEBHOOK_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIotaResponseWebhookURL(String iotaResponseWebhookURL) {
    this.iotaResponseWebhookURL = iotaResponseWebhookURL;
  }

  public UpdateConfigurationByIdInput enableVerification(Boolean enableVerification) {
    
    this.enableVerification = enableVerification;
    return this;
  }

  /**
   * Cryptographically verifies the data shared by the user when enabled.
   * @return enableVerification
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableVerification() {
    return enableVerification;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableVerification(Boolean enableVerification) {
    this.enableVerification = enableVerification;
  }

  public UpdateConfigurationByIdInput enableConsentAuditLog(Boolean enableConsentAuditLog) {
    
    this.enableConsentAuditLog = enableConsentAuditLog;
    return this;
  }

  /**
   * Records the user&#39;s consent when they share their data, including the type of data shared when enabled.
   * @return enableConsentAuditLog
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_CONSENT_AUDIT_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableConsentAuditLog() {
    return enableConsentAuditLog;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_CONSENT_AUDIT_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableConsentAuditLog(Boolean enableConsentAuditLog) {
    this.enableConsentAuditLog = enableConsentAuditLog;
  }

  public UpdateConfigurationByIdInput tokenMaxAge(BigDecimal tokenMaxAge) {
    
    this.tokenMaxAge = tokenMaxAge;
    return this;
  }

  /**
   * This is the lifetime of the signed request token during the data-sharing flow.
   * @return tokenMaxAge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTokenMaxAge() {
    return tokenMaxAge;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenMaxAge(BigDecimal tokenMaxAge) {
    this.tokenMaxAge = tokenMaxAge;
  }

  public UpdateConfigurationByIdInput description(String description) {
    
    this.description = description;
    return this;
  }

  /**
   * An optional description of what the configuration is used for.
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

  public UpdateConfigurationByIdInput clientMetadata(IotaConfigurationDtoClientMetadata clientMetadata) {
    
    this.clientMetadata = clientMetadata;
    return this;
  }

  /**
   * Get clientMetadata
   * @return clientMetadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IotaConfigurationDtoClientMetadata getClientMetadata() {
    return clientMetadata;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientMetadata(IotaConfigurationDtoClientMetadata clientMetadata) {
    this.clientMetadata = clientMetadata;
  }

  public UpdateConfigurationByIdInput mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

  /**
   * Determines whether to handle the data-sharing request using the WebSocket or Redirect flow.
   * @return mode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public UpdateConfigurationByIdInput redirectUris(List<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public UpdateConfigurationByIdInput addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * List of allowed URLs to redirect users, including the response from the request. This is required if the selected data-sharing mode is Redirect.
   * @return redirectUris
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRedirectUris() {
    return redirectUris;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public UpdateConfigurationByIdInput enableIdvProviders(Boolean enableIdvProviders) {
    
    this.enableIdvProviders = enableIdvProviders;
    return this;
  }

  /**
   * Enables identity verification from user with a 3rd-party provider when a verified identity document is not found.
   * @return enableIdvProviders
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_IDV_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableIdvProviders() {
    return enableIdvProviders;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_IDV_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableIdvProviders(Boolean enableIdvProviders) {
    this.enableIdvProviders = enableIdvProviders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConfigurationByIdInput updateConfigurationByIdInput = (UpdateConfigurationByIdInput) o;
    return Objects.equals(this.name, updateConfigurationByIdInput.name) &&
        Objects.equals(this.walletAri, updateConfigurationByIdInput.walletAri) &&
        Objects.equals(this.iotaResponseWebhookURL, updateConfigurationByIdInput.iotaResponseWebhookURL) &&
        Objects.equals(this.enableVerification, updateConfigurationByIdInput.enableVerification) &&
        Objects.equals(this.enableConsentAuditLog, updateConfigurationByIdInput.enableConsentAuditLog) &&
        Objects.equals(this.tokenMaxAge, updateConfigurationByIdInput.tokenMaxAge) &&
        Objects.equals(this.description, updateConfigurationByIdInput.description) &&
        Objects.equals(this.clientMetadata, updateConfigurationByIdInput.clientMetadata) &&
        Objects.equals(this.mode, updateConfigurationByIdInput.mode) &&
        Objects.equals(this.redirectUris, updateConfigurationByIdInput.redirectUris) &&
        Objects.equals(this.enableIdvProviders, updateConfigurationByIdInput.enableIdvProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, walletAri, iotaResponseWebhookURL, enableVerification, enableConsentAuditLog, tokenMaxAge, description, clientMetadata, mode, redirectUris, enableIdvProviders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConfigurationByIdInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    walletAri: ").append(toIndentedString(walletAri)).append("\n");
    sb.append("    iotaResponseWebhookURL: ").append(toIndentedString(iotaResponseWebhookURL)).append("\n");
    sb.append("    enableVerification: ").append(toIndentedString(enableVerification)).append("\n");
    sb.append("    enableConsentAuditLog: ").append(toIndentedString(enableConsentAuditLog)).append("\n");
    sb.append("    tokenMaxAge: ").append(toIndentedString(tokenMaxAge)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    clientMetadata: ").append(toIndentedString(clientMetadata)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    enableIdvProviders: ").append(toIndentedString(enableIdvProviders)).append("\n");
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

    // add `walletAri` to the URL query string
    if (getWalletAri() != null) {
      try {
        joiner.add(String.format("%swalletAri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalletAri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iotaResponseWebhookURL` to the URL query string
    if (getIotaResponseWebhookURL() != null) {
      try {
        joiner.add(String.format("%siotaResponseWebhookURL%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIotaResponseWebhookURL()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableVerification` to the URL query string
    if (getEnableVerification() != null) {
      try {
        joiner.add(String.format("%senableVerification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableVerification()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableConsentAuditLog` to the URL query string
    if (getEnableConsentAuditLog() != null) {
      try {
        joiner.add(String.format("%senableConsentAuditLog%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableConsentAuditLog()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenMaxAge` to the URL query string
    if (getTokenMaxAge() != null) {
      try {
        joiner.add(String.format("%stokenMaxAge%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenMaxAge()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `clientMetadata` to the URL query string
    if (getClientMetadata() != null) {
      try {
        joiner.add(String.format("%sclientMetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      try {
        joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectUris` to the URL query string
    if (getRedirectUris() != null) {
      for (int i = 0; i < getRedirectUris().size(); i++) {
        try {
          joiner.add(String.format("%sredirectUris%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getRedirectUris().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `enableIdvProviders` to the URL query string
    if (getEnableIdvProviders() != null) {
      try {
        joiner.add(String.format("%senableIdvProviders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableIdvProviders()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

