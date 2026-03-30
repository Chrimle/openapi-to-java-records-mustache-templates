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

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.ParameterDeclarations;

public final class GeneratedRecordProvider extends GeneratedSourceProvider
    implements ArgumentsProvider {

  public static final String GENERATED_RECORD_TESTS_METHOD_SOURCE_CLASS =
      "io.github.chrimle.o2jrm.tests.GeneratedRecordImplTests";
  public static final String GENERATED_RECORD_TESTS_METHOD_SOURCE_METHOD =
      "allPluginExecutionsAndGeneratedRecordCombinations";

  @Override
  public Stream<? extends Arguments> provideArguments(
      ParameterDeclarations parameters, ExtensionContext context) throws Exception {
    return applyFilters(
        GENERATED_RECORD_TESTS_METHOD_SOURCE_CLASS,
        GENERATED_RECORD_TESTS_METHOD_SOURCE_METHOD,
        context);
  }
}
