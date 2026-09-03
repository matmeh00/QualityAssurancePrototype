package com.example.qualityassuranceprototype.controller;

import com.example.qualityassuranceprototype.entity.FollowUp;
import com.example.qualityassuranceprototype.dto.FollowUpForm;
import com.example.qualityassuranceprototype.service.FollowUpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class FollowUpController {

    private final FollowUpService followUpService;

    public FollowUpController(FollowUpService followUpService) {
        this.followUpService = followUpService;
    }

    @GetMapping("/followUps")
    public String showFollowUpForm(Model model) {
        //var followUps = followUpService.getAllFollowUps();
        var followUps = new ArrayList<FollowUp>();
        model.addAttribute("followUps", followUps);
        System.out.println(followUpService.getAllFollowUps());
        return "follow_ups";
    }
    @PostMapping("/follow-ups")
    public String addFollowUp(@ModelAttribute FollowUpForm followUpForm) {
        followUpService.createFollowUp(followUpForm);
        System.out.println("Follow-up added: " + followUpForm);
        return "redirect:/followUps";
    }

}
