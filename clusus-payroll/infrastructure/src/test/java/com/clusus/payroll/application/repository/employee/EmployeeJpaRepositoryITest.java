package com.clusus.payroll.application.repository.employee;

import com.clusus.payroll.application.repository.employee.department.DepartmentJpaRepository;
import com.clusus.payroll.application.repository.employee.department.JpaEmployeeDepartment;
import com.clusus.payroll.application.repository.employee.role.JpaEmployeeRole;
import com.clusus.payroll.application.repository.employee.role.RoleJpaRepository;
import com.clusus.payroll.application.repository.employee.team.JpaEmployeeTeam;
import com.clusus.payroll.application.repository.employee.team.TeamJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class EmployeeJpaRepositoryITest {

    @Autowired
    private EmployeeJpaRepository jpaRepository;
    @Autowired
    private DepartmentJpaRepository departmentJpaRepository;
    @Autowired
    private RoleJpaRepository roleJpaRepository;
    @Autowired
    private TeamJpaRepository teamJpaRepository;

    private JpaEmployee savedEmployee;

    @BeforeEach
    public void setUp() {
        departmentJpaRepository.save(department());
        roleJpaRepository.save(role());
        teamJpaRepository.save(team());
        savedEmployee = jpaRepository.save(employee());
    }

    @Test
    public void save() {
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getDepartment()).isNotNull();
        assertThat(savedEmployee.getRole()).isNotNull();
        assertThat(savedEmployee.getTeam()).isNotNull();
    }

    @Test
    public void findByEmployeeId() {
        assertThat(jpaRepository.findByEmployeeId(savedEmployee.getEmployeeId())).isNotNull();
    }

    private JpaEmployee employee() {
        JpaEmployee jpaEmployee = new JpaEmployee();
        jpaEmployee.setEmployeeId(UUID.randomUUID().toString());
        jpaEmployee.setEmployeeCode("u570");
        jpaEmployee.setFirstName("Sakar");
        jpaEmployee.setMiddleName(null);
        jpaEmployee.setLastName("Adhikari");
        jpaEmployee.setCurrentAddress("Kathmandu");
        jpaEmployee.setPermanentAddress("Chitwan");
        jpaEmployee.setPrimaryContact("982231131312");
        jpaEmployee.setSecondaryContact("9823123132");
        jpaEmployee.setBloodGroup("A-");
        jpaEmployee.setJoinedDate(LocalDate.now());
        jpaEmployee.setDepartment(departmentJpaRepository.findByName("Support").orElseThrow());
        jpaEmployee.setRole(roleJpaRepository.findByName("Developer").orElseThrow());
        jpaEmployee.setTeam(teamJpaRepository.findByName("Vega").orElseThrow());
        return jpaEmployee;
    }


    private JpaEmployeeDepartment department() {
        JpaEmployeeDepartment department = new JpaEmployeeDepartment();
        department.setName("Support");
        return department;
    }

    private JpaEmployeeRole role() {
        JpaEmployeeRole role = new JpaEmployeeRole();
        role.setName("Developer");
        return role;
    }

    private JpaEmployeeTeam team() {
        JpaEmployeeTeam team = new JpaEmployeeTeam();
        team.setName("Vega");
        return team;
    }

}