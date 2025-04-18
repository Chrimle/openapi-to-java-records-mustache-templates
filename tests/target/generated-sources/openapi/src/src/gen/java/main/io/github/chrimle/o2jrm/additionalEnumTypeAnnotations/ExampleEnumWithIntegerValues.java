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
 * Generated with Version: 2.8.2
 *
 */

package io.github.chrimle.o2jrm.additionalEnumTypeAnnotations;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Example of an Enum with integer values
 */
@io.github.chrimle.o2jrm.annotations.TestAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestAnnotationTwo
@io.github.chrimle.o2jrm.annotations.TestAnnotationThree
public enum ExampleEnumWithIntegerValues {
  NUMBER_100(100),
  NUMBER_200(200),
  NUMBER_300(300),
  NUMBER_400(400),
  NUMBER_500(500);

  private final Integer value;

  ExampleEnumWithIntegerValues(final Integer value) {
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
   * @return a {@link ExampleEnumWithIntegerValues } with the matching value.
   * @throws IllegalArgumentException if no enum has a value matching the given value.
   */
  public static ExampleEnumWithIntegerValues fromValue(final Integer value) {
    for (final ExampleEnumWithIntegerValues constant : ExampleEnumWithIntegerValues.values()) {
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
   * @throws IOException if the JSON Element is not a valid ExampleEnumWithIntegerValues object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
    final Integer value = jsonElement.getAsInt();
    ExampleEnumWithIntegerValues.fromValue(value);
  }

  public static class Adapter extends TypeAdapter<ExampleEnumWithIntegerValues> {

    @Override
    public void write(final JsonWriter jsonWriter, final ExampleEnumWithIntegerValues enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExampleEnumWithIntegerValues read(final JsonReader jsonReader) throws IOException {
      final Integer value = jsonReader.nextInt();
      return ExampleEnumWithIntegerValues.fromValue(value);
    }
  }
}
