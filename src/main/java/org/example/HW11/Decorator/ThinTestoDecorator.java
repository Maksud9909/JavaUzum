package org.example.HW11.Decorator;

public class ThinTestoDecorator extends PizzaDecorator {
    public ThinTestoDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " тонкое тесто";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
