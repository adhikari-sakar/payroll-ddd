package com.clusus.payroll.accounting.domain.entity;

import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.accounting.domain.valueobject.SalaryId;
import com.clusus.payroll.shared.domain.core.Entity;

import java.time.LocalDate;

public class Salary extends Entity<SalaryId> {
    private LocalDate entryDate;
    private Money amount;

    public Salary(SalaryId salaryId) {
        super(salaryId);
    }

    public void release(LocalDate entryDate, Money amount) {
        this.entryDate = entryDate;
        this.amount = amount;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public Money getAmount() {
        return amount;
    }
}
