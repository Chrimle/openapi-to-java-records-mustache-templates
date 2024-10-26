Project containing [Mustache-templates](https://mustache.github.io/) used by [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md) to generate [Java Records](https://docs.oracle.com/en/java/javase/17/language/records.html) from [OpenAPI Specifications](https://swagger.io/specification/).

This project contains the **mustache templates**.

# Getting Started
The mustache templates can be acquired through multiple ways.
- [Maven Central Repository](https://central.sonatype.com/artifact/io.github.chrimle/openapi-to-java-records-mustache-templates)
- [GitHub Packages](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/packages/)
- Downloading them manually from [GitHub](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/tree/main/src/main/resources/templates)

## Import Dependency
```xml
<dependency>
    <groupId>io.github.chrimle</groupId>
    <artifactId>openapi-to-java-records-mustache-templates</artifactId>
    <version>1.11.2</version>
</dependency>
```

## Use the `.mustache` templates when generating
Place the file(s) in desired directory. Then, in the Maven build configuration, set the property `<templateDirectory>` to the directory path. Example:
```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.openapitools</groupId>
      <artifactId>openapi-generator-maven-plugin</artifactId>
      <executions>
        <execution>
          <goals>
            <goal>generate</goal>
          </goals>
          <configuration>
            <inputSpec><!-- Relative directory path to the openapi.yaml file --></inputSpec>
            <templateDirectory><!-- Relative directory path to the mustache templates --></templateDirectory>
            <output><!-- Relative directory path to where generated classes should be placed --></output>
          </configuration>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```
## Additional Configurations
The generated classes are customizable by using `<configuration>`-properties.

In this example, each generated class will be named with the suffix "DTO", and fields of generated records will be annotated with [Jakarta Bean Validation annotations](https://jakarta.ee/specifications/bean-validation/3.0/jakarta-bean-validation-spec-3.0.html#builtinconstraints).
```xml
  <configuration>
    <modelNameSuffix>DTO</modelNameSuffix>
    <!-- ... more configurations ... -->
    <configOptions>
      <useBeanValidation>true</useBeanValidation>
      <!-- ... more configOptions ... -->
    </configOptions>
  </configuration>
```

> See [Supported 'openapi‐generator‐maven‐plugin' Configuration options](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-%27openapi‐generator‐maven‐plugin%27-Configuration-options)

## OpenAPI Specification

```yaml
components:
  schemas:
    Person:
      description: Personal information
      deprecated: true
      type: object
      required:
        - fullName
        - age
        - gender
        - height
        - ssn
        - aliases
        - trackingCode
      properties:
        fullName:
          description: Full name
          type: string
          minLength: 2
          maxLength: 50
        age:
          description: Age (years)
          type: integer
          minimum: 0
          maximum: 100
        gender:
          description: Gender
          type: string
          enum:
            - Male
            - Female
        height:
          description: Height (m)
          type: number
          pattern: float
          minimum: 0
        ssn:
          description: Social Security Number
          type: string
          pattern: '^\d{3}-\d{2}-\d{4}$'
        aliases:
          description: Known Aliases
          type: array
          uniqueItems: true
          minItems: 1
          maxItems: 3
          items:
            type: string
        telephoneNumber:
          description: Telephone Number
          type: string
          nullable: true
        trackingCode:
          description: Tracking code for Web analytics
          type: string
          default: "utm_source=default"
```

> See [Supported OpenAPI Specification properties](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-OpenAPI-Specification-properties)

## Generate models
Compile the project, for example via:
```console
mvn compile
```

> Further information about how to generate models can be found on [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md).

## Generated Java Record
Unless the configuration property `<output>` has been set, the generated classes should be found under `./target/generated-sources/openapi`.

```java
package io.github.chrimle.example;

import ...;

/**
 * Personal information
 *
 * @deprecated
 * @param fullName Full name
 * @param age Age (years)
 * @param gender Gender
 * @param height Height (m)
 * @param ssn Social Security Number
 * @param aliases Known Aliases
 * @param telephoneNumber Telephone Number
 * @param trackingCode Tracking code for Web analytics
 */
@Deprecated
public record PersonDTO(
    @javax.annotation.Nonnull @NotNull @Size(min = 2, max = 50) String fullName,
    @javax.annotation.Nonnull @NotNull @Min(0) @Max(100) Integer age,
    @javax.annotation.Nonnull @NotNull GenderEnum gender,
    @javax.annotation.Nonnull @NotNull @DecimalMin("0") BigDecimal height,
    @javax.annotation.Nonnull @NotNull @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") String ssn,
    @javax.annotation.Nonnull @NotNull @Size(min = 1, max = 3) Set<String> aliases,
    @javax.annotation.Nullable String telephoneNumber,
    @javax.annotation.Nonnull @NotNull String trackingCode) {

  public PersonDTO(
      @javax.annotation.Nonnull final String fullName,
      @javax.annotation.Nonnull final Integer age,
      @javax.annotation.Nonnull final GenderEnum gender,
      @javax.annotation.Nonnull final BigDecimal height,
      @javax.annotation.Nonnull final String ssn,
      @javax.annotation.Nullable final Set<String> aliases,
      @javax.annotation.Nullable final String telephoneNumber,
      @javax.annotation.Nullable final String trackingCode) {
    this.fullName = fullName;
    this.age = age;
    this.gender = gender;
    this.height = height;
    this.ssn = ssn;
    this.aliases = Objects.requireNonNullElse(aliases, new LinkedHashSet<>());
    this.telephoneNumber = telephoneNumber;
    this.trackingCode = Objects.requireNonNullElse(trackingCode, "utm_source=default");
  }

  /**
   * Gender
   */
  public enum GenderEnum {
    MALE("Male"),
    FEMALE("Female");

    private final String value;

    GenderEnum(final String value) {
      this.value = value;
    }

    /**
     * Gets the {@code value} of this enum.
     *
     * @return value of this enum
     */
    public String getValue() {
      return value;
    }

    /**
     * Case-sensitively parses the given string to an enum constant whose {@link #getValue()}
     * matches the provided value.
     *
     * @param value of the Enum
     * @return a {@link GenderEnum } with the matching value
     * @throws IllegalArgumentException if no enum has a value matching the given value
     */
    public static GenderEnum fromValue(final String value) {
      for (final GenderEnum constant : GenderEnum.values()) {
        if (constant.getValue().equals(value)) {
          return constant;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
}
```

## Further examples
All supported plugin `<configuration>`-options and OpenAPI Specification-properties have been tested.
For reference:
- [OpenAPI Specification](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/src/main/resources/api.yaml), used for all tests
- [Maven plugin executions](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/pom.xml#L166), for each different set of configurations
- [Generated classes](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/tree/main/target/generated-sources/openapi/src/src/gen/java/main/io/github/chrimle/example) grouped by plugin-execution.

### Useful Resources

- [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [OpenAPI Basic Structure](https://swagger.io/docs/specification/basic-structure/)
- [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
- [Mustache](https://mustache.github.io/)

## Encountered an issue?
Double-check that build-configurations and the OpenAPI Specification is supported. If problems persist, check the [open issues](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues).
If the problem you are facing is not already reported, please [open an issue](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues/new) with details and instructions to reproduce.

# License
MIT License

Copyright (c) 2024 Chrimle

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
