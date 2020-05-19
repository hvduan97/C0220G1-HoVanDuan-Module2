package com.codegym.controllers;

import com.codegym.models.Student;
import com.codegym.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("studentAbc", new Student("Tien", "2k"));

        return "create";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student) {
        student.setId((int)(Math.random() * 1000000));
        studentService.save(student);

        return "create";
    }

    @GetMapping("/list")
    public String showList() {
        return "list";
    }

    @GetMapping("/detail")
    public String showInfo(@RequestParam Integer id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "/detail";
    }
}
