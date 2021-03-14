package com.clusus.payroll.shared.domain.core;

public abstract class ValueObject {
  @Override
  public abstract int hashCode();

  @Override
  public abstract boolean equals(Object o);
}
