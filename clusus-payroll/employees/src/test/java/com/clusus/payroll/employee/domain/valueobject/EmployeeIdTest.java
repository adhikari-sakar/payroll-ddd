package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeIdTest {
    @Test
    public void whenTwoEmployeeIdAreSameThenTheyAreEqual() {
        String empId = UUID.randomUUID().toString();
        EmployeeId employeeId1 = new EmployeeId(empId);
        EmployeeId employeeId2 = new EmployeeId(empId);
        assertThat(employeeId1).isEqualTo(employeeId2);
        assertThat(employeeId1.hashCode()).isEqualTo(employeeId2.hashCode());
    }

    @Test
    public void whenTwoEmployeeIdAreNotSameThenTheyAreNotEqual() {
        EmployeeId employeeId1 = new EmployeeId(UUID.randomUUID().toString());
        EmployeeId employeeId2 = new EmployeeId(UUID.randomUUID().toString());
        assertThat(employeeId1).isNotEqualTo(employeeId2);
        assertThat(employeeId1.hashCode()).isNotEqualTo(employeeId2.hashCode());
    }

}