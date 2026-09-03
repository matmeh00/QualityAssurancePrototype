package com.example.qualityassuranceprototype.entity;

import java.time.LocalDate;

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


    
}