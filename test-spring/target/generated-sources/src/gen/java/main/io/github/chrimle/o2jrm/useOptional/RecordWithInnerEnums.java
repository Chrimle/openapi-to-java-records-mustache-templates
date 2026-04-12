package io.github.chrimle.o2jrm.useOptional;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Example of a Record with inner enum classes
 */

@Schema(name = "RecordWithInnerEnums", description = "Example of a Record with inner enum classes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-12T22:13:42.341544900+02:00[Europe/Stockholm]", comments = "Generator version: 7.21.0")
public class RecordWithInnerEnums {

  /**
   * Example of an inner enum class
   */
  public enum ExampleInnerEnum {
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

    ExampleInnerEnum(String value) {
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
    public static ExampleInnerEnum fromValue(String value) {
      for (ExampleInnerEnum b : ExampleInnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private Optional<ExampleInnerEnum> exampleInner = Optional.empty();

  /**
   * Example of another inner enum class with integer values
   */
  public enum ExampleInnerTwoEnum {
    NUMBER_404(404),
    
    NUMBER_501(501),
    
    NUMBER_503(503);

    private final Integer value;

    ExampleInnerTwoEnum(Integer value) {
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
    public static ExampleInnerTwoEnum fromValue(Integer value) {
      for (ExampleInnerTwoEnum b : ExampleInnerTwoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private Optional<ExampleInnerTwoEnum> exampleInnerTwo = Optional.empty();

  /**
   * Example of another inner enum class with URI values
   */
  public enum ExampleInnerThreeEnum {
    HTTPS_GITHUB_COM_CHRIMLE_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES(URI.create("https://github.com/Chrimle/openapi-to-java-records-mustache-templates")),
    
    HTTPS_CHRIMLE_GITHUB_IO_OPENAPI_TO_JAVA_RECORDS_MUSTACHE_TEMPLATES_(URI.create("https://chrimle.github.io/openapi-to-java-records-mustache-templates/"));

    private final URI value;

    ExampleInnerThreeEnum(URI value) {
      this.value = value;
    }

    @JsonValue
    public URI getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExampleInnerThreeEnum fromValue(URI value) {
      for (ExampleInnerThreeEnum b : ExampleInnerThreeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private Optional<ExampleInnerThreeEnum> exampleInnerThree = Optional.empty();

  public RecordWithInnerEnums exampleInner(ExampleInnerEnum exampleInner) {
    this.exampleInner = Optional.ofNullable(exampleInner);
    return this;
  }

  /**
   * Example of an inner enum class
   * @return exampleInner
   */
  
  @Schema(name = "exampleInner", description = "Example of an inner enum class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exampleInner")
  public Optional<ExampleInnerEnum> getExampleInner() {
    return exampleInner;
  }

  @JsonProperty("exampleInner")
  public void setExampleInner(Optional<ExampleInnerEnum> exampleInner) {
    this.exampleInner = exampleInner;
  }

  public RecordWithInnerEnums exampleInnerTwo(ExampleInnerTwoEnum exampleInnerTwo) {
    this.exampleInnerTwo = Optional.ofNullable(exampleInnerTwo);
    return this;
  }

  /**
   * Example of another inner enum class with integer values
   * @return exampleInnerTwo
   */
  
  @Schema(name = "exampleInnerTwo", description = "Example of another inner enum class with integer values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exampleInnerTwo")
  public Optional<ExampleInnerTwoEnum> getExampleInnerTwo() {
    return exampleInnerTwo;
  }

  @JsonProperty("exampleInnerTwo")
  public void setExampleInnerTwo(Optional<ExampleInnerTwoEnum> exampleInnerTwo) {
    this.exampleInnerTwo = exampleInnerTwo;
  }

  public RecordWithInnerEnums exampleInnerThree(ExampleInnerThreeEnum exampleInnerThree) {
    this.exampleInnerThree = Optional.ofNullable(exampleInnerThree);
    return this;
  }

  /**
   * Example of another inner enum class with URI values
   * @return exampleInnerThree
   */
  @Valid 
  @Schema(name = "exampleInnerThree", description = "Example of another inner enum class with URI values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exampleInnerThree")
  public Optional<ExampleInnerThreeEnum> getExampleInnerThree() {
    return exampleInnerThree;
  }

  @JsonProperty("exampleInnerThree")
  public void setExampleInnerThree(Optional<ExampleInnerThreeEnum> exampleInnerThree) {
    this.exampleInnerThree = exampleInnerThree;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordWithInnerEnums recordWithInnerEnums = (RecordWithInnerEnums) o;
    return Objects.equals(this.exampleInner, recordWithInnerEnums.exampleInner) &&
        Objects.equals(this.exampleInnerTwo, recordWithInnerEnums.exampleInnerTwo) &&
        Objects.equals(this.exampleInnerThree, recordWithInnerEnums.exampleInnerThree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleInner, exampleInnerTwo, exampleInnerThree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordWithInnerEnums {\n");
    sb.append("    exampleInner: ").append(toIndentedString(exampleInner)).append("\n");
    sb.append("    exampleInnerTwo: ").append(toIndentedString(exampleInnerTwo)).append("\n");
    sb.append("    exampleInnerThree: ").append(toIndentedString(exampleInnerThree)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

