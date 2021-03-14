package com.clusus.payroll.employee.domain.valueobject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContactTest {

    @Test
    public void whenTwoContactAreSameThenTheyAreEqual() {
        Contact contact1 = new Contact(new Email("email1"), new Phone("phone1"), new Phone("phone2"));
        Contact contact2 = new Contact(new Email("email1"), new Phone("phone1"), new Phone("phone2"));
        assertThat(contact1).isEqualTo(contact2);
        assertThat(contact1.hashCode()).isEqualTo(contact1.hashCode());
    }

    @Test
    public void whenTwoContactAreDifferentThenTheyAreNotEqual() {
        Contact contact1 = new Contact(new Email("email1"), new Phone("phone1"), new Phone("phone2"));
        Contact contact2 = new Contact(new Email("email2"), new Phone("phone1"), new Phone("phone2"));
        assertThat(contact1).isNotEqualTo(contact2);
        assertThat(contact1.hashCode()).isNotEqualTo(contact2.hashCode());
    }

}