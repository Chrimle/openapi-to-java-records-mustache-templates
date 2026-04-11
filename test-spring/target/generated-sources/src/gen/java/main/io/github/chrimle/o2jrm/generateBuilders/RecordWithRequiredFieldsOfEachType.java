package io.github.chrimle.o2jrm.generateBuilders;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.chrimle.o2jrm.generateBuilders.ExampleEnum;
import io.github.chrimle.o2jrm.generateBuilders.ExampleRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * @param field1 a Boolean field
 * @param field2 a String field
 * @param field3 an Integer field
 * @param field4 a Number field
 * @param field5 an Array of Boolean field
 * @param field6 a Set field
 * @param field7 ExampleRecord.
 * @param field8 ExampleEnum.
 */
public record RecordWithRequiredFieldsOfEachType(
    @NotNull Boolean field1,
    @NotNull String field2,
    @NotNull Integer field3,
    @NotNull BigDecimal field4,
    @NotNull List<Boolean> field5,
    @NotNull Set<Boolean> field6,
    @Valid @NotNull ExampleRecord field7,
    @NotNull ExampleEnum field8) {

  @JsonCreator
  public RecordWithRequiredFieldsOfEachType(
      final Boolean field1,
      final String field2,
      final Integer field3,
      final BigDecimal field4,
      final List<Boolean> field5,
      final Set<Boolean> field6,
      final ExampleRecord field7,
      final ExampleEnum field8) {
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = Objects.requireNonNullElseGet(field5, () -> new ArrayList<>());
    this.field6 = Objects.requireNonNullElseGet(field6, () -> new LinkedHashSet<>());
    this.field7 = field7;
    this.field8 = field8;
  }

  /** Builder class for {@link RecordWithRequiredFieldsOfEachType }. */
  public static class Builder {

    private Boolean field1;
    private String field2;
    private Integer field3;
    private BigDecimal field4;
    private List<Boolean> field5;
    private Set<Boolean> field6;
    private ExampleRecord field7;
    private ExampleEnum field8;

    /**
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 a Boolean field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final Boolean field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field2 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field2 a String field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field2(final String field2) {
      this.field2 = field2;
      return this;
    }

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
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field4 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field4 a Number field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field4(final BigDecimal field4) {
      this.field4 = field4;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field5 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field5 an Array of Boolean field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field5(final List<Boolean> field5) {
      this.field5 = field5;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithRequiredFieldsOfEachType#field6 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field6 a Set field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field6(final Set<Boolean> field6) {
      this.field6 = field6;
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
          field1,
          field2,
          field3,
          field4,
          field5,
          field6,
          field7,
          field8);
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static RecordWithRequiredFieldsOfEachType.Builder builder() {
    return new RecordWithRequiredFieldsOfEachType.Builder();
  }
}
