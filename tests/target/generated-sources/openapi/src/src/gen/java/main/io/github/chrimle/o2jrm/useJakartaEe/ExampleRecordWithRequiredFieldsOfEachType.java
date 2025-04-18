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

package io.github.chrimle.o2jrm.useJakartaEe;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.useJakartaEe.ExampleEnum;
import io.github.chrimle.o2jrm.useJakartaEe.ExampleRecord;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * Example of a Record with fields of each type
 *
 * @param field1 a Boolean field
 * @param field2 a String field
 * @param field3 an Integer field
 * @param field4 a Number field
 * @param field5 an Array of Boolean field
 * @param field6 a Set field
 * @param field7 ExampleRecord.
 * @param field8 ExampleEnum.
 */
public record ExampleRecordWithRequiredFieldsOfEachType(
    @jakarta.annotation.Nonnull Boolean field1,
    @jakarta.annotation.Nonnull String field2,
    @jakarta.annotation.Nonnull Integer field3,
    @jakarta.annotation.Nonnull BigDecimal field4,
    @jakarta.annotation.Nonnull List<Boolean> field5,
    @jakarta.annotation.Nonnull Set<Boolean> field6,
    @jakarta.annotation.Nonnull ExampleRecord field7,
    @jakarta.annotation.Nonnull ExampleEnum field8) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("field1",
              "field2",
              "field3",
              "field4",
              "field5",
              "field6",
              "field7",
              "field8"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of("field1",
              "field2",
              "field3",
              "field4",
              "field5",
              "field6",
              "field7",
              "field8"));

  public ExampleRecordWithRequiredFieldsOfEachType(
      @jakarta.annotation.Nonnull final Boolean field1,
      @jakarta.annotation.Nonnull final String field2,
      @jakarta.annotation.Nonnull final Integer field3,
      @jakarta.annotation.Nonnull final BigDecimal field4,
      @jakarta.annotation.Nullable final List<Boolean> field5,
      @jakarta.annotation.Nullable final Set<Boolean> field6,
      @jakarta.annotation.Nonnull final ExampleRecord field7,
      @jakarta.annotation.Nonnull final ExampleEnum field8) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = Objects.requireNonNullElse(field5, new ArrayList<>());
    this.field6 = Objects.requireNonNullElse(field6, new LinkedHashSet<>());
    this.field7 = field7;
    this.field8 = field8;
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleRecordWithRequiredFieldsOfEachType object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException { 
    if (jsonElement == null) {
      throw new IllegalArgumentException(
          String.format(
              "The required field(s) %s in ExampleRecordWithRequiredFieldsOfEachType is not found in the empty JSON string",
              ExampleRecordWithRequiredFieldsOfEachType.openapiRequiredFields.toString()));
    }

    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!ExampleRecordWithRequiredFieldsOfEachType.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ExampleRecordWithRequiredFieldsOfEachType` properties. JSON: %s",
                key, jsonElement));
      }
    }

    for (final String requiredField : ExampleRecordWithRequiredFieldsOfEachType.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement));
      }
    }

    final JsonObject jsonObj = jsonElement.getAsJsonObject();

    if (!jsonObj.get("field1").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field1` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field1")));
    }

    if (!jsonObj.get("field2").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field2` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field2")));
    }

    if (!jsonObj.get("field3").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field3` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field3")));
    }

    if (!jsonObj.get("field4").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field4` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("field4")));
    }

    if (!jsonObj.get("field5").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field5` to be an array in the JSON string but got `%s`",
              jsonObj.get("field5")));
    }

    if (!jsonObj.get("field6").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `field6` to be an array in the JSON string but got `%s`",
              jsonObj.get("field6")));
    }

    ExampleRecord.validateJsonElement(jsonObj.get("field7"));

    ExampleEnum.validateJsonElement(jsonObj.get("field8"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ExampleRecordWithRequiredFieldsOfEachType.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ExampleRecordWithRequiredFieldsOfEachType> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(ExampleRecordWithRequiredFieldsOfEachType.class));

      return (TypeAdapter<T>) new TypeAdapter<ExampleRecordWithRequiredFieldsOfEachType>() {

        @Override
        public void write(JsonWriter out, ExampleRecordWithRequiredFieldsOfEachType value) throws IOException {
          final JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
          elementAdapter.write(out, obj);
        }

        @Override
        public ExampleRecordWithRequiredFieldsOfEachType read(JsonReader in) throws IOException {
          final JsonElement jsonElement = elementAdapter.read(in);
          validateJsonElement(jsonElement);
          return thisAdapter.fromJsonTree(jsonElement);
        }
      }.nullSafe();
    }
  }
}
