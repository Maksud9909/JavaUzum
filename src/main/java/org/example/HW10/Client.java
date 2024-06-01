package org.example.HW10;

import org.example.HW10.factory.TaxiFactory;
import org.example.HW10.move.Move;
import org.example.HW10.taxiServices.Driver;

public class Client {
    protected Driver driver;
    protected Move move;
    public Client(TaxiFactory taxiFactory) {
        this.driver = taxiFactory.createDriver();
        this.move = taxiFactory.createMove();
    }
    public void start(){
        driver.drive();
        move.move();
    }
}
