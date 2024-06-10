package org.example.HW11.Decorator;

public class Mozzarella extends PizzaDecorator {
    public Mozzarella(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Моцарелла";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.50;
    }
}
