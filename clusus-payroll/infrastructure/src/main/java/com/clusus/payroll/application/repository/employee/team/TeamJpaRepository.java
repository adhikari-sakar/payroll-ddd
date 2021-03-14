package com.clusus.payroll.application.repository.employee.team;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamJpaRepository extends JpaRepository<JpaEmployeeTeam, Long> {
    Optional<JpaEmployeeTeam> findByName(String teamName);
}
