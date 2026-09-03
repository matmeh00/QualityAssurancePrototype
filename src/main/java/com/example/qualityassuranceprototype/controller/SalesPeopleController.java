package com.example.qualityassuranceprototype.controller;

import com.example.qualityassuranceprototype.entity.Salesperson;
import com.example.qualityassuranceprototype.service.SalespersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalesPeopleController {

    private final SalespersonService salespersonService;

    public SalesPeopleController(SalespersonService salespersonService) {
        this.salespersonService = salespersonService;
    }

    @GetMapping("/salespeople")
    public String getSalespeople(Model model) {
        var sales = salespersonService.getAllSalesPeople();
        System.out.println("All sales people print out: " + sales);
        model.addAttribute("salespeople", sales);
        return "sales_people";
    }

    @PostMapping("/salespeople")
    public String addSalesperson(
            @RequestParam String firstName,
            @RequestParam String lastName) {
        salespersonService.addSalesperson(new Salesperson(firstName, lastName));
        return "redirect:/salespeople";
    }

    @DeleteMapping("/deleteAllSales")
    public String deleteAllSalesPeople() {
        salespersonService.deleteAllSalespersons();
        return "redirect:/salespeople";
    }


}
