package com.codegym.service.impl;

import com.codegym.model.TypeCustomer;
import com.codegym.repository.TypeCustomerRepository;
import com.codegym.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    private TypeCustomerRepository typeCustomerRepository;

    @Override
    public Iterable<TypeCustomer> findAll() {
        return typeCustomerRepository.findAll();
    }

    @Override
    public TypeCustomer findById(Long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TypeCustomer typeCustomer) {
        typeCustomerRepository.save(typeCustomer);
    }

    @Override
    public void remove(Long id) {
        typeCustomerRepository.deleteById(id);
    }
}
