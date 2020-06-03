package com.codegym.cms.controller;

import com.codegym.cms.model.Part;
import com.codegym.cms.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PartController {
    @Autowired
    PartService partService;
    @GetMapping("/create-part")
    public String showCreateForm(Model model){
        model.addAttribute("parts",new Part());
        return "employee/createpart";
    }
    @PostMapping("/create-part")
    public String savePart(@ModelAttribute("parts") Part part,Model model){
        partService.save(part);
        model.addAttribute("parts",new Part());
        model.addAttribute("message","Bộ phận mới được thêm");
        return "employee/createpart";
    }
}
