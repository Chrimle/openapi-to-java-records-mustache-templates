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

package io.github.chrimle.o2jrm.enumUnknownDefaultCase;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.enumUnknownDefaultCase.ExampleNullableEnum;
import io.github.chrimle.o2jrm.enumUnknownDefaultCase.ExampleNullableRecord;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
 * @param field7 ExampleNullableRecord.
 * @param field8 ExampleNullableEnum.
 */
public record ExampleRecordWithNullableFieldsOfEachType(
    @javax.annotation.Nullable Boolean field1,
    @javax.annotation.Nullable String field2,
    @javax.annotation.Nullable Integer field3,
    @javax.annotation.Nullable BigDecimal field4,
    @javax.annotation.Nullable List<Boolean> field5,
    @javax.annotation.Nullable Set<Boolean> field6,
    @javax.annotation.Nullable ExampleNullableRecord field7,
    @javax.annotation.Nullable ExampleNullableEnum field8) {

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
              "field6"));

  public ExampleRecordWithNullableFieldsOfEachType(
      @javax.annotation.Nullable final Boolean field1,
      @javax.annotation.Nullable final String field2,
      @javax.annotation.Nullable final Integer field3,
      @javax.annotation.Nullable final BigDecimal field4,
      @javax.annotation.Nullable final List<Boolean> field5,
      @javax.annotation.Nullable final Set<Boolean> field6,
      @javax.annotation.Nullable final ExampleNullableRecord field7,
      @javax.annotation.Nullable final ExampleNullableEnum field8) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = field5;
    this.field6 = field6;
    this.field7 = field7;
    this.field8 = field8;
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid ExampleRecordWithNullableFieldsOfEachType object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException { 
    if (jsonElement == null) {
      throw new IllegalArgumentException(
          String.format(
              "The required field(s) %s in ExampleRecordWithNullableFieldsOfEachType is not found in the empty JSON string",
              ExampleRecordWithNullableFieldsOfEachType.openapiRequiredFields.toString()));
    }

    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!ExampleRecordWithNullableFieldsOfEachType.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ExampleRecordWithNullableFieldsOfEachType` properties. JSON: %s",
                key, jsonElement));
      }
    }

    for (final String requiredField : ExampleRecordWithNullableFieldsOfEachType.openapiRequiredFields) {
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

    if (jsonObj.get("field7") != null
        && !jsonObj.get("field7").isJsonNull()) { 
      ExampleNullableRecord.validateJsonElement(jsonObj.get("field7"));
    }

    if (jsonObj.get("field8") != null
        && !jsonObj.get("field8").isJsonNull()) { 
      ExampleNullableEnum.validateJsonElement(jsonObj.get("field8"));
    }
  }
}
