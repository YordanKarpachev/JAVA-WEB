package com.example.springfundamentals.cats.model.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owners")

public class OwnerEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ownerId;

    @Column(nullable = false)
    private String ownerName;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<CatEntity> cats = new ArrayList<>();

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public OwnerEntity addCat(CatEntity cat){
        cats.add(cat);
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<CatEntity> getCats() {
        return cats;
    }

    public void setCats(List<CatEntity> cats) {
        this.cats = cats;
    }
}
