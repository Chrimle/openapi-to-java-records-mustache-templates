# openapi-to-java-records-mustache-templates

Aims to
generate [Java Records](https://docs.oracle.com/en/java/javase/17/language/records.html)
from [OpenAPI Specifications](https://swagger.io/specification/)
via [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
and [mustache templates](https://mustache.github.io/). This project contains the
mustache templates, and an example OpenAPI Specification which will generate
example Java classes (Records & Enums).

## Example

The following is an example of a Java record generated from an OpenAPI
Specification.

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
> See the complete list
>
of [Supported OpenAPI Specification properties](#supported-openapi-specification-properties).

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

The following are `<configuration>`-properties which are supported. Other
properties may be ignored, or may cause problems. Please refer to
the [pom.xml](./pom.xml) for the version currently
used. [Full list of available configurations](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md).

| Property                                         | Required | Default                         | Description                                          |
|--------------------------------------------------|:--------:|---------------------------------|------------------------------------------------------|
| `openapi.generator.maven.plugin.generateModels`  |    no    | `true`                          | Generates Java classes, if `true`.                   |
| `openapi.generator.maven.plugin.modelPackage`    |    no    | `org.openapitools.client.model` | The `package` of generated Java classes.             |
| `openapi.generator.maven.plugin.modelNamePrefix` |    no    |                                 | Adds a prefix to the name of generated Java classes. |
| `openapi.generator.maven.plugin.modelNameSuffix` |    no    |                                 | Adds a suffix to the name of generated Java classes. |

## Supported OpenAPI Specification properties

The following are OpenAPI Specification properties which are supported. Other
properties may be ignored, or may cause problems.

| Property                                                        |             Supported values              | Description                                                                                          |
|-----------------------------------------------------------------|:-----------------------------------------:|------------------------------------------------------------------------------------------------------|
| `components.schemas.{schema}`                                   |                    any                    | Name of the generated Java class.                                                                    |
| `components.schemas.{schema}.type`                              |             `object` / `enum`             | Type of the generated Java class.                                                                    |
| `components.schemas.{schema}.description`                       |                    any                    | JavaDoc description of the generated Java class.                                                     |
| `components.schemas.{schema}.deprecated`                        |             `true` / `false`              | Annotates the class with `@Deprecated` and adds `@deprecated` to the JavaDoc description.            |
| `components.schemas.{schema}.properties`                        |                    any                    | The fields of the generated Java Record.                                                             |
| `components.schemas.{schema}.properties.{property}`             |                    any                    | The name of the field in the generated Java Record. This is also added as a `@param` in the JavaDoc. |
| `components.schemas.{schema}.properties.{property}.description` |                    any                    | The description of the `@param` in the JavaDoc.                                                      |
| `components.schemas.{schema}.properties.{property}.type`        | `array` / `string` / `integer` / `number` | The type of the field in the generated Java Record.                                                  |
| `components.schemas.{schema}.properties.{property}.$ref`        |                    any                    | The type of the field in the generated Java Record. Can refer to another generated Java class.       |

### Useful Resources

- [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [OpenAPI Basic Structure](https://swagger.io/docs/specification/basic-structure/)
- [openapi-generator-maven-plugin](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md)
- [Mustache](https://mustache.github.io/)