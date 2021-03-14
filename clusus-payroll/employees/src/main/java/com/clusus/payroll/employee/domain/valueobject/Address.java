package com.clusus.payroll.employee.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class Address extends ValueObject {
    private final String current;
    private final String permanent;

    public Address(String current, String permanent) {
        this.current = current.trim();
        this.permanent = permanent.trim();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.current) + Objects.hashCode(this.permanent);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Address that = (Address) other;
        return Objects.equals(this.current, that.current) && Objects.equals(this.permanent, that.permanent);
    }

    public String getCurrent() {
        return current;
    }

    public String getPermanent() {
        return permanent;
    }
}
