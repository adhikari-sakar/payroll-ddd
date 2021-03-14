package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.Salary;
import com.clusus.payroll.accounting.domain.model.SalaryModel;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class SalaryBuilder extends DomainBuilder<SalaryModel, Salary> {
    protected SalaryBuilder() {
        super(SalaryBuilder::toDomain, SalaryBuilder::toModel);
    }

    private static Salary toDomain(SalaryModel model) {
//        return Salary.builder()
//                .amount(Money.of(model.getAmount()))
//                .entryDate(Date.create(model.getEntryDate()))
//                .build();
        return null;
    }

    private static SalaryModel toModel(Salary domain) {
//        return SalaryModel.builder()
//                .amount(domain.getAmount().getValue())
//                .entryDate(domain.getEntryDate().getValue())
//                .build();
        return null;
    }
}
