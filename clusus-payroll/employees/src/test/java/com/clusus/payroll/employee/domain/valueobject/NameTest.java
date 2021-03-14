package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NameTest {
    @Test
    public void whenTwoNameAreSameThenTheyAreEqual() {
        Name name1 = new Name("fistName1", "middleName1", "lastName1");
        Name name2 = new Name("fistName1", "middleName1", "lastName1");
        assertThat(name1).isEqualTo(name2);
        assertThat(name1.hashCode()).isEqualTo(name2.hashCode());
    }

    @Test
    public void whenTwoNameAreDifferentThenTheyAreNotEqual() {
        Name name1 = new Name("fistName1", "middleName1", "lastName1");
        Name name2 = new Name("fistName2", "middleName1", "lastName1");
        assertThat(name1).isNotEqualTo(name2);
        assertThat(name1.hashCode()).isNotEqualTo(name2.hashCode());
    }

}