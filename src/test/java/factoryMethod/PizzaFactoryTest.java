package factoryMethod;


import org.example.HW11.Decorator.Pizza;
import org.example.HW11.FactoryMethod.factory.FourCheesePizzaFactory;
import org.example.HW11.FactoryMethod.factory.HawaiianPizzaFactory;
import org.example.HW11.FactoryMethod.factory.PepperoniPizzaFactory;
import org.example.HW11.FactoryMethod.factory.PizzaFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaFactoryTest {

    @Test
    public void testFourCheesePizzaFactory() {
        PizzaFactory factory = new FourCheesePizzaFactory();
        Pizza pizza = factory.createPizza();
        assertEquals("Тесто, Моцарелла,Пармезан, Томатный соус", pizza.getDescription());

        assertEquals(8.55, pizza.getCost(), 0.01);
    }

    @Test
    public void testHawaiianPizzaFactory() {
        PizzaFactory factory = new HawaiianPizzaFactory();
        Pizza pizza = factory.createPizza();
        assertEquals("Тесто, ананасы, Томатный соус", pizza.getDescription());
        assertEquals(6.15, pizza.getCost(), 0.01);
    }

    @Test
    public void testPepperoniPizzaFactory() {
        PizzaFactory factory = new PepperoniPizzaFactory();
        Pizza pizza = factory.createPizza();
        assertEquals("Тесто, Томатный соус салями", pizza.getDescription()); // Добавьте пепперони по мере необходимости
        assertEquals(5.75, pizza.getCost(), 0.01);
    }
}
