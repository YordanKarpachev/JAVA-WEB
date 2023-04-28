package com.example.springfundamentals.iok;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooService {

    //   private final Animal animal;

    //  public ZooService(Animal animal) {
    //     this.animal = animal;
    //  }


    private List<Animal> animals;

    public ZooService(List<Animal> animals) {
        this.animals = animals;
    }

    public void doWork() {
        animals.forEach(Animal::makeNoise);
    }
}
