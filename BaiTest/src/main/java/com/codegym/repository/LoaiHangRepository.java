package com.codegym.repository;

import com.codegym.model.LoaiHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Loia extends JpaRepository<LoaiHang,Long> {
}
