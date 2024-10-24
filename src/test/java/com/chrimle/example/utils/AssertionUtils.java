package com.chrimle.example.utils;

import com.chrimle.example.GeneratedField;
import com.chrimle.example.GeneratedSource;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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

    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
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

    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
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

      if (generatedSource.useBeanValidation()) {
        final Class<NotNull> notNullAnnotation = NotNull.class;
        if (generatedField.isBeanValidationNullable()) {
          assertDoesNotHaveAnnotation(classUnderTest, field, notNullAnnotation);
        } else {
          assertHasAnnotation(classUnderTest, field, notNullAnnotation);
        }
        final Class<Pattern> patternAnnotation = Pattern.class;
        if (generatedField.pattern().isPresent()) {
          final Pattern actualPatternAnnotation =
              assertHasAnnotation(classUnderTest, field, patternAnnotation);
          Assertions.assertEquals(generatedField.pattern().get(), actualPatternAnnotation.regexp());
        } else {
          assertDoesNotHaveAnnotation(classUnderTest, field, patternAnnotation);
        }
        final Class<Size> sizeAnnotation = Size.class;
        if (generatedField.minLength().isPresent() || generatedField.maxLength().isPresent()) {
          final Size actualSizeAnnotation =
              assertHasAnnotation(classUnderTest, field, sizeAnnotation);
          Assertions.assertEquals(generatedField.minLength().orElse(0), actualSizeAnnotation.min());
          Assertions.assertEquals(
              generatedField.maxLength().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
        } else if (generatedField.minItems().isPresent() || generatedField.maxItems().isPresent()) {
          final Size actualSizeAnnotation =
              assertHasAnnotation(classUnderTest, field, sizeAnnotation);
          Assertions.assertEquals(generatedField.minItems().orElse(0), actualSizeAnnotation.min());
          Assertions.assertEquals(
              generatedField.maxItems().orElse(Integer.MAX_VALUE), actualSizeAnnotation.max());
        } else {
          assertDoesNotHaveAnnotation(classUnderTest, field, sizeAnnotation);
        }
        final Class<Min> minAnnotation = Min.class;
        if (generatedField.minimum().isPresent()) {
          final Min min = assertHasAnnotation(classUnderTest, field, minAnnotation);
          Assertions.assertEquals(generatedField.minimum().get(), min.value());
        } else {
          assertDoesNotHaveAnnotation(classUnderTest, field, minAnnotation);
        }
        final Class<Max> maxAnnotation = Max.class;
        if (generatedField.maximum().isPresent()) {
          final Max max = assertHasAnnotation(classUnderTest, field, maxAnnotation);
          Assertions.assertEquals(generatedField.maximum().get(), max.value());
        } else {
          assertDoesNotHaveAnnotation(classUnderTest, field, maxAnnotation);
        }
        final Class<DecimalMin> decimalMinAnnotation = DecimalMin.class;
        if (generatedField.decimalMin().isPresent()) {
          final DecimalMin decimalMin =
              assertHasAnnotation(classUnderTest, field, decimalMinAnnotation);
          Assertions.assertEquals(generatedField.decimalMin().get(), decimalMin.value());
        } else {
          assertDoesNotHaveAnnotation(classUnderTest, field, decimalMinAnnotation);
        }
        final Class<DecimalMax> decimalMaxAnnotation = DecimalMax.class;
        if (generatedField.decimalMax().isPresent()) {
          final DecimalMax decimalMax =
              assertHasAnnotation(classUnderTest, field, decimalMaxAnnotation);
          Assertions.assertEquals(generatedField.decimalMax().get(), decimalMax.value());
        } else {
          assertDoesNotHaveAnnotation(classUnderTest, field, decimalMaxAnnotation);
        }
      }
    }
  }

  private static <T extends Annotation> T assertHasAnnotation(
      final Class<?> classUnderTest,
      final AnnotatedElement annotatedElement,
      final Class<T> annotation) {
    T actualAnnotation = annotatedElement.getAnnotation(annotation);
    Assertions.assertNotNull(
        actualAnnotation,
        classUnderTest.getCanonicalName()
            + "'s field "
            + annotatedElement
            + " is not annotated with "
            + annotation.getCanonicalName());
    return actualAnnotation;
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

  public static void assertInstanceMethodReturns(
      final Object objectUnderTest, final String methodName, final Object expectedValue) {
    final Class<?> classUnderTest = objectUnderTest.getClass();
    final Method method = assertClassHasMethod(classUnderTest, methodName);

    final Object actualValue =
        Assertions.assertDoesNotThrow(
            () -> method.invoke(objectUnderTest),
            classUnderTest.getCanonicalName() + " could not invoke method: " + method.getName());
    Assertions.assertEquals(
        expectedValue,
        actualValue,
        classUnderTest.getCanonicalName() + " method '" + methodName + "' has unexpected value");
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
      for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
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
