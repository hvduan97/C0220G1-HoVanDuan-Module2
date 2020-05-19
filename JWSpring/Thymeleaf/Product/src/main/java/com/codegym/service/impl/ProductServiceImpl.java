package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private  static Map<Integer, Product> products;
    static {

        products = new HashMap<Integer, Product>();
        products.put(1, new Product(1, "ipx", "12", "X","Apple"));
        products.put(2, new Product(2, "samsungS20", "16", "S","SamSung"));
        products.put(3, new Product(3, "htcu11", "4", "U","HTC"));
        products.put(4, new Product(4, "opporeno", "10", "Reno","Oppo"));
    }
    public List<Product> findAll() {
        return new ArrayList<Product>(products.values());
    }

    public void save(Product product) {
        products.put(product.getId(),product);
    }

    public Product findById(int id) {
        return products.get(id);
    }

    public void update(int id, Product product) {
        products.put(id,product);
    }

    public void remove(int id) {
        products.remove(id);
    }
}
