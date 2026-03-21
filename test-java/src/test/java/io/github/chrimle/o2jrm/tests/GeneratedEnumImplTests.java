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
package io.github.chrimle.o2jrm.tests;

import io.github.chrimle.o2jrm.GeneratedSource;
import io.github.chrimle.o2jrm.PluginExecutionImpl;
import io.github.chrimle.o2jrm.models.BeanValidationAnnotation;
import io.github.chrimle.o2jrm.models.GeneratedClass;
import io.github.chrimle.o2jrm.models.GeneratedClassImpl;
import io.github.chrimle.o2jrm.models.GeneratedEnumImpl;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.*;

@DisplayName("Test Generated `enum` classes")
final class GeneratedEnumImplTests extends GeneratedEnumTests {

  @SuppressWarnings("unused")
  static List<GeneratedSource> allPluginExecutionsAndGeneratedEnumCombinations() {
    return Stream.of(PluginExecutionImpl.values())
        .flatMap(
            pluginExecution ->
                Stream.of(GeneratedEnumImpl.values())
                    .map(
                        generatedEnum ->
                            new GeneratedSource(
                                pluginExecution,
                                generatedEnum,
                                GeneratedClassImpl.getGeneratedFields(
                                    generatedEnum, pluginExecution),
                                GeneratedClass.getClass(generatedEnum, pluginExecution),
                                Map.of(
                                    BeanValidationAnnotation.VALID,
                                    javax.validation.Valid.class,
                                    BeanValidationAnnotation.NOT_NULL,
                                    javax.validation.constraints.NotNull.class,
                                    BeanValidationAnnotation.PATTERN,
                                    javax.validation.constraints.Pattern.class,
                                    BeanValidationAnnotation.SIZE,
                                    javax.validation.constraints.Size.class,
                                    BeanValidationAnnotation.MIN,
                                    javax.validation.constraints.Min.class,
                                    BeanValidationAnnotation.MAX,
                                    javax.validation.constraints.Max.class,
                                    BeanValidationAnnotation.DECIMAL_MIN,
                                    javax.validation.constraints.DecimalMin.class,
                                    BeanValidationAnnotation.DECIMAL_MAX,
                                    javax.validation.constraints.DecimalMax.class,
                                    BeanValidationAnnotation.EMAIL,
                                    javax.validation.constraints.Email.class))))
        .toList();
  }
}
