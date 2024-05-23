package org.example.HW9.entity;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Мяу";
    }
}
