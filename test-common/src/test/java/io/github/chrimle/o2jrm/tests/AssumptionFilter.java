/*
 *   Copyright 2024-2026 Chrimle
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.configs.ConfigOption;
import io.github.chrimle.o2jrm.configs.Library;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows filtering {@link io.github.chrimle.o2jrm.GeneratedSource}s using {@link
 * org.junit.jupiter.api.Assumptions}, based on several criteria.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AssumptionFilter {

  /** The <em>Type</em> of the enum {@code value}. Must match exactly. Default allows all types. */
  Class<?> enumValueClass() default Object.class;

  /** Whether {@link ConfigOption#ADDITIONAL_ENUM_TYPE_ANNOTATIONS} should be set. */
  Condition hasAdditionalEnumTypeAnnotations() default Condition.ANY;

  /** Whether {@link ConfigOption#ADDITIONAL_MODEL_TYPE_ANNOTATIONS} should be set. */
  Condition hasAdditionalModelTypeAnnotations() default Condition.ANY;

  /** Whether the schema has "extra annotations". */
  Condition hasExtraAnnotations() default Condition.ANY;

  /** Whether the schema has required fields. */
  Condition hasRequiredGeneratedFields() default Condition.ANY;

  /** Whether the schema has "x-implements". */
  Condition hasXImplements() default Condition.ANY;

  /** Whether the schema is "deprecated". */
  Condition isDeprecated() default Condition.ANY;

  /** Whether the schema is an "inner" enum class. */
  Condition isInnerEnum() default Condition.ANY;

  /**
   * Collection of {@link ConfigOption}s that ALL MUST be {@code true}. Other {@link ConfigOption}s
   * (not referenced) MAY be false or true. Default allows any or all ConfigOptions to be false.
   */
  ConfigOption[] enabledConfigOptions() default {};

  /**
   * Collection of {@link ConfigOption}s that ALL MUST be {@code false}. Other {@link ConfigOption}s
   * (not referenced) MAY be false or true. Default allows any or all ConfigOptions to be true.
   */
  ConfigOption[] disabledConfigOptions() default {};

  /** Collection of {@link Library}s. Default allows all {@link Library}s. */
  Library[] isOneOfLibraries() default {};

  /** Whether {@code jackson} serialization library is used. */
  Condition isSerializationLibraryJackson() default Condition.ANY;
}
