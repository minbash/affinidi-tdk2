/*
 * CredentialIssuanceService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.credential.issuance.client.models;

import java.util.Objects;
import com.affinidi.tdk.credential.issuance.client.models.CredentialSupportedObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.affinidi.tdk.credential.issuance.client.JSON;

/**
 * CreateIssuanceConfigInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-05T23:16:39.123213391Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateIssuanceConfigInput {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ISSUER_WALLET_ID = "issuerWalletId";
  @SerializedName(SERIALIZED_NAME_ISSUER_WALLET_ID)
  private String issuerWalletId;

  public static final String SERIALIZED_NAME_CREDENTIAL_OFFER_DURATION = "credentialOfferDuration";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_OFFER_DURATION)
  private BigDecimal credentialOfferDuration;

  /**
   * String identifying the format of this Credential, i.e., ldp_vc. Depending on the format value, the object contains further elements defining the type
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    LDP_VC("ldp_vc"),
    
    JWT_VC_JSON_LD("jwt_vc_json-ld"),
    
    SD_JWT_VC_JSON_LD("sd_jwt_vc_json-ld");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_CREDENTIAL_SUPPORTED = "credentialSupported";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_SUPPORTED)
  private List<CredentialSupportedObject> credentialSupported = new ArrayList<>();

  public static final String SERIALIZED_NAME_ISSUER_METADATA = "issuerMetadata";
  @SerializedName(SERIALIZED_NAME_ISSUER_METADATA)
  private Map<String, Object> issuerMetadata = new HashMap<>();

  public static final String SERIALIZED_NAME_RETURN_URIS = "returnUris";
  @SerializedName(SERIALIZED_NAME_RETURN_URIS)
  private List<String> returnUris = new ArrayList<>();

  public CreateIssuanceConfigInput() {
  }

  public CreateIssuanceConfigInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateIssuanceConfigInput description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateIssuanceConfigInput issuerWalletId(String issuerWalletId) {
    this.issuerWalletId = issuerWalletId;
    return this;
  }

  /**
   * Issuer Wallet id
   * @return issuerWalletId
   */
  @javax.annotation.Nonnull
  public String getIssuerWalletId() {
    return issuerWalletId;
  }

  public void setIssuerWalletId(String issuerWalletId) {
    this.issuerWalletId = issuerWalletId;
  }


  public CreateIssuanceConfigInput credentialOfferDuration(BigDecimal credentialOfferDuration) {
    this.credentialOfferDuration = credentialOfferDuration;
    return this;
  }

  /**
   * credential offer duration in second
   * minimum: 1
   * maximum: 604801
   * @return credentialOfferDuration
   */
  @javax.annotation.Nullable
  public BigDecimal getCredentialOfferDuration() {
    return credentialOfferDuration;
  }

  public void setCredentialOfferDuration(BigDecimal credentialOfferDuration) {
    this.credentialOfferDuration = credentialOfferDuration;
  }


  public CreateIssuanceConfigInput format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * String identifying the format of this Credential, i.e., ldp_vc. Depending on the format value, the object contains further elements defining the type
   * @return format
   */
  @javax.annotation.Nullable
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public CreateIssuanceConfigInput credentialSupported(List<CredentialSupportedObject> credentialSupported) {
    this.credentialSupported = credentialSupported;
    return this;
  }

  public CreateIssuanceConfigInput addCredentialSupportedItem(CredentialSupportedObject credentialSupportedItem) {
    if (this.credentialSupported == null) {
      this.credentialSupported = new ArrayList<>();
    }
    this.credentialSupported.add(credentialSupportedItem);
    return this;
  }

  /**
   * Get credentialSupported
   * @return credentialSupported
   */
  @javax.annotation.Nonnull
  public List<CredentialSupportedObject> getCredentialSupported() {
    return credentialSupported;
  }

  public void setCredentialSupported(List<CredentialSupportedObject> credentialSupported) {
    this.credentialSupported = credentialSupported;
  }


  public CreateIssuanceConfigInput issuerMetadata(Map<String, Object> issuerMetadata) {
    this.issuerMetadata = issuerMetadata;
    return this;
  }

  public CreateIssuanceConfigInput putIssuerMetadataItem(String key, Object issuerMetadataItem) {
    if (this.issuerMetadata == null) {
      this.issuerMetadata = new HashMap<>();
    }
    this.issuerMetadata.put(key, issuerMetadataItem);
    return this;
  }

  /**
   * Issuer public information wallet may want to show to user during consent confirmation
   * @return issuerMetadata
   */
  @javax.annotation.Nullable
  public Map<String, Object> getIssuerMetadata() {
    return issuerMetadata;
  }

  public void setIssuerMetadata(Map<String, Object> issuerMetadata) {
    this.issuerMetadata = issuerMetadata;
  }


  public CreateIssuanceConfigInput returnUris(List<String> returnUris) {
    this.returnUris = returnUris;
    return this;
  }

  public CreateIssuanceConfigInput addReturnUrisItem(String returnUrisItem) {
    if (this.returnUris == null) {
      this.returnUris = new ArrayList<>();
    }
    this.returnUris.add(returnUrisItem);
    return this;
  }

  /**
   * List of allowed URIs to be returned to after issuance
   * @return returnUris
   */
  @javax.annotation.Nullable
  public List<String> getReturnUris() {
    return returnUris;
  }

  public void setReturnUris(List<String> returnUris) {
    this.returnUris = returnUris;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIssuanceConfigInput createIssuanceConfigInput = (CreateIssuanceConfigInput) o;
    return Objects.equals(this.name, createIssuanceConfigInput.name) &&
        Objects.equals(this.description, createIssuanceConfigInput.description) &&
        Objects.equals(this.issuerWalletId, createIssuanceConfigInput.issuerWalletId) &&
        Objects.equals(this.credentialOfferDuration, createIssuanceConfigInput.credentialOfferDuration) &&
        Objects.equals(this.format, createIssuanceConfigInput.format) &&
        Objects.equals(this.credentialSupported, createIssuanceConfigInput.credentialSupported) &&
        Objects.equals(this.issuerMetadata, createIssuanceConfigInput.issuerMetadata) &&
        Objects.equals(this.returnUris, createIssuanceConfigInput.returnUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, issuerWalletId, credentialOfferDuration, format, credentialSupported, issuerMetadata, returnUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIssuanceConfigInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issuerWalletId: ").append(toIndentedString(issuerWalletId)).append("\n");
    sb.append("    credentialOfferDuration: ").append(toIndentedString(credentialOfferDuration)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    credentialSupported: ").append(toIndentedString(credentialSupported)).append("\n");
    sb.append("    issuerMetadata: ").append(toIndentedString(issuerMetadata)).append("\n");
    sb.append("    returnUris: ").append(toIndentedString(returnUris)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("issuerWalletId");
    openapiFields.add("credentialOfferDuration");
    openapiFields.add("format");
    openapiFields.add("credentialSupported");
    openapiFields.add("issuerMetadata");
    openapiFields.add("returnUris");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issuerWalletId");
    openapiRequiredFields.add("credentialSupported");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateIssuanceConfigInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateIssuanceConfigInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIssuanceConfigInput is not found in the empty JSON string", CreateIssuanceConfigInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateIssuanceConfigInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateIssuanceConfigInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateIssuanceConfigInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("issuerWalletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerWalletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerWalletId").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        FormatEnum.validateJsonElement(jsonObj.get("format"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("credentialSupported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `credentialSupported` to be an array in the JSON string but got `%s`", jsonObj.get("credentialSupported").toString()));
      }

      JsonArray jsonArraycredentialSupported = jsonObj.getAsJsonArray("credentialSupported");
      // validate the required field `credentialSupported` (array)
      for (int i = 0; i < jsonArraycredentialSupported.size(); i++) {
        CredentialSupportedObject.validateJsonElement(jsonArraycredentialSupported.get(i));
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("returnUris") != null && !jsonObj.get("returnUris").isJsonNull() && !jsonObj.get("returnUris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnUris` to be an array in the JSON string but got `%s`", jsonObj.get("returnUris").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIssuanceConfigInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIssuanceConfigInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIssuanceConfigInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIssuanceConfigInput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIssuanceConfigInput>() {
           @Override
           public void write(JsonWriter out, CreateIssuanceConfigInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIssuanceConfigInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateIssuanceConfigInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateIssuanceConfigInput
   * @throws IOException if the JSON string is invalid with respect to CreateIssuanceConfigInput
   */
  public static CreateIssuanceConfigInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIssuanceConfigInput.class);
  }

  /**
   * Convert an instance of CreateIssuanceConfigInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

