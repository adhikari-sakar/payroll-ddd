package com.clusus.payroll.application.repository.account;

import com.clusus.payroll.application.repository.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "EMPLOYEE_TAX")
@EqualsAndHashCode(callSuper = true)
public class JpaTax extends JpaEntity {
    private LocalDate entryDate;
    private BigDecimal bonusAmount;
}
