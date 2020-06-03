package com.codegym.cms.controller;

import com.codegym.cms.model.*;
import com.codegym.cms.service.ContractService;
import com.codegym.cms.service.CustomerService;
import com.codegym.cms.service.EmployeeService;
import com.codegym.cms.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    ServiceService serviceService;
    @GetMapping("/create-contract")
    public String showCreateForm(Model model){
        model.addAttribute("contracts",new Contract());
        return "contract/createcontract";
    }
    @PostMapping("/create-contract")
    public String saveContract(@Validated @ModelAttribute("contracts") Contract contract, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "contract/createcontract";
        }
        contractService.save(contract);
        model.addAttribute("contracts",new Contract());
        model.addAttribute("message","Hợp đồng mới đã được tạo");
        return "contract/createcontract";
    }
    @ModelAttribute("customers")
    public Iterable<Customer> customers(){
        return customerService.findAll();
    }
    @ModelAttribute("employees")
    public Iterable<Employee> employees(){
        return employeeService.findAll();
    }
    @ModelAttribute("services")
    public Iterable<Service> services(){
        return serviceService.findAll();
    }
}
