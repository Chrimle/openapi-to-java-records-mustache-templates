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

package io.github.chrimle.o2jrm.additionalModelTypeAnnotations;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example of a Record with default fields
 *
 * @param field1 a String field with a default value
 */
@io.github.chrimle.o2jrm.annotations.TestAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestAnnotationTwo
@io.github.chrimle.o2jrm.annotations.TestAnnotationThree
public record ExampleRecordWithDefaultFields(
    @javax.annotation.Nonnull String field1) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("field1"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of());

  public ExampleRecordWithDefaultFields(
      @javax.annotation.Nullable final String field1) { 
    this.field1 = Objects.requireNonNullElse(field1, "someDefaultValue");
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleRecordWithDefaultFields object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException { 
    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!ExampleRecordWithDefaultFields.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ExampleRecordWithDefaultFields` properties. JSON: %s",
                key, jsonElement));
      }
    }
  }
}
