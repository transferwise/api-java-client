/*
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IdNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-27T11:31:31.783Z[GMT]")
public class IdNumber {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public IdNumber type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of ID number. Valid values are &#x60;ssn&#x60;, &#x60;social_insurance&#x60;, &#x60;tax_id&#x60;, &#x60;identity_card&#x60;, &#x60;passport&#x60; and &#x60;driving_license&#x60;
   * @return type
  **/
  @ApiModelProperty(value = "Type of ID number. Valid values are `ssn`, `social_insurance`, `tax_id`, `identity_card`, `passport` and `driving_license`")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IdNumber value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of ID number
   * @return value
  **/
  @ApiModelProperty(value = "Value of ID number")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IdNumber stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Two letter code of issuing state (state-issued driving licenses only)
   * @return stateCode
  **/
  @ApiModelProperty(value = "Two letter code of issuing state (state-issued driving licenses only)")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdNumber idNumber = (IdNumber) o;
    return Objects.equals(this.type, idNumber.type) &&
        Objects.equals(this.value, idNumber.value) &&
        Objects.equals(this.stateCode, idNumber.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdNumber {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

