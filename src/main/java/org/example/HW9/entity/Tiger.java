package org.example.HW9.entity;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Р-р-р";
    }
}
