package com.example.springfundamentals.iok;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;

public class Dog implements Animal, BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("The name of is : " + name);
    }

    @PostConstruct
    public void afterInt(){
        System.out.println("This is DOGGG");
    }

    private boolean isSuperDog;

    public Dog() {
        this(false);
    }

    public Dog(boolean isSuperDog) {
        this.isSuperDog = isSuperDog;
    }

    @Override
    public void makeNoise() {
        if (isSuperDog) {
            System.out.println("Super Bark bark");
        } else {
            System.out.println("bark bark");
        }
    }


}
