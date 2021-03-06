/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 */
@ApiModel(description = "PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.")

public class V1alpha1PriorityClass {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("globalDefault")
  private Boolean globalDefault = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("value")
  private Integer value = null;

  public V1alpha1PriorityClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1alpha1PriorityClass description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
   * @return description
  **/
  @ApiModelProperty(value = "description is an arbitrary string that usually provides guidelines on when this priority class should be used.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1alpha1PriorityClass globalDefault(Boolean globalDefault) {
    this.globalDefault = globalDefault;
    return this;
  }

   /**
   * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as &#x60;globalDefault&#x60;. However, if more than one PriorityClasses exists with their &#x60;globalDefault&#x60; field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
   * @return globalDefault
  **/
  @ApiModelProperty(value = "globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.")
  public Boolean isGlobalDefault() {
    return globalDefault;
  }

  public void setGlobalDefault(Boolean globalDefault) {
    this.globalDefault = globalDefault;
  }

  public V1alpha1PriorityClass kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha1PriorityClass metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1alpha1PriorityClass value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PriorityClass v1alpha1PriorityClass = (V1alpha1PriorityClass) o;
    return Objects.equals(this.apiVersion, v1alpha1PriorityClass.apiVersion) &&
        Objects.equals(this.description, v1alpha1PriorityClass.description) &&
        Objects.equals(this.globalDefault, v1alpha1PriorityClass.globalDefault) &&
        Objects.equals(this.kind, v1alpha1PriorityClass.kind) &&
        Objects.equals(this.metadata, v1alpha1PriorityClass.metadata) &&
        Objects.equals(this.value, v1alpha1PriorityClass.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, description, globalDefault, kind, metadata, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PriorityClass {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    globalDefault: ").append(toIndentedString(globalDefault)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

