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
 * Example of a Record with an extra annotation
 */

@Schema(name = "ExampleRecordWithOneExtraAnnotation", description = "Example of a Record with an extra annotation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
public class ExampleRecordWithOneExtraAnnotation {

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
  private Optional<Boolean> field1 = Optional.empty();

  @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
  private Optional<Boolean> field2 = Optional.empty();

  public ExampleRecordWithOneExtraAnnotation field1(Boolean field1) {
    this.field1 = Optional.ofNullable(field1);
    return this;
  }

  /**
   * a boolean field with an extra field annotation
   * @return field1
   */
  
  @Schema(name = "field1", description = "a boolean field with an extra field annotation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field1")
  public Optional<Boolean> getField1() {
    return field1;
  }

  @JsonProperty("field1")
  public void setField1(Optional<Boolean> field1) {
    this.field1 = field1;
  }

  public ExampleRecordWithOneExtraAnnotation field2(Boolean field2) {
    this.field2 = Optional.ofNullable(field2);
    return this;
  }

  /**
   * a boolean field with two extra field annotations
   * @return field2
   */
  
  @Schema(name = "field2", description = "a boolean field with two extra field annotations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field2")
  public Optional<Boolean> getField2() {
    return field2;
  }

  @JsonProperty("field2")
  public void setField2(Optional<Boolean> field2) {
    this.field2 = field2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleRecordWithOneExtraAnnotation exampleRecordWithOneExtraAnnotation = (ExampleRecordWithOneExtraAnnotation) o;
    return Objects.equals(this.field1, exampleRecordWithOneExtraAnnotation.field1) &&
        Objects.equals(this.field2, exampleRecordWithOneExtraAnnotation.field2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1, field2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleRecordWithOneExtraAnnotation {\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
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

