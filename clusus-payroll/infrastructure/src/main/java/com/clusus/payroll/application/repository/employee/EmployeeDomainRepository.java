package com.clusus.payroll.application.repository.employee;

import com.clusus.payroll.application.mapper.EmployeeMapper;
import com.clusus.payroll.employee.domain.builder.EmployeeBuilder;
import com.clusus.payroll.employee.domain.entity.Employee;
import com.clusus.payroll.employee.domain.valueobject.EmployeeId;
import com.clusus.payroll.shared.domain.core.DomainEventPublisher;
import com.clusus.payroll.shared.domain.core.DomainRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmployeeDomainRepository extends DomainRepository<Employee, EmployeeId> {
    private final EmployeeMapper mapper;
    private final EmployeeJpaRepository jpaRepository;

    protected EmployeeDomainRepository(DomainEventPublisher publisher, EmployeeMapper mapper, EmployeeJpaRepository jpaRepository) {
        super(publisher);
        this.mapper = mapper;
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Optional<Employee> findOne(EmployeeId employeeId) {
        return Optional.ofNullable(new EmployeeBuilder().
                build(jpaRepository.findByEmployeeId(employeeId.getValue())
                        .map(mapper::toModel).orElse(null)));
    }

    @Override
    protected void persist(Employee entity) {
        jpaRepository.save(mapper.toEntity(new EmployeeBuilder().build(entity)));
    }

}
