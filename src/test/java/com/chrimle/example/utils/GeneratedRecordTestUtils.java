package com.chrimle.example.utils;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Generalized Test-class for testing Generated Record-classes
 */
public class GeneratedRecordTestUtils {

  public static void assertRecord(
      final Class<?> classUnderTest,
      final boolean isDeprecated,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders,
      final Class<?>... fieldClasses) {
    AssertionUtils.assertIsRecord(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(classUnderTest,
        isDeprecated);
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, hasAdditionalTypeAnnotations);
    AssertionUtils.assertModelIsSerializable(classUnderTest,
        isSerializableModel);
    AssertionUtils.assertRecordHasFieldsOfType(classUnderTest,
        isSerializableModel, fieldClasses);
    AssertionUtils.assertClassImplementsSerializable(classUnderTest,
        isSerializableModel);
    AssertionUtils.assertRecordHasBuilderInnerClass(classUnderTest,
        generateBuilders, fieldClasses);
    Constructor<?> constructor = AssertionUtils.assertRecordHasConstructor(classUnderTest,
        fieldClasses);
    AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest,
        constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
  }

  public static void assertExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        Boolean.class
    );
  }

  public static void assertDeprecatedExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders
  ) {
    assertRecord(
        classUnderTest,
        true,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        Boolean.class
    );
  }

  public static void assertExampleRecordWithDefaultFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalModelTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalModelTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        String.class,
        String.class
    );

    final Constructor<?> constructor = AssertionUtils.assertRecordHasConstructor(
        classUnderTest, String.class, String.class);

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest,
            constructor,
            null,
            null
        ),
        "field1",
        null
    );

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest,
            constructor,
            "ignore",
            null
        ),
        "field2",
        "someDefaultValue"
    );

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest,
            constructor,
            "ignore",
            "someValue"
        ),
        "field2",
        "someValue"
    );
  }

  public static void assertExampleRecordWithRequiredFieldsOfEachType(
      final Class<?> classUnderTest,
      final Class<?> recordClass,
      final Class<?> enumClass,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel,
      final boolean generateBuilders) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        generateBuilders,
        Boolean.class,
        String.class,
        Integer.class,
        BigDecimal.class,
        List.class,
        Set.class,
        recordClass,
        enumClass
    );
  }
}
