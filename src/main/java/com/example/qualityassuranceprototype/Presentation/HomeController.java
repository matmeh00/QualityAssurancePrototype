package com.example.qualityassuranceprototype.Presentation;

import com.example.qualityassuranceprototype.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/")
    public static String home(Model model) {
        var employee = new Employee("Mathias", "Mehari");
        model.addAttribute("employee", employee);
        model.addAttribute("name", employee.getFistName());
        return "home";
    }
}
