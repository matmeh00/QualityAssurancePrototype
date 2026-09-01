package com.example.qualityassuranceprototype.Model;

import java.time.LocalDate;

public class Review {
    private Employee consultant;
    private Employee reviewer;
    private String reviewId;
    private Company company;
    private LocalDate reviewDate;
    private LocalDate consultantInformed;

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

    private LocalDate nextFollowUp;
}
