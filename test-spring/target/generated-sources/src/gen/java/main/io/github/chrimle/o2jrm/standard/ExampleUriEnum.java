package io.github.chrimle.o2jrm.standard;

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
 * Example of an Enum with URI values
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-11T13:25:30.450964900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public enum ExampleUriEnum {
  
  HTTPS_GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES("https://github.com/Chrimle/openapi-to-java-records-mustache-templates"),
  
  HTTPS_CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_("https://Chrimle.github.io/openapi-to-java-records-mustache-templates/");

  private final String value;

  ExampleUriEnum(String value) {
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
  public static ExampleUriEnum fromValue(String value) {
    for (ExampleUriEnum b : ExampleUriEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

