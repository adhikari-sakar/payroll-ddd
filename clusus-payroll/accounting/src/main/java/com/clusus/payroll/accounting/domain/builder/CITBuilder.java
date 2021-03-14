package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.CIT;
import com.clusus.payroll.accounting.domain.model.CITModel;
import com.clusus.payroll.accounting.domain.valueobject.CitId;
import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.accounting.domain.valueobject.Rate;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class CITBuilder extends DomainBuilder<CITModel, CIT> {
    protected CITBuilder() {
        super(CITBuilder::toDomain, CITBuilder::toModel);
    }

    private static CIT toDomain(CITModel model) {
        CIT cit = new CIT(new CitId(model.getId()));
        cit.release(model.getEnabled(), model.getAutoCalculate(), new Rate(model.getRate()),
                Money.of(model.getAmount()), model.getEntryDate());
        return cit;
    }

    private static CITModel toModel(CIT domain) {
        return CITModel.builder()
                .id(domain.getId().getValue())
                .enabled(domain.getEnabled())
                .autoCalculate(domain.getAutoCalculate())
                .rate(domain.getRate().getValue())
                .amount(domain.getAmount().getValue())
                .entryDate(domain.getEntryDate())
                .build();
    }
}
