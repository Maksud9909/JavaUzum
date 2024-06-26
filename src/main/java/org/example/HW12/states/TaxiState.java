package org.example.HW12.states;


import org.example.HW12.model.Taxi;

public interface TaxiState {
    void handleGas(Taxi taxi);
    void handleBrake(Taxi taxi);
}
