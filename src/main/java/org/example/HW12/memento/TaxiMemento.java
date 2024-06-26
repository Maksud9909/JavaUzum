package org.example.HW12.memento;


public class TaxiMemento {
    private final double mileage;
    private final String driver;
    private final String status;

    public TaxiMemento(double mileage, String driver, String status) {
        this.mileage = mileage;
        this.driver = driver;
        this.status = status;
    }

    public double getMileage() {
        return mileage;
    }

    public String getDriver() {
        return driver;
    }

    public String getStatus() {
        return status;
    }
}
