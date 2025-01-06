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
import com.affinidi.tdk.credential.verification.client.models.NestedDescriptor;
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

import com.affinidi.tdk.credential.verification.client.JSON;

/**
 * Descriptor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-05T23:17:28.162527459Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Descriptor {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PATH_NESTED = "path_nested";
  @SerializedName(SERIALIZED_NAME_PATH_NESTED)
  private NestedDescriptor pathNested;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public Descriptor() {
  }

  public Descriptor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Descriptor path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public Descriptor pathNested(NestedDescriptor pathNested) {
    this.pathNested = pathNested;
    return this;
  }

  /**
   * Get pathNested
   * @return pathNested
   */
  @javax.annotation.Nullable
  public NestedDescriptor getPathNested() {
    return pathNested;
  }

  public void setPathNested(NestedDescriptor pathNested) {
    this.pathNested = pathNested;
  }


  public Descriptor format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @javax.annotation.Nonnull
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Descriptor descriptor = (Descriptor) o;
    return Objects.equals(this.id, descriptor.id) &&
        Objects.equals(this.path, descriptor.path) &&
        Objects.equals(this.pathNested, descriptor.pathNested) &&
        Objects.equals(this.format, descriptor.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, pathNested, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Descriptor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathNested: ").append(toIndentedString(pathNested)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("path");
    openapiFields.add("path_nested");
    openapiFields.add("format");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("format");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Descriptor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Descriptor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Descriptor is not found in the empty JSON string", Descriptor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Descriptor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Descriptor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Descriptor.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      // validate the optional field `path_nested`
      if (jsonObj.get("path_nested") != null && !jsonObj.get("path_nested").isJsonNull()) {
        NestedDescriptor.validateJsonElement(jsonObj.get("path_nested"));
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Descriptor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Descriptor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Descriptor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Descriptor.class));

       return (TypeAdapter<T>) new TypeAdapter<Descriptor>() {
           @Override
           public void write(JsonWriter out, Descriptor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Descriptor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Descriptor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Descriptor
   * @throws IOException if the JSON string is invalid with respect to Descriptor
   */
  public static Descriptor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Descriptor.class);
  }

  /**
   * Convert an instance of Descriptor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

