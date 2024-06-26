package org.example.HW12.model;


import org.example.HW12.memento.TaxiMemento;
import org.example.HW12.states.DrivingState;
import org.example.HW12.states.SpeedingState;
import org.example.HW12.states.StandingState;
import org.example.HW12.states.TaxiState;
import org.example.HW12.strategies.Tariff;
import org.example.HW12.visitor.TaxiVisitor;

public class Taxi {
    private Tariff tariff;
    private TaxiState state;
    private double mileage;
    private String driver;
    private String status;

    public Taxi(Tariff tariff, String driver) {
        this.tariff = tariff;
        this.driver = driver;
        this.state = new StandingState();
        this.status = "standing";
    }

    public void changeTariff(Tariff newTariff) {
        this.tariff = newTariff;
    }

    public void pressGas() {
        state.handleGas(this);
        updateStatus();
    }

    public void pressBrake() {
        state.handleBrake(this);
        updateStatus();
    }

    public void setState(TaxiState state) {
        this.state = state;
    }

    public void updateStatus() {
        if (state instanceof StandingState) {
            status = "standing";
        } else if (state instanceof DrivingState) {
            status = "driving";
        } else if (state instanceof SpeedingState) {
            status = "speeding";
        }
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getDriver() {
        return driver;
    }

    public String getStatus() {
        return status;
    }

    public TaxiMemento saveState() {
        return new TaxiMemento(mileage, driver, status);
    }

    public void restoreState(TaxiMemento memento) {
        this.mileage = memento.getMileage();
        this.driver = memento.getDriver();
        this.status = memento.getStatus();
        if (status.equals("standing")) {
            setState(new StandingState());
        } else if (status.equals("driving")) {
            setState(new DrivingState());
        } else if (status.equals("speeding")) {
            setState(new SpeedingState());
        }
    }

    public void accept(TaxiVisitor visitor) {
        visitor.visit(this);
    }
}
