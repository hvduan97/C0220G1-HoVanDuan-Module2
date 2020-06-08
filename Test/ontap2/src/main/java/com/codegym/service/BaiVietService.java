package com.codegym.service;

import com.codegym.model.BaiViet;
import com.codegym.model.Tinh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaiVietService {
    Iterable<BaiViet> findAll();
    Page<BaiViet> findAll(Pageable pageable);

    BaiViet findById(Long id);

    void save(BaiViet baiViet);

    void remove(Long id);
    Page<BaiViet> findAllByTinh_TenTinh(String abc, Pageable pageable);
}
