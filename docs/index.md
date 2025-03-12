[![Java CI with Maven](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/actions/workflows/maven.yml/badge.svg)](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/actions/workflows/maven.yml)
[![Maven Package](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/actions/workflows/maven-publish.yml)
[![pages-build-deployment](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/actions/workflows/pages/pages-build-deployment/badge.svg)](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/actions/workflows/pages/pages-build-deployment)

Project containing [Mustache-templates](https://mustache.github.io/) used by [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md) to generate [Java Records](https://docs.oracle.com/en/java/javase/17/language/records.html) from [OpenAPI Specifications](https://swagger.io/specification/).

This project contains the **mustache templates**.

## Apache License 2.0
Starting with project version **2.0.0**, the project is licensed under the **Apache License 2.0**.
> Prior to version **2.0.0**, the project was licensed under the **MIT License**. See [License](#license).

## Support the Project
If you find this project useful, please ⭐ **Star** ⭐ it and share it with others!
This is the best way to show appreciation for this project - Thank you! ❤️

If you have feedback or suggestions, please share it in either [Discussions](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/discussions) or [Issues](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues)!

> This project is, _and will continue to be_, solely maintained by [Chrimle](https://github.com/Chrimle).
> While _direct_ code contributions are disallowed, your feedback is the most valuable contribution - please share it!

# Getting Started
The mustache templates are best acquired by importing the project as a dependency.

> If you want a more detailed guide with simple examples to get started, check out the Wiki-page
> [Beginner Guide (Step-by-Step)](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Beginner-Guide-%28Step‐by‐Step%29).

## Import Dependency
> The Maven artifact **only** contains the `.mustache` template files and a `LICENSE.txt`. No other files are included in the imported artifact.

```xml
<dependency>
    <groupId>io.github.chrimle</groupId>
    <artifactId>openapi-to-java-records-mustache-templates</artifactId>
    <version>2.7.0</version>
</dependency>
```
It is **strongly recommended** to import the project as a dependency. It has officially been published to:
- [Maven Central Repository](https://central.sonatype.com/artifact/io.github.chrimle/openapi-to-java-records-mustache-templates)
- [GitHub Packages](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/packages/)

> While it is _possible_ to download the Mustache templates directly
> from [GitHub](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/tree/main/mustache-templates/target/classes/templates),
> this approach is **not recommended**. Templates obtained this way are not guaranteed to be versioned correctly and
> is explicitly **exempt** from the [Semantic Versioning](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Semantic-Versioning) considerations.

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

> See [Supported 'openapi‐generator‐maven‐plugin' Configuration options](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-%27openapi‐generator‐maven‐plugin%27-Configuration-options)

## OpenAPI Specification

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
    @javax.annotation.Nonnull @Valid @NotNull Name name,
    @javax.annotation.Nonnull @NotNull @Min(0) @Max(100) Integer age,
    @javax.annotation.Nonnull @NotNull GenderEnum gender,
    @javax.annotation.Nonnull @NotNull @DecimalMin("0") BigDecimal height,
    @javax.annotation.Nonnull @Valid Person legalGuardian,
    @javax.annotation.Nonnull @NotNull @Pattern(regexp = "^\\d{3}-\\d{2}-\\d{4}$") String ssn,
    @javax.annotation.Nonnull @NotNull @Size(min = 1, max = 3) Set<String> aliases,
    @javax.annotation.Nullable String telephoneNumber,
    @javax.annotation.Nonnull @NotNull @Email String email,
    @javax.annotation.Nonnull @NotNull @Size(min = 5, max = 50) String trackingCode,
    @javax.annotation.Nonnull @NotNull UUID uuid) {

  public Person(
      @javax.annotation.Nonnull final Name name,
      @javax.annotation.Nonnull final Integer age,
      @javax.annotation.Nonnull final GenderEnum gender,
      @javax.annotation.Nonnull final BigDecimal height,
      @javax.annotation.Nonnull final Person legalGuardian,
      @javax.annotation.Nonnull final String ssn,
      @javax.annotation.Nullable final Set<String> aliases,
      @javax.annotation.Nullable final String telephoneNumber,
      @javax.annotation.Nonnull final String email,
      @javax.annotation.Nullable final String trackingCode,
      @javax.annotation.Nonnull final UUID uuid) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.height = height;
    this.legalGuardian = legalGuardian;
    this.ssn = ssn;
    this.aliases = Objects.requireNonNullElse(aliases, new LinkedHashSet<>());
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

## Further examples

Refer to the test-cases for generated classes, as these list supported plugin `<configuration>`-options and OpenAPI
Specification-properties. The unit-tests could clarify expected behaviors, and the OpenAPI Specification could also
provide concrete examples and use-cases. For reference:

- [OpenAPI Specification](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/tests/src/main/resources/api.yaml)<br/>
  Used as the input schema to generate **all** classes used in testing.
- [Maven plugin executions](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/tests/pom.xml#L139)<br/>
  Generates classes from the OpenAPI spec, with different `openapi-generator-maven-plugin` configuration options. The
  resulting classes are placed in sub-packages, named after the plugin-execution.
- [Generated classes](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/tree/main/tests/target/generated-sources/openapi/src/src/gen/java/main/io/github/chrimle/o2jrm)<br/>
  The resulting classes are organized into sub-packages, which facilitates testing. These files are - _albeit in no way
  necessary_ - tracked and versioned in order to be accessible without needing to compile anything. Furthermore, it
  makes it easier to spot differences in generated classes after making a change to the mustache templates.
- [Test Suite](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/tree/main/tests/src/test/java/io/github/chrimle/o2jrm/tests)<br/>
  Contains all test-cases for generated `record` and `enum` classes. These tests are _parameterized_, to test **all**
  classes in the OpenAPI Specification in combination with **all** plugin-executions.

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

# License
                                 Apache License
                           Version 2.0, January 2004
                        http://www.apache.org/licenses/

   TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION

   1. Definitions.

      "License" shall mean the terms and conditions for use, reproduction,
      and distribution as defined by Sections 1 through 9 of this document.

      "Licensor" shall mean the copyright owner or entity authorized by
      the copyright owner that is granting the License.

      "Legal Entity" shall mean the union of the acting entity and all
      other entities that control, are controlled by, or are under common
      control with that entity. For the purposes of this definition,
      "control" means (i) the power, direct or indirect, to cause the
      direction or management of such entity, whether by contract or
      otherwise, or (ii) ownership of fifty percent (50%) or more of the
      outstanding shares, or (iii) beneficial ownership of such entity.

      "You" (or "Your") shall mean an individual or Legal Entity
      exercising permissions granted by this License.

      "Source" form shall mean the preferred form for making modifications,
      including but not limited to software source code, documentation
      source, and configuration files.

      "Object" form shall mean any form resulting from mechanical
      transformation or translation of a Source form, including but
      not limited to compiled object code, generated documentation,
      and conversions to other media types.

      "Work" shall mean the work of authorship, whether in Source or
      Object form, made available under the License, as indicated by a
      copyright notice that is included in or attached to the work
      (an example is provided in the Appendix below).

      "Derivative Works" shall mean any work, whether in Source or Object
      form, that is based on (or derived from) the Work and for which the
      editorial revisions, annotations, elaborations, or other modifications
      represent, as a whole, an original work of authorship. For the purposes
      of this License, Derivative Works shall not include works that remain
      separable from, or merely link (or bind by name) to the interfaces of,
      the Work and Derivative Works thereof.

      "Contribution" shall mean any work of authorship, including
      the original version of the Work and any modifications or additions
      to that Work or Derivative Works thereof, that is intentionally
      submitted to Licensor for inclusion in the Work by the copyright owner
      or by an individual or Legal Entity authorized to submit on behalf of
      the copyright owner. For the purposes of this definition, "submitted"
      means any form of electronic, verbal, or written communication sent
      to the Licensor or its representatives, including but not limited to
      communication on electronic mailing lists, source code control systems,
      and issue tracking systems that are managed by, or on behalf of, the
      Licensor for the purpose of discussing and improving the Work, but
      excluding communication that is conspicuously marked or otherwise
      designated in writing by the copyright owner as "Not a Contribution."

      "Contributor" shall mean Licensor and any individual or Legal Entity
      on behalf of whom a Contribution has been received by Licensor and
      subsequently incorporated within the Work.

   2. Grant of Copyright License. Subject to the terms and conditions of
      this License, each Contributor hereby grants to You a perpetual,
      worldwide, non-exclusive, no-charge, royalty-free, irrevocable
      copyright license to reproduce, prepare Derivative Works of,
      publicly display, publicly perform, sublicense, and distribute the
      Work and such Derivative Works in Source or Object form.

   3. Grant of Patent License. Subject to the terms and conditions of
      this License, each Contributor hereby grants to You a perpetual,
      worldwide, non-exclusive, no-charge, royalty-free, irrevocable
      (except as stated in this section) patent license to make, have made,
      use, offer to sell, sell, import, and otherwise transfer the Work,
      where such license applies only to those patent claims licensable
      by such Contributor that are necessarily infringed by their
      Contribution(s) alone or by combination of their Contribution(s)
      with the Work to which such Contribution(s) was submitted. If You
      institute patent litigation against any entity (including a
      cross-claim or counterclaim in a lawsuit) alleging that the Work
      or a Contribution incorporated within the Work constitutes direct
      or contributory patent infringement, then any patent licenses
      granted to You under this License for that Work shall terminate
      as of the date such litigation is filed.

   4. Redistribution. You may reproduce and distribute copies of the
      Work or Derivative Works thereof in any medium, with or without
      modifications, and in Source or Object form, provided that You
      meet the following conditions:

      (a) You must give any other recipients of the Work or
          Derivative Works a copy of this License; and

      (b) You must cause any modified files to carry prominent notices
          stating that You changed the files; and

      (c) You must retain, in the Source form of any Derivative Works
          that You distribute, all copyright, patent, trademark, and
          attribution notices from the Source form of the Work,
          excluding those notices that do not pertain to any part of
          the Derivative Works; and

      (d) If the Work includes a "NOTICE" text file as part of its
          distribution, then any Derivative Works that You distribute must
          include a readable copy of the attribution notices contained
          within such NOTICE file, excluding those notices that do not
          pertain to any part of the Derivative Works, in at least one
          of the following places: within a NOTICE text file distributed
          as part of the Derivative Works; within the Source form or
          documentation, if provided along with the Derivative Works; or,
          within a display generated by the Derivative Works, if and
          wherever such third-party notices normally appear. The contents
          of the NOTICE file are for informational purposes only and
          do not modify the License. You may add Your own attribution
          notices within Derivative Works that You distribute, alongside
          or as an addendum to the NOTICE text from the Work, provided
          that such additional attribution notices cannot be construed
          as modifying the License.

      You may add Your own copyright statement to Your modifications and
      may provide additional or different license terms and conditions
      for use, reproduction, or distribution of Your modifications, or
      for any such Derivative Works as a whole, provided Your use,
      reproduction, and distribution of the Work otherwise complies with
      the conditions stated in this License.

   5. Submission of Contributions. Unless You explicitly state otherwise,
      any Contribution intentionally submitted for inclusion in the Work
      by You to the Licensor shall be under the terms and conditions of
      this License, without any additional terms or conditions.
      Notwithstanding the above, nothing herein shall supersede or modify
      the terms of any separate license agreement you may have executed
      with Licensor regarding such Contributions.

   6. Trademarks. This License does not grant permission to use the trade
      names, trademarks, service marks, or product names of the Licensor,
      except as required for reasonable and customary use in describing the
      origin of the Work and reproducing the content of the NOTICE file.

   7. Disclaimer of Warranty. Unless required by applicable law or
      agreed to in writing, Licensor provides the Work (and each
      Contributor provides its Contributions) on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
      implied, including, without limitation, any warranties or conditions
      of TITLE, NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A
      PARTICULAR PURPOSE. You are solely responsible for determining the
      appropriateness of using or redistributing the Work and assume any
      risks associated with Your exercise of permissions under this License.

   8. Limitation of Liability. In no event and under no legal theory,
      whether in tort (including negligence), contract, or otherwise,
      unless required by applicable law (such as deliberate and grossly
      negligent acts) or agreed to in writing, shall any Contributor be
      liable to You for damages, including any direct, indirect, special,
      incidental, or consequential damages of any character arising as a
      result of this License or out of the use or inability to use the
      Work (including but not limited to damages for loss of goodwill,
      work stoppage, computer failure or malfunction, or any and all
      other commercial damages or losses), even if such Contributor
      has been advised of the possibility of such damages.

   9. Accepting Warranty or Additional Liability. While redistributing
      the Work or Derivative Works thereof, You may choose to offer,
      and charge a fee for, acceptance of support, warranty, indemnity,
      or other liability obligations and/or rights consistent with this
      License. However, in accepting such obligations, You may act only
      on Your own behalf and on Your sole responsibility, not on behalf
      of any other Contributor, and only if You agree to indemnify,
      defend, and hold each Contributor harmless for any liability
      incurred by, or claims asserted against, such Contributor by reason
      of your accepting any such warranty or additional liability.

   END OF TERMS AND CONDITIONS

   APPENDIX: How to apply the Apache License to your work.

      To apply the Apache License to your work, attach the following
      boilerplate notice, with the fields enclosed by brackets "[]"
      replaced with your own identifying information. (Don't include
      the brackets!)  The text should be enclosed in the appropriate
      comment syntax for the file format. We also recommend that a
      file or class name and description of purpose be included on the
      same "printed page" as the copyright notice for easier
      identification within third-party archives.

   Copyright 2024-2025 Chrimle

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
