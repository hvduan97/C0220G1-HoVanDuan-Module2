package com.codegym.cms.service;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog customer);

    void remove(Long id);
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findAllByCategory_IdContaining(String id, Pageable pageable);
    Page<Blog> findAllByCategory_NameContaining(String name, Pageable pageable);

}
