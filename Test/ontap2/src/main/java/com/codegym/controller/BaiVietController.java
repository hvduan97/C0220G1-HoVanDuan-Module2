package com.codegym.controller;

import com.codegym.model.BaiViet;
import com.codegym.model.Tinh;
import com.codegym.service.BaiVietService;
import com.codegym.service.TinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BaiVietController {
    @Autowired
    BaiVietService baiVietService;
    @Autowired
    TinhService tinhService;
    @GetMapping("/create-baiviet")
    public String showCreateForm(Model model){
        model.addAttribute("baiviet",new BaiViet());
        return "baiviet/createbaiviet";
    }
    @PostMapping("/create-baiviet")
    public String saveTinh(@Validated @ModelAttribute("baiviet") BaiViet baiViet, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "baiviet/createbaiviet";
        }
        baiVietService.save(baiViet);
        model.addAttribute("baiviet",new BaiViet());
        model.addAttribute("message","Bài viết đã được thêm");
        return "baiviet/createbaiviet";
    }
    @ModelAttribute("tinhs")
    public Iterable<Tinh> tinhs(){
        return tinhService.findAll();
    }
    @GetMapping("/baiviets")
    public String listBaiViet(Model model, @RequestParam("s") Optional<String> s,@PageableDefault(size = 2) Pageable pageable){
        Page<BaiViet> baiViets;
        String keywordLast = null;
        if(s.isPresent()){
            keywordLast=s.get();
            baiViets = baiVietService.findAllByTinh_TenTinh(keywordLast, pageable);
        } else {
            baiViets = baiVietService.findAll(pageable);
        }
        model.addAttribute("keyword", keywordLast);
        model.addAttribute("baiviets",baiViets);
        return "baiviet/listbaiviet";
    }

    @GetMapping("/edit-baiviet/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        BaiViet baiViet = baiVietService.findById(id);
        if(baiViet != null) {
            ModelAndView modelAndView = new ModelAndView("/baiviet/edit");
            modelAndView.addObject("baiviet", baiViet);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-baiviet")
    public ModelAndView updateBaiViet(@ModelAttribute("baiviet") BaiViet baiViet){
        baiVietService.save(baiViet);
        ModelAndView modelAndView = new ModelAndView("/baiviet/edit");
        modelAndView.addObject("baiviet", baiViet);
        modelAndView.addObject("message", "Bài viết đã được cập nhật thông tin");
        return modelAndView;
    }
    @GetMapping("/delete-baiviet/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        BaiViet baiViet = baiVietService.findById(id);
        if(baiViet != null) {
            ModelAndView modelAndView = new ModelAndView("/baiviet/delete");
            modelAndView.addObject("baiviet", baiViet);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete-baiviet")
    public String deleteBaiViet(@ModelAttribute("baiviet") BaiViet baiViet){
        baiVietService.remove(baiViet.getId());
        return "redirect:baiviets";
    }
}
