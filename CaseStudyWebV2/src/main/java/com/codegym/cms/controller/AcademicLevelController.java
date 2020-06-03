package com.codegym.cms.controller;

import com.codegym.cms.model.AcademicLevel;
import com.codegym.cms.service.AcademicLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AcademicLevelController {
    @Autowired
    AcademicLevelService academicLevelService;
    @GetMapping("/create-level")
    public String showCreateForm(Model model){
        model.addAttribute("levels",new AcademicLevel());
        return "employee/createlevel";
    }
    @PostMapping("/create-level")
    public String saveLevel(@ModelAttribute("levels") AcademicLevel academicLevel,Model model){
        academicLevelService.save(academicLevel);
        model.addAttribute("levels",new AcademicLevel());
        model.addAttribute("message","Trình độ học vấn đã được thêm");
        return "employee/createlevel";
    }
}
