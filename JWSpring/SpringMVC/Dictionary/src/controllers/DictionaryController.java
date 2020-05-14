package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Dictionary;
@Controller
public class DictionaryController {

    @Autowired
    Dictionary dictionary;

    @GetMapping("/dic")
    public String translateDic(@RequestParam String diction, Model model){
        String a=dictionary.translateWord(diction);
        model.addAttribute("abcd",a);
        return "result";
    }
}
