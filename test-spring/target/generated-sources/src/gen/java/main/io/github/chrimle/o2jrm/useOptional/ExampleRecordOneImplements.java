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
 * Example of an Record which implements an interface.
 *
 * @param field1 a boolean field
 */
public record ExampleRecordOneImplements(
    Boolean field1)
    implements io.github.chrimle.o2jrm.interfaces.TestInterfaceOne {

  @JsonCreator
  public ExampleRecordOneImplements(
      final Boolean field1) {
    this.field1 = field1;
  }
}
