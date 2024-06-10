package org.example.HW11.Decorator;

public class BasicPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Тесто";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}

