package com.example.qualityassuranceprototype.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "salesperson", schema = "quality-assurance-db")
public class Salesperson {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


    protected Salesperson() {

    }

    public Salesperson(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public Salesperson(String firstName, String lastName, Long id) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
