package com.codegym.service.impl;

import com.codegym.model.Tinh;
import com.codegym.repository.TinhRepository;
import com.codegym.service.TinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TinhServiceImpl implements TinhService {
    @Autowired
    TinhRepository tinhRepository;
    @Override
    public Iterable<Tinh> findAll() {
        return tinhRepository.findAll();
    }

    @Override
    public Tinh findById(Long id) {
        return tinhRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Tinh tinh) {
        tinhRepository.save(tinh);
    }

    @Override
    public void remove(Long id) {
        tinhRepository.deleteById(id);
    }
}
