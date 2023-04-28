package com.example.springfundamentals.iok;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooService {

       private final Animal animal;

       private final Animal animal1;

    public ZooService(@Qualifier("mySuperDog") Animal animal, @Qualifier("cat") Animal animal1) {
        this.animal1 = animal1;
        this.animal = animal;
     }

public void doWork(){
        this.animal.makeNoise();
        this.animal1.makeNoise();
}


    // VARIANTE 1
   /* private List<Animal> animals;

    public ZooService(List<Animal> animals) {
        this.animals = animals;
    }

    public void doWork() {
        animals.forEach(Animal::makeNoise);
    } */
}
