package io.github.chrimle.o2jrm.serializableModel;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
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
    Boolean oneAnnotationAsInline,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Boolean oneAnnotationAsNewLine,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Boolean oneAnnotationAsList,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    Boolean oneAnnotationAsArray,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
@io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Boolean twoAnnotationsAsNewLine,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Boolean twoAnnotationsAsList,
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationOne
    @io.github.chrimle.o2jrm.annotations.TestFieldExtraAnnotationTwo
    Boolean twoAnnotationsAsArray)
    implements Serializable {

  @JsonCreator
  public ExampleRecordWithExtraFieldAnnotations(
      final Boolean oneAnnotationAsInline,
      final Boolean oneAnnotationAsNewLine,
      final Boolean oneAnnotationAsList,
      final Boolean oneAnnotationAsArray,
      final Boolean twoAnnotationsAsNewLine,
      final Boolean twoAnnotationsAsList,
      final Boolean twoAnnotationsAsArray) {
    this.oneAnnotationAsInline = oneAnnotationAsInline;
    this.oneAnnotationAsNewLine = oneAnnotationAsNewLine;
    this.oneAnnotationAsList = oneAnnotationAsList;
    this.oneAnnotationAsArray = oneAnnotationAsArray;
    this.twoAnnotationsAsNewLine = twoAnnotationsAsNewLine;
    this.twoAnnotationsAsList = twoAnnotationsAsList;
    this.twoAnnotationsAsArray = twoAnnotationsAsArray;
  }
}
