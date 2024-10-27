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
 * Generated with Version: 2.1.0
 *
 */

package io.github.chrimle.example.additionalEnumTypeAnnotations;

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
import java.util.LinkedHashSet;
import java.util.List;
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
 */
public record ExampleRecordWithNullableFieldsOfEachType(
    @javax.annotation.Nullable Boolean field1,
    @javax.annotation.Nullable String field2,
    @javax.annotation.Nullable Integer field3,
    @javax.annotation.Nullable BigDecimal field4,
    @javax.annotation.Nullable List<Boolean> field5,
    @javax.annotation.Nullable Set<Boolean> field6) {

  public ExampleRecordWithNullableFieldsOfEachType(
      @javax.annotation.Nullable final Boolean field1,
      @javax.annotation.Nullable final String field2,
      @javax.annotation.Nullable final Integer field3,
      @javax.annotation.Nullable final BigDecimal field4,
      @javax.annotation.Nullable final List<Boolean> field5,
      @javax.annotation.Nullable final Set<Boolean> field6) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
    this.field4 = field4;
    this.field5 = field5;
    this.field6 = field6;
  }
}
