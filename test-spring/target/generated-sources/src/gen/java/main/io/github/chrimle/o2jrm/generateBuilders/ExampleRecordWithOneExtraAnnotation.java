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
 * Example of a Record with an extra annotation
 *
 * @param field1 a boolean field with an extra field annotation
 * @param field2 a boolean field with two extra field annotations
 */
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
public record ExampleRecordWithOneExtraAnnotation(
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Boolean field1,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Boolean field2) {

  @JsonCreator
  public ExampleRecordWithOneExtraAnnotation(
      final Boolean field1,
      final Boolean field2) {
    this.field1 = field1;
    this.field2 = field2;
  }

  /** Builder class for {@link ExampleRecordWithOneExtraAnnotation }. */
  public static class Builder {

    private Boolean field1;
    private Boolean field2;

    /**
     * Sets the value of {@link ExampleRecordWithOneExtraAnnotation#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 a boolean field with an extra field annotation.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final Boolean field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithOneExtraAnnotation#field2 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field2 a boolean field with two extra field annotations.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field2(final Boolean field2) {
      this.field2 = field2;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordWithOneExtraAnnotation }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordWithOneExtraAnnotation }-instance.
     */
    public ExampleRecordWithOneExtraAnnotation build() {
      return new ExampleRecordWithOneExtraAnnotation(
          field1,
          field2);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleRecordWithOneExtraAnnotation.Builder builder() {
    return new ExampleRecordWithOneExtraAnnotation.Builder();
  }
}
