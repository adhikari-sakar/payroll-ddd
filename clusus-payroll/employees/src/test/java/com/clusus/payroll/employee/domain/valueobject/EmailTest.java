package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailTest {

    @Test
    public void whenTwoEmailAreSameThenTheyAreEqual() {
        Email email1 = new Email("sakar.adhikari@clusus.com");
        Email email2 = new Email("sakar.adhikari@clusus.com");
        assertThat(email1).isEqualTo(email2);
        assertThat(email1.hashCode()).isEqualTo(email2.hashCode());
    }

    @Test
    public void whenTwoEmailAreDifferentThenTheyAreEqual() {
        Email email1 = new Email("sakar.adhikari@clusus.com");
        Email email2 = new Email("Sakar.Adhikari@clusus.com");
        assertThat(email1).isNotEqualTo(email2);
        assertThat(email1.hashCode()).isNotEqualTo(email2.hashCode());
    }
}