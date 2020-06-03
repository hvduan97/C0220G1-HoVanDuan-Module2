package com.codegym.service;

import com.codegym.model.TypeCustomer;

public interface TypeCustomerService {
    Iterable<TypeCustomer> findAll();

    TypeCustomer findById(Long id);

    void save(TypeCustomer typeCustomer);

    void remove(Long id);
}
