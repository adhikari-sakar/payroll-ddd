package com.clusus.payroll.accounting.domain.entity;

import com.clusus.payroll.accounting.domain.valueobject.CitId;
import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.accounting.domain.valueobject.Rate;
import com.clusus.payroll.shared.domain.core.Entity;

import java.time.LocalDate;

public class CIT extends Entity<CitId> {
    private Boolean enabled;
    private Boolean autoCalculate;
    private Rate rate;
    private Money amount;
    private LocalDate entryDate;

    public CIT(CitId citId) {
        super(citId);
    }

    public void release(Boolean enabled, Boolean autoCalculate, Rate rate, Money amount, LocalDate entryDate) {
        this.enabled = enabled;
        this.autoCalculate = autoCalculate;
        this.rate = rate;
        this.amount = amount;
        this.entryDate = entryDate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Boolean getAutoCalculate() {
        return autoCalculate;
    }

    public Rate getRate() {
        return rate;
    }

    public Money getAmount() {
        return amount;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }
}
