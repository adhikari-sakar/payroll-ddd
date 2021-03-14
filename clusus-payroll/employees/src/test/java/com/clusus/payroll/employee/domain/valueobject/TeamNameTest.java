package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TeamNameTest {

    @Test
    public void whenTwoTeamNameAreSameThenTheyAreEqual() {
        TeamName teamName1 = new TeamName("Vega");
        TeamName teamName2 = new TeamName("Vega");
        assertThat(teamName1).isEqualTo(teamName2);
        assertThat(teamName1.hashCode()).isEqualTo(teamName2.hashCode());
    }

    @Test
    public void whenTwoTeamNameAreDifferentThenTheyAreEqual() {
        TeamName teamName1 = new TeamName("Vega");
        TeamName teamName2 = new TeamName("Mars");
        assertThat(teamName1).isNotEqualTo(teamName2);
        assertThat(teamName1.hashCode()).isNotEqualTo(teamName2.hashCode());
    }
}