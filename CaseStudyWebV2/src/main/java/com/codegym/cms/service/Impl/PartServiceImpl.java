package com.codegym.cms.service.Impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Part;
import com.codegym.cms.repository.CustomerRepository;
import com.codegym.cms.repository.PartRepository;
import com.codegym.cms.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartServiceImpl implements PartService {
    @Autowired
    private PartRepository partRepository;

    @Override
    public Iterable<Part> findAll() {
        return partRepository.findAll();
    }

    @Override
    public Part findById(Long id) {
        return partRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Part part) {
        partRepository.save(part);
    }

    @Override
    public void remove(Long id) {
        partRepository.deleteById(id);
    }
}
