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

package io.github.chrimle.o2jrm.serializableModel;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Example of an Enum
 */
public enum ExampleEnum {
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

  ExampleEnum(final String value) {
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
   * @return a {@link ExampleEnum } with the matching value.
   * @throws IllegalArgumentException if no enum has a value matching the given value.
   */
  public static ExampleEnum fromValue(final String value) {
    for (final ExampleEnum constant : ExampleEnum.values()) {
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
   * @throws IOException if the JSON Element is not a valid ExampleEnum object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
    final String value = jsonElement.getAsString();
    ExampleEnum.fromValue(value);
  }

  /**
   * Converts {@link ExampleEnum } objects to and from JSON.
   *
   * @see com.google.gson.TypeAdapter
   */
  public static class Adapter extends TypeAdapter<ExampleEnum> {

    /**
     * Writes the {@link #value} of the {@code enumeration} as a JSON-string to the {@code
     * jsonWriter}.
     *
     * @param jsonWriter to write the value to.
     * @param enumeration to write as JSON.
     * @throws IOException if the {@code jsonWriter} fails to write the value.
     * @throws NullPointerException if {@code jsonWriter} or {@code enumeration} is {@code null}.
     */
    @Override
    public void write(final JsonWriter jsonWriter, final ExampleEnum enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    /**
     * Reads the <i>next</i> JSON-value from the {@code jsonReader} and converts it to a {@link
     * ExampleEnum }.
     *
     * @param jsonReader to read the JSON-string from.
     * @return a {@link ExampleEnum }.
     * @throws IOException if the {@code jsonReader} fails to read a value.
     * @throws NullPointerException if {@code jsonReader} is {@code null}.
     * @see #fromValue
     */
    @Override
    public ExampleEnum read(final JsonReader jsonReader) throws IOException {
      final String value = jsonReader.nextString();
      return ExampleEnum.fromValue(value);
    }
  }
}
