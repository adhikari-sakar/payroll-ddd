package com.clusus.payroll.employee.domain.entity;

import com.clusus.payroll.employee.domain.valueobject.*;
import com.clusus.payroll.shared.domain.core.AggregateRoot;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Employee extends AggregateRoot<EmployeeId> {
    private EmployeeCode employeeCode;
    private Name name;
    private LocalDate joinedDate;
    private Address address;
    private BloodGroup bloodGroup;
    private Contact contact;
    private Role role;
    private Team team;
    private Department department;
    private Status status;

    public Employee(EmployeeId employeeId) {
        super(employeeId);
    }

    public void registerEmployee(EmployeeCode employeeCode, Name name, LocalDate joinedDate,
                                 Address address, Contact contact, BloodGroup bloodGroup,
                                 Role role, Team team, Department department) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.joinedDate = joinedDate;
        this.bloodGroup = bloodGroup;
        this.contact = contact;
        this.address = address;
        this.role = role;
        this.team = team;
        this.department = department;
    }

    public void applyStatus(Status status) {
        this.status = status;
    }
}
