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
import com.affinidi.tdk.iam.client.models.TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfo;
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

import com.affinidi.tdk.iam.client.JSON;

/**
 * Private Key JWT Authentication of Client with &#x60;private_key_jwt&#x60; oAuth Method
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-05T23:17:04.645187545Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TokenPrivateKeyAuthenticationMethodDto {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PRIVATE_KEY("PRIVATE_KEY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Gets or Sets signingAlgorithm
   */
  @JsonAdapter(SigningAlgorithmEnum.Adapter.class)
  public enum SigningAlgorithmEnum {
    RS256("RS256"),
    
    RS512("RS512"),
    
    ES256("ES256"),
    
    ES512("ES512");

    private String value;

    SigningAlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SigningAlgorithmEnum fromValue(String value) {
      for (SigningAlgorithmEnum b : SigningAlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SigningAlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SigningAlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SigningAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SigningAlgorithmEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SigningAlgorithmEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SIGNING_ALGORITHM = "signingAlgorithm";
  @SerializedName(SERIALIZED_NAME_SIGNING_ALGORITHM)
  private SigningAlgorithmEnum signingAlgorithm;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_INFO = "publicKeyInfo";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_INFO)
  private TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfo publicKeyInfo;

  public TokenPrivateKeyAuthenticationMethodDto() {
  }

  public TokenPrivateKeyAuthenticationMethodDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TokenPrivateKeyAuthenticationMethodDto signingAlgorithm(SigningAlgorithmEnum signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
    return this;
  }

  /**
   * Get signingAlgorithm
   * @return signingAlgorithm
   */
  @javax.annotation.Nonnull
  public SigningAlgorithmEnum getSigningAlgorithm() {
    return signingAlgorithm;
  }

  public void setSigningAlgorithm(SigningAlgorithmEnum signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
  }


  public TokenPrivateKeyAuthenticationMethodDto publicKeyInfo(TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfo publicKeyInfo) {
    this.publicKeyInfo = publicKeyInfo;
    return this;
  }

  /**
   * Get publicKeyInfo
   * @return publicKeyInfo
   */
  @javax.annotation.Nonnull
  public TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfo getPublicKeyInfo() {
    return publicKeyInfo;
  }

  public void setPublicKeyInfo(TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfo publicKeyInfo) {
    this.publicKeyInfo = publicKeyInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPrivateKeyAuthenticationMethodDto tokenPrivateKeyAuthenticationMethodDto = (TokenPrivateKeyAuthenticationMethodDto) o;
    return Objects.equals(this.type, tokenPrivateKeyAuthenticationMethodDto.type) &&
        Objects.equals(this.signingAlgorithm, tokenPrivateKeyAuthenticationMethodDto.signingAlgorithm) &&
        Objects.equals(this.publicKeyInfo, tokenPrivateKeyAuthenticationMethodDto.publicKeyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, signingAlgorithm, publicKeyInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPrivateKeyAuthenticationMethodDto {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signingAlgorithm: ").append(toIndentedString(signingAlgorithm)).append("\n");
    sb.append("    publicKeyInfo: ").append(toIndentedString(publicKeyInfo)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("signingAlgorithm");
    openapiFields.add("publicKeyInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("signingAlgorithm");
    openapiRequiredFields.add("publicKeyInfo");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TokenPrivateKeyAuthenticationMethodDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenPrivateKeyAuthenticationMethodDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenPrivateKeyAuthenticationMethodDto is not found in the empty JSON string", TokenPrivateKeyAuthenticationMethodDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenPrivateKeyAuthenticationMethodDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenPrivateKeyAuthenticationMethodDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenPrivateKeyAuthenticationMethodDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("signingAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signingAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signingAlgorithm").toString()));
      }
      // validate the required field `signingAlgorithm`
      SigningAlgorithmEnum.validateJsonElement(jsonObj.get("signingAlgorithm"));
      // validate the required field `publicKeyInfo`
      TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfo.validateJsonElement(jsonObj.get("publicKeyInfo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenPrivateKeyAuthenticationMethodDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenPrivateKeyAuthenticationMethodDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenPrivateKeyAuthenticationMethodDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenPrivateKeyAuthenticationMethodDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenPrivateKeyAuthenticationMethodDto>() {
           @Override
           public void write(JsonWriter out, TokenPrivateKeyAuthenticationMethodDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenPrivateKeyAuthenticationMethodDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TokenPrivateKeyAuthenticationMethodDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TokenPrivateKeyAuthenticationMethodDto
   * @throws IOException if the JSON string is invalid with respect to TokenPrivateKeyAuthenticationMethodDto
   */
  public static TokenPrivateKeyAuthenticationMethodDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenPrivateKeyAuthenticationMethodDto.class);
  }

  /**
   * Convert an instance of TokenPrivateKeyAuthenticationMethodDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

