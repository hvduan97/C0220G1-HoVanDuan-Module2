package com.codegym.cms.controller;

import com.codegym.cms.model.TypeService;
import com.codegym.cms.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TypeServiceController {
    @Autowired
    TypeServiceService typeServiceService;
    @GetMapping("/create-typeservice")
    public String showCreateForm(Model model){
        model.addAttribute("typeservices",new TypeService());
        return "service/createtypeservice";
    }
    @PostMapping("/create-typeservice")
    public String saveTypeService(@ModelAttribute("typeservices") TypeService typeService,Model model){
        typeServiceService.save(typeService);
        model.addAttribute("typeservices",new TypeService());
        model.addAttribute("message","Loại dịch vụ mới đã được thêm");
        return "service/createtypeservice";
    }
}
