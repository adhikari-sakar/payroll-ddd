package com.clusus.payroll.employee.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class TeamId extends ValueObject {

    private final Long value;

    public TeamId(Long value) {
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
        TeamId that = (TeamId) other;
        return Objects.equals(this.value, that.value);
    }

    public Long getValue() {
        return value;
    }
}
