package com.example.qualityassuranceprototype.Presentation;

import com.example.qualityassuranceprototype.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public static String home() {
        var employee = new Employee("Mathias", "Mehari", true);
        return "home";
    }
}
