package com.chrimle.example;

import com.chrimle.example.utils.AssertionUtils;
import com.chrimle.example.utils.GeneratedClass;
import com.chrimle.example.utils.GeneratedEnumTestUtils;
import com.chrimle.example.utils.GeneratedRecordTestUtils;
import com.chrimle.example.utils.PluginExecution;

public record TestSuite(
    boolean hasAdditionalModelTypeAnnotations,
    boolean hasAdditionalEnumTypeAnnotations,
    boolean useEnumCaseInsensitive,
    boolean serializableModel,
    boolean generateBuilders,
    PluginExecution pluginExecution
) {

  public void assertModels() {

    GeneratedEnumTestUtils.assertExampleEnum(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(GeneratedClass.EXAMPLE_ENUM)
        ),
        hasAdditionalEnumTypeAnnotations,
        useEnumCaseInsensitive
    );
    GeneratedEnumTestUtils.assertDeprecatedExampleEnum(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(GeneratedClass.DEPRECATED_EXAMPLE_ENUM)
        ),
        hasAdditionalEnumTypeAnnotations,
        useEnumCaseInsensitive
    );
    GeneratedRecordTestUtils.assertExampleRecord(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(GeneratedClass.EXAMPLE_RECORD)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertDeprecatedExampleRecord(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(GeneratedClass.DEPRECATED_EXAMPLE_RECORD)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithBooleanFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_BOOLEAN_FIELDS)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleEnumFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_EXAMPLE_ENUM_FIELDS)
        ),
        AssertionUtils.assertClassExists(
            getCanonicalClassName(GeneratedClass.EXAMPLE_ENUM)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithExampleRecordFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_EXAMPLE_RECORD_FIELDS)
        ),
        AssertionUtils.assertClassExists(
            getCanonicalClassName(GeneratedClass.EXAMPLE_RECORD)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithIntegerFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_INTEGER_FIELDS)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithNumberFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_NUMBER_FIELDS)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithStringFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_STRING_FIELDS)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithArrayFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_ARRAY_FIELDS)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithSetFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(GeneratedClass.EXAMPLE_RECORD_WITH_SET_FIELDS)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
    GeneratedRecordTestUtils.assertExampleRecordWithDefaultFields(
        AssertionUtils.assertClassExists(
            getCanonicalClassName(
                GeneratedClass.EXAMPLE_RECORD_WITH_DEFAULT_FIELDS)
        ),
        hasAdditionalModelTypeAnnotations,
        serializableModel,
        generateBuilders
    );
  }

  private String getCanonicalClassName(final GeneratedClass generatedClass) {
    return generatedClass.getCanonicalClassName(
        pluginExecution.getPackageName());
  }

}
