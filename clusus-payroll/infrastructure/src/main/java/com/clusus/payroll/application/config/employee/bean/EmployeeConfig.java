package com.clusus.payroll.application.config.employee.bean;

import com.clusus.payroll.application.repository.employee.EmployeeDomainRepository;
import com.clusus.payroll.application.service.RegistrationService;
import com.clusus.payroll.employee.domain.repository.DepartmentRepository;
import com.clusus.payroll.employee.domain.repository.RoleRepository;
import com.clusus.payroll.employee.domain.repository.TeamRepository;
import com.clusus.payroll.shared.domain.core.DomainEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public DomainEventPublisher publisher() {
        return domainEvent -> {

        };
    }

    @Bean
    public RegistrationService service(EmployeeDomainRepository domainRepository,
                                       DepartmentRepository departmentRepository,
                                       RoleRepository roleRepository,
                                       TeamRepository teamRepository) {
        return new RegistrationService(domainRepository, departmentRepository, roleRepository, teamRepository);
    }

}
