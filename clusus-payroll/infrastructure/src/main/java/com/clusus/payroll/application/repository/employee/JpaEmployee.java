package com.clusus.payroll.application.repository.employee;

import com.clusus.payroll.application.repository.JpaEntity;
import com.clusus.payroll.application.repository.employee.department.JpaEmployeeDepartment;
import com.clusus.payroll.application.repository.employee.role.JpaEmployeeRole;
import com.clusus.payroll.application.repository.employee.team.JpaEmployeeTeam;
import com.clusus.payroll.employee.domain.valueobject.Status;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.EnumType.STRING;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE", indexes = {@Index(name = "IDX_EMPLOYEE_CODE", columnList = "employeeCode", unique = true)})
@EqualsAndHashCode(callSuper = true)
public class JpaEmployee extends JpaEntity {
    private String employeeId;
    private String employeeCode;
    private String firstName;
    private String middleName;
    private String lastName;
    private String currentAddress;
    private String permanentAddress;
    private String email;
    private String primaryContact;
    private String secondaryContact;
    private String bloodGroup;
    private LocalDate joinedDate;

    @ManyToOne(cascade = CascadeType.MERGE)
    private JpaEmployeeRole role;

    @ManyToOne(cascade = CascadeType.MERGE)
    private JpaEmployeeTeam team;

    @ManyToOne(cascade = CascadeType.MERGE)
    private JpaEmployeeDepartment department;

    @Enumerated(STRING)
    private Status status;
}
