package org.example.HW11.Decorator;

public class PineApple extends PizzaDecorator{
    public PineApple(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ананасы";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.4;
    }
}
