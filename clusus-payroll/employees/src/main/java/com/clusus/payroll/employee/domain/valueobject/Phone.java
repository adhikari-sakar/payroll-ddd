package com.clusus.payroll.employee.domain.valueobject;

import java.util.Objects;

public class Phone {
    private final String number;

    public Phone(String value) {
        this.number = value.trim();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.number);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Phone that = (Phone) other;
        return Objects.equals(this.number, that.number);
    }

    public String getNumber() {
        return number;
    }
}
