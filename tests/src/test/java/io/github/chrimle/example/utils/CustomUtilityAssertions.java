package io.github.chrimle.example.utils;

import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;

/**
 * Collection of general utility assertion methods, which complements {@link Assertions}.
 *
 * @since 2.5.3
 * @apiNote Complements {@link Assertions} by overloading select methods with {@link Supplier}s as
 *     method parameters, as well as returning the value being asserted - for method
 *     chaining/nesting.
 * @implSpec This is a <b>sealed class</b> and must thus only be <i>extended</i> by other
 *     <i>Assertion</i>-classes, which should also benefit from extending this class.
 * @implNote This class should only contain Assertion-methods which complements {@link Assertions}
 *     and should be as <i>generic</i> as possible.
 */
public sealed class CustomUtilityAssertions permits CustomAssertions {

  protected CustomUtilityAssertions() {}

  /**
   * Asserts that the {@code objectSupplier} returns an {@link Object} which is {@code null}.
   *
   * @param objectSupplier of the object to be asserted.
   * @param messageSupplier for the assertion message.
   * @param <T> the type of the object.
   * @since 2.5.3
   */
  public static <T> void assertNull(
      final Supplier<T> objectSupplier, final Supplier<String> messageSupplier) {
    Assertions.assertNull(objectSupplier.get(), messageSupplier);
  }

  /**
   * Asserts that the {@code object} is not {@code null}.
   *
   * @param object to be asserted.
   * @param messageSupplier for the assertion message.
   * @param <T> type of the {@code object}.
   * @return the {@code object} if it is not {@code null}.
   * @since 2.5.3
   */
  public static <T> T assertNotNull(final T object, final Supplier<String> messageSupplier) {
    Assertions.assertNotNull(object, messageSupplier);
    return object;
  }

  /**
   * Asserts that the {@code objectSupplier} returns an {@link Object} which is not {@code null}.
   *
   * @param objectSupplier of the object to be asserted.
   * @param messageSupplier for the assertion message.
   * @param <T> the type of the object.
   * @return the object if it is not {@code null}.
   * @since 2.5.3
   */
  public static <T> T assertNotNull(
      final Supplier<T> objectSupplier, final Supplier<String> messageSupplier) {
    return assertNotNull(objectSupplier.get(), messageSupplier);
  }

  /**
   * Asserts that the {@code actualSupplier} returns an object which is <i>equal</i> to {@code
   * expected}.
   *
   * @param expected value to be asserted.
   * @param actualSupplier of the value to be asserted.
   * @param messageSupplier for the assertion message.
   * @since 2.5.3
   */
  public static void assertEquals(
      final Object expected,
      final Supplier<?> actualSupplier,
      final Supplier<String> messageSupplier) {
    Assertions.assertEquals(expected, actualSupplier.get(), messageSupplier);
  }
}
