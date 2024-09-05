# openapi-to-java-records-mustache-templates

Aims to generate Java records from OpenAPI-spec via
openapi-generator-maven-plugin and mustache templates.

## Supported Features

| Feature      |                       Source                        | Description                                                                |   `java/default`   |
|--------------|:---------------------------------------------------:|----------------------------------------------------------------------------|:------------------:|
| Package Name |       `pom.xml`:`configuration.modelPackage`        | Sets the package name for generated models. Example: `com.chrimle.example` | :heavy_check_mark: |
| Description  | `api.yaml`:`components.schemas.{model}.description` | Adds *JavaDoc* for generated models.                                       | :heavy_check_mark: |
| Deprecation  | `api.yaml`:`components.schemas.{model}.deprecated`  | Adds `@Deprecated`-annotation to the generated model, and its *JavaDoc*.   | :heavy_check_mark: |

### Useful Resources

- [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [OpenAPI Basic Structure](https://swagger.io/docs/specification/basic-structure/)
- [openapi-generator](https://github.com/OpenAPITools/openapi-generator)