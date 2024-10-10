package com.chrimle.example;

import java.util.Optional;

public record GeneratedField<T>(
    String name,
    Class<T> type,
    boolean isNullable,
    boolean isBeanValidationNullable,
    Optional<T> defaultValue,
    Optional<String> pattern) {

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

    public GeneratedField<T> build() {
      return new GeneratedField<>(
          name, type, isNullable, isBeanValidationNullable, defaultValue, pattern);
    }
  }
}
