package com.clusus.payroll.shared.domain.builder;


import com.clusus.payroll.shared.domain.core.Entity;

import java.util.function.Function;

public abstract class DomainBuilder<M, D extends Entity> {

    private final Function<M, D> domainBuilder;
    private final Function<D, M> modelBuilder;

    protected DomainBuilder(Function<M, D> domainBuilder, Function<D, M> modelBuilder) {
        this.domainBuilder = domainBuilder;
        this.modelBuilder = modelBuilder;
    }

    public D build(M model) {
        return model == null ? null : domainBuilder.apply(model);
    }

    public M build(D domain) {
        return domain == null ? null : modelBuilder.apply(domain);
    }

}
