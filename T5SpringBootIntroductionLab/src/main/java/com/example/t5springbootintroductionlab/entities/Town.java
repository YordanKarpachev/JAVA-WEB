package com.example.t5springbootintroductionlab.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "town")
public class Town extends BaseEntity {


    @Column
    private String name;

    @OneToMany(targetEntity = Shop.class, mappedBy = "id")
    private List<Shop> shops;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
