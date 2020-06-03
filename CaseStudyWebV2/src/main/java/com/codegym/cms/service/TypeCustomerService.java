package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.TypeCustomer;

public interface TypeCustomerService {
    Iterable<TypeCustomer> findAll();

    TypeCustomer findById(Long id);

    void save(TypeCustomer typeCustomer);

    void remove(Long id);
}
