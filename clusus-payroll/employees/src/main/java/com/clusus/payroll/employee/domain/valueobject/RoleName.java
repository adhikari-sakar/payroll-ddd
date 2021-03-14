package com.clusus.payroll.employee.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class RoleName extends ValueObject {

    private final String value;

    public RoleName(String value) {
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
        RoleName that = (RoleName) other;
        return Objects.equals(this.value, that.value);
    }

    public String getValue() {
        return value;
    }
}
