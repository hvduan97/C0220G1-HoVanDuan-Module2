package com.codegym.cms.repository;

import com.codegym.cms.model.Part;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PartRepository extends PagingAndSortingRepository<Part,Long> {
}
