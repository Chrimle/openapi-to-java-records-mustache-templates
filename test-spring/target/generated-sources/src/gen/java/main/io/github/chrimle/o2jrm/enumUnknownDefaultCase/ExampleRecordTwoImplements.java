package io.github.chrimle.o2jrm.enumUnknownDefaultCase;

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
 * Example of an Record which implements two interfaces.
 *
 * @param field1 a boolean field
 */
public record ExampleRecordTwoImplements(
    Boolean field1)
    implements io.github.chrimle.o2jrm.interfaces.TestInterfaceOne, io.github.chrimle.o2jrm.interfaces.TestInterfaceTwo {

  @JsonCreator
  public ExampleRecordTwoImplements(
      final Boolean field1) {
    this.field1 = field1;
  }
}
