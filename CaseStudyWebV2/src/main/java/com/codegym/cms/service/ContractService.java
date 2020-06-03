package com.codegym.cms.service;

import com.codegym.cms.model.Contract;
import com.codegym.cms.model.Customer;

public interface ContractService {
    Iterable<Contract> findAll();

    Contract findById(Long id);

    void save(Contract contract);

    void remove(Long id);
}
