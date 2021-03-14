package com.clusus.payroll.employee.domain.valueobject;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddressTest {

    @Test
    public void whenAddressAreSameThenAddressAreEqual() {
        Address address1 = new Address("testCurrent", "testPermanent");
        Address address2 = new Address("testCurrent", "testPermanent");
        assertThat(address1).isEqualTo(address2);
        assertThat(address1.hashCode()).isEqualTo(address2.hashCode());
    }

    @Test
    public void whenAddressAreNotSameThenAddressAreNotEqual() {
        Address address1 = new Address("testCurrent1", "testPermanent1");
        Address address2 = new Address("testCurrent2", "testPermanent2");
        assertThat(address1).isNotEqualTo(address2);
        assertThat(address1.hashCode()).isNotEqualTo(address2.hashCode());
    }

}