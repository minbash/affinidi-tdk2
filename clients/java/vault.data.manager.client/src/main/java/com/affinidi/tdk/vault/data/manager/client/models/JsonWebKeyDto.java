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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * JsonWebKeyDto
 */
@JsonPropertyOrder({
  JsonWebKeyDto.JSON_PROPERTY_KID,
  JsonWebKeyDto.JSON_PROPERTY_KTY,
  JsonWebKeyDto.JSON_PROPERTY_N,
  JsonWebKeyDto.JSON_PROPERTY_E,
  JsonWebKeyDto.JSON_PROPERTY_X,
  JsonWebKeyDto.JSON_PROPERTY_Y,
  JsonWebKeyDto.JSON_PROPERTY_CRV,
  JsonWebKeyDto.JSON_PROPERTY_ALG,
  JsonWebKeyDto.JSON_PROPERTY_USE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:23:40.721253515Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class JsonWebKeyDto {
  public static final String JSON_PROPERTY_KID = "kid";
  private String kid;

  public static final String JSON_PROPERTY_KTY = "kty";
  private String kty;

  public static final String JSON_PROPERTY_N = "n";
  private String n;

  public static final String JSON_PROPERTY_E = "e";
  private String e;

  public static final String JSON_PROPERTY_X = "x";
  private String x;

  public static final String JSON_PROPERTY_Y = "y";
  private String y;

  public static final String JSON_PROPERTY_CRV = "crv";
  private String crv;

  public static final String JSON_PROPERTY_ALG = "alg";
  private String alg;

  public static final String JSON_PROPERTY_USE = "use";
  private String use;

  public JsonWebKeyDto() {
  }

  public JsonWebKeyDto kid(String kid) {
    
    this.kid = kid;
    return this;
  }

  /**
   * Get kid
   * @return kid
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKid() {
    return kid;
  }


  @JsonProperty(JSON_PROPERTY_KID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKid(String kid) {
    this.kid = kid;
  }

  public JsonWebKeyDto kty(String kty) {
    
    this.kty = kty;
    return this;
  }

  /**
   * Get kty
   * @return kty
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKty() {
    return kty;
  }


  @JsonProperty(JSON_PROPERTY_KTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKty(String kty) {
    this.kty = kty;
  }

  public JsonWebKeyDto n(String n) {
    
    this.n = n;
    return this;
  }

  /**
   * Get n
   * @return n
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getN() {
    return n;
  }


  @JsonProperty(JSON_PROPERTY_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setN(String n) {
    this.n = n;
  }

  public JsonWebKeyDto e(String e) {
    
    this.e = e;
    return this;
  }

  /**
   * Get e
   * @return e
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getE() {
    return e;
  }


  @JsonProperty(JSON_PROPERTY_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setE(String e) {
    this.e = e;
  }

  public JsonWebKeyDto x(String x) {
    
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(String x) {
    this.x = x;
  }

  public JsonWebKeyDto y(String y) {
    
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getY() {
    return y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(String y) {
    this.y = y;
  }

  public JsonWebKeyDto crv(String crv) {
    
    this.crv = crv;
    return this;
  }

  /**
   * Get crv
   * @return crv
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrv() {
    return crv;
  }


  @JsonProperty(JSON_PROPERTY_CRV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrv(String crv) {
    this.crv = crv;
  }

  public JsonWebKeyDto alg(String alg) {
    
    this.alg = alg;
    return this;
  }

  /**
   * Get alg
   * @return alg
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAlg() {
    return alg;
  }


  @JsonProperty(JSON_PROPERTY_ALG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlg(String alg) {
    this.alg = alg;
  }

  public JsonWebKeyDto use(String use) {
    
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUse() {
    return use;
  }


  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUse(String use) {
    this.use = use;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKeyDto jsonWebKeyDto = (JsonWebKeyDto) o;
    return Objects.equals(this.kid, jsonWebKeyDto.kid) &&
        Objects.equals(this.kty, jsonWebKeyDto.kty) &&
        Objects.equals(this.n, jsonWebKeyDto.n) &&
        Objects.equals(this.e, jsonWebKeyDto.e) &&
        Objects.equals(this.x, jsonWebKeyDto.x) &&
        Objects.equals(this.y, jsonWebKeyDto.y) &&
        Objects.equals(this.crv, jsonWebKeyDto.crv) &&
        Objects.equals(this.alg, jsonWebKeyDto.alg) &&
        Objects.equals(this.use, jsonWebKeyDto.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kid, kty, n, e, x, y, crv, alg, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKeyDto {\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

    // add `kid` to the URL query string
    if (getKid() != null) {
      try {
        joiner.add(String.format("%skid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `kty` to the URL query string
    if (getKty() != null) {
      try {
        joiner.add(String.format("%skty%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKty()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `n` to the URL query string
    if (getN() != null) {
      try {
        joiner.add(String.format("%sn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getN()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `e` to the URL query string
    if (getE() != null) {
      try {
        joiner.add(String.format("%se%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getE()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `x` to the URL query string
    if (getX() != null) {
      try {
        joiner.add(String.format("%sx%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getX()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `y` to the URL query string
    if (getY() != null) {
      try {
        joiner.add(String.format("%sy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getY()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `crv` to the URL query string
    if (getCrv() != null) {
      try {
        joiner.add(String.format("%scrv%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCrv()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `alg` to the URL query string
    if (getAlg() != null) {
      try {
        joiner.add(String.format("%salg%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAlg()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `use` to the URL query string
    if (getUse() != null) {
      try {
        joiner.add(String.format("%suse%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUse()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

