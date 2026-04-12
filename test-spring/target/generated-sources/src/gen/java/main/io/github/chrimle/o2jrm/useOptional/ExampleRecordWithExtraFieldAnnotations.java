package io.github.chrimle.o2jrm.useOptional;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record with fields with &#x60;x-field-extra-annotations&#x60;.
 */

@Schema(name = "ExampleRecordWithExtraFieldAnnotations", description = "Example of a Record with fields with `x-field-extra-annotations`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public class ExampleRecordWithExtraFieldAnnotations {

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
  private Optional<Boolean> oneAnnotationAsInline = Optional.empty();

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
  private Optional<Boolean> oneAnnotationAsNewLine = Optional.empty();

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
  private Optional<Boolean> oneAnnotationAsList = Optional.empty();

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
  private Optional<Boolean> oneAnnotationAsArray = Optional.empty();

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
  private Optional<Boolean> twoAnnotationsAsNewLine = Optional.empty();

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
  private Optional<Boolean> twoAnnotationsAsList = Optional.empty();

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
  private Optional<Boolean> twoAnnotationsAsArray = Optional.empty();

  public ExampleRecordWithExtraFieldAnnotations oneAnnotationAsInline(Boolean oneAnnotationAsInline) {
    this.oneAnnotationAsInline = Optional.ofNullable(oneAnnotationAsInline);
    return this;
  }

  /**
   * Setting ONE annotation, using inlined.
   * @return oneAnnotationAsInline
   */
  
  @Schema(name = "oneAnnotationAsInline", description = "Setting ONE annotation, using inlined.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oneAnnotationAsInline")
  public Optional<Boolean> getOneAnnotationAsInline() {
    return oneAnnotationAsInline;
  }

  @JsonProperty("oneAnnotationAsInline")
  public void setOneAnnotationAsInline(Optional<Boolean> oneAnnotationAsInline) {
    this.oneAnnotationAsInline = oneAnnotationAsInline;
  }

  public ExampleRecordWithExtraFieldAnnotations oneAnnotationAsNewLine(Boolean oneAnnotationAsNewLine) {
    this.oneAnnotationAsNewLine = Optional.ofNullable(oneAnnotationAsNewLine);
    return this;
  }

  /**
   * Setting ONE annotation, using newlines.
   * @return oneAnnotationAsNewLine
   */
  
  @Schema(name = "oneAnnotationAsNewLine", description = "Setting ONE annotation, using newlines.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oneAnnotationAsNewLine")
  public Optional<Boolean> getOneAnnotationAsNewLine() {
    return oneAnnotationAsNewLine;
  }

  @JsonProperty("oneAnnotationAsNewLine")
  public void setOneAnnotationAsNewLine(Optional<Boolean> oneAnnotationAsNewLine) {
    this.oneAnnotationAsNewLine = oneAnnotationAsNewLine;
  }

  public ExampleRecordWithExtraFieldAnnotations oneAnnotationAsList(Boolean oneAnnotationAsList) {
    this.oneAnnotationAsList = Optional.ofNullable(oneAnnotationAsList);
    return this;
  }

  /**
   * Setting ONE annotation, using list.
   * @return oneAnnotationAsList
   */
  
  @Schema(name = "oneAnnotationAsList", description = "Setting ONE annotation, using list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oneAnnotationAsList")
  public Optional<Boolean> getOneAnnotationAsList() {
    return oneAnnotationAsList;
  }

  @JsonProperty("oneAnnotationAsList")
  public void setOneAnnotationAsList(Optional<Boolean> oneAnnotationAsList) {
    this.oneAnnotationAsList = oneAnnotationAsList;
  }

  public ExampleRecordWithExtraFieldAnnotations oneAnnotationAsArray(Boolean oneAnnotationAsArray) {
    this.oneAnnotationAsArray = Optional.ofNullable(oneAnnotationAsArray);
    return this;
  }

  /**
   * Setting ONE annotation, using array.
   * @return oneAnnotationAsArray
   */
  
  @Schema(name = "oneAnnotationAsArray", description = "Setting ONE annotation, using array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oneAnnotationAsArray")
  public Optional<Boolean> getOneAnnotationAsArray() {
    return oneAnnotationAsArray;
  }

  @JsonProperty("oneAnnotationAsArray")
  public void setOneAnnotationAsArray(Optional<Boolean> oneAnnotationAsArray) {
    this.oneAnnotationAsArray = oneAnnotationAsArray;
  }

  public ExampleRecordWithExtraFieldAnnotations twoAnnotationsAsNewLine(Boolean twoAnnotationsAsNewLine) {
    this.twoAnnotationsAsNewLine = Optional.ofNullable(twoAnnotationsAsNewLine);
    return this;
  }

  /**
   * Setting TWO annotations, using newlines.
   * @return twoAnnotationsAsNewLine
   */
  
  @Schema(name = "twoAnnotationsAsNewLine", description = "Setting TWO annotations, using newlines.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twoAnnotationsAsNewLine")
  public Optional<Boolean> getTwoAnnotationsAsNewLine() {
    return twoAnnotationsAsNewLine;
  }

  @JsonProperty("twoAnnotationsAsNewLine")
  public void setTwoAnnotationsAsNewLine(Optional<Boolean> twoAnnotationsAsNewLine) {
    this.twoAnnotationsAsNewLine = twoAnnotationsAsNewLine;
  }

  public ExampleRecordWithExtraFieldAnnotations twoAnnotationsAsList(Boolean twoAnnotationsAsList) {
    this.twoAnnotationsAsList = Optional.ofNullable(twoAnnotationsAsList);
    return this;
  }

  /**
   * Setting TWO annotations, using list.
   * @return twoAnnotationsAsList
   */
  
  @Schema(name = "twoAnnotationsAsList", description = "Setting TWO annotations, using list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twoAnnotationsAsList")
  public Optional<Boolean> getTwoAnnotationsAsList() {
    return twoAnnotationsAsList;
  }

  @JsonProperty("twoAnnotationsAsList")
  public void setTwoAnnotationsAsList(Optional<Boolean> twoAnnotationsAsList) {
    this.twoAnnotationsAsList = twoAnnotationsAsList;
  }

  public ExampleRecordWithExtraFieldAnnotations twoAnnotationsAsArray(Boolean twoAnnotationsAsArray) {
    this.twoAnnotationsAsArray = Optional.ofNullable(twoAnnotationsAsArray);
    return this;
  }

  /**
   * Setting TWO annotations, using array.
   * @return twoAnnotationsAsArray
   */
  
  @Schema(name = "twoAnnotationsAsArray", description = "Setting TWO annotations, using array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twoAnnotationsAsArray")
  public Optional<Boolean> getTwoAnnotationsAsArray() {
    return twoAnnotationsAsArray;
  }

  @JsonProperty("twoAnnotationsAsArray")
  public void setTwoAnnotationsAsArray(Optional<Boolean> twoAnnotationsAsArray) {
    this.twoAnnotationsAsArray = twoAnnotationsAsArray;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleRecordWithExtraFieldAnnotations exampleRecordWithExtraFieldAnnotations = (ExampleRecordWithExtraFieldAnnotations) o;
    return Objects.equals(this.oneAnnotationAsInline, exampleRecordWithExtraFieldAnnotations.oneAnnotationAsInline) &&
        Objects.equals(this.oneAnnotationAsNewLine, exampleRecordWithExtraFieldAnnotations.oneAnnotationAsNewLine) &&
        Objects.equals(this.oneAnnotationAsList, exampleRecordWithExtraFieldAnnotations.oneAnnotationAsList) &&
        Objects.equals(this.oneAnnotationAsArray, exampleRecordWithExtraFieldAnnotations.oneAnnotationAsArray) &&
        Objects.equals(this.twoAnnotationsAsNewLine, exampleRecordWithExtraFieldAnnotations.twoAnnotationsAsNewLine) &&
        Objects.equals(this.twoAnnotationsAsList, exampleRecordWithExtraFieldAnnotations.twoAnnotationsAsList) &&
        Objects.equals(this.twoAnnotationsAsArray, exampleRecordWithExtraFieldAnnotations.twoAnnotationsAsArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneAnnotationAsInline, oneAnnotationAsNewLine, oneAnnotationAsList, oneAnnotationAsArray, twoAnnotationsAsNewLine, twoAnnotationsAsList, twoAnnotationsAsArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleRecordWithExtraFieldAnnotations {\n");
    sb.append("    oneAnnotationAsInline: ").append(toIndentedString(oneAnnotationAsInline)).append("\n");
    sb.append("    oneAnnotationAsNewLine: ").append(toIndentedString(oneAnnotationAsNewLine)).append("\n");
    sb.append("    oneAnnotationAsList: ").append(toIndentedString(oneAnnotationAsList)).append("\n");
    sb.append("    oneAnnotationAsArray: ").append(toIndentedString(oneAnnotationAsArray)).append("\n");
    sb.append("    twoAnnotationsAsNewLine: ").append(toIndentedString(twoAnnotationsAsNewLine)).append("\n");
    sb.append("    twoAnnotationsAsList: ").append(toIndentedString(twoAnnotationsAsList)).append("\n");
    sb.append("    twoAnnotationsAsArray: ").append(toIndentedString(twoAnnotationsAsArray)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

