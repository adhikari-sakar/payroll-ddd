package com.clusus.payroll.accounting.domain.entity;

import com.clusus.payroll.accounting.domain.valueobject.CitId;
import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.accounting.domain.valueobject.Rate;
import com.clusus.payroll.shared.domain.core.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

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

    public LocalDate getEntryDate() {
        return entryDate;
    }
}
