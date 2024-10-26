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
 * Generated with Version: 2.0.0
 *
 */

package io.github.chrimle.example.standard;

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
 * @param exampleInnerTwo Example of another inner enum class
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

  /**
   * Example of an inner enum class
   */
  public enum ExampleInnerEnum {
    ENUM1("ENUM1"),
    ENUM2("ENUM2"),
    ENUM3("ENUM3");

    private final String value;

    ExampleInnerEnum(final String value) {
      this.value = value;
    }

    /**
     * Gets the {@code value} of this enum.
     *
     * @return value of this enum
     */
    public String getValue() {
      return value;
    }

    /**
     * Case-sensitively parses the given string to an enum constant whose {@link #getValue()}
     * matches the provided value.
     *
     * @param value of the Enum
     * @return a {@link ExampleInnerEnum } with the matching value
     * @throws IllegalArgumentException if no enum has a value matching the given value
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
   * Example of another inner enum class
   */
  public enum ExampleInnerTwoEnum {
    ENUM1("ENUM1"),
    ENUM2("ENUM2"),
    ENUM3("ENUM3");

    private final String value;

    ExampleInnerTwoEnum(final String value) {
      this.value = value;
    }

    /**
     * Gets the {@code value} of this enum.
     *
     * @return value of this enum
     */
    public String getValue() {
      return value;
    }

    /**
     * Case-sensitively parses the given string to an enum constant whose {@link #getValue()}
     * matches the provided value.
     *
     * @param value of the Enum
     * @return a {@link ExampleInnerTwoEnum } with the matching value
     * @throws IllegalArgumentException if no enum has a value matching the given value
     */
    public static ExampleInnerTwoEnum fromValue(final String value) {
      for (final ExampleInnerTwoEnum constant : ExampleInnerTwoEnum.values()) {
        if (constant.getValue().equals(value)) {
          return constant;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
}
