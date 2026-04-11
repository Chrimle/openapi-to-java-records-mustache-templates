package io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive;

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
 * Example of a deprecated Enum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-11T13:25:33.770396400+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public enum DeprecatedExampleEnum {
  
  ENUM1("ENUM1"),
  
  ENUM2("ENUM2"),
  
  ENUM3("ENUM3"),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private final String value;

  DeprecatedExampleEnum(String value) {
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
  public static DeprecatedExampleEnum fromValue(String value) {
    for (DeprecatedExampleEnum b : DeprecatedExampleEnum.values()) {
      if (b.value.equalsIgnoreCase(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }
}

