package com.clusus.payroll.employee.domain.repository;

import com.clusus.payroll.employee.domain.entity.Role;
import com.clusus.payroll.employee.domain.valueobject.RoleId;
import com.clusus.payroll.employee.domain.valueobject.RoleName;

import java.util.Optional;

public interface RoleRepository {

    void persist(Role role);

    Optional<Role> findByRoleId(RoleId id);

    Optional<Role> findByName(RoleName name);

}
