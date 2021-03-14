package com.clusus.payroll.employee.domain.builder;

import com.clusus.payroll.employee.domain.entity.Department;
import com.clusus.payroll.employee.domain.model.DepartmentModel;
import com.clusus.payroll.employee.domain.valueobject.DepartmentId;
import com.clusus.payroll.employee.domain.valueobject.DepartmentName;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

public class DepartmentBuilder extends DomainBuilder<DepartmentModel, Department> {

    public DepartmentBuilder() {
        super(DepartmentBuilder::toDomain, DepartmentBuilder::toModel);
    }

    private static Department toDomain(DepartmentModel model) {
        Department department = new Department(new DepartmentId(model.getId()));
        department.assign(new DepartmentName(model.getName()));
        return department;
    }

    private static DepartmentModel toModel(Department domain) {
        return DepartmentModel.builder()
                .id(domain.getId().getValue())
                .name(domain.getName().getValue())
                .build();
    }

}
