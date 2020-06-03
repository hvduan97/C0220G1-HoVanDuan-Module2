package com.codegym.cms.service.Impl;

import com.codegym.cms.model.AcademicLevel;

import com.codegym.cms.repository.AcademicLevelRepository;

import com.codegym.cms.service.AcademicLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademicLevelServiceImpl implements AcademicLevelService {
    @Autowired
    private AcademicLevelRepository academicLevelRepository;

    @Override
    public Iterable<AcademicLevel> findAll() {
        return academicLevelRepository.findAll();
    }

    @Override
    public AcademicLevel findById(Long id) {
        return academicLevelRepository.findById(id).orElse(null);
    }

    @Override
    public void save(AcademicLevel academicLevel) {
        academicLevelRepository.save(academicLevel);
    }

    @Override
    public void remove(Long id) {
        academicLevelRepository.deleteById(id);
    }
}
