package io.github.chrimle.o2jrm.generateBuilders;

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
 *
 * @param field1 a String field with a default value
 */
public record ExampleRecordWithDefaultFields(
    String field1) {

  @JsonCreator
  public ExampleRecordWithDefaultFields(
      final String field1) {
    this.field1 = Objects.requireNonNullElse(field1, "someDefaultValue");
  }

  /** Builder class for {@link ExampleRecordWithDefaultFields }. */
  public static class Builder {

    private String field1;

    /**
     * Sets the value of {@link ExampleRecordWithDefaultFields#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 a String field with a default value.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final String field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordWithDefaultFields }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordWithDefaultFields }-instance.
     */
    public ExampleRecordWithDefaultFields build() {
      return new ExampleRecordWithDefaultFields(
          field1);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleRecordWithDefaultFields.Builder builder() {
    return new ExampleRecordWithDefaultFields.Builder();
  }
}
