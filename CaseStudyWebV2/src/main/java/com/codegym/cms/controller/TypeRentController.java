package com.codegym.cms.controller;

import com.codegym.cms.model.TypeRent;
import com.codegym.cms.service.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TypeRentController {
    @Autowired
    TypeRentService typeRentService;
    @GetMapping("/create-typerent")
    public String showCreateForm(Model model){
        model.addAttribute("typerents",new TypeRent());
        return "service/createtyperent";
    }
    @PostMapping("/create-typerent")
    public String saveTypeRent(@ModelAttribute("typerents") TypeRent typeRent,Model model){
        typeRentService.save(typeRent);
        model.addAttribute("typerents",new TypeRent());
        model.addAttribute("message","Kiểu thuê mới đã được thêm");
        return "service/createtyperent";
    }
}
