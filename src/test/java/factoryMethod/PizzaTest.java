package factoryMethod;

import org.example.HW11.Decorator.BasicPizza;
import org.example.HW11.Decorator.Mozzarella;
import org.example.HW11.Decorator.Pizza;
import org.example.HW11.Decorator.TomatoSauce;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;





public class PizzaTest {

    @Test
    public void testPlainPizza() {
        Pizza pizza = new BasicPizza();
        assertEquals("Тесто", pizza.getDescription());
        assertEquals(4.00, pizza.getCost(), 0.01);
    }

    @Test
    public void testMozzarellaDecorator() {
        Pizza pizza = new BasicPizza();
        pizza = new Mozzarella(pizza);
        assertEquals("Тесто, Моцарелла", pizza.getDescription());
        assertEquals(5.50, pizza.getCost(), 0.01);
    }

    @Test
    public void testTomatoSauceDecorator() {
        Pizza pizza = new BasicPizza();
        pizza = new TomatoSauce(pizza);
        assertEquals("Тесто, Томатный соус", pizza.getDescription());
        assertEquals(4.75, pizza.getCost(), 0.01);
    }

    @Test
    public void testMultipleDecorators() {
        Pizza pizza = new BasicPizza();
        pizza = new Mozzarella(pizza);
        pizza = new TomatoSauce(pizza);
        assertEquals("Тесто, Моцарелла, Томатный соус", pizza.getDescription());
        assertEquals(6.25, pizza.getCost(), 0.01);
    }
}

