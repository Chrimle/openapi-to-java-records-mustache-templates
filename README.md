![O2JRM Logo](docs/assets/banner_logo.png)
[![Maven Central Version](https://img.shields.io/maven-central/v/io.github.chrimle/openapi-to-java-records-mustache-templates?style=flat)](https://central.sonatype.com/artifact/io.github.chrimle/openapi-to-java-records-mustache-templates)
[![MvnRepository](https://badges.mvnrepository.com/badge/io.github.chrimle/openapi-to-java-records-mustache-templates/badge.svg?type=rank&label=MvnRepository)](https://mvnrepository.com/artifact/io.github.chrimle/openapi-to-java-records-mustache-templates)
![JUnit Test Suite](https://img.shields.io/badge/JUnit_Test_Suite-24112_Tests-blue?style=flat)
[![OpenSSF Scorecard](https://api.scorecard.dev/projects/github.com/Chrimle/openapi-to-java-records-mustache-templates/badge)](https://scorecard.dev/viewer/?uri=github.com/Chrimle/openapi-to-java-records-mustache-templates)
[![OpenSSF Best Practices](https://www.bestpractices.dev/projects/12077/badge)](https://www.bestpractices.dev/projects/12077)

Project containing [Mustache-templates](https://mustache.github.io/) used by [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md) to generate [Java Records](https://docs.oracle.com/en/java/javase/17/language/records.html) from [OpenAPI Specifications](https://swagger.io/specification/).

This project contains the **mustache templates**.

## Apache License 2.0
This project is licensed under the **[Apache License 2.0](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/LICENSE)**.

## Support the Project
If you find this project useful, please ⭐ **Star** ⭐ it and share it with others!
This is the best way to show appreciation for this project - Thank you! ❤️

If you have feedback or suggestions, please share it in either [Discussions](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/discussions) or [Issues](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues)!

> [!NOTE]
> This project is, _and will continue to be_, solely maintained by [Chrimle](https://github.com/Chrimle). 
> While _direct_ code contributions are disallowed, your feedback is the most valuable contribution - please share it!

# Getting Started
> [!TIP]
If you want a more detailed guide with simple examples to get started, check out the Wiki-page
> [Beginner Guide (Step-by-Step)](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Beginner-Guide-%28Step‐by‐Step%29).

<details>

<summary>Supported `openapi-generator` Versions</summary>

- [7.20.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.20.0) - 2026, Feb 16 (latest)
- [7.19.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.19.0) - 2026, Jan 19
- [7.18.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.18.0) - 2025, Dec 22
- [7.17.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.17.0) - 2025, Oct 29
- [7.16.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.16.0) - 2025, Sep 28
- [7.15.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.15.0) - 2025, Aug 22
- [7.14.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.14.0) - 2025, Jun 25
- [7.13.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.13.0) - 2025, Apr 27
- [7.12.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.12.0) - 2025, Feb 28
- [7.11.0](https://github.com/OpenAPITools/openapi-generator/releases/tag/v7.11.0) - 2025, Jan 20

Older/newer versions may work, but are currently not part of the CI Test Suite.

</details>

## Obtain Mustache Templates

> [!NOTE]
> The Maven artifact **only** contains the `.mustache` template files and a `LICENSE.txt`.
> - `templates/`
>   - `generateBuilders.mustache`
>   - `javadoc.mustache`
>   - `licenseInfo.mustache`
>   - `modelEnum.mustache`
>   - `pojo.mustache`
>   - `useBeanValidation.mustache`
> - `LICENSE.txt`
>
> No other files are included in the imported artifact.
> ```xml
> <dependency>
>    <groupId>io.github.chrimle</groupId>
>    <artifactId>openapi-to-java-records-mustache-templates</artifactId>
>    <version><!-- Check for latest version --></version>
> </dependency>
> ```

These mustache templates may be obtained in several (4) ways (_ordered by convenience_):

### 1. Use `maven-dependency-plugin` (Recommended)
Use a plugin such as `maven-dependency-plugin` to unpack the `.mustache` files from `io.github.chrimle:openapi-to-java-records-mustache-templates`.
> [!CAUTION]
> **SECURITY BEST PRACTICES**
> 
> Do not unpack arbitrary files from the downloaded artifact. Always explicitly list individual files to unpack. (_Semantic Versioning is already considering this_).
> [Further information in Security Policy](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/security/policy).

### 2. Download from Maven Central
Download the GPG-Signed artifact `io.github.chrimle:openapi-to-java-records-mustache-templates` from [Maven Central Repository](https://central.sonatype.com/artifact/io.github.chrimle/openapi-to-java-records-mustache-templates)
and copy the `.mustache`-files from the `/templates` directory.

### 3. Download from GitHub Packages
Download the `io.github.chrimle:openapi-to-java-records-mustache-templates` Package from [GitHub Packages](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/packages/)
and copy the `.mustache`-files from the `/templates` directory.

### 4. Download the Source Code from GitHub Releases
Download the GPG-Signed source code from [Releases](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/releases)
and copy the `.mustache`-files from the `mustache-templates/target/classes/templates` directory.

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

In this example, each generated class field will be annotated with [Jakarta Bean Validation annotations](https://jakarta.ee/specifications/bean-validation/3.0/jakarta-bean-validation-spec-3.0.html#builtinconstraints).
```xml
  <configuration>
    <!-- ... more configurations ... -->
    <configOptions>
      <useBeanValidation>true</useBeanValidation>
      <!-- ... more configOptions ... -->
    </configOptions>
  </configuration>
```

> [!TIP]
> See [Supported 'openapi‐generator‐maven‐plugin' Configuration options](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-%27openapi‐generator‐maven‐plugin%27-Configuration-options)

## OpenAPI Specification
<details open>
<summary>Example OpenAPI Specification</summary>
    
```yaml
components:
  schemas:
    Name:
      description: Name Information
      type: object
      required:
        - firstName
        - lastName
      properties:
        firstName:
          description: First Name
          type: string
          minLength: 2
        lastName:
          description: Last Name
          type: string
          minLength: 2
        middleName:
          description: Middle Name
          type: string
          nullable: true
    Person:
      description: Personal information
      deprecated: true
      type: object
      required:
        - name
        - age
        - gender
        - height
        - ssn
        - aliases
        - email
        - trackingCode
        - uuid
      properties:
        name:
          description: Name
          type: object
          $ref: '#/components/schemas/Name'
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
        legalGuardian:
          description: Legal Guardian
          type: object
          $ref: '#/components/schemas/Person'
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
        email:
          description: Email Address
          type: string
          format: email
        trackingCode:
          description: Tracking code for Web analytics
          type: string
          minLength: 5
          maxLength: 50
          default: "utm_source=default"
        uuid:
          description: An Universally Unique Identifier
          type: string
          format: uuid
```

</details>

> [!TIP]
> See [Supported OpenAPI Specification properties](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-OpenAPI-Specification-properties)

## Generate models
Compile the project, for example via:
```console
mvn compile
```

> [!TIP]
> Further information about how to generate models can be found on [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md).

## Generated Java Record
Unless the configuration property `<output>` has been set, the generated classes should be found under `./target/generated-sources/openapi`.

<details open>
    
<summary>Resulting Java record from example OpenAPI spec.</summary>

```java
package io.github.chrimle.o2jrm;

/**
 * Personal information
 *
 * @deprecated
 * @param name Name.
 * @param age Age (years)
 * @param gender Gender
 * @param height Height (m)
 * @param legalGuardian Person.
 * @param ssn Social Security Number
 * @param aliases Known Aliases
 * @param telephoneNumber Telephone Number
 * @param email Email Address
 * @param trackingCode Tracking code for Web analytics
 * @param uuid An Universally Unique Identifier
 */
@Deprecated
public record Person(
    @Valid @NotNull Name name,
    @NotNull @Min(0) @Max(100) Integer age,
    @NotNull GenderEnum gender,
    @NotNull @DecimalMin("0") BigDecimal height,
    @Valid Person legalGuardian,
    @NotNull @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") String ssn,
    @NotNull @Size(min = 1, max = 3) Set<String> aliases,
    String telephoneNumber,
    @NotNull @Email String email,
    @NotNull @Size(min = 5, max = 50) String trackingCode,
    @NotNull UUID uuid) {

  public Person(
      final Name name,
      final Integer age,
      final GenderEnum gender,
      final BigDecimal height,
      final Person legalGuardian,
      final String ssn,
      final Set<String> aliases,
      final String telephoneNumber,
      final String email,
      final String trackingCode,
      final UUID uuid) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.height = height;
    this.legalGuardian = legalGuardian;
    this.ssn = ssn;
    this.aliases = Objects.requireNonNullElseGet(aliases, () -> new LinkedHashSet<>());
    this.telephoneNumber = telephoneNumber;
    this.email = email;
    this.trackingCode = Objects.requireNonNullElse(trackingCode, "utm_source=default");
    this.uuid = uuid;
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
     * @return the value of this enum.
     */
    public String getValue() {
      return value;
    }

    /**
     * Case-sensitively matches the given {@code value} to an enum constant using {@link
     * #getValue()}.
     *
     * <p><b>NOTE:</b> if multiple enum constants have a matching value, the first enum constant is
     * returned, by the order they are declared.
     *
     * @param value of the enum.
     * @return a {@link GenderEnum } with the matching value.
     * @throws IllegalArgumentException if no enum has a value matching the given value.
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

</details>

## Further examples

Refer to the test-cases for generated classes, as these list supported plugin `<configuration>`-options and OpenAPI
Specification-properties. The unit-tests could clarify expected behaviors, and the OpenAPI Specification could also
provide concrete examples and use-cases. For reference:

- [OpenAPI Specification](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/test-common/src/main/resources/api.yaml)<br/>
  Used as the input schema to generate **all** classes used in testing.
- [Maven plugin executions](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/tests/pom.xml#L150)<br/>
  Generates classes from the OpenAPI spec, with different `openapi-generator-maven-plugin` configuration options. The
  resulting classes are placed in sub-packages, named after the plugin-execution.
- [Generated classes](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/tree/main/tests/target/generated-sources/openapi/src/src/gen/java/main/io/github/chrimle/o2jrm)<br/>
  The resulting classes are organized into sub-packages, which facilitates testing. These files are - _albeit in no way
  necessary_ - tracked and versioned in order to be accessible without needing to compile anything. Furthermore, it
  makes it easier to spot differences in generated classes after making a change to the mustache templates.
- [Test Suite](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/tree/main/test-common/src/test/java/io/github/chrimle/o2jrm/tests)<br/>
  Contains all test-cases for generated `record` and `enum` classes. These tests are _parameterized_, to test **all**
  classes in the OpenAPI Specification in combination with **all** plugin-executions. This consists of >20 000 tests.

## Encountered an issue?
Firstly, make a minimal reproducible example - it will greatly facilitate troubleshooting!

Please, verify these steps _without_ custom mustache-template files:
1. Verify that the Maven Build Configuration is correct.
2. Verify that the OpenAPI Specification is valid.
3. Verify that classes are generated successfully.
4. Verify that needed dependencies are imported.

Once verified, use the custom mustache-template files and verify the following:
1. Verify that the `openapi-generator-maven-plugin` configuration options are supported. See [Supported 'openapi‐generator‐maven‐plugin' Configuration options](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-%27openapi‐generator‐maven‐plugin%27-Configuration-options).
   - If no configuration options are set, please proceed to the next step.
   - If the configuration option is not listed as supported - please request it via [open an issue](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues/new/choose).
2. Verify that the OpenAPI Specification properties are supported. See [Supported OpenAPI Specification properties](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-OpenAPI-Specification-properties).
   - If the property is not listed as supported - please request it via [open an issue](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues/new/choose).
3. Compare `openapi-generator-maven-plugin` versions
   - As a last resort, it could be due to using an older/newer version than what is used within this project for testing.
     Even if this would solve the issue - please report it via [open an issue](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues/new/choose).

If problems persist, check the [open issues](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues). 
If the problem you are facing has not already been reported, please [open an issue](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues/new/choose) with details and instructions to reproduce.

### Useful Resources

- [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [OpenAPI Basic Structure](https://swagger.io/docs/specification/basic-structure/)
- [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
- [Mustache](https://mustache.github.io/)

<!-- Scarf Pixel Tracker -->
<img referrerpolicy="no-referrer-when-downgrade" src="https://static.scarf.sh/a.png?x-pxid=d9ff30fa-ffcc-4963-a18d-9977bb84c3ad" />
