[# Security Policy

## Supported Versions

| Version |     Supported      |
|:-------:|:------------------:|
|   3.x   | :white_check_mark: |
|   2.x   | :white_check_mark: |
|  < 2.0  |        :x:         |

## Reporting a Vulnerability
> [!CAUTION]
> If you discover a potential security vulnerability within the `.mustache` templates of this project, please do not use the public issue tracker. Instead, follow these steps:

1. **Private Disclosure**: Please report vulnerabilities by [opening a Draft Security Advisory](https://github.com/Chrimle/openapi-to-java-records-mustache-templates/security/advisories/new) on GitHub.
   > [!NOTE]
   > This allows for a private conversation between you and the maintainer.
2. **Response Time**: You can expect an initial acknowledgement of your report within 48–72 hours.
3. **Disclosure Process**: Once a fix is ready and a new version is published, a public security advisory will be released to credit your discovery and notify the community.

## Security Best Practices
Since these templates are used for code generation, users should adhere to the following:
- **Sanitize OpenAPI Specs**: Ensure your source OpenAPI specification files are from a trusted source.
- **Dependency Management**: Use Dependabot or similar tools to stay updated with the latest template versions.
  > [!CAUTION]
  > Only retrieve these `.mustache` templates from **Official Sources**!
  > * GitHub Packages
  > * Maven Central
- **Review Generated Code**: Always perform a quick sanity check or automated scan on the generated Java records to ensure they meet your organization's security standards.
  > [!CAUTION]
  > **ALWAYS** secure that _input_-files (such as `.mustache` files) are authentic, that no _unexpected_ files are downloaded and/or retrieved, and only trusted files are used for code generation.