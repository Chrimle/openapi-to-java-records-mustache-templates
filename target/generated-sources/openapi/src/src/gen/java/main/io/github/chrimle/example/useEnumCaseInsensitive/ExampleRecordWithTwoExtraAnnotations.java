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
 * Generated with Version: ${project.version}
 *
 */

package io.github.chrimle.example.useEnumCaseInsensitive;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Example of a Record with two extra annotations
 *
 * @param field1 a boolean field
 */
@io.github.chrimle.example.annotations.TestExtraAnnotation
@io.github.chrimle.example.annotations.TestExtraAnnotationTwo
public record ExampleRecordWithTwoExtraAnnotations(
    @javax.annotation.Nonnull Boolean field1) {

  public ExampleRecordWithTwoExtraAnnotations(
      @javax.annotation.Nonnull final Boolean field1) { 
    this.field1 = field1;
  }
}
