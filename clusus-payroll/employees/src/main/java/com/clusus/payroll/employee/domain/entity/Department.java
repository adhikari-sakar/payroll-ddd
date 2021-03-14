package com.clusus.payroll.employee.domain.entity;

import com.clusus.payroll.employee.domain.valueobject.DepartmentId;
import com.clusus.payroll.employee.domain.valueobject.DepartmentName;
import com.clusus.payroll.shared.domain.core.Entity;

public class Department extends Entity<DepartmentId> {
    private DepartmentName name;

    public Department(DepartmentId departmentId) {
        super(departmentId);
    }

    public void assign(DepartmentName name) {
        this.name = name;
    }

    public DepartmentName getName() {
        return name;
    }

    public Department get() {
        return this;
    }
}
