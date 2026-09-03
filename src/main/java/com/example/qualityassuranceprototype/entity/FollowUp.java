package com.example.qualityassuranceprototype.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "follow_ups")
public class FollowUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @ManyToOne
    @JoinColumn(name = "consultant_id")
    private Consultant consultant;

    @ManyToOne
    @JoinColumn(name = "salesperson_id")
    private Salesperson salesperson;

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
}