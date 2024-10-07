package com.chrimle.example;

import java.util.Optional;

public record GeneratedField<T>(
    String name, Class<T> type, boolean isNullable, Optional<T> defaultValue) {

  public GeneratedField(String name, Class<T> type, boolean isNullable, T defaultValue) {
    this(name, type, isNullable, Optional.ofNullable(defaultValue));
  }

  public GeneratedField(String name, Class<T> type, boolean isNullable) {
    this(name, type, isNullable, Optional.empty());
  }

  public GeneratedField(String name, Class<T> type) {
    this(name, type, false);
  }

  public static <T> GeneratedField<T> of(String name, Class<T> type) {
    return new GeneratedField<>(name, type);
  }

  public static <T> GeneratedField<T> of(String name, Class<T> type, boolean isNullable) {
    return new GeneratedField<>(name, type, isNullable);
  }

  public static <T> GeneratedField<T> of(
      String name, Class<T> type, boolean isNullable, T defaultValue) {
    return new GeneratedField<>(name, type, isNullable, defaultValue);
  }
}
