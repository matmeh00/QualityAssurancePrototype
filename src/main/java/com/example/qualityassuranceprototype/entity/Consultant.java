package com.example.qualityassuranceprototype.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consultant extends Employee {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Consultant(String firstName, String lastName) {
        super(firstName, lastName);
        this.id = new Long(1);
    }
}
