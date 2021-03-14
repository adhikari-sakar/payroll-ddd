package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BloodGroupTest {
    @Test
    public void whenTwoBloodGroupAreSameThenTheyAreEqual() {
        BloodGroup group1 = new BloodGroup("A-");
        BloodGroup group2 = new BloodGroup("A-");
        assertThat(group1).isEqualTo(group2);
        assertThat(group1.hashCode()).isEqualTo(group2.hashCode());
    }

    @Test
    public void whenTwoBloodGroupAreDifferentThenTheyAreNotEqual() {
        BloodGroup group1 = new BloodGroup("A-");
        BloodGroup group2 = new BloodGroup("B+");
        assertThat(group1).isNotEqualTo(group2);
        assertThat(group1.hashCode()).isNotEqualTo(group2.hashCode());
    }


}