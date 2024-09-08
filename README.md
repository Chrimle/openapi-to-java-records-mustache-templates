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

import java.util.List;

/**
 * This is an example
 * @deprecated
 * @param text Example text property  
 * @param collection Example list property  
 * @param composite
 */
@Deprecated
public record Example(
    String text,
    List<Integer> collection,
    Composite composite) {

}
```

## Supported `openapi-generator-maven-plugin` configurations

The following are `<configuration>`-properties which are supported. Other properties may
be ignored, or may cause problems. Please refer to the [pom.xml](./pom.xml) for the
version currently
used. [Full list of available configurations](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md).

> [!NOTE]
> The following properties can be set either in the build `<configuration>`-tag,
> or by the complete property name prefixed
> by `openapi.generator.maven.plugin.{property}`.

| Property          | Required? |             Default             | Description                                                                      |
|-------------------|:---------:|:-------------------------------:|----------------------------------------------------------------------------------|
| `generateModels`  |    :x:    |             `true`              | Generates Java classes when `true`.                                              |
| `modelPackage`    |    :x:    | `org.openapitools.client.model` | The `package` name of generated Java classes.                                    |
| `modelNamePrefix` |    :x:    |                                 | Adds a prefix to the name of generated Java classes (useful for naming schemes). |
| `modelNameSuffix` |    :x:    |                                 | Adds a suffix to the name of generated Java classes (useful for naming schemes). |

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
| `{schema}.description`                       | JavaDoc description of the generated Java class. |         *         |                                                                                                                        |
| `{schema}.deprecated`                        | Marks the generated Java class as Deprecated.    |      `true`       | Annotates the class with `@Deprecated` and adds `@deprecated` to the JavaDoc description.                              |
|                                              |                                                  | `false` (default) | Does nothing.                                                                                                          |
| `{schema}.properties`                        | Fields of the generated Record class.            |         *         |                                                                                                                        |
| `{schema}.properties.{property}`             | Name of the field.                               |         *         | Added as a `@param` in the JavaDoc.                                                                                    |
| `{schema}.properties.{property}.description` | Description of the field.                        |         *         | Description of the `@param` in the JavaDoc.                                                                            |
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
