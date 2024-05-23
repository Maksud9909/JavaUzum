package org.example.HW9.entity;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Гав-гав";
    }
}
