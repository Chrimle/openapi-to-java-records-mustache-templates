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
 * Generated with Version: 2.9.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Example of a Record
 *
 * @param field1 a boolean field
 */
public record ExampleNullableRecord(
    @javax.annotation.Nonnull Boolean field1) {

  public ExampleNullableRecord(
      @javax.annotation.Nonnull final Boolean field1) { 
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
