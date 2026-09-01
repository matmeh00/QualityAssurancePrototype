package com.example.qualityassuranceprototype.Model;

public class Employee {
    private String fistName;
    private String lastName;
    private boolean isConsultant;


    public Employee(String fistName, String lastName, boolean isConsultant) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.isConsultant = isConsultant;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isConsultant() {
        return isConsultant;
    }

    public void setConsultant(boolean consultant) {
        isConsultant = consultant;
    }
}
