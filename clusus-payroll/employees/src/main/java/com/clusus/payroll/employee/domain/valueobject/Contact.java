package com.clusus.payroll.employee.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.util.Objects;

public class Contact extends ValueObject {
    private final Email email;
    private final Phone primary;
    private final Phone secondary;

    public Contact(Email email, Phone primary, Phone secondary) {
        this.email = email;
        this.primary = primary;
        this.secondary = secondary;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.email.getValue())
                + Objects.hashCode(this.primary.getNumber())
                + Objects.hashCode(this.secondary.getNumber());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Contact that = (Contact) other;
        return Objects.equals(this.email.getValue(), that.email.getValue()) &&
                Objects.equals(this.primary.getNumber(), that.primary.getNumber()) &&
                Objects.equals(this.secondary.getNumber(), that.secondary.getNumber());
    }

    public Email getEmail() {
        return email;
    }

    public Phone getPrimary() {
        return primary;
    }

    public Phone getSecondary() {
        return secondary;
    }
}
