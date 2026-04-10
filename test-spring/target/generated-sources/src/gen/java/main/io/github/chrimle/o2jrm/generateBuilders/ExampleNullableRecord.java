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
 * Example of a Record
 *
 * @param field1 a boolean field
 */
public record ExampleNullableRecord(
    Boolean field1) {

  @JsonCreator
  public ExampleNullableRecord(
      final Boolean field1) {
    this.field1 = field1;
  }

  /** Builder class for {@link ExampleNullableRecord }. */
  public static class Builder {

    private Boolean field1;

    /**
     * Sets the value of {@link ExampleNullableRecord#field1 }.
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
     * Builds a {@link ExampleNullableRecord }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleNullableRecord }-instance.
     */
    public ExampleNullableRecord build() {
      return new ExampleNullableRecord(
          field1);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleNullableRecord.Builder builder() {
    return new ExampleNullableRecord.Builder();
  }
}
