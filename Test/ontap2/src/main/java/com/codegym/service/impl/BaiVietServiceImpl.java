package com.codegym.service.impl;

import com.codegym.model.BaiViet;
import com.codegym.model.Tinh;
import com.codegym.repository.BaiVietRepository;
import com.codegym.repository.TinhRepository;
import com.codegym.service.BaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BaiVietServiceImpl implements BaiVietService {
    @Autowired
    BaiVietRepository baiVietRepository;
    @Override
    public Iterable<BaiViet> findAll() {
        return baiVietRepository.findAll();
    }

    @Override
    public Page<BaiViet> findAll(Pageable pageable) {
        return baiVietRepository.findAll(pageable);
    }

    @Override
    public BaiViet findById(Long id) {
        return baiVietRepository.findById(id).orElse(null);
    }

    @Override
    public void save(BaiViet baiViet) {
        baiVietRepository.save(baiViet);
    }

    @Override
    public void remove(Long id) {
        baiVietRepository.deleteById(id);
    }

    @Override
    public Page<BaiViet> findAllByTinh_TenTinh(String ten, Pageable pageable) {
        return baiVietRepository.findAllByTinh_TenTinh(ten,pageable);
    }
}
