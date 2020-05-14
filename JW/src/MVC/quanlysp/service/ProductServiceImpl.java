package MVC.quanlysp.service;

import MVC.quanlysp.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "ipx", "25", "apple","max"));
        products.put(2, new Product(2, "samsung S20", "20", "samsung","S"));
        products.put(3, new Product(3, "HTC U12", "10", "HTC","U"));
        products.put(4, new Product(4, "Xiaomi Mi10", "12", "Xiaomi","Mi"));
        products.put(5, new Product(5, "Bphone 3", "9", "bphone","Bp"));
        products.put(6, new Product(6, "Oppo Reno", "15", "Oppo","Reno"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public boolean searchName(Map<Integer, Product> products, String tim) {
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {

            if (tim.equals(entry.getValue().getName())){
                return true;
            }
        }
        return  false;
    }
}
