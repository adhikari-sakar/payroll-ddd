package com.clusus.payroll.accounting.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class SalaryId extends ValueObject {
    private final Long value;

    public SalaryId(Long value) {
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
        SalaryId that = (SalaryId) other;
        return Objects.equals(this.value, that.value);
    }

    public Long getValue() {
        return value;
    }
}
