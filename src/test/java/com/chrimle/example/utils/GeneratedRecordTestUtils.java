package com.chrimle.example.utils;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Assertions;

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

    final Constructor<?> constructor = Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredConstructor(String.class, String.class),
        classUnderTest.getCanonicalName() + " did not have expected constructor!"
    );

    final String expectedCustomValue = "someValue";

    final Object objectWithDefaultValue = Assertions.assertDoesNotThrow(
        () -> constructor.newInstance("ignore", null),
        classUnderTest.getCanonicalName() + " could not be instantiated!"
    );

    final String field2WithDefaultValue = (String) Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredMethod("field2")
            .invoke(objectWithDefaultValue),
        classUnderTest.getCanonicalName()
            + " could not invoke .field2()-method!");

    Assertions.assertEquals("someDefaultValue", field2WithDefaultValue,
        classUnderTest.getCanonicalName() + " field2 default-value was NOT used!");

    final Object objectWithCustomValue = Assertions.assertDoesNotThrow(
        () -> constructor.newInstance("ignore", expectedCustomValue),
        classUnderTest.getCanonicalName() + " could not be instantiated!"
    );

    final String field2WithCustomValue = (String) Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredMethod("field2")
            .invoke(objectWithCustomValue),
        classUnderTest.getCanonicalName()
            + " could not invoke .field2()-method!");

    Assertions.assertEquals(expectedCustomValue, field2WithCustomValue,
        classUnderTest.getCanonicalName() + " field2 default-value WAS used!");

    final Object objectWithNullableField = Assertions.assertDoesNotThrow(
        () -> constructor.newInstance(null, null),
        classUnderTest.getCanonicalName() + " could not be instantiated!"
    );

    final String field1WithNull = (String) Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredMethod("field1")
            .invoke(objectWithNullableField),
        classUnderTest.getCanonicalName()
            + " could not invoke .field1()-method!");

    Assertions.assertNull(field1WithNull, classUnderTest.getCanonicalName()
        + " nullable field 'field1' was NOT null!");

  }

}
