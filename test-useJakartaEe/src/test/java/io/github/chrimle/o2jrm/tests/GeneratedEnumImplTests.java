/*
  Copyright 2024-2025 Chrimle

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
import io.github.chrimle.o2jrm.models.GeneratedClass;
import io.github.chrimle.o2jrm.models.GeneratedClassImpl;
import io.github.chrimle.o2jrm.models.GeneratedEnumImpl;
import java.util.stream.Stream;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.Arguments;

@DisplayName("Test Generated `enum` classes")
final class GeneratedEnumImplTests extends GeneratedEnumTests {

  @SuppressWarnings("unused")
  static Stream<Arguments> allPluginExecutionsAndGeneratedEnumCombinations() {
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
                                jakarta.annotation.Nullable.class,
                                jakarta.annotation.Nonnull.class,
                                jakarta.validation.Valid.class,
                                jakarta.validation.constraints.NotNull.class,
                                jakarta.validation.constraints.Pattern.class,
                                jakarta.validation.constraints.Size.class,
                                jakarta.validation.constraints.Min.class,
                                jakarta.validation.constraints.Max.class,
                                jakarta.validation.constraints.DecimalMin.class,
                                jakarta.validation.constraints.DecimalMax.class,
                                jakarta.validation.constraints.Email.class)))
        .map(Arguments::of);
  }
}
