package com.example.t5springbootintroductionlab.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "shop")
public class Shop extends BaseEntity {


    @Column
    private String name;

    @Column(nullable = false, unique = true)
    private String address;

    @ManyToOne(targetEntity = Town.class)
    private Town town;

    @OneToMany(targetEntity = Seller.class,mappedBy = "id")
    private List<Seller> seller;

 @ManyToMany(targetEntity = Product.class, mappedBy = "shops")
    private List<Product> products;

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public void setAddress(String address) {
        if (address.length() < 2) {
            throw new RuntimeException("Address must be minimum two characters");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
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
}
