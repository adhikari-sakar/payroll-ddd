package com.clusus.payroll.application.repository.employee.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleJpaRepository extends JpaRepository<JpaEmployeeRole, Long> {
    Optional<JpaEmployeeRole> findByName(String roleName);
}
