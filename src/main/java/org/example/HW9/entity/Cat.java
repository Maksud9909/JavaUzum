package org.example.HW9.entity;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }
}
