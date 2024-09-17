package com.chrimle.example.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

  public static void assertIsRecord(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isRecord(),
        clazz.getCanonicalName() + " is NOT a record class!");
  }

  public static void assertIsEnum(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isEnum(),
        clazz.getCanonicalName() + " is NOT an enum class!");
  }

  public static void assertClassIsAnnotatedWithAdditionalTypeAnnotations(
      final Class<?> classUnderTest,
      final boolean hasAdditionalTypeAnnotations) {
    assertClassIsAnnotatedWith(classUnderTest,
        com.chrimle.example.annotations.TestAnnotationOne.class,
        hasAdditionalTypeAnnotations);
    assertClassIsAnnotatedWith(classUnderTest,
        com.chrimle.example.annotations.TestAnnotationTwo.class,
        hasAdditionalTypeAnnotations);
    assertClassIsAnnotatedWith(classUnderTest,
        com.chrimle.example.annotations.TestAnnotationThree.class,
        hasAdditionalTypeAnnotations);

  }

  public static void assertClassIsAnnotatedAsDeprecated(
      final Class<?> classUnderTest, final boolean isDeprecated) {
    assertClassIsAnnotatedWith(classUnderTest, Deprecated.class, isDeprecated);
  }

  private static void assertClassIsAnnotatedWith(final Class<?> classUnderTest,
      final Class<?> annotation, final boolean hasAnnotation) {
    if (hasAnnotation) {
      assertClassIsAnnotatedWith(classUnderTest, annotation);
    } else {
      assertClassIsNotAnnotatedWith(classUnderTest, annotation);
    }
  }


  private static void assertClassIsAnnotatedWith(final Class<?> clazz,
      final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .anyMatch(aClass -> aClass.equals(annotation)),
        clazz.getCanonicalName() + " is NOT annotated with "
            + annotation.getCanonicalName()
    );
  }

  private static void assertClassIsNotAnnotatedWith(final Class<?> clazz,
      final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .noneMatch(aClass -> aClass.equals(annotation)),
        clazz.getCanonicalName() + " IS annotated with "
            + annotation.getCanonicalName()
    );
  }

  public static void assertRecordHasFieldsOfType(final Class<?> classUnderTest,
      final boolean isModelSerializable,
      final Class<?>... fieldClasses) {

    Assertions.assertEquals(fieldClasses.length + (isModelSerializable ? 1 : 0),
        classUnderTest.getDeclaredFields().length,
        classUnderTest.getCanonicalName()
            + " does not have the expected number of fields!");

    for (int i = 1; i <= fieldClasses.length; i++) {
      final String fieldName = "field" + i;
      assertRecordHasField(
          classUnderTest,
          fieldName,
          fieldClasses[i - 1]
      );
    }
  }


  public static void assertModelIsSerializable(final Class<?> classUnderTest,
      final boolean isModelSerializable) {
    if (isModelSerializable) {
      assertRecordHasField(
          classUnderTest,
          "serialVersionUID",
          long.class
      );
    } else {
      assertRecordDoesNotHaveField(
          classUnderTest,
          "serialVersionUID"
      );
    }
  }

  public static Object assertRecordInstantiateWithArgs(
      final Class<?> classUnderTest,
      final Constructor<?> constructorUnderTest,
      final Object... constructorArgs
  ) {
    return Assertions.assertDoesNotThrow(
        () -> constructorUnderTest.newInstance(constructorArgs),
        classUnderTest.getCanonicalName()
            + " could not be instantiated with constructorArgs: "
            + Arrays.toString(constructorArgs)
    );
  }

  public static Constructor<?> assertRecordHasConstructor(
      final Class<?> classUnderTest,
      final Class<?>... constructorArgs
  ) {
    return Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredConstructor(constructorArgs),
        classUnderTest.getCanonicalName()
            + " does not have the expected constructor with arguments: "
            + Arrays.toString(constructorArgs)
    );
  }

  public static void assertRecordFieldHasValue(
      final Object objectUnderTest,
      final String fieldName,
      final Object expectedValue
  ) {
    final Class<?> classUnderTest = objectUnderTest.getClass();
    final Method method = Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredMethod(fieldName),
        classUnderTest.getCanonicalName() + " does not have method: "
            + fieldName
    );

    final Object actualValue = Assertions.assertDoesNotThrow(
        () -> method.invoke(objectUnderTest),
        classUnderTest.getCanonicalName() + " could not invoke method: "
            + method.getName()
    );
    Assertions.assertEquals(expectedValue, actualValue);
  }

  private static void assertRecordDoesNotHaveField(
      final Class<?> classUnderTest,
      final String fieldName
  ) {
    Assertions.assertThrows(NoSuchFieldException.class,
        () -> classUnderTest.getDeclaredField(fieldName),
        classUnderTest.getCanonicalName() + " unexpectedly has the field: "
            + fieldName
    );
  }


  private static void assertRecordHasField(
      final Class<?> classUnderTest,
      final String fieldName,
      final Class<?> fieldType
  ) {
    final Field field = Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredField(fieldName),
        classUnderTest.getCanonicalName() + " does not have the field: "
            + fieldName
    );

    Assertions.assertEquals(fieldType, field.getType());
  }

}
