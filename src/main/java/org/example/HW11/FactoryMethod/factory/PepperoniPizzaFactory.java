package org.example.HW11.FactoryMethod.factory;

import org.example.HW11.Decorator.BasicPizza;
import org.example.HW11.Decorator.Pizza;
import org.example.HW11.Decorator.Salami;
import org.example.HW11.Decorator.TomatoSauce;

public class PepperoniPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        Pizza pizza = new BasicPizza();
        pizza = new TomatoSauce(pizza);
        pizza = new Salami(pizza);
        return pizza;
    }
}
