package com.codegym.cms.service;

import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);

    Page<Category> findAllByNameContaining(Long id, Pageable pageable);
}
