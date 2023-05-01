package com.example.t5springbootintroductionlab.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity(name = "products")
public class Product extends BaseEntity {

    @Column(name = "best_before")
    private Date bestBefore;


    @Column
    private String description;

    @Column
    private String name;

    @Column(nullable = false)
    private BigDecimal price;


    @ManyToMany
    private List<Shop> shops;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    private Category category;

    public Date getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(Date bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            throw new RuntimeException("Name must be minimum two characters");
        }
        this.name = name;
    }

    public double getPrice() {


        return
                this.price.doubleValue();
    }

    public void setPrice(Double price) {

        if (price < 0) {
            throw new RuntimeException("Price mus be positive Number");
        }
        this.price = BigDecimal.valueOf(price);
    }
}
