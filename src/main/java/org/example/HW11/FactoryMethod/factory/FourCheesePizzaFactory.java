package org.example.HW11.FactoryMethod.factory;

import org.example.HW11.Decorator.*;

public class FourCheesePizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        Pizza pizza = new BasicPizza();
        pizza = new Mozzarella(pizza);
        pizza = new Parmezan(pizza);
        pizza = new TomatoSauce(pizza);
        return pizza;
    }
}
