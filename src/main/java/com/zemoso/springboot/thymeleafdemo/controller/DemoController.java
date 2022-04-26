package com.zemoso.springboot.thymeleafdemo.controller;


import com.zemoso.springboot.thymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {




    // create a mapping for "/hello"
    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("date",new java.util.Date());
        return "helloworld";
    }

    @GetMapping("/employees")
    public String getEmployees(Model model){
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(1,"Vineet","G");
        Employee emp2 = new Employee(2,"shanker","sai");
        Employee emp3 = new Employee(3,"Kalyan","CH");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        model.addAttribute("employees",employees);
        return "employeeview";
    }



}
