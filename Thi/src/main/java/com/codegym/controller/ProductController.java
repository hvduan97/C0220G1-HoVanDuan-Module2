package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.model.Type;
import com.codegym.service.ProductService;
import com.codegym.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    TypeService typeService;
    @GetMapping("/create-product")
    public String showCreateForm(Model model){
        model.addAttribute("product",new Product());
        return "product/createpro";
    }
    @PostMapping("/create-product")
    public String saveProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "product/createpro";
        }
        productService.save(product);
        model.addAttribute("product",new Product());
        model.addAttribute("message","Mặt hàng đã được thêm");
        return "product/createpro";
    }
    @ModelAttribute("type")
    public Iterable<Type> types(){
        return typeService.findAll();
    }



    @GetMapping("/products")
    public String listCustomer(Model model, @RequestParam("s") Optional<String> s, Pageable pageable){
        Page<Product> products;
        if(s.isPresent()){
            products = productService.findAllByTenContaining(s.get(), pageable);
        } else {
            products = productService.findAll(pageable);
        }
        model.addAttribute("products",products);
        return "product/listproduct";
    }
    @GetMapping("/edit-product/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Product product = productService.findById(id);
        if(product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            modelAndView.addObject("product", product);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-product")
    public ModelAndView updateCustomer(@Validated @ModelAttribute("product") Product product,BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            return modelAndView;
        }
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/product/edit");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Mặt hàng đã được cập nhật thông tin");
        return modelAndView;
    }
    @GetMapping("/delete-product/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Product product = productService.findById(id);
        if(product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/delete");
            modelAndView.addObject("product", product);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-product")
    public String deleteCustomer(@ModelAttribute("product") Product product){
        productService.remove(product.getId());
        return "redirect:products";
    }
}
