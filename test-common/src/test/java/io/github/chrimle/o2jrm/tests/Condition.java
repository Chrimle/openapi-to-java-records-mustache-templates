package io.github.chrimle.o2jrm.tests;

import java.util.function.UnaryOperator;

public enum Condition {
  ANY(ignored -> true),
  TRUE(bool -> bool),
  FALSE(bool -> !bool);

  private final UnaryOperator<Boolean> function;

  Condition(UnaryOperator<Boolean> function) {
    this.function = function;
  }

  public boolean test(final boolean bool) {
    return function.apply(bool);
  }
}
