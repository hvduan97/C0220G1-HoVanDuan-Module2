package com.codegym.cms.service;

import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    Iterable<Category> findAll();
    List<Category> findAll2();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);

    Page<Category> findAllByNameContaining(Long id, Pageable pageable);
}
