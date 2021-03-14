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
@Table(name = "EMPLOYEE_ALLOWANCE")
@EqualsAndHashCode(callSuper = true)
public class JpaAllowance extends JpaEntity {
    private Boolean enabled;
    private LocalDate entryDate;
    private BigDecimal amount;
}
