package com.clusus.payroll.accounting.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class CITModel {
    private Boolean enabled;
    private Boolean autoCalculate;
    private Double rate;
    private BigDecimal amount;
    private LocalDate entryDate;
}
