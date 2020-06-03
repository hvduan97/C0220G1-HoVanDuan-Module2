package com.codegym.cms.controller;

import com.codegym.cms.model.GoFollow;
import com.codegym.cms.service.GoFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GoFollowController {
    @Autowired
    GoFollowService goFollowService;
    @GetMapping("/create-go")
    public String showCreateForm(Model model){
        model.addAttribute("gofollows",new GoFollow());
        return "contract/creatego";
    }
    @PostMapping("/create-go")
    public String saveGo(@ModelAttribute("gofollows") GoFollow goFollow,Model model){
        goFollowService.save(goFollow);
        model.addAttribute("gofollows",new GoFollow());
        model.addAttribute("message","Dịch vụ đi kèm mới đã được thêm vào");
        return "contract/creatego";
    }
}
