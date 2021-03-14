package com.clusus.payroll.employee.domain.builder;

import com.clusus.payroll.employee.domain.entity.Role;
import com.clusus.payroll.employee.domain.model.RoleModel;
import com.clusus.payroll.employee.domain.valueobject.RoleId;
import com.clusus.payroll.employee.domain.valueobject.RoleName;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

public class RoleBuilder extends DomainBuilder<RoleModel, Role> {

    public RoleBuilder() {
        super(RoleBuilder::toDomain, RoleBuilder::toModel);
    }

    private static Role toDomain(RoleModel model) {
        Role role = new Role(new RoleId(model.getId()));
        role.assign(new RoleName(model.getName()));
        return role;
    }

    private static RoleModel toModel(Role domain) {
        return RoleModel.builder()
                .id(domain.getId().getValue())
                .name(domain.getName().getValue())
                .build();
    }

}
