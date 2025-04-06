> [More detailed description of the change] [Considerations, Context or Clarifications] [Semantic version reasoning or stress **internal refactoring**]

## Checklist
*Each item in the list MUST either be checked ([x]) or crossed off (`~`).*
- [ ] Closes #
- [ ] New Release?
  - [ ] Update `<version>` in `pom.xml`
        <p>To update the project version, run the following command locally: `mvn versions:set -DnewVersion=`
  - [ ] Update `<version>` in `README.md` and `index.md`
        <p>Manually update the project version in documentation files.
- [ ] Compile the project with `mvn clean install`
- [ ] Commit all new/changed/deleted `generated-sources`-files
- [ ] Documentation (`README.md` & `index.md`) have been updated
