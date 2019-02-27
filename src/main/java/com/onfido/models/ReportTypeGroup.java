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
import com.onfido.models.ReportType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportTypeGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-27T11:31:31.783Z[GMT]")
public class ReportTypeGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GROUP_ONLY = "group_only";
  @SerializedName(SERIALIZED_NAME_GROUP_ONLY)
  private Boolean groupOnly;

  public static final String SERIALIZED_NAME_REPORT_TYPES = "report_types";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPES)
  private List<ReportType> reportTypes = new ArrayList<>();

  public ReportTypeGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the group.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportTypeGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The group’s name, as specified under your account.
   * @return name
  **/
  @ApiModelProperty(value = "The group’s name, as specified under your account.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportTypeGroup groupOnly(Boolean groupOnly) {
    this.groupOnly = groupOnly;
    return this;
  }

   /**
   * If false, individual reports in that group can be requested; if true, all reports must be requested together.
   * @return groupOnly
  **/
  @ApiModelProperty(value = "If false, individual reports in that group can be requested; if true, all reports must be requested together.")
  public Boolean getGroupOnly() {
    return groupOnly;
  }

  public void setGroupOnly(Boolean groupOnly) {
    this.groupOnly = groupOnly;
  }

  public ReportTypeGroup reportTypes(List<ReportType> reportTypes) {
    this.reportTypes = reportTypes;
    return this;
  }

  public ReportTypeGroup addReportTypesItem(ReportType reportTypesItem) {
    if (this.reportTypes == null) {
      this.reportTypes = new ArrayList<>();
    }
    this.reportTypes.add(reportTypesItem);
    return this;
  }

   /**
   * A list of report types included in this group.
   * @return reportTypes
  **/
  @ApiModelProperty(value = "A list of report types included in this group.")
  public List<ReportType> getReportTypes() {
    return reportTypes;
  }

  public void setReportTypes(List<ReportType> reportTypes) {
    this.reportTypes = reportTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTypeGroup reportTypeGroup = (ReportTypeGroup) o;
    return Objects.equals(this.id, reportTypeGroup.id) &&
        Objects.equals(this.name, reportTypeGroup.name) &&
        Objects.equals(this.groupOnly, reportTypeGroup.groupOnly) &&
        Objects.equals(this.reportTypes, reportTypeGroup.reportTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, groupOnly, reportTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTypeGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupOnly: ").append(toIndentedString(groupOnly)).append("\n");
    sb.append("    reportTypes: ").append(toIndentedString(reportTypes)).append("\n");
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

