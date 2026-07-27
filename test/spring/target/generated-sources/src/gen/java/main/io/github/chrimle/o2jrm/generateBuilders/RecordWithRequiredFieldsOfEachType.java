package io.github.chrimle.o2jrm.generateBuilders;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.generateBuilders.ExampleEnum;
import io.github.chrimle.o2jrm.generateBuilders.ExampleRecord;
import org.springframework.lang.Nullable;
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
 * @param field7 ExampleRecord.
 * @param field8 ExampleEnum.
 */
public record RecordWithRequiredFieldsOfEachType(
    @NotNull Integer field3,
    @Valid @NotNull ExampleRecord field7,
    @NotNull ExampleEnum field8) {

  @JsonCreator
  public RecordWithRequiredFieldsOfEachType(
      final Integer field3,
      final ExampleRecord field7,
      final ExampleEnum field8) {
    this.field3 = field3;
    this.field7 = field7;
    this.field8 = field8;
  }

  /** Builder class for {@link RecordWithRequiredFieldsOfEachType }. */
  public static class Builder {

    private Integer field3;
    private ExampleRecord field7;
    private ExampleEnum field8;

    /**
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field3 }.
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
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field7 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field7 sets the value of field7.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field7(final ExampleRecord field7) {
      this.field7 = field7;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field8 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field8 sets the value of field8.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field8(final ExampleEnum field8) {
      this.field8 = field8;
      return this;
    }

    /**
     * Builds a {@link RecordWithRequiredFieldsOfEachType }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link RecordWithRequiredFieldsOfEachType }-instance.
     */
    public RecordWithRequiredFieldsOfEachType build() {
      return new RecordWithRequiredFieldsOfEachType(
          field3,
          field7,
          field8);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static RecordWithRequiredFieldsOfEachType.Builder builder() {
    return new RecordWithRequiredFieldsOfEachType.Builder();
  }
}
