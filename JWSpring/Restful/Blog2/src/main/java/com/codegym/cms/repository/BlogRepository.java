package com.codegym.cms.repository;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findAllByCategory_IdContaining(String id, Pageable pageable);
    Page<Blog> findAllByCategory_NameContaining(String name, Pageable pageable);
    List<Blog> findAllByCategory_Id(Long id);
}
