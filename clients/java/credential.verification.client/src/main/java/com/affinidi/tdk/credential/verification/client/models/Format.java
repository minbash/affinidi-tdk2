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
import com.affinidi.tdk.credential.verification.client.models.JwtObject;
import com.affinidi.tdk.credential.verification.client.models.LdpObject;
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
 * Format
 */
@JsonPropertyOrder({
  Format.JSON_PROPERTY_JWT,
  Format.JSON_PROPERTY_JWT_VC,
  Format.JSON_PROPERTY_JWT_VP,
  Format.JSON_PROPERTY_LDP,
  Format.JSON_PROPERTY_LDP_VC,
  Format.JSON_PROPERTY_LDP_VP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T09:22:13.913964654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Format {
  public static final String JSON_PROPERTY_JWT = "jwt";
  private JwtObject jwt;

  public static final String JSON_PROPERTY_JWT_VC = "jwt_vc";
  private JwtObject jwtVc;

  public static final String JSON_PROPERTY_JWT_VP = "jwt_vp";
  private JwtObject jwtVp;

  public static final String JSON_PROPERTY_LDP = "ldp";
  private LdpObject ldp;

  public static final String JSON_PROPERTY_LDP_VC = "ldp_vc";
  private LdpObject ldpVc;

  public static final String JSON_PROPERTY_LDP_VP = "ldp_vp";
  private LdpObject ldpVp;

  public Format() {
  }

  public Format jwt(JwtObject jwt) {
    
    this.jwt = jwt;
    return this;
  }

  /**
   * Get jwt
   * @return jwt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JWT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JwtObject getJwt() {
    return jwt;
  }


  @JsonProperty(JSON_PROPERTY_JWT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJwt(JwtObject jwt) {
    this.jwt = jwt;
  }

  public Format jwtVc(JwtObject jwtVc) {
    
    this.jwtVc = jwtVc;
    return this;
  }

  /**
   * Get jwtVc
   * @return jwtVc
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JWT_VC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JwtObject getJwtVc() {
    return jwtVc;
  }


  @JsonProperty(JSON_PROPERTY_JWT_VC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJwtVc(JwtObject jwtVc) {
    this.jwtVc = jwtVc;
  }

  public Format jwtVp(JwtObject jwtVp) {
    
    this.jwtVp = jwtVp;
    return this;
  }

  /**
   * Get jwtVp
   * @return jwtVp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JWT_VP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JwtObject getJwtVp() {
    return jwtVp;
  }


  @JsonProperty(JSON_PROPERTY_JWT_VP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJwtVp(JwtObject jwtVp) {
    this.jwtVp = jwtVp;
  }

  public Format ldp(LdpObject ldp) {
    
    this.ldp = ldp;
    return this;
  }

  /**
   * Get ldp
   * @return ldp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LDP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LdpObject getLdp() {
    return ldp;
  }


  @JsonProperty(JSON_PROPERTY_LDP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLdp(LdpObject ldp) {
    this.ldp = ldp;
  }

  public Format ldpVc(LdpObject ldpVc) {
    
    this.ldpVc = ldpVc;
    return this;
  }

  /**
   * Get ldpVc
   * @return ldpVc
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LDP_VC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LdpObject getLdpVc() {
    return ldpVc;
  }


  @JsonProperty(JSON_PROPERTY_LDP_VC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLdpVc(LdpObject ldpVc) {
    this.ldpVc = ldpVc;
  }

  public Format ldpVp(LdpObject ldpVp) {
    
    this.ldpVp = ldpVp;
    return this;
  }

  /**
   * Get ldpVp
   * @return ldpVp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LDP_VP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LdpObject getLdpVp() {
    return ldpVp;
  }


  @JsonProperty(JSON_PROPERTY_LDP_VP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLdpVp(LdpObject ldpVp) {
    this.ldpVp = ldpVp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Format format = (Format) o;
    return Objects.equals(this.jwt, format.jwt) &&
        Objects.equals(this.jwtVc, format.jwtVc) &&
        Objects.equals(this.jwtVp, format.jwtVp) &&
        Objects.equals(this.ldp, format.ldp) &&
        Objects.equals(this.ldpVc, format.ldpVc) &&
        Objects.equals(this.ldpVp, format.ldpVp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt, jwtVc, jwtVp, ldp, ldpVc, ldpVp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Format {\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    jwtVc: ").append(toIndentedString(jwtVc)).append("\n");
    sb.append("    jwtVp: ").append(toIndentedString(jwtVp)).append("\n");
    sb.append("    ldp: ").append(toIndentedString(ldp)).append("\n");
    sb.append("    ldpVc: ").append(toIndentedString(ldpVc)).append("\n");
    sb.append("    ldpVp: ").append(toIndentedString(ldpVp)).append("\n");
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

    // add `jwt` to the URL query string
    if (getJwt() != null) {
      joiner.add(getJwt().toUrlQueryString(prefix + "jwt" + suffix));
    }

    // add `jwt_vc` to the URL query string
    if (getJwtVc() != null) {
      joiner.add(getJwtVc().toUrlQueryString(prefix + "jwt_vc" + suffix));
    }

    // add `jwt_vp` to the URL query string
    if (getJwtVp() != null) {
      joiner.add(getJwtVp().toUrlQueryString(prefix + "jwt_vp" + suffix));
    }

    // add `ldp` to the URL query string
    if (getLdp() != null) {
      joiner.add(getLdp().toUrlQueryString(prefix + "ldp" + suffix));
    }

    // add `ldp_vc` to the URL query string
    if (getLdpVc() != null) {
      joiner.add(getLdpVc().toUrlQueryString(prefix + "ldp_vc" + suffix));
    }

    // add `ldp_vp` to the URL query string
    if (getLdpVp() != null) {
      joiner.add(getLdpVp().toUrlQueryString(prefix + "ldp_vp" + suffix));
    }

    return joiner.toString();
  }

}

