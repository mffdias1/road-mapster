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
import io.swagger.client.model.ChatCompletionResponseMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CreateChatCompletionResponseChoices
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-22T11:54:28.282623982Z[GMT]")

public class CreateChatCompletionResponseChoices {
  @SerializedName("index")
  private Integer index = null;

  @SerializedName("message")
  private ChatCompletionResponseMessage message = null;

  /**
   * Gets or Sets finishReason
   */
  @JsonAdapter(FinishReasonEnum.Adapter.class)
  public enum FinishReasonEnum {
    @SerializedName("stop")
    STOP("stop"),
    @SerializedName("length")
    LENGTH("length"),
    @SerializedName("function_call")
    FUNCTION_CALL("function_call");

    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FinishReasonEnum fromValue(String input) {
      for (FinishReasonEnum b : FinishReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FinishReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FinishReasonEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FinishReasonEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FinishReasonEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("finish_reason")
  private FinishReasonEnum finishReason = null;

  public CreateChatCompletionResponseChoices index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(required = true, description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CreateChatCompletionResponseChoices message(ChatCompletionResponseMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(required = true, description = "")
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }

  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }

  public CreateChatCompletionResponseChoices finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

   /**
   * Get finishReason
   * @return finishReason
  **/
  @Schema(required = true, description = "")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponseChoices createChatCompletionResponseChoices = (CreateChatCompletionResponseChoices) o;
    return Objects.equals(this.index, createChatCompletionResponseChoices.index) &&
        Objects.equals(this.message, createChatCompletionResponseChoices.message) &&
        Objects.equals(this.finishReason, createChatCompletionResponseChoices.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, message, finishReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoices {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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