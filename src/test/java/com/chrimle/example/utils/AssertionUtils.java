package com.chrimle.example.utils;

import com.chrimle.example.GeneratedField;
import com.chrimle.example.GeneratedSource;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public class AssertionUtils {

  public static void assertIsRecord(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isRecord(), clazz.getCanonicalName() + " is NOT a record class!");
  }

  public static void assertIsEnum(final Class<?> clazz) {
    Assertions.assertTrue(clazz.isEnum(), clazz.getCanonicalName() + " is NOT an enum class!");
  }

  public static void assertClassIsAnnotatedWithAdditionalTypeAnnotations(
      final Class<?> classUnderTest, final boolean hasAdditionalTypeAnnotations) {
    assertClassIsAnnotatedWith(
        classUnderTest,
        com.chrimle.example.annotations.TestAnnotationOne.class,
        hasAdditionalTypeAnnotations);
    assertClassIsAnnotatedWith(
        classUnderTest,
        com.chrimle.example.annotations.TestAnnotationTwo.class,
        hasAdditionalTypeAnnotations);
    assertClassIsAnnotatedWith(
        classUnderTest,
        com.chrimle.example.annotations.TestAnnotationThree.class,
        hasAdditionalTypeAnnotations);
  }

  public static void assertClassIsAnnotatedAsDeprecated(
      final Class<?> classUnderTest, final boolean isDeprecated) {
    assertClassIsAnnotatedWith(classUnderTest, Deprecated.class, isDeprecated);
  }

  private static void assertClassIsAnnotatedWith(
      final Class<?> classUnderTest, final Class<?> annotation, final boolean hasAnnotation) {
    if (hasAnnotation) {
      assertClassIsAnnotatedWith(classUnderTest, annotation);
    } else {
      assertClassIsNotAnnotatedWith(classUnderTest, annotation);
    }
  }

  private static void assertClassIsAnnotatedWith(final Class<?> clazz, final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .anyMatch(aClass -> aClass.equals(annotation)),
        clazz.getCanonicalName() + " is NOT annotated with " + annotation.getCanonicalName());
  }

  private static void assertClassIsNotAnnotatedWith(
      final Class<?> clazz, final Class<?> annotation) {
    Assertions.assertTrue(
        Arrays.stream(clazz.getAnnotations())
            .map(Annotation::annotationType)
            .noneMatch(aClass -> aClass.equals(annotation)),
        clazz.getCanonicalName() + " IS annotated with " + annotation.getCanonicalName());
  }

  public static void assertRecordHasFieldsOfType(final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    Assertions.assertEquals(
        generatedSource.generatedFields().length + (generatedSource.serializableModel() ? 1 : 0),
        classUnderTest.getDeclaredFields().length,
        classUnderTest.getCanonicalName() + " does not have the expected number of fields!");

    for (GeneratedField generatedField : generatedSource.generatedFields()) {
      assertRecordHasField(classUnderTest, generatedField.name(), generatedField.type());
    }
  }

  public static void assertRecordHasFieldsOfTypeWithNullableAnnotations(
      final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    Assertions.assertEquals(
        generatedSource.generatedFields().length + (generatedSource.serializableModel() ? 1 : 0),
        classUnderTest.getDeclaredFields().length,
        classUnderTest.getCanonicalName() + " does not have the expected number of fields!");

    for (GeneratedField generatedField : generatedSource.generatedFields()) {
      final Field field =
          assertRecordHasField(classUnderTest, generatedField.name(), generatedField.type());

      // Jakarta or JavaX ?
      final Class<? extends Annotation> nullableAnnotation =
          generatedSource.useJakartaEe()
              ? jakarta.annotation.Nullable.class
              : javax.annotation.Nullable.class;
      final Class<? extends Annotation> nonNullAnnotation =
          generatedSource.useJakartaEe()
              ? jakarta.annotation.Nonnull.class
              : javax.annotation.Nonnull.class;

      // Nullable or NonNull expected?
      final Class<? extends Annotation> expectedAnnotation =
          generatedField.isNullable() ? nullableAnnotation : nonNullAnnotation;

      final Class<? extends Annotation> unexpectedAnnotation =
          generatedField.isNullable() ? nonNullAnnotation : nullableAnnotation;

      assertHasAnnotation(classUnderTest, field, expectedAnnotation);
      assertDoesNotHaveAnnotation(classUnderTest, field, unexpectedAnnotation);
    }
  }

  private static <T extends Annotation> void assertHasAnnotation(
      final Class<?> classUnderTest,
      final AnnotatedElement annotatedElement,
      final Class<T> annotation) {
    Assertions.assertNotNull(
        annotatedElement.getAnnotation(annotation),
        classUnderTest.getCanonicalName()
            + "'s field "
            + annotatedElement
            + " is not annotated with "
            + annotation.getCanonicalName());
  }

  private static <T extends Annotation> void assertDoesNotHaveAnnotation(
      final Class<?> classUnderTest,
      final AnnotatedElement annotatedElement,
      final Class<T> annotation) {
    Assertions.assertNull(
        annotatedElement.getAnnotation(annotation),
        classUnderTest.getCanonicalName()
            + "'s field "
            + annotatedElement
            + " is annotated with "
            + annotation.getCanonicalName());
  }

  public static void assertModelIsSerializable(final GeneratedSource generatedSource) {
    if (generatedSource.serializableModel()) {
      assertRecordHasField(generatedSource.getClassUnderTest(), "serialVersionUID", long.class);
    } else {
      assertRecordDoesNotHaveField(generatedSource.getClassUnderTest(), "serialVersionUID");
    }
  }

  public static Object assertRecordInstantiateWithArgs(
      final Class<?> classUnderTest,
      final Constructor<?> constructorUnderTest,
      final Object... constructorArgs) {
    return Assertions.assertDoesNotThrow(
        () -> constructorUnderTest.newInstance(constructorArgs),
        classUnderTest.getCanonicalName()
            + " could not be instantiated with constructorArgs: "
            + Arrays.toString(constructorArgs));
  }

  public static Constructor<?> assertRecordHasConstructor(
      final Class<?> classUnderTest, final Class<?>... constructorArgs) {
    return Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredConstructor(constructorArgs),
        classUnderTest.getCanonicalName()
            + " does not have the expected constructor with arguments: "
            + Arrays.toString(constructorArgs));
  }

  public static void assertRecordFieldHasValue(
      final Object objectUnderTest, final String fieldName, final Object expectedValue) {
    final Class<?> classUnderTest = objectUnderTest.getClass();
    final Method method = assertClassHasMethod(classUnderTest, fieldName);

    final Object actualValue =
        Assertions.assertDoesNotThrow(
            () -> method.invoke(objectUnderTest),
            classUnderTest.getCanonicalName() + " could not invoke method: " + method.getName());
    Assertions.assertEquals(expectedValue, actualValue);
  }

  public static void assertClassDoesNotHaveMethod(
      final Class<?> classUnderTest, final String methodName, final Class<?>... methodArgs) {
    Assertions.assertThrows(
        NoSuchMethodException.class,
        () -> classUnderTest.getMethod(methodName, methodArgs),
        classUnderTest.getCanonicalName()
            + " unexpectedly has method: "
            + methodName
            + " with methodArgs: "
            + Arrays.toString(methodArgs));
  }

  public static Method assertClassHasMethod(
      final Class<?> classUnderTest, final String methodName, final Class<?>... methodArgs) {
    return Assertions.assertDoesNotThrow(
        () -> classUnderTest.getDeclaredMethod(methodName, methodArgs),
        classUnderTest.getCanonicalName()
            + " does not have method: "
            + methodName
            + " with methodArgs: "
            + Arrays.toString(methodArgs));
  }

  private static void assertRecordDoesNotHaveField(
      final Class<?> classUnderTest, final String fieldName) {
    Assertions.assertThrows(
        NoSuchFieldException.class,
        () -> classUnderTest.getDeclaredField(fieldName),
        classUnderTest.getCanonicalName() + " unexpectedly has the field: " + fieldName);
  }

  private static Field assertRecordHasField(
      final Class<?> classUnderTest, final String fieldName, final Class<?> fieldType) {
    final Field field =
        Assertions.assertDoesNotThrow(
            () -> classUnderTest.getDeclaredField(fieldName),
            classUnderTest.getCanonicalName() + " does not have the field: " + fieldName);

    Assertions.assertEquals(fieldType, field.getType());

    return field;
  }

  public static void assertClassImplementsSerializable(final GeneratedSource generatedSource) {
    Assertions.assertEquals(
        generatedSource.serializableModel(),
        Arrays.asList(generatedSource.getClassUnderTest().getInterfaces())
            .contains(Serializable.class));
  }

  public static void assertRecordHasBuilderInnerClass(final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    // Assert Builder can be instantiated from constructor
    Arrays.stream(classUnderTest.getClasses())
        .filter(b -> "Builder".equals(b.getSimpleName()))
        .findFirst()
        .map(AssertionUtils::assertRecordHasConstructor)
        .map(constructor -> assertRecordInstantiateWithArgs(classUnderTest, constructor))
        .ifPresentOrElse(
            object -> assertRecordHasFieldsOfType(generatedSource),
            () -> Assertions.assertFalse(generatedSource.generateBuilders()));
    // Assert Builder can be instantiated from builder()-method
    if (generatedSource.generateBuilders()) {
      final Method builderMethod = assertClassHasMethod(classUnderTest, "builder");
      final Object builderObject = Assertions.assertDoesNotThrow(() -> builderMethod.invoke(null));
      Assertions.assertNotNull(builderObject);
      for (GeneratedField generatedField : generatedSource.generatedFields()) {
        final String fieldBuilderMethodName = generatedField.name();
        final Class<?> fieldClass = generatedField.type();
        final Method fieldBuilderMethod =
            Assertions.assertDoesNotThrow(
                () ->
                    builderObject.getClass().getDeclaredMethod(fieldBuilderMethodName, fieldClass));
        final Object object =
            Assertions.assertDoesNotThrow(
                () -> fieldBuilderMethod.invoke(builderObject, (Object) null));
        Assertions.assertEquals(builderObject, object);
      }
      final Method buildMethod =
          AssertionUtils.assertClassHasMethod(builderObject.getClass(), "build");
      final Object classObject =
          Assertions.assertDoesNotThrow(() -> buildMethod.invoke(builderObject));
      Assertions.assertNotNull(classObject);
      Assertions.assertInstanceOf(classUnderTest, classObject);
    } else {
      assertClassDoesNotHaveMethod(classUnderTest, "builder");
    }
  }

  public static Class<?> assertClassExists(final String canonicalClassName) {
    return Assertions.assertDoesNotThrow(() -> Class.forName(canonicalClassName));
  }
}
