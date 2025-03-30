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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
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
          Set.of(
              "stringStandard",
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
          Set.of("stringRequired", "stringRequiredNullable", "stringRequiredPattern"));

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
    if (jsonElement == null && !RecordWithAllConstraints.openapiRequiredFields.isEmpty()) {
      throw new IllegalArgumentException(
          String.format(
              "The required field(s) %s in RecordWithAllConstraints is not found in the empty JSON string",
              RecordWithAllConstraints.openapiRequiredFields.toString()));
    }
  }
}
