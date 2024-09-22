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
 * Generated with Version: 1.7.3
 *
 */

package io.github.chrimle.example.standard;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Example of a Record with String fields
 * @param field1 a String field
 * @param field2 another String field
 * @param field3 yet another String field
 */
public record ExampleRecordWithStringFields(
    @javax.annotation.Nonnull String field1,
    @javax.annotation.Nonnull String field2,
    @javax.annotation.Nonnull String field3) {

  public ExampleRecordWithStringFields(
      @javax.annotation.Nonnull final String field1,
      @javax.annotation.Nonnull final String field2,
      @javax.annotation.Nonnull final String field3) { 
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
  }
}
