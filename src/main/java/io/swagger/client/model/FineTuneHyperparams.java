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
import java.io.IOException;
import java.math.BigDecimal;
/**
 * FineTuneHyperparams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-22T11:54:28.282623982Z[GMT]")

public class FineTuneHyperparams {
  @SerializedName("n_epochs")
  private Integer nEpochs = null;

  @SerializedName("batch_size")
  private Integer batchSize = null;

  @SerializedName("prompt_loss_weight")
  private BigDecimal promptLossWeight = null;

  @SerializedName("learning_rate_multiplier")
  private BigDecimal learningRateMultiplier = null;

  @SerializedName("compute_classification_metrics")
  private Boolean computeClassificationMetrics = null;

  @SerializedName("classification_positive_class")
  private String classificationPositiveClass = null;

  @SerializedName("classification_n_classes")
  private Integer classificationNClasses = null;

  public FineTuneHyperparams nEpochs(Integer nEpochs) {
    this.nEpochs = nEpochs;
    return this;
  }

   /**
   * Get nEpochs
   * @return nEpochs
  **/
  @Schema(required = true, description = "")
  public Integer getNEpochs() {
    return nEpochs;
  }

  public void setNEpochs(Integer nEpochs) {
    this.nEpochs = nEpochs;
  }

  public FineTuneHyperparams batchSize(Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @Schema(required = true, description = "")
  public Integer getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

  public FineTuneHyperparams promptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
    return this;
  }

   /**
   * Get promptLossWeight
   * @return promptLossWeight
  **/
  @Schema(required = true, description = "")
  public BigDecimal getPromptLossWeight() {
    return promptLossWeight;
  }

  public void setPromptLossWeight(BigDecimal promptLossWeight) {
    this.promptLossWeight = promptLossWeight;
  }

  public FineTuneHyperparams learningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
    return this;
  }

   /**
   * Get learningRateMultiplier
   * @return learningRateMultiplier
  **/
  @Schema(required = true, description = "")
  public BigDecimal getLearningRateMultiplier() {
    return learningRateMultiplier;
  }

  public void setLearningRateMultiplier(BigDecimal learningRateMultiplier) {
    this.learningRateMultiplier = learningRateMultiplier;
  }

  public FineTuneHyperparams computeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
    return this;
  }

   /**
   * Get computeClassificationMetrics
   * @return computeClassificationMetrics
  **/
  @Schema(description = "")
  public Boolean isComputeClassificationMetrics() {
    return computeClassificationMetrics;
  }

  public void setComputeClassificationMetrics(Boolean computeClassificationMetrics) {
    this.computeClassificationMetrics = computeClassificationMetrics;
  }

  public FineTuneHyperparams classificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
    return this;
  }

   /**
   * Get classificationPositiveClass
   * @return classificationPositiveClass
  **/
  @Schema(description = "")
  public String getClassificationPositiveClass() {
    return classificationPositiveClass;
  }

  public void setClassificationPositiveClass(String classificationPositiveClass) {
    this.classificationPositiveClass = classificationPositiveClass;
  }

  public FineTuneHyperparams classificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
    return this;
  }

   /**
   * Get classificationNClasses
   * @return classificationNClasses
  **/
  @Schema(description = "")
  public Integer getClassificationNClasses() {
    return classificationNClasses;
  }

  public void setClassificationNClasses(Integer classificationNClasses) {
    this.classificationNClasses = classificationNClasses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneHyperparams fineTuneHyperparams = (FineTuneHyperparams) o;
    return Objects.equals(this.nEpochs, fineTuneHyperparams.nEpochs) &&
        Objects.equals(this.batchSize, fineTuneHyperparams.batchSize) &&
        Objects.equals(this.promptLossWeight, fineTuneHyperparams.promptLossWeight) &&
        Objects.equals(this.learningRateMultiplier, fineTuneHyperparams.learningRateMultiplier) &&
        Objects.equals(this.computeClassificationMetrics, fineTuneHyperparams.computeClassificationMetrics) &&
        Objects.equals(this.classificationPositiveClass, fineTuneHyperparams.classificationPositiveClass) &&
        Objects.equals(this.classificationNClasses, fineTuneHyperparams.classificationNClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nEpochs, batchSize, promptLossWeight, learningRateMultiplier, computeClassificationMetrics, classificationPositiveClass, classificationNClasses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneHyperparams {\n");
    
    sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    promptLossWeight: ").append(toIndentedString(promptLossWeight)).append("\n");
    sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
    sb.append("    computeClassificationMetrics: ").append(toIndentedString(computeClassificationMetrics)).append("\n");
    sb.append("    classificationPositiveClass: ").append(toIndentedString(classificationPositiveClass)).append("\n");
    sb.append("    classificationNClasses: ").append(toIndentedString(classificationNClasses)).append("\n");
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
