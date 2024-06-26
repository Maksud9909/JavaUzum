package org.example.HW12.states;


import org.example.HW12.model.Taxi;

public class DrivingState implements TaxiState {
    @Override
    public void handleGas(Taxi taxi) {
        taxi.setState(new SpeedingState());
        System.out.println("Taxi is now speeding.");
    }

    @Override
    public void handleBrake(Taxi taxi) {
        taxi.setState(new StandingState());
        System.out.println("Taxi is now standing.");
    }
}
