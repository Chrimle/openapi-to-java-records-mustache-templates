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

package io.github.chrimle.o2jrm.useBeanValidation;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

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
 * Example of a Record with default fields
 *
 * @param field1 a String field with a default value
 */
public record ExampleRecordWithDefaultFields(
    @javax.annotation.Nonnull String field1) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("field1"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(Set.of());

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

    final JsonObject jsonObj = jsonElement.getAsJsonObject();

    if (jsonObj.get("field1") != null
        && !jsonObj.get("field1").isJsonNull()) { 
      if (!jsonObj.get("field1").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `field1` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("field1")));
      }
    }
  }

  /**
   * Creates {@link TypeAdapter}s for {@link ExampleRecordWithDefaultFields }s and other
   * <i>assignable</i> types.
   */
  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

    /**
     * {@inheritDoc}
     *
     * @param gson to create the {@link TypeAdapter} from.
     * @param type to <i>serialize</i>/<i>deserialize</i>.
     * @return an (<i>anonymous</i>) instance of {@link TypeAdapter<ExampleRecordWithDefaultFields>}, or
     *     {@code null} if {@code T} is not <i>assignable</i> to {@link ExampleRecordWithDefaultFields }.
     * @param <T> class to <i>serialize</i>/<i>deserialize</i>.
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
      if (!ExampleRecordWithDefaultFields.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ExampleRecordWithDefaultFields> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ExampleRecordWithDefaultFields.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ExampleRecordWithDefaultFields>() {

            @Override
            public void write(final JsonWriter out, final ExampleRecordWithDefaultFields value)
                throws IOException {
              final JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ExampleRecordWithDefaultFields read(final JsonReader in) throws IOException {
              final JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }
}
