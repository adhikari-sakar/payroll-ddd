package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DepartmentIdTest {
    @Test
    public void whenTwoDepartmentIdAreSameThenTheyAreEqual() {
        DepartmentId departmentId1 = new DepartmentId(1L);
        DepartmentId departmentId2 = new DepartmentId(1L);
        assertThat(departmentId1).isEqualTo(departmentId2);
        assertThat(departmentId1.hashCode()).isEqualTo(departmentId2.hashCode());
    }

    @Test
    public void whenTwoDepartmentIdAreNotSameThenTheyAreNotEqual() {
        DepartmentId departmentId1 = new DepartmentId(1L);
        DepartmentId departmentId2 = new DepartmentId(2L);
        assertThat(departmentId1).isNotEqualTo(departmentId2);
        assertThat(departmentId1.hashCode()).isNotEqualTo(departmentId2.hashCode());
    }
}