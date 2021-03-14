package com.clusus.payroll.employee.domain.service;

public interface DomainService<T,R> {

    R register(T domain);
}
