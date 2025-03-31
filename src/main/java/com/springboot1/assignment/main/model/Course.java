package com.springboot1.assignment.main.model;

import jakarta.persistence.*;

@Entity
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private Double fee;
    private Integer credits;

    public Course() {
        this.fee = 10000.0;
        this.credits = 100; 
    }

    public Course(int id, String title, Double fee, Integer credits) {
        this.id = id;
        this.title = title;
        this.fee = fee != null ? fee : 10000.0;
        this.credits = credits != null ? credits : 100;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
