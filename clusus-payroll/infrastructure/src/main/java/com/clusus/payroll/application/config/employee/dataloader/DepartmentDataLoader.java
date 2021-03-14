package com.clusus.payroll.application.config.employee.dataloader;

import com.clusus.payroll.employee.domain.builder.DepartmentBuilder;
import com.clusus.payroll.employee.domain.entity.Department;
import com.clusus.payroll.employee.domain.model.DepartmentModel;
import com.clusus.payroll.employee.domain.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class DepartmentDataLoader {

    private final DepartmentDataWrapper wrapper;
    private final DepartmentRepository repository;

    @PostConstruct
    public void loadData() {
        getDepartments().forEach(this::load);
    }

    private void load(Department department) {
        repository.findByName(department.getName())
                .ifPresentOrElse(existing -> update(existing, department), () -> add(department));
    }

    private void update(Department existing, Department updated) {
        existing.assign(updated.getName());
        repository.persist(existing);
    }

    private void add(Department department) {
        Department newDepartment = new Department(department.getId());
        newDepartment.assign(department.getName());
        repository.persist(newDepartment);
    }

    private List<Department> getDepartments() {
        return wrapper.getNames().stream().map(this::toDepartment).collect(Collectors.toList());
    }

    private Department toDepartment(String name) {
        return new DepartmentBuilder().build(DepartmentModel.of(name));
    }

}
