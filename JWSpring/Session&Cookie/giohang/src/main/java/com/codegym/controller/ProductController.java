package com.codegym.controller;
import com.codegym.model.Item;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @ModelAttribute("giohang")
    public Product setUpCounter() {
        return new Product();
    }
    @GetMapping("/")
    public String listProduct(Model model){
        model.addAttribute("products",productService.findAll());
        return "list";
    }
    @GetMapping("/product/{id}")
    public String viewProduct(Model model, @PathVariable("id") Integer id){
        model.addAttribute("viewpro",productService.findById(id));
        return "view";
    }
    @PostMapping("/product/{id}")
    public String buy(@PathVariable("id") Integer id, HttpSession session) {


        if (session.getAttribute("cart") == null) {
            List<Item> cart = new ArrayList<>();
            cart.add(new Item(productService.findById(id), 1));
            session.setAttribute("cart", cart);
        } else {
            List<Item> cart = (List<Item>) session.getAttribute("cart");
            int index = this.exists(id, cart);
            if (index == -1) {
                cart.add(new Item(productService.findById(id), 1));
            } else {
                int quantity = cart.get(index).getQuantity() + 1;
                cart.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", cart);
        }
        return "redirect:/buy";
    }


    private int exists(int id, List<Item> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProduct().getId()==id) {
                return i;
            }
        }
        return -1;
    }
}
