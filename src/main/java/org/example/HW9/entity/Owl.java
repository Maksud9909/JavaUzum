package org.example.HW9.entity;

public class Owl extends Animal{

    public Owl(String name){
        super(name);
    }

    @Override
    public String sound() {
        return "Ух-ух";
    }
}
