/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.CreateEmbeddingResponseData;
import io.swagger.client.model.CreateEmbeddingResponseUsage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CreateEmbeddingResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-22T11:54:28.282623982Z[GMT]")

public class CreateEmbeddingResponse {
  @SerializedName("object")
  private String object = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("data")
  private List<CreateEmbeddingResponseData> data = new ArrayList<CreateEmbeddingResponseData>();

  @SerializedName("usage")
  private CreateEmbeddingResponseUsage usage = null;

  public CreateEmbeddingResponse object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(required = true, description = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public CreateEmbeddingResponse model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Schema(required = true, description = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateEmbeddingResponse data(List<CreateEmbeddingResponseData> data) {
    this.data = data;
    return this;
  }

  public CreateEmbeddingResponse addDataItem(CreateEmbeddingResponseData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<CreateEmbeddingResponseData> getData() {
    return data;
  }

  public void setData(List<CreateEmbeddingResponseData> data) {
    this.data = data;
  }

  public CreateEmbeddingResponse usage(CreateEmbeddingResponseUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @Schema(required = true, description = "")
  public CreateEmbeddingResponseUsage getUsage() {
    return usage;
  }

  public void setUsage(CreateEmbeddingResponseUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingResponse createEmbeddingResponse = (CreateEmbeddingResponse) o;
    return Objects.equals(this.object, createEmbeddingResponse.object) &&
        Objects.equals(this.model, createEmbeddingResponse.model) &&
        Objects.equals(this.data, createEmbeddingResponse.data) &&
        Objects.equals(this.usage, createEmbeddingResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, model, data, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponse {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
