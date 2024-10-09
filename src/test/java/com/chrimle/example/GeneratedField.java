package com.chrimle.example;

import java.util.Optional;

public record GeneratedField<T>(
    String name,
    Class<T> type,
    boolean isNullable,
    boolean isBeanValidationNullable,
    Optional<T> defaultValue) {

  public GeneratedField(
      String name,
      Class<T> type,
      boolean isNullable,
      boolean isBeanValidationNullable,
      T defaultValue) {
    this(name, type, isNullable, isBeanValidationNullable, Optional.ofNullable(defaultValue));
  }

  public GeneratedField(
      String name, Class<T> type, boolean isNullable, boolean isBeanValidationNullable) {
    this(name, type, isNullable, isBeanValidationNullable, Optional.empty());
  }

  public GeneratedField(String name, Class<T> type) {
    this(name, type, false, true);
  }

  public static <T> GeneratedField<T> of(String name, Class<T> type) {
    return new GeneratedField<>(name, type);
  }

  public static <T> GeneratedField<T> of(
      String name, Class<T> type, boolean isNullable, boolean isBeanValidationNullable) {
    return new GeneratedField<>(name, type, isNullable, isBeanValidationNullable);
  }

  public static <T> GeneratedField<T> of(
      String name,
      Class<T> type,
      boolean isNullable,
      boolean isBeanValidationNullable,
      T defaultValue) {
    return new GeneratedField<>(name, type, isNullable, isBeanValidationNullable, defaultValue);
  }
}
