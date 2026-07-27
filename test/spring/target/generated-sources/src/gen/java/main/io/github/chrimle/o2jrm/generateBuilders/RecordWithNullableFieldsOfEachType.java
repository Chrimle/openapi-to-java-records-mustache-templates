package io.github.chrimle.o2jrm.generateBuilders;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.generateBuilders.ExampleNullableEnum;
import io.github.chrimle.o2jrm.generateBuilders.ExampleNullableRecord;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record with fields of each type
 *
 * @param field3 an Integer field
 * @param field7 ExampleNullableRecord.
 * @param field8 ExampleNullableEnum.
 */
public record RecordWithNullableFieldsOfEachType(
    Integer field3,
    @Valid ExampleNullableRecord field7,
    ExampleNullableEnum field8) {

  @JsonCreator
  public RecordWithNullableFieldsOfEachType(
      final Integer field3,
      final ExampleNullableRecord field7,
      final ExampleNullableEnum field8) {
    this.field3 = field3;
    this.field7 = field7;
    this.field8 = field8;
  }

  /** Builder class for {@link RecordWithNullableFieldsOfEachType }. */
  public static class Builder {

    private Integer field3;
    private ExampleNullableRecord field7;
    private ExampleNullableEnum field8;

    /**
     * Sets the value of {@link RecordWithNullableFieldsOfEachType#field3 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field3 an Integer field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field3(final Integer field3) {
      this.field3 = field3;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithNullableFieldsOfEachType#field7 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field7 sets the value of field7.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field7(final ExampleNullableRecord field7) {
      this.field7 = field7;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithNullableFieldsOfEachType#field8 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field8 sets the value of field8.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field8(final ExampleNullableEnum field8) {
      this.field8 = field8;
      return this;
    }

    /**
     * Builds a {@link RecordWithNullableFieldsOfEachType }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link RecordWithNullableFieldsOfEachType }-instance.
     */
    public RecordWithNullableFieldsOfEachType build() {
      return new RecordWithNullableFieldsOfEachType(
          field3,
          field7,
          field8);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static RecordWithNullableFieldsOfEachType.Builder builder() {
    return new RecordWithNullableFieldsOfEachType.Builder();
  }
}
