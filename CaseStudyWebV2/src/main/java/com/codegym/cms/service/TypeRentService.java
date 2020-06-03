package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.TypeRent;

public interface TypeRentService {
    Iterable<TypeRent> findAll();

    TypeRent findById(Long id);

    void save(TypeRent typeRent);

    void remove(Long id);
}
