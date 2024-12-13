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
 * Generated with Version: 2.4.0
 *
 */

package io.github.chrimle.example.additionalModelTypeAnnotations;

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

/**
 * Example of a Record which has fields with constraints
 *
 * @param stringStandard String
 * @param stringDefault String
 * @param stringNullable String
 * @param stringRequired String
 * @param stringRequiredNullable String
 * @param stringRequiredPattern String
 * @param stringEmailFormat String
 * @param stringUuidFormat UUID
 * @param stringMinLength String
 * @param stringMaxLength String
 * @param stringMinAndMaxLength String
 * @param arrayMinItems List<String>
 * @param arrayMaxItems List<String>
 * @param arrayMinAndMaxItems List<String>
 * @param intMinimum Integer
 * @param intMaximum Integer
 * @param intMinimumAndMaximum Integer
 * @param longMinimum Long
 * @param longMaximum Long
 * @param longMinimumAndMaximum Long
 * @param bigDecimalMinimum BigDecimal
 * @param bigDecimalMaximum BigDecimal
 * @param bigDecimalMinimumAndMaximum BigDecimal
 */
@io.github.chrimle.example.annotations.TestAnnotationOne
@io.github.chrimle.example.annotations.TestAnnotationTwo
@io.github.chrimle.example.annotations.TestAnnotationThree
public record RecordWithAllConstraints(
    @javax.annotation.Nonnull String stringStandard,
    @javax.annotation.Nonnull String stringDefault,
    @javax.annotation.Nullable String stringNullable,
    @javax.annotation.Nonnull String stringRequired,
    @javax.annotation.Nullable String stringRequiredNullable,
    @javax.annotation.Nonnull String stringRequiredPattern,
    @javax.annotation.Nonnull String stringEmailFormat,
    @javax.annotation.Nonnull UUID stringUuidFormat,
    @javax.annotation.Nonnull String stringMinLength,
    @javax.annotation.Nonnull String stringMaxLength,
    @javax.annotation.Nonnull String stringMinAndMaxLength,
    @javax.annotation.Nonnull List<String> arrayMinItems,
    @javax.annotation.Nonnull List<String> arrayMaxItems,
    @javax.annotation.Nonnull List<String> arrayMinAndMaxItems,
    @javax.annotation.Nonnull Integer intMinimum,
    @javax.annotation.Nonnull Integer intMaximum,
    @javax.annotation.Nonnull Integer intMinimumAndMaximum,
    @javax.annotation.Nonnull Long longMinimum,
    @javax.annotation.Nonnull Long longMaximum,
    @javax.annotation.Nonnull Long longMinimumAndMaximum,
    @javax.annotation.Nonnull BigDecimal bigDecimalMinimum,
    @javax.annotation.Nonnull BigDecimal bigDecimalMaximum,
    @javax.annotation.Nonnull BigDecimal bigDecimalMinimumAndMaximum) {

  public RecordWithAllConstraints(
      @javax.annotation.Nonnull final String stringStandard,
      @javax.annotation.Nullable final String stringDefault,
      @javax.annotation.Nullable final String stringNullable,
      @javax.annotation.Nonnull final String stringRequired,
      @javax.annotation.Nullable final String stringRequiredNullable,
      @javax.annotation.Nonnull final String stringRequiredPattern,
      @javax.annotation.Nonnull final String stringEmailFormat,
      @javax.annotation.Nonnull final UUID stringUuidFormat,
      @javax.annotation.Nonnull final String stringMinLength,
      @javax.annotation.Nonnull final String stringMaxLength,
      @javax.annotation.Nonnull final String stringMinAndMaxLength,
      @javax.annotation.Nullable final List<String> arrayMinItems,
      @javax.annotation.Nullable final List<String> arrayMaxItems,
      @javax.annotation.Nullable final List<String> arrayMinAndMaxItems,
      @javax.annotation.Nonnull final Integer intMinimum,
      @javax.annotation.Nonnull final Integer intMaximum,
      @javax.annotation.Nonnull final Integer intMinimumAndMaximum,
      @javax.annotation.Nonnull final Long longMinimum,
      @javax.annotation.Nonnull final Long longMaximum,
      @javax.annotation.Nonnull final Long longMinimumAndMaximum,
      @javax.annotation.Nonnull final BigDecimal bigDecimalMinimum,
      @javax.annotation.Nonnull final BigDecimal bigDecimalMaximum,
      @javax.annotation.Nonnull final BigDecimal bigDecimalMinimumAndMaximum) { 
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
}
