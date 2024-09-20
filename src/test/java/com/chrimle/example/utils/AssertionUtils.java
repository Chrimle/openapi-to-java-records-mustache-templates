package com.chrimle.example.utils;

import java.io.Serializable;
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
    final Method method = assertClassHasMethod(classUnderTest, fieldName);

    final Object actualValue = Assertions.assertDoesNotThrow(
        () -> method.invoke(objectUnderTest),
        classUnderTest.getCanonicalName() + " could not invoke method: "
            + method.getName()
    );
    Assertions.assertEquals(expectedValue, actualValue);
  }

  public static void assertClassDoesNotHaveMethod(
      final Class<?> classUnderTest,
      final String methodName,
      final Class<?>... methodArgs
  ) {
    Assertions.assertThrows(
        NoSuchMethodException.class,
        () -> classUnderTest.getMethod(methodName, methodArgs),
        classUnderTest.getCanonicalName() + " unexpectedly has method: "
            + methodName + " with methodArgs: " + Arrays.toString(methodArgs)
    );
  }

  public static Method assertClassHasMethod(
      final Class<?> classUnderTest,
      final String methodName,
      final Class<?>... methodArgs
  ) {
    return Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredMethod(methodName, methodArgs),
        classUnderTest.getCanonicalName() + " does not have method: "
            + methodName + " with methodArgs: " + Arrays.toString(methodArgs));
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

  public static void assertClassImplementsSerializable(
      final Class<?> classUnderTest,
      final boolean isSerializableModel) {

    Assertions.assertEquals(
        isSerializableModel,
        Arrays.asList(classUnderTest.getInterfaces())
            .contains(Serializable.class)
    );
  }

  public static void assertRecordHasBuilderInnerClass(
      final Class<?> classUnderTest,
      final boolean generateBuilders,
      final Class<?>... fieldClasses) {
    // Assert Builder can be instantiated from constructor
    Arrays.stream(
            classUnderTest.getClasses())
        .filter(b -> "Builder".equals(b.getSimpleName()))
        .findFirst()
        .map(AssertionUtils::assertRecordHasConstructor)
        .map(constructor -> assertRecordInstantiateWithArgs(classUnderTest,
            constructor))
        .ifPresentOrElse(
            object -> assertRecordHasFieldsOfType(
                object.getClass(),
                false,
                fieldClasses),
            () -> Assertions.assertFalse(generateBuilders));
    // Assert Builder can be instantiated from builder()-method
    if (generateBuilders) {
      final Method builderMethod = assertClassHasMethod(classUnderTest,
          "builder");
      final Object builderObject = Assertions.assertDoesNotThrow(
          () -> builderMethod.invoke(null)
      );
      Assertions.assertNotNull(builderObject);
      for (int i = 1; i <= fieldClasses.length; i++) {
        final String fieldBuilderMethodName = "field" + i;
        final Class<?> fieldClass = fieldClasses[i - 1];
        final Method fieldBuilderMethod = Assertions.assertDoesNotThrow(
            () -> builderObject.getClass()
                .getDeclaredMethod(fieldBuilderMethodName, fieldClass)
        );
        final Object object = Assertions.assertDoesNotThrow(
            () -> fieldBuilderMethod.invoke(builderObject, (Object) null)
        );
        Assertions.assertEquals(builderObject, object);
      }
      final Method buildMethod = AssertionUtils.assertClassHasMethod(
          builderObject.getClass(), "build");
      final Object classObject = Assertions.assertDoesNotThrow(
          () -> buildMethod.invoke(builderObject)
      );
      Assertions.assertNotNull(classObject);
      Assertions.assertInstanceOf(classUnderTest, classObject);
    } else {
      assertClassDoesNotHaveMethod(classUnderTest, "builder");
    }
  }
}
