package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneTest {

    @Test
    public void whenTwoPhoneAreSameThenTheyAreEqual() {
        Phone phone1 = new Phone("phone1");
        Phone phone2 = new Phone("phone1");
        assertThat(phone1).isEqualTo(phone2);
        assertThat(phone1.hashCode()).isEqualTo(phone1.hashCode());
    }

    @Test
    public void whenTwoPhoneAreDifferentThenTheyAreNotEqual() {
        Phone phone1 = new Phone("phone1");
        Phone phone2 = new Phone("phone2");
        assertThat(phone1).isNotEqualTo(phone2);
        assertThat(phone1.hashCode()).isNotEqualTo(phone2.hashCode());
    }
}