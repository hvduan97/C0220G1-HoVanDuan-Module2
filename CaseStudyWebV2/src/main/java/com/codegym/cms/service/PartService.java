package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Part;

public interface PartService {
    Iterable<Part> findAll();

    Part findById(Long id);

    void save(Part part);

    void remove(Long id);
}
