package com.example.ExamPrep.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Table(name = "categories")
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated
    private ShipEnums name;


    public Category() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShipEnums getName() {
        return name;
    }

    public void setName(ShipEnums name) {
        this.name = name;
    }
}
