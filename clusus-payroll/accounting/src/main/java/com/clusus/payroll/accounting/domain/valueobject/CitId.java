package com.clusus.payroll.accounting.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class CitId extends ValueObject {
    private final String value;

    public CitId(String value) {
        this.value = value.trim();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        CitId that = (CitId) other;
        return Objects.equals(this.value, that.value);
    }

    public String getValue() {
        return value;
    }
}
