package com.codegym.cms.service;

import com.codegym.cms.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceService {
    Iterable<Service> findAll();

    Service findById(Long id);

    void save(Service service);

    void remove(Long id);

    Page<Service> findAll(Pageable pageable);

    Page<Service> findAllByNameContaining(String name, Pageable pageable);
}
