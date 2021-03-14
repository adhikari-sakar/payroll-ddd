package com.clusus.payroll.employee.domain.repository;

import com.clusus.payroll.employee.domain.entity.Department;
import com.clusus.payroll.employee.domain.valueobject.DepartmentId;
import com.clusus.payroll.employee.domain.valueobject.DepartmentName;

import java.util.Optional;

public interface DepartmentRepository {

    void persist(Department department);

    Optional<Department> findByDepartmentId(DepartmentId id);

    Optional<Department> findByName(DepartmentName name);

}
