package com.clusus.payroll.employee.domain.entity;

import com.clusus.payroll.employee.domain.valueobject.RoleId;
import com.clusus.payroll.employee.domain.valueobject.RoleName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isEqualEntity() {
        RoleId roleId = new RoleId(1L);
        Role developer = new Role(roleId);
        developer.assign(new RoleName("Developer"));
        Role anotherDeveloper = new Role(roleId);
        anotherDeveloper.assign(new RoleName("Developer"));
        System.out.println(developer.hashCode());
        System.out.println(anotherDeveloper.hashCode());
        assertEquals(developer, anotherDeveloper);
    }
}