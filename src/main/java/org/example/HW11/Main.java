package org.example.HW11;

import org.example.HW11.Builder.Testo;
import org.example.HW11.Builder.TestoBuilder;
import org.example.HW11.Builder.ThickTesto;
import org.example.HW11.Builder.ThinTesto;
import org.example.HW11.Decorator.*;
import org.example.HW11.FactoryMethod.factory.FourCheesePizzaFactory;
import org.example.HW11.FactoryMethod.factory.PizzaFactory;
// юнит тест написаны в папке, test/java/factoryMethod
public class Main {
    public static void main(String[] args) {

        PizzaFactory factory = new FourCheesePizzaFactory();
        Pizza fourCheesePizza = factory.createPizza();
        System.out.println("Состав пиццы 4 сыра: " + fourCheesePizza.getDescription());
        System.out.println("Стоимость пиццы 4 сыра: " + fourCheesePizza.getCost());


        Pizza customPizza = new BasicPizza();
        customPizza = new Mozzarella(customPizza);
        customPizza = new TomatoSauce(customPizza);
        System.out.println("Состав авторской пиццы: " + customPizza.getDescription());
        System.out.println("Стоимость авторской пиццы: " + customPizza.getCost());


        TestoBuilder doughBuilder = new TestoBuilder();
        Testo thinDough = doughBuilder.setTesto(new ThinTesto()).build();
        System.out.println("Выбрано тесто: " + thinDough.getTestoType());

        Testo thickDough = doughBuilder.setTesto(new ThickTesto()).build();
        System.out.println("Выбрано тесто: " + thickDough.getTestoType());
    }
}

