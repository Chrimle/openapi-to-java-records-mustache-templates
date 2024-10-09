package com.chrimle.example.utils;

import com.chrimle.example.GeneratedField;
import com.chrimle.example.GeneratedSource;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Assertions;

/** Generalized Test-class for testing Generated Record-classes */
public class GeneratedRecordTestUtils {

  public static void assertRecord(final GeneratedSource generatedSource) {
    final Class<?>[] fieldClasses = generatedSource.fieldClasses();
    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    AssertionUtils.assertIsRecord(classUnderTest);
    AssertionUtils.assertClassIsAnnotatedAsDeprecated(
        classUnderTest, generatedSource.isDeprecated());
    AssertionUtils.assertClassIsAnnotatedWithAdditionalTypeAnnotations(
        classUnderTest, generatedSource.hasAdditionalModelTypeAnnotations());
    AssertionUtils.assertModelIsSerializable(generatedSource);
    AssertionUtils.assertRecordHasFieldsOfTypeWithNullableAnnotations(generatedSource);
    AssertionUtils.assertClassImplementsSerializable(generatedSource);
    AssertionUtils.assertRecordHasBuilderInnerClass(generatedSource);
    final Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, fieldClasses);

    // Asserting Nullable-fields are null if unset
    final Object objectWithFieldsSetToNull =
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest, constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
    Assertions.assertInstanceOf(classUnderTest, objectWithFieldsSetToNull);

    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      assertGeneratedField(generatedField, objectWithFieldsSetToNull);
    }
  }

  private static <T> void assertGeneratedField(GeneratedField<T> generatedField, Object object) {
    AssertionUtils.assertRecordFieldHasValue(
        object,
        generatedField.name(),
        generatedField
            .defaultValue()
            .or(
                () ->
                    generatedField.isNullable()
                        ? Optional.empty()
                        : getClassSpecificDefaultValue(generatedField.type()))
            .orElse(null));
  }

  private static <T> Optional<T> getClassSpecificDefaultValue(final Class<? extends T> fieldClass) {
    if (Arrays.class.equals(fieldClass)) {
      return Optional.of((T) Collections.emptyList());
    }
    if (Set.class.equals(fieldClass)) {
      return Optional.of((T) new LinkedHashSet<>());
    }
    if (List.class.equals(fieldClass)) {
      return Optional.of((T) new ArrayList<>());
    }
    return Optional.empty();
  }

  public static void assertExampleRecordWithDefaultFields(final GeneratedSource generatedSource) {

    final Class<?> classUnderTest = generatedSource.getClassUnderTest();

    assertRecord(generatedSource);

    final Constructor<?> constructor =
        AssertionUtils.assertRecordHasConstructor(classUnderTest, generatedSource.fieldClasses());

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest, constructor, (Object) null),
        generatedSource.generatedFields()[0].name(),
        generatedSource.generatedFields()[0].defaultValue().orElseThrow());

    AssertionUtils.assertRecordFieldHasValue(
        AssertionUtils.assertRecordInstantiateWithArgs(classUnderTest, constructor, "someValue"),
        generatedSource.generatedFields()[0].name(),
        "someValue");
  }
}
