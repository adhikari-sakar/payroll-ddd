package com.clusus.payroll.application.repository.employee.department;

import com.clusus.payroll.application.mapper.DepartmentMapper;
import com.clusus.payroll.employee.domain.builder.DepartmentBuilder;
import com.clusus.payroll.employee.domain.entity.Department;
import com.clusus.payroll.employee.domain.repository.DepartmentRepository;
import com.clusus.payroll.employee.domain.valueobject.DepartmentId;
import com.clusus.payroll.employee.domain.valueobject.DepartmentName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private final DepartmentMapper mapper;
    private final DepartmentJpaRepository jpaRepository;

    @Override
    public void persist(Department department) {
        jpaRepository.save(mapper.toEntity(new DepartmentBuilder().build(department)));
    }

    @Override
    public Optional<Department> findByDepartmentId(DepartmentId id) {
        return Optional.ofNullable(new DepartmentBuilder()
                .build(jpaRepository.findById(id.getValue())
                        .map(mapper::toModel).orElse(null)));
    }

    @Override
    public Optional<Department> findByName(DepartmentName name) {
        return Optional.ofNullable(new DepartmentBuilder()
                .build(jpaRepository.findByName(name.getValue()).map(mapper::toModel).orElse(null)));
    }
}
