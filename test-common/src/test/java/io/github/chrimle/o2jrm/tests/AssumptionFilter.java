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

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AssumptionFilter {

  Condition enumUnknownDefaultCase() default Condition.ANY;

  Class<?> enumValueClass() default Object.class;

  Condition generateBuilders() default Condition.ANY;

  Condition hasAdditionalEnumTypeAnnotations() default Condition.ANY;

  Condition hasAdditionalModelTypeAnnotations() default Condition.ANY;

  Condition hasExtraAnnotations() default Condition.ANY;

  Condition hasRequiredGeneratedFields() default Condition.ANY;

  Condition hasXImplements() default Condition.ANY;

  Condition isDeprecated() default Condition.ANY;

  Condition isInnerEnum() default Condition.ANY;

  ConfigOption[] enabledConfigOptions() default {};

  ConfigOption[] disabledConfigOptions() default {};

  Library[] isOneOfLibraries() default {};

  Condition isSerializationLibraryJackson() default Condition.ANY;

  Condition useBeanValidation() default Condition.ANY;
}
