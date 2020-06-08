package com.codegym.service;

import com.codegym.model.Tinh;

public interface TinhService {
    Iterable<Tinh> findAll();

    Tinh findById(Long id);

    void save(Tinh tinh);

    void remove(Long id);
}
