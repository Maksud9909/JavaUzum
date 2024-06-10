package org.example.HW11.FactoryMethod.factory;


import org.example.HW11.Decorator.*;

public class HawaiianPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        Pizza pizza = new BasicPizza();
        pizza = new PineApple(pizza);
        pizza = new TomatoSauce(pizza);
        return pizza;
    }
}
