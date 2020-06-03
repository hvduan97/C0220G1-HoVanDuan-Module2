package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Position;

public interface PositionService {
    Iterable<Position> findAll();

    Position findById(Long id);

    void save(Position position);

    void remove(Long id);
}
