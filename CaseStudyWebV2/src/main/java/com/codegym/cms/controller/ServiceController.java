package com.codegym.cms.controller;

import com.codegym.cms.model.*;
import com.codegym.cms.service.ServiceService;
import com.codegym.cms.service.TypeRentService;
import com.codegym.cms.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("like")
public class ServiceController {
    @Autowired
    ServiceService serviceService;
    @Autowired
    TypeRentService typeRentService;
    @Autowired
    TypeServiceService typeServiceService;

    @ModelAttribute("like")
    public Service setUpContract() {
        return new Service();
    }
    @GetMapping("/like-service/{id}")
    public String likeCollection(@PathVariable Long id,@ModelAttribute("like") Service service,Model model){
        service=serviceService.findById(id);
        model.addAttribute("like",service);
        return "service/collect";
    }

    @GetMapping("/create-service")
    public String showCreateForm(Model model){
        model.addAttribute("services",new Service());
        return "service/createservice";
    }
    @PostMapping("/create-service")
    public String saveService(@ModelAttribute("services") Service service,Model model){
        serviceService.save(service);
        model.addAttribute("services",new Service());
        model.addAttribute("message","Dịch vụ mới đã được tạo");
        return "service/createservice";
    }
    @ModelAttribute("typerents")
    public Iterable<TypeRent> typeRents(){
        return typeRentService.findAll();
    }
    @ModelAttribute("typeservices")
    public Iterable<TypeService> typeServices(){
        return typeServiceService.findAll();
    }

    @GetMapping("/services")
    public String listService(Model model, @PageableDefault(size = 1) Pageable pageable,@RequestParam("s") Optional<String> s){

        Page<Service> services;
        if(s.isPresent()){
            services = serviceService.findAllByNameContaining(s.get(), pageable);
        } else {
            services = serviceService.findAll(pageable);
        }
        model.addAttribute("services",services);
        return "service/listservice";
    }
    @GetMapping("/edit-service/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Service service = serviceService.findById(id);
        if(service != null) {
            ModelAndView modelAndView = new ModelAndView("/service/edit");
            modelAndView.addObject("service", service);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-service")
    public ModelAndView updateCustomer(@ModelAttribute("service") Service service){
        serviceService.save(service);
        ModelAndView modelAndView = new ModelAndView("/service/edit");
        modelAndView.addObject("service", service);
        modelAndView.addObject("message", "Dịch vụ đã được cập nhật thông tin");
        return modelAndView;
    }
    @GetMapping("/delete-service/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Service service = serviceService.findById(id);
        if(service != null) {
            ModelAndView modelAndView = new ModelAndView("/service/delete");
            modelAndView.addObject("service", service);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-service")
    public String deleteCustomer(@ModelAttribute("service") Service service){
        serviceService.remove(service.getId());
        return "redirect:services";
    }
}
