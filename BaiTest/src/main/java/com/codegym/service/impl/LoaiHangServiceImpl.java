package com.codegym.service.impl;

import com.codegym.model.LoaiHang;
import com.codegym.repository.LoaiHangRepository;
import com.codegym.service.LoaiHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiHangServiceImpl implements LoaiHangService {
    @Autowired
    private LoaiHangRepository loaiHangRepository;

    @Override
    public Iterable<LoaiHang> findAll() {
        return loaiHangRepository.findAll();
    }

    @Override
    public LoaiHang findById(Long id) {
        return loaiHangRepository.findById(id).orElse(null);
    }

    @Override
    public void save(LoaiHang customer) {
        loaiHangRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        loaiHangRepository.deleteById(id);
    }
}
