package com.clusus.payroll.employee.domain.entity;

import com.clusus.payroll.employee.domain.valueobject.RoleId;
import com.clusus.payroll.employee.domain.valueobject.RoleName;
import com.clusus.payroll.shared.domain.core.Entity;

import java.time.LocalDate;

public class Role extends Entity<RoleId> {
    private RoleName name;

    public Role(RoleId roleId) {
        super(roleId);
    }

    public void assign(RoleName name) {
        this.name = name;
    }

    public RoleName getName() {
        return name;
    }


    public Role get() {
        return this;
    }
}
