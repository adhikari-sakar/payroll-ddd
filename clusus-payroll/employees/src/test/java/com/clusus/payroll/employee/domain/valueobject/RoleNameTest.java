package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoleNameTest {

    @Test
    public void whenTwoRoleNameAreSameThenTheyAreEqual() {
        RoleName roleName1 = new RoleName("developer");
        RoleName roleName2 = new RoleName("developer");
        assertThat(roleName1).isEqualTo(roleName2);
        assertThat(roleName1.hashCode()).isEqualTo(roleName2.hashCode());
    }

    @Test
    public void whenTwoRoleNameAreDifferentThenTheyAreEqual() {
        RoleName roleName1 = new RoleName("Developer");
        RoleName roleName2 = new RoleName("developer");
        assertThat(roleName1).isNotEqualTo(roleName2);
        assertThat(roleName1.hashCode()).isNotEqualTo(roleName2.hashCode());
    }

}