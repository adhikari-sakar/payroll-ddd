package com.clusus.payroll.accounting.domain.entity;

import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.accounting.domain.valueobject.Rate;

import java.time.LocalDate;

public class Tax {
    private Money amount;
    private Rate rate;
    private LocalDate entryDate;
}
