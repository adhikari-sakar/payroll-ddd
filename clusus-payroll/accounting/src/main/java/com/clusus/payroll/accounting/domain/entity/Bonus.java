package com.clusus.payroll.accounting.domain.entity;

import com.clusus.payroll.accounting.domain.valueobject.BonusId;
import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.shared.domain.core.Entity;

import java.time.LocalDate;

public class Bonus extends Entity<BonusId> {
    private LocalDate entryDate;
    private Money amount;

    public Bonus(BonusId bonusId) {
        super(bonusId);
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
