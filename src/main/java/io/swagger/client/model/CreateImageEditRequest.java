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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.io.IOException;
/**
 * CreateImageEditRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-22T11:54:28.282623982Z[GMT]")

public class CreateImageEditRequest {
  @SerializedName("image")
  private File image = null;

  @SerializedName("mask")
  private File mask = null;

  @SerializedName("prompt")
  private String prompt = null;

  @SerializedName("n")
  private Integer n = 1;

  /**
   * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
   */
  @JsonAdapter(SizeEnum.Adapter.class)
  public enum SizeEnum {
    @SerializedName("256x256")
    _256X256("256x256"),
    @SerializedName("512x512")
    _512X512("512x512"),
    @SerializedName("1024x1024")
    _1024X1024("1024x1024");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SizeEnum fromValue(String input) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SizeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SizeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("size")
  private SizeEnum size = SizeEnum._1024X1024;

  /**
   * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
   */
  @JsonAdapter(ResponseFormatEnum.Adapter.class)
  public enum ResponseFormatEnum {
    @SerializedName("url")
    URL("url"),
    @SerializedName("b64_json")
    B64_JSON("b64_json");

    private String value;

    ResponseFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResponseFormatEnum fromValue(String input) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResponseFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseFormatEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResponseFormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResponseFormatEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("response_format")
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;

  @SerializedName("user")
  private String user = null;

  public CreateImageEditRequest image(File image) {
    this.image = image;
    return this;
  }

   /**
   * The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
   * @return image
  **/
  @Schema(required = true, description = "The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.")
  public File getImage() {
    return image;
  }

  public void setImage(File image) {
    this.image = image;
  }

  public CreateImageEditRequest mask(File mask) {
    this.mask = mask;
    return this;
  }

   /**
   * An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
   * @return mask
  **/
  @Schema(description = "An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.")
  public File getMask() {
    return mask;
  }

  public void setMask(File mask) {
    this.mask = mask;
  }

  public CreateImageEditRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * A text description of the desired image(s). The maximum length is 1000 characters.
   * @return prompt
  **/
  @Schema(example = "A cute baby sea otter wearing a beret", required = true, description = "A text description of the desired image(s). The maximum length is 1000 characters.")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public CreateImageEditRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * The number of images to generate. Must be between 1 and 10.
   * minimum: 1
   * maximum: 10
   * @return n
  **/
  @Schema(example = "1", description = "The number of images to generate. Must be between 1 and 10.")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateImageEditRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
   * @return size
  **/
  @Schema(example = "1024x1024", description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.")
  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public CreateImageEditRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
   * @return responseFormat
  **/
  @Schema(example = "url", description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateImageEditRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  @Schema(example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateImageEditRequest createImageEditRequest = (CreateImageEditRequest) o;
    return Objects.equals(this.image, createImageEditRequest.image) &&
        Objects.equals(this.mask, createImageEditRequest.mask) &&
        Objects.equals(this.prompt, createImageEditRequest.prompt) &&
        Objects.equals(this.n, createImageEditRequest.n) &&
        Objects.equals(this.size, createImageEditRequest.size) &&
        Objects.equals(this.responseFormat, createImageEditRequest.responseFormat) &&
        Objects.equals(this.user, createImageEditRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(image), Objects.hashCode(mask), prompt, n, size, responseFormat, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImageEditRequest {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
