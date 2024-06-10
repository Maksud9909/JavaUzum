package org.example.HW11.Decorator;

public class Parmezan extends PizzaDecorator {
    public Parmezan(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",Пармезан";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.3;
    }
}
