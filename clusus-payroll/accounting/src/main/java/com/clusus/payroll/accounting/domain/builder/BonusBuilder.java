package com.clusus.payroll.accounting.domain.builder;

import com.clusus.payroll.accounting.domain.entity.Bonus;
import com.clusus.payroll.accounting.domain.model.BonusModel;
import com.clusus.payroll.accounting.domain.valueobject.BonusId;
import com.clusus.payroll.accounting.domain.valueobject.Money;
import com.clusus.payroll.shared.domain.builder.DomainBuilder;

final class BonusBuilder extends DomainBuilder<BonusModel, Bonus> {
    protected BonusBuilder() {
        super(BonusBuilder::toDomain, BonusBuilder::toModel);
    }

    private static Bonus toDomain(BonusModel model) {
        Bonus bonus = new Bonus(new BonusId(model.getId()));
        bonus.release(model.getEntryDate(), Money.of(model.getAmount()));
        return bonus;
    }

    private static BonusModel toModel(Bonus domain) {
        return BonusModel.builder()
                .id(domain.getId().getValue())
                .amount(domain.getAmount().getValue())
                .entryDate(domain.getEntryDate())
                .build();
    }
}
