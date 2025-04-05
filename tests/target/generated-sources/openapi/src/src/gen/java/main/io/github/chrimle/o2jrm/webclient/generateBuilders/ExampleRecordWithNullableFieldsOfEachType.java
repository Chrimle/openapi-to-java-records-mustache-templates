/*
 * Example OpenAPI Spec.
 * An example OpenAPI-spec to generate example Java records.
 *
 * The version of the OpenAPI document: 0.0.1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * This class was generated using custom mustache templates from
 * openapi-to-java-records-mustache-templates. For further information,
 * questions, requesting features or reporting issues, please visit:
 * https://github.com/Chrimle/openapi-to-java-records-mustache-templates.
 * Generated with Version: 2.8.0
 *
 */

package io.github.chrimle.o2jrm.webclient.generateBuilders;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.webclient.generateBuilders.ExampleNullableEnum;
import io.github.chrimle.o2jrm.webclient.generateBuilders.ExampleNullableRecord;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Example of a Record with fields of each type
 *
 * @param field1 a Boolean field
 * @param field2 a String field
 * @param field3 an Integer field
 * @param field4 a Number field
 * @param field5 an Array of Boolean field
 * @param field6 a Set field
 * @param field7 ExampleNullableRecord.
 * @param field8 ExampleNullableEnum.
 */
public record ExampleRecordWithNullableFieldsOfEachType(
    @javax.annotation.Nullable Boolean field1,
    @javax.annotation.Nullable String field2,
    @javax.annotation.Nullable Integer field3,
    @javax.annotation.Nullable BigDecimal field4,
    @javax.annotation.Nullable List<Boolean> field5,
    @javax.annotation.Nullable Set<Boolean> field6,
    @javax.annotation.Nullable ExampleNullableRecord field7,
    @javax.annotation.Nullable ExampleNullableEnum field8) {

  public ExampleRecordWithNullableFieldsOfEachType(
      @javax.annotation.Nullable final Boolean field1,
      @javax.annotation.Nullable final String field2,
      @javax.annotation.Nullable final Integer field3,
      @javax.annotation.Nullable final BigDecimal field4,
      @javax.annotation.Nullable final List<Boolean> field5,
      @javax.annotation.Nullable final Set<Boolean> field6,
      @javax.annotation.Nullable final ExampleNullableRecord field7,
      @javax.annotation.Nullable final ExampleNullableEnum field8) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = field5;
    this.field6 = field6;
    this.field7 = field7;
    this.field8 = field8;
  }

  /** Builder class for {@link ExampleRecordWithNullableFieldsOfEachType }. */
  public static class Builder {

    private Boolean field1;
    private String field2;
    private Integer field3;
    private BigDecimal field4;
    private List<Boolean> field5;
    private Set<Boolean> field6;
    private ExampleNullableRecord field7;
    private ExampleNullableEnum field8;

    /**
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field1 }.
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
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field2 }.
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
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field3 }.
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
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field4 }.
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
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field5 }.
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
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field6 }.
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
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field7 }.
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
     * Sets the value of {@link ExampleRecordWithNullableFieldsOfEachType#field8 }.
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
     * Builds a {@link ExampleRecordWithNullableFieldsOfEachType }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordWithNullableFieldsOfEachType }-instance.
     */
    public ExampleRecordWithNullableFieldsOfEachType build() {
      return new ExampleRecordWithNullableFieldsOfEachType(
        field1,
        field2,
        field3,
        field4,
        field5,
        field6,
        field7,
        field8
      );
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleRecordWithNullableFieldsOfEachType.Builder builder() {
    return new ExampleRecordWithNullableFieldsOfEachType.Builder();
  }
}
