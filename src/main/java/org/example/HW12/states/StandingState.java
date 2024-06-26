package org.example.HW12.states;

import org.example.HW12.model.Taxi;

public class StandingState implements TaxiState {
    @Override
    public void handleGas(Taxi taxi) {
        taxi.setState(new DrivingState());
        System.out.println("Taxi is now driving.");
    }

    @Override
    public void handleBrake(Taxi taxi) {
        System.out.println("Taxi is already standing.");
    }
}
