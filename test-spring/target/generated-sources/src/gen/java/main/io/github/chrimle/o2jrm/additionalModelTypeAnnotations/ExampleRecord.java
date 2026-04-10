package io.github.chrimle.o2jrm.additionalModelTypeAnnotations;

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
 * Example of a Record
 *
 * @param field1 a boolean field
 */
@io.github.chrimle.o2jrm.annotations.TestAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestAnnotationTwo
@io.github.chrimle.o2jrm.annotations.TestAnnotationThree
public record ExampleRecord(
    Boolean field1) {

  @JsonCreator
  public ExampleRecord(
      final Boolean field1) {
    this.field1 = field1;
  }
}
