package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeCodeTest {

    @Test
    public void whenTwoEmployeeCodeAreSameThenTheyAreEqual() {
        EmployeeCode employeeCode1 = new EmployeeCode("u570");
        EmployeeCode employeeCode2 = new EmployeeCode("u570");
        assertThat(employeeCode1).isEqualTo(employeeCode2);
        assertThat(employeeCode1.hashCode()).isEqualTo(employeeCode2.hashCode());
    }

    @Test
    public void whenTwoEmployeeCodeAreDifferentThenTheyAreEqual() {
        EmployeeCode employeeCode1 = new EmployeeCode("u570");
        EmployeeCode employeeCode2 = new EmployeeCode("u571");
        assertThat(employeeCode1).isNotEqualTo(employeeCode2);
        assertThat(employeeCode1.hashCode()).isNotEqualTo(employeeCode2.hashCode());
    }

}