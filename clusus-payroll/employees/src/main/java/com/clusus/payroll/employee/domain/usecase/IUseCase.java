package com.clusus.payroll.employee.domain.usecase;

public interface IUseCase<T, R> {

    R apply(T object);
}
