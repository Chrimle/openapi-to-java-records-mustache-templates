package io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive.FirstOneOfRecord;
import io.github.chrimle.o2jrm.enumDefaultCaseAndCaseInsensitive.SecondOneOfRecord;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-13T12:57:46.780014+02:00[Europe/Stockholm]", comments = "Generator version: 7.23.0")
public interface ParentOneOfRecord {
}
