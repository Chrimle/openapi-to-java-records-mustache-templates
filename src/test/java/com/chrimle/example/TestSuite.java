package com.chrimle.example;

import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;

public record TestSuite<DeprecatedExampleEnum extends Enum<DeprecatedExampleEnum>, ExampleEnum extends Enum<ExampleEnum>>(
    Class<DeprecatedExampleEnum> deprecatedExampleEnum,
    Class<?> deprecatedExampleRecord,
    Class<ExampleEnum> exampleEnum,
    Class<?> exampleRecord,
    Class<?> exampleRecordWithArrayFields,
    Class<?> exampleRecordWithBooleanFields,
    Class<?> exampleRecordWithDefaultFields,
    Class<?> exampleRecordWithExampleEnumFields,
    Class<?> exampleRecordWithExampleRecordFields,
    Class<?> exampleRecordWithIntegerFields,
    Class<?> exampleRecordWithNumberFields,
    Class<?> exampleRecordWithStringFields,
    boolean hasAdditionalModelTypeAnnotations,
    boolean hasAdditionalEnumTypeAnnotations,
    boolean useEnumCaseInsensitive,
    boolean serializableModel
) {

  public void assertModels() {
    GeneratedEnumTestUtils.assertExampleEnum(
        exampleEnum,
        hasAdditionalEnumTypeAnnotations,
        useEnumCaseInsensitive
    );
    GeneratedEnumTestUtils.assertDeprecatedExampleEnum(
        deprecatedExampleEnum,
        hasAdditionalEnumTypeAnnotations,
        useEnumCaseInsensitive
    );
    GeneratedRecordTestUtils.assertExampleRecord(
        exampleRecord,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertDeprecatedExampleRecord(
        deprecatedExampleRecord,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithBooleanFields(
        exampleRecordWithBooleanFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleEnumFields(
        exampleRecordWithExampleEnumFields,
        exampleEnum,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleRecordFields(
        exampleRecordWithExampleRecordFields,
        exampleRecord,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithIntegerFields(
        exampleRecordWithIntegerFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithNumberFields(
        exampleRecordWithNumberFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithStringFields(
        exampleRecordWithStringFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithArrayFields(
        exampleRecordWithArrayFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
    GeneratedRecordTestUtils.assertExampleRecordWithDefaultFields(
        exampleRecordWithDefaultFields,
        hasAdditionalModelTypeAnnotations,
        serializableModel
    );
  }
}
