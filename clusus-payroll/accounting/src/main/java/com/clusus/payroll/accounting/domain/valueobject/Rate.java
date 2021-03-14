package com.clusus.payroll.accounting.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class Rate extends ValueObject {
    private final Double value;

    public Rate(Double value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Rate that = (Rate) other;
        return Objects.equals(this.value, that.value);
    }

    public Double getValue() {
        return value;
    }
}
