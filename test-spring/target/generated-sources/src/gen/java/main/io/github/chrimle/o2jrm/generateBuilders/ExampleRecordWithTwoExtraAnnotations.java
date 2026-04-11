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
 * Example of a Record with two extra annotations
 *
 * @param field1 a boolean field
 */
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotationTwo
public record ExampleRecordWithTwoExtraAnnotations(
    Boolean field1) {

  @JsonCreator
  public ExampleRecordWithTwoExtraAnnotations(
      final Boolean field1) {
    this.field1 = field1;
  }

  /** Builder class for {@link ExampleRecordWithTwoExtraAnnotations }. */
  public static class Builder {

    private Boolean field1;

    /**
     * Sets the value of {@link ExampleRecordWithTwoExtraAnnotations#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 a boolean field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final Boolean field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordWithTwoExtraAnnotations }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordWithTwoExtraAnnotations }-instance.
     */
    public ExampleRecordWithTwoExtraAnnotations build() {
      return new ExampleRecordWithTwoExtraAnnotations(
          field1);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleRecordWithTwoExtraAnnotations.Builder builder() {
    return new ExampleRecordWithTwoExtraAnnotations.Builder();
  }
}
