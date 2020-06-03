package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.TypeCustomer;
import com.codegym.cms.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TypeCustomerController {
    @Autowired
    TypeCustomerService typeCustomerService;
    @GetMapping("/create-typecus")
    public String showCreateForm(Model model){
        model.addAttribute("typecustomer",new TypeCustomer());
        return "customer/createtype";
    }
    @PostMapping("/create-typecus")
    public String saveTypeCustomer(@ModelAttribute("typecustomer") TypeCustomer typeCustomer,Model model){
        typeCustomerService.save(typeCustomer);
        model.addAttribute("typecustomer",new TypeCustomer());
        model.addAttribute("message","Loại khách hàng đã được tạo");
        return "customer/createtype";
    }
}
