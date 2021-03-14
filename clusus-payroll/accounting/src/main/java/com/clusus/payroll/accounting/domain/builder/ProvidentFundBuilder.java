package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.ProvidentFund;
import com.clusus.payroll.accounting.domain.model.ProvidentFundModel;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class ProvidentFundBuilder extends DomainBuilder<ProvidentFundModel, ProvidentFund> {
    protected ProvidentFundBuilder() {
        super(ProvidentFundBuilder::toDomain, ProvidentFundBuilder::toModel);
    }

    private static ProvidentFund toDomain(ProvidentFundModel model) {
//        return ProvidentFund.builder()
//                .enabled(model.getEnabled())
//                .autoCalculate(model.getAutoCalculate())
//                .rate(Rate.create(model.getRate()))
//                .amount(Money.of(model.getAmount()))
//                .entryDate(Date.create(model.getEntryDate()))
//                .build();
        return null;
    }

    private static ProvidentFundModel toModel(ProvidentFund domain) {
//        return ProvidentFundModel.builder()
//                .enabled(domain.getEnabled())
//                .autoCalculate(domain.getAutoCalculate())
//                .rate(domain.getRate().getValue())
//                .amount(domain.getAmount().getValue())
//                .entryDate(domain.getEntryDate().getValue())
//                .build();
        return null;
    }
}
