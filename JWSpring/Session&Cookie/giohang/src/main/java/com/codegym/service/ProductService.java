package com.codegym.service;

import com.codegym.model.Product;

import java.util.Optional;

public interface ProductService {
    Iterable<Product> findAll();
    Product findById(int id);
}
