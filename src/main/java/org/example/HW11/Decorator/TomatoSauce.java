package org.example.HW11.Decorator;

public class TomatoSauce extends PizzaDecorator {
    public TomatoSauce(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Томатный соус";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 0.75;
    }
}