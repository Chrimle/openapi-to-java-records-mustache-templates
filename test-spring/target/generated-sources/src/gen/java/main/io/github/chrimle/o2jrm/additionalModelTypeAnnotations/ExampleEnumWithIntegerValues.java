package io.github.chrimle.o2jrm.additionalModelTypeAnnotations;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Example of an Enum with integer values
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-11T01:30:32.127206800+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public enum ExampleEnumWithIntegerValues {
  
  NUMBER_100(100),
  
  NUMBER_200(200),
  
  NUMBER_300(300),
  
  NUMBER_400(400),
  
  NUMBER_500(500);

  private final Integer value;

  ExampleEnumWithIntegerValues(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExampleEnumWithIntegerValues fromValue(Integer value) {
    for (ExampleEnumWithIntegerValues b : ExampleEnumWithIntegerValues.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

