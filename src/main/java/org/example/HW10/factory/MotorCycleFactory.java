package org.example.HW10.factory;

import org.example.HW10.move.Move;
import org.example.HW10.move.Ride;
import org.example.HW10.taxiServices.Driver;
import org.example.HW10.taxiServices.MotorcycleTaxi;

public class MotorCycleFactory implements TaxiFactory{
    @Override
    public Driver createDriver() {
        return new MotorcycleTaxi();
    }
    @Override
    public Move createMove() {
        return new Ride();
    }
}
