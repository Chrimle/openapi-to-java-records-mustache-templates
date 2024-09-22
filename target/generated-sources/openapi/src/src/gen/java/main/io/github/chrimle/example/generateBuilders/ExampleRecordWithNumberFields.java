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
 * Generated with Version: 1.7.4
 *
 */

package io.github.chrimle.example.generateBuilders;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Example of a Record with Number fields
 * @param field1 a Number field
 * @param field2 another Number field
 * @param field3 yet another Number field
 */
public record ExampleRecordWithNumberFields(
    @javax.annotation.Nonnull BigDecimal field1,
    @javax.annotation.Nonnull BigDecimal field2,
    @javax.annotation.Nonnull BigDecimal field3) {

  public ExampleRecordWithNumberFields(
      @javax.annotation.Nonnull final BigDecimal field1,
      @javax.annotation.Nonnull final BigDecimal field2,
      @javax.annotation.Nonnull final BigDecimal field3) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
  }

  /** Builder class for {@link ExampleRecordWithNumberFields } */
  public static class Builder {

    private BigDecimal field1;
    private BigDecimal field2;
    private BigDecimal field3;

    /**
     * Sets the value of {@link ExampleRecordWithNumberFields#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param field1 a Number field
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder field1(final BigDecimal field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNumberFields#field2 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param field2 another Number field
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder field2(final BigDecimal field2) {
      this.field2 = field2;
      return this;
    }

    /**
     * Sets the value of {@link ExampleRecordWithNumberFields#field3 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param field3 yet another Number field
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder field3(final BigDecimal field3) {
      this.field3 = field3;
      return this;
    }

    /**
     * Builds a {@link ExampleRecordWithNumberFields }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @return a new {@link ExampleRecordWithNumberFields }-instance
     */
    public ExampleRecordWithNumberFields build() {
      return new ExampleRecordWithNumberFields(
        field1,
        field2,
        field3
      );
    }
  }

  /** Creates a {@link Builder}-instance. */
  public static ExampleRecordWithNumberFields.Builder builder() {
    return new ExampleRecordWithNumberFields.Builder();
  }
}
