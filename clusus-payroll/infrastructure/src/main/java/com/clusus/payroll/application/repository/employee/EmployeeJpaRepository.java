package com.clusus.payroll.application.repository.employee;

import com.clusus.payroll.employee.domain.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeJpaRepository extends JpaRepository<JpaEmployee, Long> {

    Optional<JpaEmployee> findByEmployeeId(String employeeId);

}
