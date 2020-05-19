package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichControllers {
    @RequestMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment,Model model) {
        model.addAttribute("abc",condiment);
//        return new ModelAndView("result","condiment",condiment);
        return "result";
    }

}
