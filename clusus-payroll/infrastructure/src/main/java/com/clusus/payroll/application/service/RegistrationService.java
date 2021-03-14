package com.clusus.payroll.application.service;

import com.clusus.payroll.application.repository.employee.EmployeeDomainRepository;
import com.clusus.payroll.employee.domain.entity.Department;
import com.clusus.payroll.employee.domain.entity.Employee;
import com.clusus.payroll.employee.domain.entity.Role;
import com.clusus.payroll.employee.domain.entity.Team;
import com.clusus.payroll.employee.domain.model.EmployeeModel;
import com.clusus.payroll.employee.domain.repository.DepartmentRepository;
import com.clusus.payroll.employee.domain.repository.RoleRepository;
import com.clusus.payroll.employee.domain.repository.TeamRepository;
import com.clusus.payroll.employee.domain.valueobject.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

import static com.clusus.payroll.employee.domain.valueobject.Status.CREATED;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final EmployeeDomainRepository domainRepository;
    private final DepartmentRepository departmentRepository;
    private final RoleRepository roleRepository;
    private final TeamRepository teamRepository;

    public void register(EmployeeModel model) {
        Employee employee = new Employee(new EmployeeId(UUID.randomUUID().toString()));
        EmployeeCode employeeCode = new EmployeeCode(model.getEmployeeCode());
        Name name = new Name(model.getFirstName(), model.getMiddleName(), model.getLastName());
        LocalDate joinedDate = model.getJoinedDate();
        Address address = new Address(model.getCurrentAddress(), model.getPermanentAddress());
        Contact contact = new Contact(new Email(model.getEmail()), new Phone(model.getPrimaryContact()), new Phone(model.getSecondaryContact()));
        BloodGroup bloodGroup = new BloodGroup(model.getBloodGroup());
        Role role = getRole(model);
        Team team = getTeam(model);
        Department department = getDepartment(model);
        employee.registerEmployee(employeeCode, name, joinedDate, address, contact, bloodGroup, role, team, department);
        employee.applyStatus(CREATED);
        domainRepository.save(employee);
    }

    private Department getDepartment(EmployeeModel model) {
        return departmentRepository.findByName(new DepartmentName(model.getDepartment().getName())).orElseThrow();
    }

    private Team getTeam(EmployeeModel model) {
        return teamRepository.findByName(new TeamName(model.getTeam().getName())).orElseThrow();
    }

    private Role getRole(EmployeeModel model) {
        return roleRepository.findByName(new RoleName(model.getRole().getName())).orElseThrow();
    }
}
