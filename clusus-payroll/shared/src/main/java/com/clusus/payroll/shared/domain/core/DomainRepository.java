package com.clusus.payroll.shared.domain.core;

import java.util.Optional;

public abstract class DomainRepository<T extends AggregateRoot<ID>, ID extends ValueObject> {

  private final DomainEventPublisher publisher;

  protected DomainRepository(DomainEventPublisher publisher) {
    this.publisher = publisher;
  }

  public abstract Optional<T> findOne(ID id);

  public void save(T entity) {
    DomainAsserts.begin(entity).notNull(DomainError.create(this, "EntityIsRequired")).end();
    this.persist(entity);
    entity.getDomainEvents().forEach(publisher::publish);
    entity.clearDomainEvents();
  }

  protected abstract void persist(T entity);
}
