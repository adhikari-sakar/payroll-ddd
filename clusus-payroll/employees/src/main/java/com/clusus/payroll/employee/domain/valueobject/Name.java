package com.clusus.payroll.employee.domain.valueobject;


import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class Name extends ValueObject {

    private final String firstName;
    private final String middleName;
    private final String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName.trim();
        this.middleName = middleName.trim();
        this.lastName = lastName.trim();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.firstName + this.middleName + this.lastName);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Name that = (Name) other;
        return Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.middleName, that.middleName) &&
                Objects.equals(this.lastName, that.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}
