package com.codegym.controller;

import com.codegym.model.Tinh;
import com.codegym.service.TinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TinhController {
    @Autowired
    TinhService tinhService;
    @GetMapping("/create-tinh")
    public String showCreateForm(Model model){
        model.addAttribute("tinh",new Tinh());
        return "tinh/createtinh";
    }
    @PostMapping("/create-tinh")
    public String saveTinh(@ModelAttribute("tinh") Tinh tinh, Model model){
        tinhService.save(tinh);
        model.addAttribute("tinh",new Tinh());
        model.addAttribute("message","Tỉnh đã được thêm");
        return "tinh/createtinh";
    }
    @GetMapping("/tinhs")
    public String listTinh(Model model){
        Iterable<Tinh> tinhs=tinhService.findAll();
        model.addAttribute("tinhs",tinhs);
        return "tinh/listtinh";
    }
    @GetMapping("/edit-tinh/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Tinh tinh = tinhService.findById(id);
        if(tinh != null) {
            ModelAndView modelAndView = new ModelAndView("/tinh/edit");
            modelAndView.addObject("tinh", tinh);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-tinh")
    public ModelAndView updateTinh(@ModelAttribute("tinh") Tinh tinh){
        tinhService.save(tinh);
        ModelAndView modelAndView = new ModelAndView("/tinh/edit");
        modelAndView.addObject("tinh", tinh);
        modelAndView.addObject("message", "Tỉnh đã được cập nhật thông tin");
        return modelAndView;
    }
    @GetMapping("/delete-tinh/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Tinh tinh = tinhService.findById(id);
        if(tinh != null) {
            ModelAndView modelAndView = new ModelAndView("/tinh/delete");
            modelAndView.addObject("tinh", tinh);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete-tinh")
    public String deleteTinh(@ModelAttribute("tinh") Tinh tinh){
        tinhService.remove(tinh.getId());
        return "redirect:tinhs";
    }
}
