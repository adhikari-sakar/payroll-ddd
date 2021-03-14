package com.clusus.payroll.shared.domain.core;

@FunctionalInterface
public interface DomainEventPublisher {

  void publish(DomainEvent domainEvent);
}
