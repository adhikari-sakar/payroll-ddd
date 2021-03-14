package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.ProvidentFund;
import com.clusus.payroll.accounting.domain.model.ProvidentFundModel;
import com.clusus.payroll.accounting.domain.valueobject.EPFId;
import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.accounting.domain.valueobject.Rate;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class ProvidentFundBuilder extends DomainBuilder<ProvidentFundModel, ProvidentFund> {
    protected ProvidentFundBuilder() {
        super(ProvidentFundBuilder::toDomain, ProvidentFundBuilder::toModel);
    }

    private static ProvidentFund toDomain(ProvidentFundModel model) {
        ProvidentFund fund = new ProvidentFund(new EPFId(model.getId()));
        fund.release(model.getEnabled(), model.getAutoCalculate(), new Rate(model.getRate()),
                Money.of(model.getAmount()), model.getEntryDate());
        return fund;
    }

    private static ProvidentFundModel toModel(ProvidentFund domain) {
        return ProvidentFundModel.builder()
                .id(domain.getId().getValue())
                .enabled(domain.getEnabled())
                .autoCalculate(domain.getAutoCalculate())
                .rate(domain.getRate().getValue())
                .amount(domain.getAmount().getValue())
                .entryDate(domain.getEntryDate())
                .build();
    }
}
