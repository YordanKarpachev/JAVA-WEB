package com.example.springfundamentals.iok;

import org.springframework.stereotype.Service;

@Service
public class ZooService {

    private final Animal animal;

    public ZooService(Animal animal) {
        this.animal = animal;
    }

    public void doWork(){
        animal.makeNoise();
    }
}
