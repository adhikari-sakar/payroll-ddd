package com.clusus.payroll.accounting.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class TaxModel {
    private BigDecimal amount;
    private Double rate;
    private LocalDate entryDate;
}
