package com.codegym.cms.controller;

import com.codegym.cms.model.*;
import com.codegym.cms.service.AcademicLevelService;
import com.codegym.cms.service.EmployeeService;
import com.codegym.cms.service.PartService;
import com.codegym.cms.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    PartService partService;
    @Autowired
    AcademicLevelService academicLevelService;
    @GetMapping("/create-employee")
    public String showCreateForm(Model model){
        model.addAttribute("employees",new Employee());
        return "employee/createemployee";
    }
    @PostMapping("/create-employee")
    public String saveEmployee(@Validated @ModelAttribute("employees") Employee employee, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "employee/createemployee";
        }
        employeeService.save(employee);
        model.addAttribute("employees",new Employee());
        model.addAttribute("message","Nhân viên mới đã được thêm");
        return "employee/createemployee";
    }
    @ModelAttribute("levels")
    public Iterable<AcademicLevel> academicLevels(){
        return academicLevelService.findAll();
    }
    @ModelAttribute("positions")
    public Iterable<Position> positions(){
        return positionService.findAll();
    }
    @ModelAttribute("parts")
    public Iterable<Part> parts(){
        return partService.findAll();
    }
}
