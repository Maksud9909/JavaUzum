package org.example.HW9.entity;

public class Owl extends Animal{

    public Owl(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Ух-ух");
    }
}
