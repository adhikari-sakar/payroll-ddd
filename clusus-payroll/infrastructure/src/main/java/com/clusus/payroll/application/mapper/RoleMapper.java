package com.clusus.payroll.application.mapper;

import com.clusus.payroll.application.repository.employee.role.JpaEmployeeRole;
import com.clusus.payroll.employee.domain.model.RoleModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleModel toModel(JpaEmployeeRole jpaRole);

    JpaEmployeeRole toEntity(RoleModel roleModel);

}
