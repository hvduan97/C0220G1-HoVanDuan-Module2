package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.TypeService;

public interface TypeServiceService {
    Iterable<TypeService> findAll();

    TypeService findById(Long id);

    void save(TypeService typeService);

    void remove(Long id);
}
