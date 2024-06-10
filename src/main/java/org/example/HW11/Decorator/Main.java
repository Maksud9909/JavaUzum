package org.example.HW11.Decorator;
// юнит тесты написаны в папке test/java/decorator
public class Main {
    public static void main(String[] args) {
        BasicPizza basicPizza = new BasicPizza();
        PizzaDecorator pineAppleDecorator = new Mozzarella(basicPizza);
        System.out.println(pineAppleDecorator.getDescription());
    }
}
