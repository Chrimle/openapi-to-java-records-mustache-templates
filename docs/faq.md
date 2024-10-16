# FAQ

- ### What version of Java is supported?
> Only JDK `17` has been confirmed, as it is used in testing.
>
> Source: [pom.xml#47](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/pom.xml#L47)<br/>
> Updated: `2024-09-26`

- ### What version of OpenAPI Specification is supported?
> Only version `3.0.0` of OpenAPI Spec. has been confirmed, as it is used in testing.
>
> Source: [/src/main/resources/api.yaml#1](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/src/main/resources/api.yaml#L1) <br/>
> Updated: `2024-09-26`

- ### What version of `openapi-generator-maven-plugin` is supported?
> Only version `7.8.0` of `openapi-generator-maven-plugin` has been confirmed, as it is used in testing.
>
> Source: [pom.xml#44](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/blob/main/pom.xml#L44)<br/>
> Updated: `2024-09-26`

- ### Are generated classes formatted with any formatter?
> Generated classes are **not** strictly formatted, but _closely_ resemble [google-java-format](https://github.com/google/google-java-format). However, due to the default `model.mustache`-template file, generated classes may have unused imports - which would not adhere to the format.
>
> Updated: `2024-09-26`
