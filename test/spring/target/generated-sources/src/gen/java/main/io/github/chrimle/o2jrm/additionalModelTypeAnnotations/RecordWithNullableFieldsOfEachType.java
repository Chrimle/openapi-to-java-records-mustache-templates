package io.github.chrimle.o2jrm.additionalModelTypeAnnotations;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.chrimle.o2jrm.additionalModelTypeAnnotations.ExampleNullableEnum;
import io.github.chrimle.o2jrm.additionalModelTypeAnnotations.ExampleNullableRecord;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record with fields of each type
 *
 * @param field3 an Integer field
 * @param field7 ExampleNullableRecord.
 * @param field8 ExampleNullableEnum.
 */
@io.github.chrimle.o2jrm.test.annotations.TestAnnotationOne
@io.github.chrimle.o2jrm.test.annotations.TestAnnotationTwo
@io.github.chrimle.o2jrm.test.annotations.TestAnnotationThree
public record RecordWithNullableFieldsOfEachType(
    Integer field3,
    @Valid ExampleNullableRecord field7,
    ExampleNullableEnum field8) {

  @JsonCreator
  public RecordWithNullableFieldsOfEachType(
      final Integer field3,
      final ExampleNullableRecord field7,
      final ExampleNullableEnum field8) {
    this.field3 = field3;
    this.field7 = field7;
    this.field8 = field8;
  }
}
