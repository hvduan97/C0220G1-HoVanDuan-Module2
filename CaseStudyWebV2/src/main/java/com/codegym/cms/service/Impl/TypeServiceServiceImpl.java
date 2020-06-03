package com.codegym.cms.service.Impl;


import com.codegym.cms.model.TypeService;

import com.codegym.cms.repository.TypeServiceRepository;
import com.codegym.cms.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceServiceImpl implements TypeServiceService {
    @Autowired
    private TypeServiceRepository typeServiceRepository;

    @Override
    public Iterable<TypeService> findAll() {
        return typeServiceRepository.findAll();
    }

    @Override
    public TypeService findById(Long id) {
        return typeServiceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TypeService typeService) {
        typeServiceRepository.save(typeService);
    }

    @Override
    public void remove(Long id) {
        typeServiceRepository.deleteById(id);
    }
}
