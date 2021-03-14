package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TeamIdTest {

    @Test
    public void whenTwoTeamIdAreSameThenTheyAreEqual() {
        TeamId teamId1 = new TeamId(1L);
        TeamId teamId2 = new TeamId(1L);
        assertThat(teamId1).isEqualTo(teamId2);
        assertThat(teamId1.hashCode()).isEqualTo(teamId2.hashCode());
    }

    @Test
    public void whenTwoTeamIdAreDifferentThenTheyAreNotEqual() {
        TeamId teamId1 = new TeamId(1L);
        TeamId teamId2 = new TeamId(2L);
        assertThat(teamId1).isNotEqualTo(teamId2);
        assertThat(teamId1.hashCode()).isNotEqualTo(teamId2.hashCode());
    }

}