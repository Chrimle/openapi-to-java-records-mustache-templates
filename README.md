# openapi-to-java-records-mustache-templates

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
    <version>1.8.0</version>
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

> [!TIP]
> See [Supported 'openapi‐generator‐maven‐plugin' Configuration options](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-%27openapi‐generator‐maven‐plugin%27-Configuration-options)

## OpenAPI Specification

```yaml
components:
  schemas:
    Example:
      description: This is an example
      deprecated: true
      type: object
      properties:
        text:
          description: Example text property
          type: string
        nullableText:
          description: Example nullable text property with default value
          type: string
          default: someDefaultValue
          nullable: true
        collection:
          description: Example list property
          type: array
          items:
            type: integer
        composite:
          $ref: '#/components/schemas/Composite'
    Composite:
      description: This is a composite object
      type: object
      properties:
        text:
          description: Example text property
          type: string
```
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

```java
package io.github.chrimle.example;

import ...;

/**
 * This is an example
 *
 * @deprecated
 * @param text Example text property
 * @param nullableText Example nullable text property with default value
 * @param collection Example list property
 * @param composite CompositeDTO
 */
@Deprecated
public record ExampleDTO(
    @javax.annotation.Nonnull String text,
    @javax.annotation.Nullable String nullableText,
    @javax.annotation.Nonnull List<Integer> collection,
    @javax.annotation.Nonnull CompositeDTO composite) {

  public ExampleDTO(
      @javax.annotation.Nonnull final String text,
      @javax.annotation.Nullable final String nullableText,
      @javax.annotation.Nullable final List<Integer> collection,
      @javax.annotation.Nonnull final CompositeDTO composite) { 
    this.text = text;
    this.nullableText = Objects.requireNonNullElse(nullableText, "someDefaultValue");
    this.collection = Objects.requireNonNullElse(collection, new ArrayList<>());
    this.composite = composite;
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
