package org.example.HW12;

import org.example.HW12.memento.TaxiMemento;
import org.example.HW12.model.Taxi;
import org.example.HW12.strategies.EconomyTariff;
import org.example.HW12.strategies.StandardTariff;
import org.example.HW12.visitor.JsonVisitor;
import org.example.HW12.visitor.TaxiVisitor;
import org.example.HW12.visitor.XmlVisitor;

public class Main {
    public static void main(String[] args) {
        // Создаем такси с тарифом "Стандарт"
        Taxi taxi = new Taxi(new StandardTariff(), "John Doe");

        // Меняем тариф на "Экономичный"
        taxi.changeTariff(new EconomyTariff());

        // Меняем состояние такси
        taxi.pressGas();  // Едем
        taxi.pressGas();  // Мчимся
        taxi.pressBrake(); // Останавливаемся

        // Сохраняем состояние такси
        TaxiMemento savedState = taxi.saveState();

        // Снова меняем состояние
        taxi.pressGas();  // Едем

        // Восстанавливаем сохраненное состояние
        taxi.restoreState(savedState);

        // Применяем визиторы для сохранения состояния в форматах XML и JSON
        TaxiVisitor xmlVisitor = new XmlVisitor();
        TaxiVisitor jsonVisitor = new JsonVisitor();

        taxi.accept(xmlVisitor);
        taxi.accept(jsonVisitor);
    }
}
