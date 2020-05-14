package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ConvertMoney;

@Controller
public class ConvertController {
    @Autowired
    ConvertMoney convertMoney;
    @GetMapping("/tien")
    public String convertMoney(@RequestParam String usd, @RequestParam String tigia, Model model){
        double ketqua=convertMoney.convertMoney(Double.parseDouble(tigia),Double.parseDouble(usd));
        model.addAttribute("abc",ketqua);
        return "result";
    }
}
