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
 * Generated with Version: 2.5.1
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
import java.util.Arrays;

/**
 * Example of a Record with inner enum classes
 *
 * @param exampleInner Example of an inner enum class
 * @param exampleInnerTwo Example of another inner enum class with integer values
 */
public record RecordWithInnerEnums(
    @javax.annotation.Nonnull ExampleInnerEnum exampleInner,
    @javax.annotation.Nonnull ExampleInnerTwoEnum exampleInnerTwo) {

  public RecordWithInnerEnums(
      @javax.annotation.Nonnull final ExampleInnerEnum exampleInner,
      @javax.annotation.Nonnull final ExampleInnerTwoEnum exampleInnerTwo) { 
    this.exampleInner = exampleInner;
    this.exampleInnerTwo = exampleInnerTwo;
  }

  /** Builder class for {@link RecordWithInnerEnums }. */
  public static class Builder {

    private ExampleInnerEnum exampleInner;
    private ExampleInnerTwoEnum exampleInnerTwo;

    /**
     * Sets the value of {@link RecordWithInnerEnums#exampleInner }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param exampleInner Example of an inner enum class.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder exampleInner(final ExampleInnerEnum exampleInner) {
      this.exampleInner = exampleInner;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithInnerEnums#exampleInnerTwo }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param exampleInnerTwo Example of another inner enum class with integer values.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder exampleInnerTwo(final ExampleInnerTwoEnum exampleInnerTwo) {
      this.exampleInnerTwo = exampleInnerTwo;
      return this;
    }

    /**
     * Builds a {@link RecordWithInnerEnums }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link RecordWithInnerEnums }-instance.
     */
    public RecordWithInnerEnums build() {
      return new RecordWithInnerEnums(
        exampleInner,
        exampleInnerTwo
      );
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static RecordWithInnerEnums.Builder builder() {
    return new RecordWithInnerEnums.Builder();
  }

  /**
   * Example of an inner enum class
   */
  public enum ExampleInnerEnum {
    /**
     * Some description of ENUM1
     */
    ENUM1("ENUM1"),
    /**
     * Some description of ENUM2
     */
    ENUM2("ENUM2"),
    /**
     * Some description of ENUM3
     */
    ENUM3("ENUM3");

    private final String value;

    ExampleInnerEnum(final String value) {
      this.value = value;
    }

    /**
     * Gets the {@code value} of this enum.
     *
     * @return the value of this enum.
     */
    public String getValue() {
      return value;
    }

    /**
     * Case-sensitively matches the given {@code value} to an enum constant using {@link
     * #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
     * returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link ExampleInnerEnum } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
     */
    public static ExampleInnerEnum fromValue(final String value) {
      for (final ExampleInnerEnum constant : ExampleInnerEnum.values()) {
        if (constant.getValue().equals(value)) {
          return constant;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  /**
   * Example of another inner enum class with integer values
   */
  public enum ExampleInnerTwoEnum {
    NUMBER_404(404),
    NUMBER_501(501),
    NUMBER_503(503);

    private final Integer value;

    ExampleInnerTwoEnum(final Integer value) {
      this.value = value;
    }

    /**
     * Gets the {@code value} of this enum.
     *
     * @return the value of this enum.
     */
    public Integer getValue() {
      return value;
    }

    /**
     * Matches the given {@code value} to an enum constant using {@link
     * #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
     * returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link ExampleInnerTwoEnum } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
     */
    public static ExampleInnerTwoEnum fromValue(final Integer value) {
      for (final ExampleInnerTwoEnum constant : ExampleInnerTwoEnum.values()) {
        if (constant.getValue().equals(value)) {
          return constant;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
}
