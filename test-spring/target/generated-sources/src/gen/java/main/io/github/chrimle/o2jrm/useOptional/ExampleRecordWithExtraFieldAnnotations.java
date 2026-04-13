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
 * Example of a Record with fields with &#x60;x-field-extra-annotations&#x60;.
 *
 * @param oneAnnotationAsInline Setting ONE annotation, using inlined.
 * @param oneAnnotationAsNewLine Setting ONE annotation, using newlines.
 * @param oneAnnotationAsList Setting ONE annotation, using list.
 * @param oneAnnotationAsArray Setting ONE annotation, using array.
 * @param twoAnnotationsAsNewLine Setting TWO annotations, using newlines.
 * @param twoAnnotationsAsList Setting TWO annotations, using list.
 * @param twoAnnotationsAsArray Setting TWO annotations, using array.
 */
public record ExampleRecordWithExtraFieldAnnotations(
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Optional<Boolean> oneAnnotationAsInline,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Optional<Boolean> oneAnnotationAsNewLine,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Optional<Boolean> oneAnnotationAsList,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Optional<Boolean> oneAnnotationAsArray,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Optional<Boolean> twoAnnotationsAsNewLine,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Optional<Boolean> twoAnnotationsAsList,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Optional<Boolean> twoAnnotationsAsArray) {

  @JsonCreator
  public ExampleRecordWithExtraFieldAnnotations(
      final Boolean oneAnnotationAsInline,
      final Boolean oneAnnotationAsNewLine,
      final Boolean oneAnnotationAsList,
      final Boolean oneAnnotationAsArray,
      final Boolean twoAnnotationsAsNewLine,
      final Boolean twoAnnotationsAsList,
      final Boolean twoAnnotationsAsArray) {
    this(Optional.of(oneAnnotationAsInline),
        Optional.of(oneAnnotationAsNewLine),
        Optional.of(oneAnnotationAsList),
        Optional.of(oneAnnotationAsArray),
        Optional.of(twoAnnotationsAsNewLine),
        Optional.of(twoAnnotationsAsList),
        Optional.of(twoAnnotationsAsArray));
  }
}
