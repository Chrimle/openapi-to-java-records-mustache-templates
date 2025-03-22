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

package io.github.chrimle.o2jrm.standard;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.chrimle.o2jrm.standard.ExampleEnum;
import io.github.chrimle.o2jrm.standard.ExampleRecord;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import java.util.HashSet;
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
    @javax.annotation.Nonnull Boolean field1,
    @javax.annotation.Nonnull String field2,
    @javax.annotation.Nonnull Integer field3,
    @javax.annotation.Nonnull BigDecimal field4,
    @javax.annotation.Nonnull List<Boolean> field5,
    @javax.annotation.Nonnull Set<Boolean> field6,
    @javax.annotation.Nonnull ExampleRecord field7,
    @javax.annotation.Nonnull ExampleEnum field8) {

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
      @javax.annotation.Nonnull final Boolean field1,
      @javax.annotation.Nonnull final String field2,
      @javax.annotation.Nonnull final Integer field3,
      @javax.annotation.Nonnull final BigDecimal field4,
      @javax.annotation.Nullable final List<Boolean> field5,
      @javax.annotation.Nullable final Set<Boolean> field6,
      @javax.annotation.Nonnull final ExampleRecord field7,
      @javax.annotation.Nonnull final ExampleEnum field8) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = Objects.requireNonNullElse(field5, new ArrayList<>());
    this.field6 = Objects.requireNonNullElse(field6, new LinkedHashSet<>());
    this.field7 = field7;
    this.field8 = field8;
  }
}
