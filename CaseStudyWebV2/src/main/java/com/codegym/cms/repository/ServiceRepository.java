package com.codegym.cms.repository;

import com.codegym.cms.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ServiceRepository extends PagingAndSortingRepository<Service,Long> {
    Page<Service> findAllByNameContaining(String name, Pageable pageable);
}
