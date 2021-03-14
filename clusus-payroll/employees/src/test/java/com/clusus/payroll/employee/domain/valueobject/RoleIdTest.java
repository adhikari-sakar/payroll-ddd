package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoleIdTest {

    @Test
    public void whenTwoRoleIdAreSameThenTheyAreEqual() {
        RoleId roleId1 = new RoleId(1L);
        RoleId roleId2 = new RoleId(1L);
        assertThat(roleId1).isEqualTo(roleId2);
        assertThat(roleId1.hashCode()).isEqualTo(roleId2.hashCode());
    }

    @Test
    public void whenTwoRoleIdAreDifferentThenTheyAreNotEqual() {
        RoleId roleId1 = new RoleId(1L);
        RoleId roleId2 = new RoleId(2L);
        assertThat(roleId1).isNotEqualTo(roleId2);
        assertThat(roleId1.hashCode()).isNotEqualTo(roleId2.hashCode());
    }

}