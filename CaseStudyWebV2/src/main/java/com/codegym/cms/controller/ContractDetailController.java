package com.codegym.cms.controller;

import com.codegym.cms.model.Contract;
import com.codegym.cms.model.ContractDetail;
import com.codegym.cms.model.GoFollow;
import com.codegym.cms.model.TypeCustomer;
import com.codegym.cms.service.ContractDetailService;
import com.codegym.cms.service.ContractService;
import com.codegym.cms.service.GoFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContractDetailController {
    @Autowired
    ContractDetailService contractDetailService;
    @Autowired
    ContractService contractService;
    @Autowired
    GoFollowService goFollowService;
    @GetMapping("/create-detail")
    public String showCreateForm(Model model){
        model.addAttribute("details",new ContractDetail());
        return "contract/createdetail";
    }
    @PostMapping("/create-detail")
    public String saveDetail(@Validated @ModelAttribute("details") ContractDetail contractDetail, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "contract/createdetail";
        }
        contractDetailService.save(contractDetail);
        model.addAttribute("details",new ContractDetail());
        model.addAttribute("message","Hợp đồng chi tiết mới đã được thêm ");
        return "contract/createdetail";
    }
    @ModelAttribute("contracts")
    public Iterable<Contract> contracts(){
        return contractService.findAll();
    }
    @ModelAttribute("gofollows")
    public Iterable<GoFollow> goFollows(){
        return goFollowService.findAll();
    }
}
