package com.clusus.payroll.employee.domain.builder;

import com.clusus.payroll.employee.domain.entity.Team;
import com.clusus.payroll.employee.domain.model.TeamModel;
import com.clusus.payroll.employee.domain.valueobject.TeamId;
import com.clusus.payroll.employee.domain.valueobject.TeamName;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

public class TeamBuilder extends DomainBuilder<TeamModel, Team> {

    public TeamBuilder() {
        super(TeamBuilder::toDomain, TeamBuilder::toModel);
    }

    private static Team toDomain(TeamModel model) {
        Team department = new Team(new TeamId(model.getId()));
        department.assign(new TeamName(model.getName()));
        return department;
    }

    private static TeamModel toModel(Team domain) {
        return TeamModel.builder()
                .id(domain.getId().getValue())
                .name(domain.getName().getValue())
                .build();
    }

}
