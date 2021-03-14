package com.clusus.payroll.employee.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleModel {
    private Long id;
    private String name;

    public static RoleModel of(String name) {
        return RoleModel.builder().name(name).build();
    }
}
