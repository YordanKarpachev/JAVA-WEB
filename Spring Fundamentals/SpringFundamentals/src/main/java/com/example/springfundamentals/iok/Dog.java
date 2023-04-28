package com.example.springfundamentals.iok;

public class Dog implements Animal{
    @Override
    public void makeNoise() {
        System.out.println("Bark bark");
    }
}
