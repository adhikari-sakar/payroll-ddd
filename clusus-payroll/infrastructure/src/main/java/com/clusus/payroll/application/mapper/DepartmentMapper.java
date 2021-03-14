package com.clusus.payroll.application.mapper;

import com.clusus.payroll.application.repository.employee.department.JpaEmployeeDepartment;
import com.clusus.payroll.employee.domain.model.DepartmentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentModel toModel(JpaEmployeeDepartment jpaDepartment);

    JpaEmployeeDepartment toEntity(DepartmentModel departmentModel);

}
