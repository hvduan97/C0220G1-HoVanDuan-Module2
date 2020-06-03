package com.codegym.cms.service.Impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.TypeCustomer;
import com.codegym.cms.repository.CustomerRepository;
import com.codegym.cms.repository.TypeCustomerRepository;
import com.codegym.cms.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
