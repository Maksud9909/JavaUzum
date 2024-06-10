package org.example.HW11.Decorator;

public class Salami extends PizzaDecorator{
    public Salami(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " салями";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }
}
