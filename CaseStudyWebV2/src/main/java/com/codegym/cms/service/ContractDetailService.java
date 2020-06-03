package com.codegym.cms.service;

import com.codegym.cms.model.ContractDetail;
import com.codegym.cms.model.Customer;

public interface ContractDetailService {
    Iterable<ContractDetail> findAll();

    ContractDetail findById(Long id);

    void save(ContractDetail contractDetail);

    void remove(Long id);
}
