package com.clusus.payroll.accounting.domain.entity;

import com.clusus.payroll.accounting.domain.valueobject.EmployeeId;
import com.clusus.payroll.shared.domain.core.Entity;

public class Employee extends Entity<EmployeeId> {

    public Employee(EmployeeId employeeId) {
        super(employeeId);
    }
}
