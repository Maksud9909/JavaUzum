package org.example.HW9.main;

import org.example.HW9.entity.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Tiger("Tiger"),
                new Owl("Owl"),
                new Dog("Dog"),
                new Cat("Cat")};


        for (Animal animal : animals) {
            System.out.print(animal.getName() + " says ");
            animal.sound();
        }
    }
}
