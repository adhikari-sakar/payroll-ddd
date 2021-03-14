package com.clusus.payroll.accounting.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class BonusModel {
    private Long id;
    private LocalDate entryDate;
    private BigDecimal amount;
}
