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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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

import com.affinidi.tdk.iota.client.JSON;

/**
 * AwsExchangeCredentialsProjectTokenOKCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-05T23:18:16.395480383Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AwsExchangeCredentialsProjectTokenOKCredentials {
  public static final String SERIALIZED_NAME_IDENTITY_ID = "identityId";
  @SerializedName(SERIALIZED_NAME_IDENTITY_ID)
  private String identityId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public AwsExchangeCredentialsProjectTokenOKCredentials() {
  }

  public AwsExchangeCredentialsProjectTokenOKCredentials identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

  /**
   * Get identityId
   * @return identityId
   */
  @javax.annotation.Nonnull
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }


  public AwsExchangeCredentialsProjectTokenOKCredentials token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  @javax.annotation.Nonnull
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsExchangeCredentialsProjectTokenOKCredentials awsExchangeCredentialsProjectTokenOKCredentials = (AwsExchangeCredentialsProjectTokenOKCredentials) o;
    return Objects.equals(this.identityId, awsExchangeCredentialsProjectTokenOKCredentials.identityId) &&
        Objects.equals(this.token, awsExchangeCredentialsProjectTokenOKCredentials.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsExchangeCredentialsProjectTokenOKCredentials {\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("identityId");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("identityId");
    openapiRequiredFields.add("token");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsExchangeCredentialsProjectTokenOKCredentials
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsExchangeCredentialsProjectTokenOKCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsExchangeCredentialsProjectTokenOKCredentials is not found in the empty JSON string", AwsExchangeCredentialsProjectTokenOKCredentials.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsExchangeCredentialsProjectTokenOKCredentials.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsExchangeCredentialsProjectTokenOKCredentials` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AwsExchangeCredentialsProjectTokenOKCredentials.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("identityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityId").toString()));
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsExchangeCredentialsProjectTokenOKCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsExchangeCredentialsProjectTokenOKCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsExchangeCredentialsProjectTokenOKCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsExchangeCredentialsProjectTokenOKCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsExchangeCredentialsProjectTokenOKCredentials>() {
           @Override
           public void write(JsonWriter out, AwsExchangeCredentialsProjectTokenOKCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsExchangeCredentialsProjectTokenOKCredentials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsExchangeCredentialsProjectTokenOKCredentials given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsExchangeCredentialsProjectTokenOKCredentials
   * @throws IOException if the JSON string is invalid with respect to AwsExchangeCredentialsProjectTokenOKCredentials
   */
  public static AwsExchangeCredentialsProjectTokenOKCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsExchangeCredentialsProjectTokenOKCredentials.class);
  }

  /**
   * Convert an instance of AwsExchangeCredentialsProjectTokenOKCredentials to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

