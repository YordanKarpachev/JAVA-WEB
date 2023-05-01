package com.example.t5springbootintroductionlab.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Category extends BaseEntity {
    @Column(nullable = false)
    private String name;

    public Category(String name) {
        setName(name);

    }

    public Category() {
    }

    @OneToMany(targetEntity = Product.class, mappedBy = "id")
    private List<Product> products;

    public void setName(String name) {
        if(name.length() < 2){
            throw new RuntimeException("Name must be minimum two characters");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

