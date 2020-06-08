package com.codegym.repository;

import com.codegym.model.BaiViet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaiVietRepository extends JpaRepository<BaiViet,Long> {
    Page<BaiViet> findAllByTinh_TenTinh(String abc, Pageable pageable);
//    Page<BaiViet> findAllByTinh_TenTinh()
}
