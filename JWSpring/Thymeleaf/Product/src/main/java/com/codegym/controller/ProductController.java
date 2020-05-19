package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.impl.ProductServiceImpl;


@Controller
public class ProductController {
    private ProductService productService=new ProductServiceImpl();
    public String index(Model model){
        model.addAttribute("products",productService.findAll());
        return "index";
    }
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirect) {
        product.setId((int)(Math.random() * 10000));
        productService.save(product);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/";
    }
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

}
