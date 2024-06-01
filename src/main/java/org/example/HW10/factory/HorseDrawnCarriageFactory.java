package org.example.HW10.factory;

import org.example.HW10.move.Bounces;
import org.example.HW10.move.Move;
import org.example.HW10.taxiServices.Driver;
import org.example.HW10.taxiServices.HorseDrawnCarriageTaxi;

public class HorseDrawnCarriageFactory implements TaxiFactory{

    @Override
    public Driver createDriver() {
        return new HorseDrawnCarriageTaxi();
    }

    @Override
    public Move createMove() {
        return new Bounces();
    }
}
