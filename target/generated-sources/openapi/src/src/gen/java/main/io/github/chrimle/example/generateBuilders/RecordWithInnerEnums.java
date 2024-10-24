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
 * Generated with Version: 1.10.0
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

  /** Builder class for {@link RecordWithInnerEnums } */
  public static class Builder {

    private ExampleInnerEnum exampleInner;
    private ExampleInnerTwoEnum exampleInnerTwo;

    /**
     * Sets the value of {@link RecordWithInnerEnums#exampleInner }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param exampleInner Example of an inner enum class
     * @return this {@link Builder}-instance for method-chaining
     */
    public Builder exampleInner(final ExampleInnerEnum exampleInner) {
      this.exampleInner = exampleInner;
      return this;
    }

    /**
     * Sets the value of {@link RecordWithInnerEnums#exampleInnerTwo }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     * @param exampleInnerTwo Example of another inner enum class
     * @return this {@link Builder}-instance for method-chaining
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
     * @return a new {@link RecordWithInnerEnums }-instance
     */
    public RecordWithInnerEnums build() {
      return new RecordWithInnerEnums(
        exampleInner,
        exampleInnerTwo
      );
    }
  }

  /** Creates a {@link Builder}-instance. */
  public static RecordWithInnerEnums.Builder builder() {
    return new RecordWithInnerEnums.Builder();
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
  }
}