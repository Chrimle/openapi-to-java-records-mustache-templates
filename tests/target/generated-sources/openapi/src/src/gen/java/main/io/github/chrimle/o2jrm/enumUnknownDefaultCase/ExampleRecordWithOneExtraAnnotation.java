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
 * Generated with Version: 2.9.1
 *
 */

package io.github.chrimle.o2jrm.enumUnknownDefaultCase;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example of a Record with an extra annotation
 *
 * @param field1 a boolean field with an extra field annotation
 * @param field2 a boolean field with two extra field annotations
 */
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
public record ExampleRecordWithOneExtraAnnotation(
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    @javax.annotation.Nonnull Boolean field1,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    @javax.annotation.Nonnull Boolean field2) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("field1",
              "field2"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields = new HashSet<String>(Set.of());

  public ExampleRecordWithOneExtraAnnotation(
      @javax.annotation.Nonnull final Boolean field1,
      @javax.annotation.Nonnull final Boolean field2) {
    this.field1 = field1;
    this.field2 = field2;
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleRecordWithOneExtraAnnotation object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException {
    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!ExampleRecordWithOneExtraAnnotation.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ExampleRecordWithOneExtraAnnotation` properties. JSON: %s",
                key, jsonElement));
      }
    }

    final JsonObject jsonObj = jsonElement.getAsJsonObject();

    if (jsonObj.get("field1") != null && !jsonObj.get("field1").isJsonNull()) { 
      if (!jsonObj.get("field1").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `field1` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("field1")));
      }
    }

    if (jsonObj.get("field2") != null && !jsonObj.get("field2").isJsonNull()) { 
      if (!jsonObj.get("field2").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `field2` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("field2")));
      }
    }
  }

  /**
   * Creates {@link TypeAdapter}s for {@link ExampleRecordWithOneExtraAnnotation }s and other
   * <i>assignable</i> types.
   */
  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

    /**
     * {@inheritDoc}
     *
     * @param gson to create the {@link TypeAdapter} from.
     * @param type to <i>serialize</i>/<i>deserialize</i>.
     * @return an (<i>anonymous</i>) instance of {@link TypeAdapter<ExampleRecordWithOneExtraAnnotation>}, or
     *     {@code null} if {@code T} is not <i>assignable</i> to {@link ExampleRecordWithOneExtraAnnotation }.
     * @param <T> class to <i>serialize</i>/<i>deserialize</i>.
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
      if (!ExampleRecordWithOneExtraAnnotation.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ExampleRecordWithOneExtraAnnotation> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ExampleRecordWithOneExtraAnnotation.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ExampleRecordWithOneExtraAnnotation>() {

            @Override
            public void write(final JsonWriter out, final ExampleRecordWithOneExtraAnnotation value)
                throws IOException {
              final JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ExampleRecordWithOneExtraAnnotation read(final JsonReader in) throws IOException {
              final JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }
}
