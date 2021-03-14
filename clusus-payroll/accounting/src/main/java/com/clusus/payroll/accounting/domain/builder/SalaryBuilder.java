package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.Salary;
import com.clusus.payroll.accounting.domain.model.SalaryModel;
import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.accounting.domain.valueobject.SalaryId;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class SalaryBuilder extends DomainBuilder<SalaryModel, Salary> {
    protected SalaryBuilder() {
        super(SalaryBuilder::toDomain, SalaryBuilder::toModel);
    }

    private static Salary toDomain(SalaryModel model) {
        Salary salary = new Salary(new SalaryId(model.getId()));
        salary.release(model.getEntryDate(), Money.of(model.getAmount()));
        return salary;
    }

    private static SalaryModel toModel(Salary domain) {
        return SalaryModel.builder()
                .id(domain.getId().getValue())
                .amount(domain.getAmount().getValue())
                .entryDate(domain.getEntryDate())
                .build();
    }
}
