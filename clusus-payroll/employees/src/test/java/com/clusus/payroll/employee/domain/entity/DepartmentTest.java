package com.clusus.payroll.employee.domain.entity;

import com.clusus.payroll.employee.domain.valueobject.DepartmentId;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DepartmentTest {

    @Test
    public void whenTwoDepartmentAreSameThenTheyAreEqual() {
        Department department1 = new Department(new DepartmentId(1L));
        Department department2 = new Department(new DepartmentId(1L));
        assertThat(department1).isEqualTo(department2);
        assertThat(department1.hashCode()).isEqualTo(department2.hashCode());
    }

    @Test
    public void whenTwoDepartmentAreDifferentThenTheyAreNotEqual() {
        Department department1 = new Department(new DepartmentId(1L));
        Department department2 = new Department(new DepartmentId(2L));
        assertThat(department1).isNotEqualTo(department2);
        assertThat(department1.hashCode()).isNotEqualTo(department2.hashCode());
    }

}