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
package com.chrimle.example;

import java.util.Optional;

public record GeneratedField<T>(
    String name,
    Class<T> type,
    boolean isNullable,
    boolean isBeanValidationNullable,
    Optional<T> defaultValue,
    Optional<String> pattern,
    Optional<Integer> minLength,
    Optional<Integer> maxLength,
    Optional<Integer> minItems,
    Optional<Integer> maxItems,
    Optional<Long> minimum,
    Optional<Long> maximum,
    Optional<String> decimalMin,
    Optional<String> decimalMax) {

  public static <T> Builder<T> of(final String name, final Class<T> type) {
    return new Builder<>(name, type);
  }

  public static class Builder<T> {
    private final String name;
    private final Class<T> type;
    private boolean isNullable = false;
    private boolean isBeanValidationNullable = true;
    private Optional<T> defaultValue = Optional.empty();
    private Optional<String> pattern = Optional.empty();
    private Optional<Integer> minLength = Optional.empty();
    private Optional<Integer> maxLength = Optional.empty();
    private Optional<Integer> minItems = Optional.empty();
    private Optional<Integer> maxItems = Optional.empty();
    private Optional<Long> minimum = Optional.empty();
    private Optional<Long> maximum = Optional.empty();
    private Optional<String> decimalMin = Optional.empty();
    private Optional<String> decimalMax = Optional.empty();

    public Builder(final String name, final Class<T> type) {
      this.name = name;
      this.type = type;
    }

    public Builder<T> isNullable(final boolean isNullable) {
      this.isNullable = isNullable;
      return this;
    }

    public Builder<T> isBeanValidationNullable(final boolean isBeanValidationNullable) {
      this.isBeanValidationNullable = isBeanValidationNullable;
      return this;
    }

    public Builder<T> defaultValue(final T defaultValue) {
      this.defaultValue = Optional.ofNullable(defaultValue);
      return this;
    }

    public Builder<T> pattern(final String pattern) {
      this.pattern = Optional.ofNullable(pattern);
      return this;
    }

    public Builder<T> minLength(final int minLength) {
      this.minLength = Optional.of(minLength);
      return this;
    }

    public Builder<T> maxLength(final int maxLength) {
      this.maxLength = Optional.of(maxLength);
      return this;
    }

    public Builder<T> minItems(final int minItems) {
      this.minItems = Optional.of(minItems);
      return this;
    }

    public Builder<T> maxItems(final int maxItems) {
      this.maxItems = Optional.of(maxItems);
      return this;
    }

    public Builder<T> minimum(final long minimum) {
      this.minimum = Optional.of(minimum);
      return this;
    }

    public Builder<T> maximum(final long maximum) {
      this.maximum = Optional.of(maximum);
      return this;
    }

    public Builder<T> decimalMin(final String decimalMin) {
      this.decimalMin = Optional.ofNullable(decimalMin);
      return this;
    }

    public Builder<T> decimalMax(final String decimalMax) {
      this.decimalMax = Optional.ofNullable(decimalMax);
      return this;
    }

    public GeneratedField<T> build() {
      return new GeneratedField<>(
          name,
          type,
          isNullable,
          isBeanValidationNullable,
          defaultValue,
          pattern,
          minLength,
          maxLength,
          minItems,
          maxItems,
          minimum,
          maximum,
          decimalMin,
          decimalMax);
    }
  }
}
