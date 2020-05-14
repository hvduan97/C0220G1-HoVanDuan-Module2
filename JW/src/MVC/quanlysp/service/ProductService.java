package MVC.quanlysp.service;

import MVC.quanlysp.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);

    void remove(int id);
    boolean searchName(Map<Integer,Product> products, String tim);
}
