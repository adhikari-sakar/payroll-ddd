package com.clusus.payroll.employee.domain.model;

import com.clusus.payroll.employee.domain.valueobject.Status;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class EmployeeModel {
    private Long id;
    private String employeeId;
    private String employeeCode;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate joinedDate;
    private String currentAddress;
    private String permanentAddress;
    private String email;
    private String primaryContact;
    private String secondaryContact;
    private String bloodGroup;
    private RoleModel role;
    private TeamModel team;
    private DepartmentModel department;
    private Status status;
}
