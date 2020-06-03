package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.TypeCustomer;
import com.codegym.cms.service.CustomerService;
import com.codegym.cms.service.TypeCustomerService;
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
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    TypeCustomerService typeCustomerService;
    @GetMapping("/create-customer")
    public String showCreateForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customer/createcus";
    }
    @PostMapping("/create-customer")
    public String saveCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "customer/createcus";
        }
        customerService.save(customer);
        model.addAttribute("customer",new Customer());
        model.addAttribute("message","Khách hàng đã được thêm");
        return "customer/createcus";
    }
    @ModelAttribute("typecustomers")
    public Iterable<TypeCustomer> typeCustomers(){
        return typeCustomerService.findAll();
    }


    @GetMapping("/customers")
    public String listCustomer(Model model, @PageableDefault(size = 1) Pageable pageable,@RequestParam("s") Optional<String> s){
//        Page<Customer> customers=customerService.findAll(pageable);
        Page<Customer> customers;
        if(s.isPresent()){
            customers = customerService.findAllByNameCustomerContaining(s.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        model.addAttribute("customers",customers);
        return "customer/listcustomer";
    }
    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Khách hàng đã được cập nhật thông tin");
        return modelAndView;
    }
    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:customers";
    }
}
