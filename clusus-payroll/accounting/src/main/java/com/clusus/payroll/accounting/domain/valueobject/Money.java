package com.clusus.payroll.accounting.domain.valueobject;

import com.clusus.payroll.shared.domain.core.ValueObject;

import java.math.BigDecimal;
import java.util.Objects;

import static com.clusus.payroll.accounting.domain.valueobject.Currency.NPR;

public class Money extends ValueObject {
    private final Currency currency;
    private final BigDecimal value;

    public Money(Currency currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    public static Money ZERO = new Money(NPR, BigDecimal.ZERO);

    public static Money of(BigDecimal value) {
        return new Money(NPR, value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.currency) + Objects.hashCode(this.value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Money that = (Money) other;
        return Objects.equals(this.currency, that.currency) && Objects.equals(this.value, that.value);
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getValue() {
        return value;
    }
}
