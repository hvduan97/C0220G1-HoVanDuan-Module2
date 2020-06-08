package com.codegym.controller;

import com.codegym.model.LoaiHang;
import com.codegym.service.LoaiHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoaiHangController {
    @Autowired
    LoaiHangService loaiHangService;
    @GetMapping("/create-loaihang")
    public String showCreateForm(Model model){
        model.addAttribute("loaihang",new LoaiHang());
        return "loaihang/createloaihang";
    }
    @PostMapping("/create-loaihang")
    public String saveLoaiHang(@ModelAttribute("loaihang") LoaiHang loaiHang, Model model){
        loaiHangService.save(loaiHang);
        model.addAttribute("loaihang",new LoaiHang());
        model.addAttribute("message","Loại hàng đã được thêm");
        return "loaihang/createloaihang";
    }

}
