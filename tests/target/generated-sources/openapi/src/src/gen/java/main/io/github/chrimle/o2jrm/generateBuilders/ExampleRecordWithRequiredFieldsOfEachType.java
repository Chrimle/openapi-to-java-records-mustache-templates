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
 * Generated with Version: 2.7.1
 *
 */

package io.github.chrimle.o2jrm.generateBuilders;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.generateBuilders.ExampleEnum;
import io.github.chrimle.o2jrm.generateBuilders.ExampleRecord;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
import java.util.Set;

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
public record ExampleRecordWithRequiredFieldsOfEachType(
    @javax.annotation.Nonnull Boolean field1,
    @javax.annotation.Nonnull String field2,
    @javax.annotation.Nonnull Integer field3,
    @javax.annotation.Nonnull BigDecimal field4,
    @javax.annotation.Nonnull List<Boolean> field5,
    @javax.annotation.Nonnull Set<Boolean> field6,
    @javax.annotation.Nonnull ExampleRecord field7,
    @javax.annotation.Nonnull ExampleEnum field8) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("field1",
              "field2",
              "field3",
              "field4",
              "field5",
              "field6",
              "field7",
              "field8"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of("field1",
              "field2",
              "field3",
              "field4",
              "field5",
              "field6",
              "field7",
              "field8"));

  public ExampleRecordWithRequiredFieldsOfEachType(
      @javax.annotation.Nonnull final Boolean field1,
      @javax.annotation.Nonnull final String field2,
      @javax.annotation.Nonnull final Integer field3,
      @javax.annotation.Nonnull final BigDecimal field4,
      @javax.annotation.Nullable final List<Boolean> field5,
      @javax.annotation.Nullable final Set<Boolean> field6,
      @javax.annotation.Nonnull final ExampleRecord field7,
      @javax.annotation.Nonnull final ExampleEnum field8) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = Objects.requireNonNullElse(field5, new ArrayList<>());
    this.field6 = Objects.requireNonNullElse(field6, new LinkedHashSet<>());
    this.field7 = field7;
    this.field8 = field8;
  }

  /** Builder class for {@link ExampleRecordWithRequiredFieldsOfEachType }. */
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field1 }.
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field2 }.
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field3 }.
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field4 }.
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field5 }.
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field6 }.
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field7 }.
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
     * Sets the value of {@link ExampleRecordWithRequiredFieldsOfEachType#field8 }.
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
     * Builds a {@link ExampleRecordWithRequiredFieldsOfEachType }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleRecordWithRequiredFieldsOfEachType }-instance.
     */
    public ExampleRecordWithRequiredFieldsOfEachType build() {
      return new ExampleRecordWithRequiredFieldsOfEachType(
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
  public static ExampleRecordWithRequiredFieldsOfEachType.Builder builder() {
    return new ExampleRecordWithRequiredFieldsOfEachType.Builder();
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleRecordWithRequiredFieldsOfEachType object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException {

  }
}
