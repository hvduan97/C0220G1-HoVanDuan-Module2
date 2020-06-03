package com.codegym.cms.service.Impl;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.GoFollow;
import com.codegym.cms.repository.CustomerRepository;
import com.codegym.cms.repository.GoFollowRepository;
import com.codegym.cms.service.GoFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoFollowServiceImpl implements GoFollowService {
    @Autowired
    private GoFollowRepository goFollowRepository;

    @Override
    public Iterable<GoFollow> findAll() {
        return goFollowRepository.findAll();
    }

    @Override
    public GoFollow findById(Long id) {
        return goFollowRepository.findById(id).orElse(null);
    }

    @Override
    public void save(GoFollow goFollow) {
        goFollowRepository.save(goFollow);
    }

    @Override
    public void remove(Long id) {
        goFollowRepository.deleteById(id);
    }
}
