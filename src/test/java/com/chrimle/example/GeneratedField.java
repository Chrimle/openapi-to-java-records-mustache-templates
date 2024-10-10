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
    Optional<Integer> maxItems) {

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
          maxItems);
    }
  }
}
