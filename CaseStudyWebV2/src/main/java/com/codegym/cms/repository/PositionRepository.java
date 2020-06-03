package com.codegym.cms.repository;

import com.codegym.cms.model.Position;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PositionRepository extends PagingAndSortingRepository<Position,Long> {
}
