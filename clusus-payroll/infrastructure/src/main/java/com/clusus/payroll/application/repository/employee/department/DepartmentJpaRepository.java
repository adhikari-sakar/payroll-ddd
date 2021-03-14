package com.clusus.payroll.application.repository.employee.department;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentJpaRepository extends JpaRepository<JpaEmployeeDepartment, Long> {
    Optional<JpaEmployeeDepartment> findByName(String departmentName);

}
