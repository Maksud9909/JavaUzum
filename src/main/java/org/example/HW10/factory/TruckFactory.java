package org.example.HW10.factory;

import org.example.HW10.move.Crawls;
import org.example.HW10.move.Move;
import org.example.HW10.taxiServices.TruckTaxi;
import org.example.HW10.taxiServices.Driver;

public class TruckFactory implements TaxiFactory{
    @Override
    public Driver createDriver() {
        return new TruckTaxi();
    }

    @Override
    public Move createMove() {
        return new Crawls();
    }
}
