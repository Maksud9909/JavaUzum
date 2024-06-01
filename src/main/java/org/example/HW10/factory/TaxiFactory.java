package org.example.HW10.factory;

import org.example.HW10.move.Move;
import org.example.HW10.taxiServices.Driver;

public interface TaxiFactory {
    Driver createDriver();
    Move createMove();
}
