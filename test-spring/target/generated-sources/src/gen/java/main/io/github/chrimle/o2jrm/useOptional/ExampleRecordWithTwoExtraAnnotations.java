package io.github.chrimle.o2jrm.useOptional;

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
 * Example of a Record with two extra annotations
 *
 * @param field1 a boolean field
 */
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotation
@io.github.chrimle.o2jrm.annotations.TestExtraAnnotationTwo
public record ExampleRecordWithTwoExtraAnnotations(
    Optional<Boolean> field1) {

  @JsonCreator
  public ExampleRecordWithTwoExtraAnnotations(
      final Boolean field1) {
    this.field1 = field1;
  }
}
