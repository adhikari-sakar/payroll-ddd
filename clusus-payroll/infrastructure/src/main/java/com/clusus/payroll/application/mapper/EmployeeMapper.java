package com.clusus.payroll.application.mapper;

import com.clusus.payroll.application.repository.employee.JpaEmployee;
import com.clusus.payroll.employee.domain.model.EmployeeModel;
import com.clusus.payroll.employee.registration.v1.request.CommonResponse;
import com.clusus.payroll.employee.registration.v1.request.EmployeeRegistrationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeModel toModel(EmployeeRegistrationRequest request);

    EmployeeModel toModel(JpaEmployee jpaEmployee);

    JpaEmployee toEntity(EmployeeModel employeeModel);

    CommonResponse toResponse(EmployeeModel employeeModel);

}
