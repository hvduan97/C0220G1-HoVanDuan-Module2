package com.codegym.controller;

import com.codegym.model.Type;
import com.codegym.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TypeController {
    @Autowired
    TypeService typeService;
    @GetMapping("/create-type")
    public String showCreateForm(Model model){
        model.addAttribute("type",new Type());
        return "type/createtype";
    }
    @PostMapping("/create-type")
    public String saveType(@ModelAttribute("type") Type type, Model model){
        typeService.save(type);
        model.addAttribute("type",new Type());
        model.addAttribute("message","loại đã được thêm");
        return "type/createtype";
    }

}
