package org.example.HW9.main;

import org.example.HW9.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Tiger("Tiger"));
        animals.add(new Owl("Owl"));
        animals.add(new Dog("Dog"));
        animals.add(new Cat("Cat"));




        AnimalSound animalSound = new AnimalSound();
        animalSound.animalSound(animals);


    }
}
