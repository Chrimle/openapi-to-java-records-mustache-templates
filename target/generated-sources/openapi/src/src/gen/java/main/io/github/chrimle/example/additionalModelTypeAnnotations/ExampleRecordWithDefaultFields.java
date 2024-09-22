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

package io.github.chrimle.example.additionalModelTypeAnnotations;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Example of a Record with default fields
 * @param field1 a nullable String field
 * @param field2 a String field with a default value
 */
@com.chrimle.example.annotations.TestAnnotationOne
@com.chrimle.example.annotations.TestAnnotationTwo
@com.chrimle.example.annotations.TestAnnotationThree
public record ExampleRecordWithDefaultFields(
    @javax.annotation.Nullable String field1,
    @javax.annotation.Nonnull String field2) {

  public ExampleRecordWithDefaultFields(
      @javax.annotation.Nullable final String field1,
      @javax.annotation.Nullable final String field2) { 
    this.field1 = field1;
    this.field2 = Objects.requireNonNullElse(field2, "someDefaultValue");
  }
}
