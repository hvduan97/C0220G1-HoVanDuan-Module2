package com.codegym.cms.service;

import com.codegym.cms.model.AcademicLevel;
import com.codegym.cms.model.Customer;

public interface AcademicLevelService {
    Iterable<AcademicLevel> findAll();

    AcademicLevel findById(Long id);

    void save(AcademicLevel academicLevel);

    void remove(Long id);
}
