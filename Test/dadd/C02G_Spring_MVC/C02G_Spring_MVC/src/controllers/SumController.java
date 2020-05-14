package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.SumService;

@Controller
public class SumController {

    @Autowired
    SumService sumService;

    @GetMapping("/sum")
//    @PostMapping("/sum")
    public String abc(@RequestParam("number1") String numberA, @RequestParam String number2, Model model) {

        double result = sumService.sum(Double.parseDouble(numberA),
                Double.parseDouble(number2));
        model.addAttribute("sumNum12", result);

        return "result";
    }

//    @GetMapping("/sum")
//    public ModelAndView abc(@RequestParam("number1") String numberA, @RequestParam String number2) {
//
//        double result = sumService.sum(Double.parseDouble(numberA),
//                Double.parseDouble(number2));
////        ModelAndView modelAndView = new ModelAndView("result");
////        modelAndView.addObject("sumNum12", result);
//
//        return new ModelAndView("result", "sumNum12", result);
//    }

    @GetMapping("/sum")
    public String abc(@RequestParam("number1") String numberA, @RequestParam String number2,
                            ModelMap modelMap) {

        double result = sumService.sum(Double.parseDouble(numberA),
                Double.parseDouble(number2));
        modelMap.addAttribute("sumNum12", result);

        return "result";
    }
}
