package com.clusus.payroll.employee.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamModel {
    private Long id;
    private String name;

    public static TeamModel of(String name) {
        return TeamModel.builder().name(name).build();
    }
}
