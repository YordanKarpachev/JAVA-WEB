package com.example.springfundamentals.iok;

public class Dog implements Animal {
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
