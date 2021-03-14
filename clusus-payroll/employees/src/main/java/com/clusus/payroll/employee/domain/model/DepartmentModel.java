package com.clusus.payroll.employee.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class DepartmentModel {
    private Long id;
    private String name;

    public static DepartmentModel of(String name) {
        return DepartmentModel.builder().name(name).build();
    }
}
