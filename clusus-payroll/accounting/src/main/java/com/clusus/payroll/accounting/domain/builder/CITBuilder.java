package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.CIT;
import com.clusus.payroll.accounting.domain.model.CITModel;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class CITBuilder extends DomainBuilder<CITModel, CIT> {
    protected CITBuilder() {
        super(CITBuilder::toDomain, CITBuilder::toModel);
    }

    private static CIT toDomain(CITModel model) {
//        return CIT.builder()
//                .enabled(model.getEnabled())
//                .autoCalculate(model.getAutoCalculate())
//                .rate(Rate.create(model.getRate()))
//                .amount(Money.of(model.getAmount()))
//                .entryDate(Date.create(model.getEntryDate()))
//                .build();
        return null;
    }

    private static CITModel toModel(CIT domain) {
//        return CITModel.builder()
//                .enabled(domain.getEnabled())
//                .autoCalculate(domain.getAutoCalculate())
//                .rate(domain.getRate().getValue())
//                .amount(domain.getAmount().getValue())
//                .entryDate(domain.getEntryDate().getValue())
//                .build();
        return null;
    }
}
