package com.clusus.payroll.employee.domain.event;

import com.clusus.payroll.shared.domain.core.DomainEvent;

public class EmployeeRegistered extends DomainEvent {
    public EmployeeRegistered(DomainEventType domainEventType) {
        super(domainEventType);
    }
}
