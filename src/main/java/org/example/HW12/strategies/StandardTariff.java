package org.example.HW12.strategies;

public class StandardTariff implements Tariff {
    @Override
    public double calculateCost(double distance) {
        return distance * 10;
    }
}