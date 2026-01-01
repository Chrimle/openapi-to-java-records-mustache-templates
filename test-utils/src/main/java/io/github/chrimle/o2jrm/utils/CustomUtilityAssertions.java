/*
  Copyright 2024-2026 Chrimle

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

*/
package io.github.chrimle.o2jrm.utils;

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
