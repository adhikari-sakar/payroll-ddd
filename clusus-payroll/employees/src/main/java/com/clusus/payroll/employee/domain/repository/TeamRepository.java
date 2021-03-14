package com.clusus.payroll.employee.domain.repository;

import com.clusus.payroll.employee.domain.entity.Team;
import com.clusus.payroll.employee.domain.valueobject.TeamId;
import com.clusus.payroll.employee.domain.valueobject.TeamName;

import java.util.Optional;

public interface TeamRepository {

    void persist(Team team);

    Optional<Team> findByTeamId(TeamId id);

    Optional<Team> findByName(TeamName name);

}
