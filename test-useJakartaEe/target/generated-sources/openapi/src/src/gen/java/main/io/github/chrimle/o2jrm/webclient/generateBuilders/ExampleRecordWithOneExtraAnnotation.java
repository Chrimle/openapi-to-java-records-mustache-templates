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
 * Generated with Version: 2.9.5
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

/**
 * Example of a Record with an extra annotation
 *
 * @param field1 a boolean field with an extra field annotation
 * @param field2 a boolean field with two extra field annotations
 */
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
public record ExampleRecordWithOneExtraAnnotation(
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    @jakarta.annotation.Nonnull Boolean field1,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    @jakarta.annotation.Nonnull Boolean field2) {

  public ExampleRecordWithOneExtraAnnotation(
      @jakarta.annotation.Nonnull final Boolean field1,
      @jakarta.annotation.Nonnull final Boolean field2) {
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
