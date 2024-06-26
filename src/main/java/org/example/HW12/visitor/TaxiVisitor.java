package org.example.HW12.visitor;


import org.example.HW12.model.Taxi;

public interface TaxiVisitor {
    void visit(Taxi taxi);
}
