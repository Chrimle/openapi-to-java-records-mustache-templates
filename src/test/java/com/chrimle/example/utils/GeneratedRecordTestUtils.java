package com.chrimle.example.utils;

import com.chrimle.example.GeneratedField;
import com.chrimle.example.GeneratedSource;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
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
    final Object objectWithNullFields =
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest, constructor, Arrays.stream(fieldClasses).map(x -> null).toArray());
    Assertions.assertInstanceOf(classUnderTest, objectWithNullFields);

    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      assertFieldHasEitherNullOrDefaultValueSet(generatedField, objectWithNullFields);
    }

    // Asserting fields are not null when set
    final Object objectWithNonNullFields =
        AssertionUtils.assertRecordInstantiateWithArgs(
            classUnderTest,
            constructor,
            Arrays.stream(fieldClasses)
                .map(GeneratedRecordTestUtils::getClassSpecificTestingValue)
                .map(o -> o.orElse(null))
                .toArray());
    Assertions.assertInstanceOf(classUnderTest, objectWithNonNullFields);

    for (GeneratedField<?> generatedField : generatedSource.generatedFields()) {
      assertFieldHasTestingValueSet(generatedField, objectWithNonNullFields);
    }
  }

  private static <T> void assertFieldHasEitherNullOrDefaultValueSet(
      GeneratedField<T> generatedField, Object object) {
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

  private static <T> void assertFieldHasTestingValueSet(
      GeneratedField<T> generatedField, Object object) {
    AssertionUtils.assertRecordFieldHasValue(
        object,
        generatedField.name(),
        getClassSpecificTestingValue(generatedField.type()).orElse(null));
  }

  /**
   * Returns the default value for the given class, according to openapi-generator-maven-plugin.
   *
   * @param fieldClass to get the default value for
   * @return the default value
   * @param <T> type of the class
   */
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

  /**
   * Returns a testing value (pure) for the given class.
   *
   * @param fieldClass to get a testing value for
   * @return the testing value
   * @param <T> type of the class
   */
  private static <T> Optional<T> getClassSpecificTestingValue(final Class<? extends T> fieldClass) {
    if (Boolean.class.equals(fieldClass)) {
      return Optional.of((T) Boolean.TRUE);
    }
    if (String.class.equals(fieldClass)) {
      return Optional.of((T) "testString");
    }
    if (Integer.class.equals(fieldClass)) {
      return Optional.of((T) Integer.valueOf(42));
    }
    if (BigDecimal.class.equals(fieldClass)) {
      return Optional.of((T) BigDecimal.valueOf(123.456));
    }
    if (List.class.equals(fieldClass)) {
      return Optional.of((T) new ArrayList<>(List.of(Boolean.TRUE, Boolean.FALSE)));
    }
    if (Set.class.equals(fieldClass)) {
      return Optional.of((T) new LinkedHashSet<>(List.of(Boolean.TRUE, Boolean.FALSE)));
    }
    return Optional.empty();
  }
}
