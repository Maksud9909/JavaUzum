package org.example.HW9.entity;

import java.util.List;

public class AnimalSound {
    public void animalSound(List<Animal> list){
        for (Animal animal:list){
            System.out.println(animal.getName() + " says " + animal.sound());
        }
    }

}
