package com.chrimle.example.utils;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
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
  }

  public static void assertExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Boolean.class
    );
  }

  public static void assertDeprecatedExampleRecord(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        true,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Boolean.class
    );
  }

  public static void assertExampleRecordWithArrayFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        List.class,
        List.class,
        List.class
    );
  }

  public static void assertExampleRecordWithBooleanFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Boolean.class,
        Boolean.class,
        Boolean.class
    );
  }

  public static void assertExampleRecordWithNumberFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        BigDecimal.class,
        BigDecimal.class,
        BigDecimal.class
    );
  }

  public static void assertExampleRecordWithStringFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        String.class,
        String.class,
        String.class
    );
  }

  public static void assertExampleRecordWithIntegerFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Integer.class,
        Integer.class,
        Integer.class
    );
  }

  public static <E extends Enum<E>> void assertExampleRecordWithExampleEnumFields(
      final Class<?> classUnderTest,
      final Class<E> enumClass,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        enumClass,
        enumClass,
        enumClass
    );
  }

  public static void assertExampleRecordWithExampleRecordFields(
      final Class<?> classUnderTest,
      final Class<?> subClass,
      final boolean hasAdditionalModelTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalModelTypeAnnotations,
        isSerializableModel,
        subClass,
        subClass,
        subClass
    );
  }

  public static void assertExampleRecordWithDefaultFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalModelTypeAnnotations,
      final boolean isSerializableModel
  ) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalModelTypeAnnotations,
        isSerializableModel,
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

  public static void assertExampleRecordWithSetFields(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations,
      final boolean isSerializableModel) {
    assertRecord(
        classUnderTest,
        false,
        hasAdditionalTypeAnnotations,
        isSerializableModel,
        Set.class,
        Set.class,
        Set.class
    );
  }
}
