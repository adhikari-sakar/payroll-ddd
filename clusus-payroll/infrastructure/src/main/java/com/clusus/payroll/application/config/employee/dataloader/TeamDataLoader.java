package com.clusus.payroll.application.config.employee.dataloader;

import com.clusus.payroll.employee.domain.builder.TeamBuilder;
import com.clusus.payroll.employee.domain.entity.Team;
import com.clusus.payroll.employee.domain.model.TeamModel;
import com.clusus.payroll.employee.domain.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class TeamDataLoader {

    private final TeamDataWrapper wrapper;
    private final TeamRepository repository;

    @PostConstruct
    public void loadData() {
        getTeams().forEach(this::load);
    }

    private void load(Team department) {
        repository.findByName(department.getName())
                .ifPresentOrElse(existing -> update(existing, department), () -> add(department));
    }

    private void update(Team existing, Team updated) {
        existing.assign(updated.getName());
        repository.persist(existing);
    }

    private void add(Team team) {
        Team newTeam = new Team(team.getId());
        newTeam.assign(team.getName());
        repository.persist(newTeam);
    }

    private List<Team> getTeams() {
        return wrapper.getNames().stream().map(this::toTeam).collect(Collectors.toList());
    }

    private Team toTeam(String name) {
        return new TeamBuilder().build(TeamModel.of(name));
    }

}
