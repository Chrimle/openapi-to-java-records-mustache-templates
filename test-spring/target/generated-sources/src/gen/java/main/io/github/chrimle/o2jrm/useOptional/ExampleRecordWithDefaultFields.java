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
 * Example of a Record with default fields
 */

@Schema(name = "ExampleRecordWithDefaultFields", description = "Example of a Record with default fields")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public class ExampleRecordWithDefaultFields {

  private Optional<String> field1 = Optional.of("someDefaultValue");

  public ExampleRecordWithDefaultFields field1(String field1) {
    this.field1 = Optional.ofNullable(field1);
    return this;
  }

  /**
   * a String field with a default value
   * @return field1
   */
  
  @Schema(name = "field1", description = "a String field with a default value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field1")
  public Optional<String> getField1() {
    return field1;
  }

  @JsonProperty("field1")
  public void setField1(Optional<String> field1) {
    this.field1 = field1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleRecordWithDefaultFields exampleRecordWithDefaultFields = (ExampleRecordWithDefaultFields) o;
    return Objects.equals(this.field1, exampleRecordWithDefaultFields.field1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleRecordWithDefaultFields {\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
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

