package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.Calculator;

@Controller
public class CalculatorControllers {
    @Autowired
    Calculator calculator;
    @GetMapping(value = "/calculator")
    public String addition(@RequestParam String number1, @RequestParam String number2, @RequestParam String operator, Model model) {
        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);
        double result;
        switch (operator){
            case "+": result=calculator.addition(num1,num2);break;
            case "-":result=calculator.subtraction(num1,num2);break;
            case "*":result=calculator.multiplacation(num1,num2);break;
            case "/":result=calculator.division(num1,num2);break;
            default:{
                result=0;
            }
        }
        model.addAttribute("result",result);
        return "result";
    }
}
