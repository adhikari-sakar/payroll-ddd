package com.clusus.payroll.accounting.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class EPFId extends ValueObject {
    private final Long value;

    public EPFId(Long value) {
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
        EPFId that = (EPFId) other;
        return Objects.equals(this.value, that.value);
    }

    public Long getValue() {
        return value;
    }
}
