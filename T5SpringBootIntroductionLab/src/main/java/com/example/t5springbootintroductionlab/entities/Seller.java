package com.example.t5springbootintroductionlab.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "sellers")
public class Seller extends BaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false)
    private Integer age;


    @Column(nullable = false)
    private double salary;


    @OneToOne(targetEntity = Seller.class)
    private String managerId;

    @ManyToOne(targetEntity = Shop.class)
    private Seller seller;


    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            throw new RuntimeException("First name must be minimum two characters");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 2) {
            throw new RuntimeException("Last name must be minimum two characters");
        }
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 18) {
            throw new RuntimeException("Age must be minimum 18 years");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
