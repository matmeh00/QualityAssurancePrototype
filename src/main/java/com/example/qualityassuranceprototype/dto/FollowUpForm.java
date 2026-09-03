package com.example.qualityassuranceprototype.dto;

import com.example.qualityassuranceprototype.entity.Consultant;
import com.example.qualityassuranceprototype.entity.Customer;
import com.example.qualityassuranceprototype.entity.FollowUp;
import com.example.qualityassuranceprototype.entity.Salesperson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class FollowUpForm {

    private Long customerId;
    private Long consultantId;
    private Long salespersonId;

    private LocalDate date;
    private LocalDate nextFollowUp;

    private String startup;
    private String results;
    private String responsibility;
    private String simplicity;
    private String joy;
    private String innovation;

    private Integer consultantSatisfaction;
    private Integer hiqSatisfaction;

    private String improvements;
    private String positiveFeedback;
    private String negativeFeedback;
    private String otherComments;

    public FollowUpForm(Long customerId, Long consultantId, Long salespersonId, LocalDate date,
                        LocalDate nextFollowUp, String startup, String results, String responsibility,
                        String simplicity, String joy, String innovation, Integer consultantSatisfaction,
                        Integer hiqSatisfaction, String improvements, String positiveFeedback,
                        String negativeFeedback, String otherComments) {
        this.customerId = customerId;
        this.consultantId = consultantId;
        this.salespersonId = salespersonId;
        this.date = date;
        this.nextFollowUp = nextFollowUp;
        this.startup = startup;
        this.results = results;
        this.responsibility = responsibility;
        this.simplicity = simplicity;
        this.joy = joy;
        this.innovation = innovation;
        this.consultantSatisfaction = consultantSatisfaction;
        this.hiqSatisfaction = hiqSatisfaction;
        this.improvements = improvements;
        this.positiveFeedback = positiveFeedback;
        this.negativeFeedback = negativeFeedback;
        this.otherComments = otherComments;
    }

    public FollowUp createFollowUp() {
        var consultant = new Consultant();
        consultant.setId(consultantId);
        var salesperson = new Salesperson();
        salesperson.setId(salespersonId);
        var customer = new Customer();
        customer.setId(customerId);
        return new FollowUp(consultant, salesperson, customer, date, nextFollowUp, startup, results,
                responsibility, simplicity, joy, innovation, consultantSatisfaction, hiqSatisfaction,
                improvements, positiveFeedback, negativeFeedback, otherComments);
    }

    @Override
    public String toString() {
        return "FollowUpForm{" +
                "customerId=" + customerId +
                ", consultantId=" + consultantId +
                ", salespersonId=" + salespersonId +
                ", date=" + date +
                ", nextFollowUp=" + nextFollowUp +
                ", startup='" + startup + '\'' +
                ", results='" + results + '\'' +
                ", responsibility='" + responsibility + '\'' +
                ", simplicity='" + simplicity + '\'' +
                ", joy='" + joy + '\'' +
                ", innovation='" + innovation + '\'' +
                ", consultantSatisfaction=" + consultantSatisfaction +
                ", hiqSatisfaction=" + hiqSatisfaction +
                ", improvements='" + improvements + '\'' +
                ", positiveFeedback='" + positiveFeedback + '\'' +
                ", negativeFeedback='" + negativeFeedback + '\'' +
                ", otherComments='" + otherComments + '\'' +
                '}';
    }
}