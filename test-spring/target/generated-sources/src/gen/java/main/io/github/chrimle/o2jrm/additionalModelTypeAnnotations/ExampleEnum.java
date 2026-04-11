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
 * Example of an Enum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-11T13:25:32.583939300+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public enum ExampleEnum {
  
  /**
   * Some description of ENUM1
   */
  ENUM1("ENUM1"),
  
  /**
   * Some description of ENUM2
   */
  ENUM2("ENUM2"),
  
  /**
   * Some description of ENUM3
   */
  ENUM3("ENUM3");

  private final String value;

  ExampleEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExampleEnum fromValue(String value) {
    for (ExampleEnum b : ExampleEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

