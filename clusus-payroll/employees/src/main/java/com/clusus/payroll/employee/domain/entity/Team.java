package com.clusus.payroll.employee.domain.entity;

import com.clusus.payroll.employee.domain.valueobject.TeamId;
import com.clusus.payroll.employee.domain.valueobject.TeamName;
import com.clusus.payroll.shared.domain.core.Entity;

public class Team extends Entity<TeamId> {
    private TeamName name;

    public Team(TeamId teamId) {
        super(teamId);
    }

    public void assign(TeamName name) {
        this.name = name;
    }

    public TeamName getName() {
        return name;
    }

    public Team get() {
        return this;
    }
}
