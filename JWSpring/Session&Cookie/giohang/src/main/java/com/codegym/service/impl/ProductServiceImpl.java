package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.Repository;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private Repository repository;
    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id).orElse(null);
    }
}
