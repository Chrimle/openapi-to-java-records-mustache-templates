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

package io.github.chrimle.o2jrm.generateBuilders;

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
 * Example of a Record
 *
 * @param field1 a boolean field
 */
public record ExampleNullableRecord(
    @javax.annotation.Nonnull Boolean field1) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("field1"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of());

  public ExampleNullableRecord(
      @javax.annotation.Nonnull final Boolean field1) { 
    this.field1 = field1;
  }

  /** Builder class for {@link ExampleNullableRecord }. */
  public static class Builder {

    private Boolean field1;

    /**
     * Sets the value of {@link ExampleNullableRecord#field1 }.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @param field1 a boolean field.
     * @return this {@link Builder}-instance for method-chaining.
     */
    public Builder field1(final Boolean field1) {
      this.field1 = field1;
      return this;
    }

    /**
     * Builds a {@link ExampleNullableRecord }-instance with the values provided in preceding
     * builder methods.
     *
     * <p><b>NOTE:</b> Pass-by-reference is used!
     *
     * @return a new {@link ExampleNullableRecord }-instance.
     */
    public ExampleNullableRecord build() {
      return new ExampleNullableRecord(
        field1
      );
    }
  }

  /** Creates a new {@link Builder}-instance. */
  public static ExampleNullableRecord.Builder builder() {
    return new ExampleNullableRecord.Builder();
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleNullableRecord object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException { 
    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!ExampleNullableRecord.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ExampleNullableRecord` properties. JSON: %s",
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
   * Creates {@link TypeAdapter}s for {@link ExampleNullableRecord }s and other
   * <i>assignable</i> types.
   */
  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

    /**
     * {@inheritDoc}
     *
     * @param gson to create the {@link TypeAdapter} from.
     * @param type to <i>serialize</i>/<i>deserialize</i>.
     * @return an (<i>anonymous</i>) instance of {@link TypeAdapter<ExampleNullableRecord>}, or
     *     {@code null} if {@code T} is not <i>assignable</i> to {@link ExampleNullableRecord }.
     * @param <T> class to <i>serialize</i>/<i>deserialize</i>.
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
      if (!ExampleNullableRecord.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ExampleNullableRecord> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ExampleNullableRecord.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ExampleNullableRecord>() {

            @Override
            public void write(final JsonWriter out, final ExampleNullableRecord value)
                throws IOException {
              final JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ExampleNullableRecord read(final JsonReader in) throws IOException {
              final JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }
}
