package com.example.qualityassuranceprototype.controller;

import com.example.qualityassuranceprototype.entity.Consultant;
import com.example.qualityassuranceprototype.service.ConsultantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final ConsultantService consultantService;

    public HomeController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }

    @GetMapping("/")
    public String home(Model model) {
        return "home_page";
    }

    @PostMapping("/")
    public String addConsultant(
            @RequestParam String firstName,
            @RequestParam String lastName) {
        consultantService.addConsultant(new Consultant(firstName.trim(), lastName.trim()));
        return "redirect:/consultants";
    }

    @GetMapping("/consultants")
    public String consultants(Model model) {
        var consultants = consultantService.getAllConsultants();
        model.addAttribute("consultants", consultants);
        return "consultants";
    }

    @GetMapping("/deleteAllConsultants")
    public String deleteAllConsultants() {
        consultantService.deleteAllConsultants();
        return "home";
    }
}
