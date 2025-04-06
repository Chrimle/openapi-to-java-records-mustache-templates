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

package io.github.chrimle.o2jrm.webclient.useEnumCaseInsensitive;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Example of a Record with an extra annotation
 *
 * @param field1 a boolean field with an extra field annotation
 * @param field2 a boolean field with two extra field annotations
 */
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
public record ExampleRecordWithOneExtraAnnotation(
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    @javax.annotation.Nonnull Boolean field1,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    @javax.annotation.Nonnull Boolean field2) {

  public ExampleRecordWithOneExtraAnnotation(
      @javax.annotation.Nonnull final Boolean field1,
      @javax.annotation.Nonnull final Boolean field2) { 
    this.field1 = field1;
    this.field2 = field2;
  }
}
