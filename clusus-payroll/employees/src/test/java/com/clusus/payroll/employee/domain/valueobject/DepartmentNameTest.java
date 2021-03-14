package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DepartmentNameTest {

    @Test
    public void whenTwoDepartmentNameAreSameThenTheyAreEqual() {
        DepartmentName departmentName1 = new DepartmentName("Support");
        DepartmentName departmentName2 = new DepartmentName("Support");
        assertThat(departmentName1).isEqualTo(departmentName2);
        assertThat(departmentName1.hashCode()).isEqualTo(departmentName2.hashCode());
    }

    @Test
    public void whenTwoDepartmentNameAreDifferentThenTheyAreNotEqual() {
        DepartmentName departmentName1 = new DepartmentName("Support");
        DepartmentName departmentName2 = new DepartmentName("support");
        assertThat(departmentName1).isNotEqualTo(departmentName2);
        assertThat(departmentName1.hashCode()).isNotEqualTo(departmentName2.hashCode());
    }

}