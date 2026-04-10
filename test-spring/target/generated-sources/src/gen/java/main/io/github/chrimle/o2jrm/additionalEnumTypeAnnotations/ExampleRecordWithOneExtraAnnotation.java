package io.github.chrimle.o2jrm.additionalEnumTypeAnnotations;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record with an extra annotation
 *
 * @param field1 a boolean field with an extra field annotation
 * @param field2 a boolean field with two extra field annotations
 */
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
public record ExampleRecordWithOneExtraAnnotation(
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Boolean field1,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Boolean field2) {

  @JsonCreator
  public ExampleRecordWithOneExtraAnnotation(
      final Boolean field1,
      final Boolean field2) {
    this.field1 = field1;
    this.field2 = field2;
  }
}
