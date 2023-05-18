package com.example.first_crud_springboot_web.controller;


import com.example.first_crud_springboot_web.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    // creating a method hanler to display list of employees

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";
    }
}
