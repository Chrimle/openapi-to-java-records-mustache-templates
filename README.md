# openapi-to-java-records-mustache-templates

Aims to
generate [Java Records](https://docs.oracle.com/en/java/javase/17/language/records.html)
from [OpenAPI Specifications](https://swagger.io/specification/)
via [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
and [mustache templates](https://mustache.github.io/).

This project contains the
mustache templates, and an example OpenAPI Specification which will generate example Java
classes (Records & Enums).

## Example

The following is an example of a Java record generated from an OpenAPI Specification.

### OpenAPI Specification

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
> See the complete list of Supported OpenAPI Specification
> properties [here](#supported-openapi-specification-properties).

### Java Record

```java
package com.chrimle.example;

import ...;

/**
 * This is an example
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

> [!NOTE]
> The annotations `@javax.annotation.*` can be changed to `@jakarta.annotation.*`
> by setting the `configOptions`-property `useJakartaEe` to `true`.

## Supported `openapi-generator-maven-plugin` configurations

> [!IMPORTANT]
> Some `<configuration>`-options have not yet been verified. By using them, they may either be ignored or may even cause issues.
> 
> Due to the sheer number of `<configuration>`-options, this section has been moved to the Wiki-page: [Supported 'openapi‐generator‐maven‐plugin' Configuration options
](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/wiki/Supported-%27openapi‐generator‐maven‐plugin%27-Configuration-options)

## Supported OpenAPI Specification properties

The following are OpenAPI Specification properties which are supported. Other
properties may be ignored, or may cause problems.

> [!NOTE]
> The following properties are referring to the schema definitions, prefixed
> by `components.schemas.{schema}`.

| Property                                     | Description                                      |       Value       | Value Description                                                                                                      |
|----------------------------------------------|--------------------------------------------------|:-----------------:|------------------------------------------------------------------------------------------------------------------------|
| `{schema}`                                   | Name of the generated Java class.                |         *         |                                                                                                                        |
| `{schema}.type`                              | Type of the generated Java class.                |     `object`      | Generates a Record class.                                                                                              |
|                                              |                                                  |      `enum`       | Generates an Enum class.                                                                                               |
| `{schema}.description`                       | JavaDoc description of the generated Java class. |         *         | If not set, adds the class name as a placeholder in the JavaDoc description.                                           |
| `{schema}.deprecated`                        | Marks the generated Java class as Deprecated.    |      `true`       | Annotates the class with `@Deprecated` and adds `@deprecated` to the JavaDoc description.                              |
|                                              |                                                  | `false` (default) | Does nothing.                                                                                                          |
| `{schema}.properties`                        | Fields of the generated Record class.            |         *         |                                                                                                                        |
| `{schema}.properties.{property}`             | Name of the field.                               |         *         | Added as a `@param` in the JavaDoc.                                                                                    |
| `{schema}.properties.{property}.description` | Description of the field.                        |         *         | Description of the `@param` in the JavaDoc. If not set, the class name of the field will be added as a description.    |
| `{schema}.properties.{property}.default`     | Default value of the field.                      |         *         | If set, the field is set to the default value if the provided value is null. (Using `Objects.requireNonNullElse()`)    |
| `{schema}.properties.{property}.nullable`    | Marks the field with `@Nullable`-annotations.    |      `true`       | Annotates the field with `@Nullable`.                                                                                  |
|                                              |                                                  | `false` (default) | Annotates the field with `@Nonnull`. This will be annotated `@Nullable` in the constructor, if `default` has been set. |
| `{schema}.properties.{property}.$ref`        | Type of the field is another Java class.         |         *         |                                                                                                                        |
| `{schema}.properties.{property}.type`        | Type of the field.                               |      `array`      | Generates the field as `List<{items.type}>`.                                                                           |
|                                              |                                                  |     `boolean`     | Generates the field as `Boolean`.                                                                                      |
|                                              |                                                  |      `enum`       | **Not supported yet** - See [Issue #5](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues/5) |
|                                              |                                                  |     `integer`     | Generates the field as `Integer`.                                                                                      |
|                                              |                                                  |     `number`      | Generates the field as `BigDecimal`.                                                                                   |
|                                              |                                                  |     `object`      | **Not supported yet** - See [Issue #4](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/issues/4) |
|                                              |                                                  |     `string`      | Generates the field as `String`.                                                                                       |

### Useful Resources

- [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [OpenAPI Basic Structure](https://swagger.io/docs/specification/basic-structure/)
- [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
- [Mustache](https://mustache.github.io/)

# How-to Instructions
> [!NOTE]
> This project is about mustache templates only. For that reason, any other files or configurations are either irrelevant, or may not be applicable to your use-case.
## 1. Get mustache templates
The mustache templates can be found under [./src/main/resources/templates](./src/main/resources/templates).
> [!IMPORTANT]
> The only **required** `.mustache`-file is [`pojo.mustache`](./src/main/resources/templates/pojo.mustache), which generates Java records instead of Java classes.
> Without the supporting `.mustache`-files however, the generated Java record will be a skeleton class - which will **not** feature JavaDocs nor `@Deprecated`-annotations.

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
Compile the project, for example via `mvn compile`.
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
