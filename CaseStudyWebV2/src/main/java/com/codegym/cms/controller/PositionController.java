package com.codegym.cms.controller;

import com.codegym.cms.model.Position;
import com.codegym.cms.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PositionController {
    @Autowired
    PositionService positionService;
    @GetMapping("/create-position")
    public String showCreateForm(Model model){
        model.addAttribute("positions",new Position());
        return "employee/createposition";
    }
    @PostMapping("/create-position")
    public String savePosition(@ModelAttribute("positions") Position position,Model model){
        positionService.save(position);
        model.addAttribute("positions",new Position());
        model.addAttribute("message","Vị trí mới đã được thêm");
        return "employee/createposition";
    }
}
