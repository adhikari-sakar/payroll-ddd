package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.Bonus;
import com.clusus.payroll.accounting.domain.model.BonusModel;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class BonusBuilder extends DomainBuilder<BonusModel, Bonus> {
    protected BonusBuilder() {
        super(BonusBuilder::toDomain, BonusBuilder::toModel);
    }

    private static Bonus toDomain(BonusModel model) {
//        return Bonus.builder()
//                .amount(Money.of(model.getAmount()))
//                .entryDate(Date.create(model.getEntryDate()))
//                .build();
        return null;
    }

    private static BonusModel toModel(Bonus domain) {
//        return BonusModel.builder()
//                .amount(domain.getAmount().getValue())
//                .entryDate(domain.getEntryDate().getValue())
//                .build();
        return null;
    }
}
