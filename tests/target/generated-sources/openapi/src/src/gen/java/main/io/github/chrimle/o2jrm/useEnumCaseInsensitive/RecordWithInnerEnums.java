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

package io.github.chrimle.o2jrm.useEnumCaseInsensitive;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
import java.util.Set;

/**
 * Example of a Record with inner enum classes
 *
 * @param exampleInner Example of an inner enum class
 * @param exampleInnerTwo Example of another inner enum class with integer values
 * @param exampleInnerThree Example of another inner enum class with URI values
 */
public record RecordWithInnerEnums(
    @javax.annotation.Nonnull ExampleInnerEnum exampleInner,
    @javax.annotation.Nonnull ExampleInnerTwoEnum exampleInnerTwo,
    @javax.annotation.Nonnull ExampleInnerThreeEnum exampleInnerThree) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("exampleInner",
              "exampleInnerTwo",
              "exampleInnerThree"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of());

  public RecordWithInnerEnums(
      @javax.annotation.Nonnull final ExampleInnerEnum exampleInner,
      @javax.annotation.Nonnull final ExampleInnerTwoEnum exampleInnerTwo,
      @javax.annotation.Nonnull final ExampleInnerThreeEnum exampleInnerThree) { 
    this.exampleInner = exampleInner;
    this.exampleInnerTwo = exampleInnerTwo;
    this.exampleInnerThree = exampleInnerThree;
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
     * Case-insensitively matches the given {@code value} to an enum constant using {@link
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
        if (constant.getValue().equalsIgnoreCase(value)) {
          return constant;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    /**
     * Validates the JSON Element and throws an exception if issues are found.
     *
     * @param jsonElement to validate.
     * @throws IOException if the JSON Element is not a valid RecordWithInnerEnums object.
     */
    public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
      final String value = jsonElement.getAsString();
      ExampleInnerEnum.fromValue(value);
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

    /**
     * Validates the JSON Element and throws an exception if issues are found.
     *
     * @param jsonElement to validate.
     * @throws IOException if the JSON Element is not a valid RecordWithInnerEnums object.
     */
    public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
      final Integer value = jsonElement.getAsInt();
      ExampleInnerTwoEnum.fromValue(value);
    }
  }

  /**
   * Example of another inner enum class with URI values
   */
  public enum ExampleInnerThreeEnum {
    GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES(URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates")),
    CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_(URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/"));

    private final URI value;

    ExampleInnerThreeEnum(final URI value) {
      this.value = value;
    }

    /**
     * Gets the {@code value} of this enum.
     *
     * @return the value of this enum.
     */
    public URI getValue() {
      return value;
    }

    /**
     * Case-insensitively matches the given {@code value} to an enum constant using {@link
     * #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
     * returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link ExampleInnerThreeEnum } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
     */
    public static ExampleInnerThreeEnum fromValue(final URI value) {
      for (final ExampleInnerThreeEnum constant : ExampleInnerThreeEnum.values()) {
        if (constant.getValue().equals(value)) {
          return constant;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    /**
     * Validates the JSON Element and throws an exception if issues are found.
     *
     * @param jsonElement to validate.
     * @throws IOException if the JSON Element is not a valid RecordWithInnerEnums object.
     */
    public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
      final URI value = URI.create(jsonElement.getAsString());
      ExampleInnerThreeEnum.fromValue(value);
    }
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid RecordWithInnerEnums object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException {

  }
}
