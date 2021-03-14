package com.clusus.payroll.application.repository.employee.team;

import com.clusus.payroll.application.mapper.TeamMapper;
import com.clusus.payroll.employee.domain.builder.TeamBuilder;
import com.clusus.payroll.employee.domain.entity.Team;
import com.clusus.payroll.employee.domain.repository.TeamRepository;
import com.clusus.payroll.employee.domain.valueobject.TeamId;
import com.clusus.payroll.employee.domain.valueobject.TeamName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TeamRepositoryImpl implements TeamRepository {
    private final TeamMapper mapper;
    private final TeamJpaRepository jpaRepository;

    @Override
    public void persist(Team team) {
        jpaRepository.save(mapper.toEntity(new TeamBuilder().build(team)));
    }

    @Override
    public Optional<Team> findByTeamId(TeamId id) {
        return Optional.ofNullable(new TeamBuilder()
                .build(jpaRepository.findById(id.getValue())
                        .map(mapper::toModel).orElse(null)));
    }

    @Override
    public Optional<Team> findByName(TeamName name) {
        return Optional.ofNullable(new TeamBuilder()
                .build(jpaRepository.findByName(name.getValue()).map(mapper::toModel).orElse(null)));
    }
}
