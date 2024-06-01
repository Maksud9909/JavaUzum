package org.example.HW10.factory;

import org.example.HW10.move.Drives;
import org.example.HW10.move.Move;
import org.example.HW10.taxiServices.CarTaxi;
import org.example.HW10.taxiServices.Driver;

public class CarTaxiFactory implements TaxiFactory{
    @Override
    public Driver createDriver() {
        return new CarTaxi();
    }

    @Override
    public Move createMove() {
        return new Drives();
    }
}
