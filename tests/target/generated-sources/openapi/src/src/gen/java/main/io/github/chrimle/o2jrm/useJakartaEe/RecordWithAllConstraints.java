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
 * Generated with Version: 2.8.0
 *
 */

package io.github.chrimle.o2jrm.useJakartaEe;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Example of a Record which has fields with constraints
 *
 * @param stringStandard String.
 * @param stringDefault String.
 * @param stringNullable String.
 * @param stringRequired String.
 * @param stringRequiredNullable String.
 * @param stringRequiredPattern String.
 * @param stringEmailFormat String.
 * @param stringUuidFormat UUID.
 * @param stringMinLength String.
 * @param stringMaxLength String.
 * @param stringMinAndMaxLength String.
 * @param arrayMinItems List<String>.
 * @param arrayMaxItems List<String>.
 * @param arrayMinAndMaxItems List<String>.
 * @param intMinimum Integer.
 * @param intMaximum Integer.
 * @param intMinimumAndMaximum Integer.
 * @param longMinimum Long.
 * @param longMaximum Long.
 * @param longMinimumAndMaximum Long.
 * @param bigDecimalMinimum BigDecimal.
 * @param bigDecimalMaximum BigDecimal.
 * @param bigDecimalMinimumAndMaximum BigDecimal.
 */
public record RecordWithAllConstraints(
    @jakarta.annotation.Nonnull String stringStandard,
    @jakarta.annotation.Nonnull String stringDefault,
    @jakarta.annotation.Nullable String stringNullable,
    @jakarta.annotation.Nonnull String stringRequired,
    @jakarta.annotation.Nullable String stringRequiredNullable,
    @jakarta.annotation.Nonnull String stringRequiredPattern,
    @jakarta.annotation.Nonnull String stringEmailFormat,
    @jakarta.annotation.Nonnull UUID stringUuidFormat,
    @jakarta.annotation.Nonnull String stringMinLength,
    @jakarta.annotation.Nonnull String stringMaxLength,
    @jakarta.annotation.Nonnull String stringMinAndMaxLength,
    @jakarta.annotation.Nonnull List<String> arrayMinItems,
    @jakarta.annotation.Nonnull List<String> arrayMaxItems,
    @jakarta.annotation.Nonnull List<String> arrayMinAndMaxItems,
    @jakarta.annotation.Nonnull Integer intMinimum,
    @jakarta.annotation.Nonnull Integer intMaximum,
    @jakarta.annotation.Nonnull Integer intMinimumAndMaximum,
    @jakarta.annotation.Nonnull Long longMinimum,
    @jakarta.annotation.Nonnull Long longMaximum,
    @jakarta.annotation.Nonnull Long longMinimumAndMaximum,
    @jakarta.annotation.Nonnull BigDecimal bigDecimalMinimum,
    @jakarta.annotation.Nonnull BigDecimal bigDecimalMaximum,
    @jakarta.annotation.Nonnull BigDecimal bigDecimalMinimumAndMaximum) {

  /** A set containing the names of all instance fields defined in this class. */
  public static final HashSet<String> openapiFields =
      new HashSet<String>(
          Set.of("stringStandard",
              "stringDefault",
              "stringNullable",
              "stringRequired",
              "stringRequiredNullable",
              "stringRequiredPattern",
              "stringEmailFormat",
              "stringUuidFormat",
              "stringMinLength",
              "stringMaxLength",
              "stringMinAndMaxLength",
              "arrayMinItems",
              "arrayMaxItems",
              "arrayMinAndMaxItems",
              "intMinimum",
              "intMaximum",
              "intMinimumAndMaximum",
              "longMinimum",
              "longMaximum",
              "longMinimumAndMaximum",
              "bigDecimalMinimum",
              "bigDecimalMaximum",
              "bigDecimalMinimumAndMaximum"));

  /** A set containing the names of all required fields defined in this class. */
  public static final HashSet<String> openapiRequiredFields =
      new HashSet<String>(
          Set.of("stringRequired",
              "stringRequiredNullable",
              "stringRequiredPattern"));

  public RecordWithAllConstraints(
      @jakarta.annotation.Nonnull final String stringStandard,
      @jakarta.annotation.Nullable final String stringDefault,
      @jakarta.annotation.Nullable final String stringNullable,
      @jakarta.annotation.Nonnull final String stringRequired,
      @jakarta.annotation.Nullable final String stringRequiredNullable,
      @jakarta.annotation.Nonnull final String stringRequiredPattern,
      @jakarta.annotation.Nonnull final String stringEmailFormat,
      @jakarta.annotation.Nonnull final UUID stringUuidFormat,
      @jakarta.annotation.Nonnull final String stringMinLength,
      @jakarta.annotation.Nonnull final String stringMaxLength,
      @jakarta.annotation.Nonnull final String stringMinAndMaxLength,
      @jakarta.annotation.Nullable final List<String> arrayMinItems,
      @jakarta.annotation.Nullable final List<String> arrayMaxItems,
      @jakarta.annotation.Nullable final List<String> arrayMinAndMaxItems,
      @jakarta.annotation.Nonnull final Integer intMinimum,
      @jakarta.annotation.Nonnull final Integer intMaximum,
      @jakarta.annotation.Nonnull final Integer intMinimumAndMaximum,
      @jakarta.annotation.Nonnull final Long longMinimum,
      @jakarta.annotation.Nonnull final Long longMaximum,
      @jakarta.annotation.Nonnull final Long longMinimumAndMaximum,
      @jakarta.annotation.Nonnull final BigDecimal bigDecimalMinimum,
      @jakarta.annotation.Nonnull final BigDecimal bigDecimalMaximum,
      @jakarta.annotation.Nonnull final BigDecimal bigDecimalMinimumAndMaximum) { 
    this.stringStandard = stringStandard;
    this.stringDefault = Objects.requireNonNullElse(stringDefault, "someDefaultValue");
    this.stringNullable = stringNullable;
    this.stringRequired = stringRequired;
    this.stringRequiredNullable = stringRequiredNullable;
    this.stringRequiredPattern = stringRequiredPattern;
    this.stringEmailFormat = stringEmailFormat;
    this.stringUuidFormat = stringUuidFormat;
    this.stringMinLength = stringMinLength;
    this.stringMaxLength = stringMaxLength;
    this.stringMinAndMaxLength = stringMinAndMaxLength;
    this.arrayMinItems = Objects.requireNonNullElse(arrayMinItems, new ArrayList<>());
    this.arrayMaxItems = Objects.requireNonNullElse(arrayMaxItems, new ArrayList<>());
    this.arrayMinAndMaxItems = Objects.requireNonNullElse(arrayMinAndMaxItems, new ArrayList<>());
    this.intMinimum = intMinimum;
    this.intMaximum = intMaximum;
    this.intMinimumAndMaximum = intMinimumAndMaximum;
    this.longMinimum = longMinimum;
    this.longMaximum = longMaximum;
    this.longMinimumAndMaximum = longMinimumAndMaximum;
    this.bigDecimalMinimum = bigDecimalMinimum;
    this.bigDecimalMaximum = bigDecimalMaximum;
    this.bigDecimalMinimumAndMaximum = bigDecimalMinimumAndMaximum;
  }

  /**
   * Validates the JSON Element and throws an exception if issues are found.
   *
   * @param jsonElement to validate.
   * @throws IOException if the JSON Element is not a valid RecordWithAllConstraints object.
   */
  public static void validateJsonElement(final JsonElement jsonElement) throws IOException { 
    if (jsonElement == null) {
      throw new IllegalArgumentException(
          String.format(
              "The required field(s) %s in RecordWithAllConstraints is not found in the empty JSON string",
              RecordWithAllConstraints.openapiRequiredFields.toString()));
    }

    for (final String key : jsonElement.getAsJsonObject().keySet()) {
      if (!RecordWithAllConstraints.openapiFields.contains(key)) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `RecordWithAllConstraints` properties. JSON: %s",
                key, jsonElement));
      }
    }

    for (final String requiredField : RecordWithAllConstraints.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement));
      }
    }

    final JsonObject jsonObj = jsonElement.getAsJsonObject();

    if (jsonObj.get("stringStandard") != null
        && !jsonObj.get("stringStandard").isJsonNull()) { 
      if (!jsonObj.get("stringStandard").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringStandard` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringStandard")));
      }
    }

    if (jsonObj.get("stringDefault") != null
        && !jsonObj.get("stringDefault").isJsonNull()) { 
      if (!jsonObj.get("stringDefault").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringDefault` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringDefault")));
      }
    }

    if (jsonObj.get("stringNullable") != null
        && !jsonObj.get("stringNullable").isJsonNull()) { 
      if (!jsonObj.get("stringNullable").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringNullable` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringNullable")));
      }
    }

    if (!jsonObj.get("stringRequired").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `stringRequired` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("stringRequired")));
    }

    if (!jsonObj.get("stringRequiredNullable").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `stringRequiredNullable` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("stringRequiredNullable")));
    }

    if (!jsonObj.get("stringRequiredPattern").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `stringRequiredPattern` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("stringRequiredPattern")));
    }

    if (jsonObj.get("stringEmailFormat") != null
        && !jsonObj.get("stringEmailFormat").isJsonNull()) { 
      if (!jsonObj.get("stringEmailFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringEmailFormat` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringEmailFormat")));
      }
    }

    if (jsonObj.get("stringUuidFormat") != null
        && !jsonObj.get("stringUuidFormat").isJsonNull()) { 
      if (!jsonObj.get("stringUuidFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringUuidFormat` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringUuidFormat")));
      }
    }

    if (jsonObj.get("stringMinLength") != null
        && !jsonObj.get("stringMinLength").isJsonNull()) { 
      if (!jsonObj.get("stringMinLength").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringMinLength` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringMinLength")));
      }
    }

    if (jsonObj.get("stringMaxLength") != null
        && !jsonObj.get("stringMaxLength").isJsonNull()) { 
      if (!jsonObj.get("stringMaxLength").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringMaxLength` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringMaxLength")));
      }
    }

    if (jsonObj.get("stringMinAndMaxLength") != null
        && !jsonObj.get("stringMinAndMaxLength").isJsonNull()) { 
      if (!jsonObj.get("stringMinAndMaxLength").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `stringMinAndMaxLength` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("stringMinAndMaxLength")));
      }
    }

    if (jsonObj.get("arrayMinItems") != null
        && !jsonObj.get("arrayMinItems").isJsonNull()) { 
      if (!jsonObj.get("arrayMinItems").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `arrayMinItems` to be an array in the JSON string but got `%s`",
                jsonObj.get("arrayMinItems")));
      }
    }

    if (jsonObj.get("arrayMaxItems") != null
        && !jsonObj.get("arrayMaxItems").isJsonNull()) { 
      if (!jsonObj.get("arrayMaxItems").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `arrayMaxItems` to be an array in the JSON string but got `%s`",
                jsonObj.get("arrayMaxItems")));
      }
    }

    if (jsonObj.get("arrayMinAndMaxItems") != null
        && !jsonObj.get("arrayMinAndMaxItems").isJsonNull()) { 
      if (!jsonObj.get("arrayMinAndMaxItems").isJsonArray()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `arrayMinAndMaxItems` to be an array in the JSON string but got `%s`",
                jsonObj.get("arrayMinAndMaxItems")));
      }
    }

    if (jsonObj.get("intMinimum") != null
        && !jsonObj.get("intMinimum").isJsonNull()) { 
      if (!jsonObj.get("intMinimum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `intMinimum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("intMinimum")));
      }
    }

    if (jsonObj.get("intMaximum") != null
        && !jsonObj.get("intMaximum").isJsonNull()) { 
      if (!jsonObj.get("intMaximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `intMaximum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("intMaximum")));
      }
    }

    if (jsonObj.get("intMinimumAndMaximum") != null
        && !jsonObj.get("intMinimumAndMaximum").isJsonNull()) { 
      if (!jsonObj.get("intMinimumAndMaximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `intMinimumAndMaximum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("intMinimumAndMaximum")));
      }
    }

    if (jsonObj.get("longMinimum") != null
        && !jsonObj.get("longMinimum").isJsonNull()) { 
      if (!jsonObj.get("longMinimum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `longMinimum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("longMinimum")));
      }
    }

    if (jsonObj.get("longMaximum") != null
        && !jsonObj.get("longMaximum").isJsonNull()) { 
      if (!jsonObj.get("longMaximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `longMaximum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("longMaximum")));
      }
    }

    if (jsonObj.get("longMinimumAndMaximum") != null
        && !jsonObj.get("longMinimumAndMaximum").isJsonNull()) { 
      if (!jsonObj.get("longMinimumAndMaximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `longMinimumAndMaximum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("longMinimumAndMaximum")));
      }
    }

    if (jsonObj.get("bigDecimalMinimum") != null
        && !jsonObj.get("bigDecimalMinimum").isJsonNull()) { 
      if (!jsonObj.get("bigDecimalMinimum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `bigDecimalMinimum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("bigDecimalMinimum")));
      }
    }

    if (jsonObj.get("bigDecimalMaximum") != null
        && !jsonObj.get("bigDecimalMaximum").isJsonNull()) { 
      if (!jsonObj.get("bigDecimalMaximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `bigDecimalMaximum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("bigDecimalMaximum")));
      }
    }

    if (jsonObj.get("bigDecimalMinimumAndMaximum") != null
        && !jsonObj.get("bigDecimalMinimumAndMaximum").isJsonNull()) { 
      if (!jsonObj.get("bigDecimalMinimumAndMaximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(
            String.format(
                "Expected the field `bigDecimalMinimumAndMaximum` to be a primitive type in the JSON string but got `%s`",
                jsonObj.get("bigDecimalMinimumAndMaximum")));
      }
    }
  }
}
