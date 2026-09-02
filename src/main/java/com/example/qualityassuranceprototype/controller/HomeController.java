package com.example.qualityassuranceprototype.controller;

import com.example.qualityassuranceprototype.entity.Consultant;
import com.example.qualityassuranceprototype.service.ConsultantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    private final ConsultantService consultantService;

    public HomeController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }

    @GetMapping("/")
    public String home(Model model) {
        var consultant = new Consultant("Mathias", "Mehari");
        model.addAttribute("employee", consultant);
        model.addAttribute("name", consultant.getFirstName());
        consultantService.addConsultant(consultant);
        return "home";
    }

    @GetMapping("/consultants")
    public String consultants(Model model) {
        var consultants = consultantService.getAllConsultants();
        model.addAttribute("consultants", consultants);
        return "consultants";
    }
}
