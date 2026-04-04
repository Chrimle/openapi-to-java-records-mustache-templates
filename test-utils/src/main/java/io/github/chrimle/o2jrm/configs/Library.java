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

package io.github.chrimle.o2jrm.configs;

public enum Library {
  OKHTTP_GSON("okhttp-gson"),
  SPRING_BOOT("spring-boot"),
  WEBCLIENT("webclient");

  private final String id;

  Library(final String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public static boolean isLibraryOkHttpGson(final Library library) {
    return library == Library.OKHTTP_GSON;
  }

  public static boolean isLibrarySpringBoot(final Library library) {
    return library == Library.SPRING_BOOT;
  }

  public static boolean isLibraryWebClient(final Library library) {
    return library == Library.WEBCLIENT;
  }
}
