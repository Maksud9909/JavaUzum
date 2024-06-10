package org.example.HW11.Decorator;

public class ThickTestoDecorator extends PizzaDecorator{
    public ThickTestoDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " толстое тесто";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.6;
    }
}
