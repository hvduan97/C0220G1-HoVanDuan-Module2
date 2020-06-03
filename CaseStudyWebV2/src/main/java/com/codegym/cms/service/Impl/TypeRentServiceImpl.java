package com.codegym.cms.service.Impl;


import com.codegym.cms.model.TypeRent;

import com.codegym.cms.repository.TypeRentRepository;
import com.codegym.cms.service.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeRentServiceImpl implements TypeRentService {
    @Autowired
    private TypeRentRepository typeRentRepository;

    @Override
    public Iterable<TypeRent> findAll() {
        return typeRentRepository.findAll();
    }

    @Override
    public TypeRent findById(Long id) {
        return typeRentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TypeRent typeRent) {
        typeRentRepository.save(typeRent);
    }

    @Override
    public void remove(Long id) {
        typeRentRepository.deleteById(id);
    }
}
