package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.GoFollow;

public interface GoFollowService {
    Iterable<GoFollow> findAll();

    GoFollow findById(Long id);

    void save(GoFollow goFollow);

    void remove(Long id);
}
