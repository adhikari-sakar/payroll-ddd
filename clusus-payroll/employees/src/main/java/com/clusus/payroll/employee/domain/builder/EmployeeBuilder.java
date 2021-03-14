package com.clusus.payroll.employee.domain.builder;

import com.clusus.payroll.employee.domain.entity.Employee;
import com.clusus.payroll.employee.domain.model.DepartmentModel;
import com.clusus.payroll.employee.domain.model.EmployeeModel;
import com.clusus.payroll.employee.domain.model.RoleModel;
import com.clusus.payroll.employee.domain.model.TeamModel;
import com.clusus.payroll.employee.domain.valueobject.EmployeeId;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

import java.util.UUID;

public class EmployeeBuilder extends DomainBuilder<EmployeeModel, Employee> {

    public EmployeeBuilder() {
        super(EmployeeBuilder::toDomain, EmployeeBuilder::toModel);
    }

    private static Employee toDomain(EmployeeModel model) {
        return new Employee(new EmployeeId(UUID.randomUUID().toString()));
    }

    private static EmployeeModel toModel(Employee domain) {
        return EmployeeModel.builder()
                .employeeId(domain.getId().getValue())
                .employeeCode(domain.getEmployeeCode().getValue())
                .firstName(domain.getName().getFirstName())
                .middleName(domain.getName().getMiddleName())
                .lastName(domain.getName().getLastName())
                .currentAddress(domain.getAddress().getCurrent())
                .permanentAddress(domain.getAddress().getPermanent())
                .email(domain.getContact().getEmail().getValue())
                .primaryContact(domain.getContact().getPrimary().getNumber())
                .secondaryContact(domain.getContact().getSecondary().getNumber())
                .bloodGroup(domain.getBloodGroup().getValue())
                .joinedDate(domain.getJoinedDate())
                .role(RoleModel.builder().id(domain.getRole().getId().getValue()).name(domain.getRole().getName().getValue()).build())
                .team(TeamModel.builder().id(domain.getTeam().getId().getValue()).name(domain.getTeam().getName().getValue()).build())
                .department(DepartmentModel.builder().id(domain.getDepartment().getId().getValue()).name(domain.getDepartment().getName().getValue()).build())
                .status(domain.getStatus())
                .build();
    }

}
