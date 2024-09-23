# openapi-to-java-records-mustache-templates

Project containing [Mustache-templates](https://mustache.github.io/) used by [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md) to generate [Java Records](https://docs.oracle.com/en/java/javase/17/language/records.html) from [OpenAPI Specifications](https://swagger.io/specification/).

This project contains the **mustache templates**.
> [!NOTE]
> There is also an example OpenAPI Specification which will generate example Java classes (Records & Enums).
> **This is for testing purposes only**, and will **not** be included when importing the project. The templates
> support a variety of different properties and configurations. Just for reference, generated classes can be found
> under [/target/generated-sources/...](./target/generated-sources/openapi/src/src/gen/java/main/io/github/chrimle/example).

# Example

The following is an example of a Java record generated from an OpenAPI Specification, with default `openapi-generator-maven-plugin`-configurations.

## Maven 
> [!IMPORTANT]
> Some `openapi-generator-maven-plugin`-configuration options have not yet been verified. By using them, they may either be ignored or may even cause issues.
> 
> Due to the sheer number of `<configuration>`-options, this section has been moved to the Wiki-page: [Supported 'openapi‐generator‐maven‐plugin' Configuration options
](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-%27openapi‐generator‐maven‐plugin%27-Configuration-options)

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
> [!IMPORTANT]
> See the complete list of [Supported OpenAPI Specification properties](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-OpenAPI-Specification-properties)
> on the wiki!

## Java Record

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
 * @param composite Composite
 */
@Deprecated
public record Example(
    @javax.annotation.Nonnull String text,
    @javax.annotation.Nullable String nullableText,
    @javax.annotation.Nonnull List<Integer> collection,
    @javax.annotation.Nonnull Composite composite) {

  public Example(
      @javax.annotation.Nonnull final String text,
      @javax.annotation.Nullable final String nullableText,
      @javax.annotation.Nullable final List<Integer> collection,
      @javax.annotation.Nonnull final Composite composite) {
    this.text = text;
    this.nullableText = Objects.requireNonNullElse(nullableText, "someDefaultValue");
    this.collection = Objects.requireNonNullElse(collection, new ArrayList<>());
    this.composite = composite;
  }
}
```

### Useful Resources

- [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [OpenAPI Basic Structure](https://swagger.io/docs/specification/basic-structure/)
- [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
- [Mustache](https://mustache.github.io/)

# How-to Instructions
> [!NOTE]
> This project is about mustache templates only. For that reason, any other files or configurations are either irrelevant, or may not be applicable to your use-case.
## 1. Get mustache templates
The mustache templates can be acquired through multiple ways.
- ### Import from [Maven Central Repository](https://central.sonatype.com/artifact/io.github.chrimle/openapi-to-java-records-mustache-templates)
Import the project via:
```xml
<dependency>
    <groupId>io.github.chrimle</groupId>
    <artifactId>openapi-to-java-records-mustache-templates</artifactId>
    <version><!-- Insert version here --></version>
</dependency>
```

- ### Import from [GitHub Packages](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/packages/)
> [!IMPORTANT]
> Importing via GitHub Packages require authentication, see [GitHub Packages: Installing a Package](https://docs.github.com/en/packages/learn-github-packages/installing-a-package) for further details.

Import the project via:
```xml
<dependency>
    <groupId>io.github.chrimle</groupId>
    <artifactId>openapi-to-java-records-mustache-templates</artifactId>
    <version><!-- Insert version here --></version>
</dependency>
```

- ### Browse mustache templates on GitHub
The mustache templates can be found under [./src/main/resources/templates](./src/main/resources/templates).

## 2. Use the `.mustache` templates when generating
Place the file(s) in desired directory. Then, in the Maven build configuration, set the property `<templateDirectory>` to the directory path. Example:
```xml
<build>
  <plugins>
    <plugin>
      <artifactId>openapi-generator-maven-plugin</artifactId>
      <!-- ... -->
      <executions>
        <execution>
          <configuration>
            <templateDirectory>${project.basedir}/src/main/resources/templates</templateDirectory> 
          </configuration>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```
### 3. Review other `<configuration>`-properties & OpenAPI Specification
> [!IMPORTANT]
> Review the configurations, and compare with [Supported Configurations](#supported-openapi-generator-maven-plugin-configurations).
> Do the same with the OpenAPI Specification, and [Supported OpenAPI Spec Properties](#supported-openapi-specification-properties).

### 4. Generate models
Compile the project, for example via:
```console
mvn compile
```

> [!TIP]
> Further information about how to generate models can be found on [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md).

### 5. Verify models
Unless the configuration property `<output>` has been set, the generated classes should be found under `./target/generated-sources/openapi`.

### 6. Encountered an issue?
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
