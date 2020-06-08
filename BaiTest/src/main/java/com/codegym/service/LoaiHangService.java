package com.codegym.service;

import com.codegym.model.LoaiHang;

public interface LoaiHangService {
    Iterable<LoaiHang> findAll();

    LoaiHang findById(Long id);

    void save(LoaiHang loaiHang);

    void remove(Long id);
}
