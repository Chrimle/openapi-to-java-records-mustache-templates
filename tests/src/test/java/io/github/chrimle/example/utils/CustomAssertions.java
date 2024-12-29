/*
  Copyright 2024 Chrimle

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
package io.github.chrimle.example.utils;

import org.junit.jupiter.api.Assertions;

/** Collection of custom assertion methods for the purpose of re-use. */
public interface CustomAssertions {

  /**
   * Asserts that the {@code aClass} is a <i>record</i> class.
   *
   * @param aClass to be asserted.
   */
  static void assertClassIsRecordClass(final Class<?> aClass) {
    Assertions.assertTrue(aClass::isRecord, () -> aClass + " is NOT a record class");
  }

  /**
   * Asserts that the {@code aClass} is an <i>enum</i> class.
   *
   * @param aClass to be asserted.
   */
  static void assertClassIsEnumClass(final Class<?> aClass) {
    Assertions.assertTrue(aClass::isEnum, () -> aClass + " is NOT an enum class");
  }
}
