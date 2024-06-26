package org.example.HW12.strategies;


public class EconomyTariff implements Tariff {
    @Override
    public double calculateCost(double distance) {
        return distance * 5;
    }
}
