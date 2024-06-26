package org.example.HW12.visitor;


import org.example.HW12.model.Taxi;

public class JsonVisitor implements TaxiVisitor {
    @Override
    public void visit(Taxi taxi) {
        System.out.println("{");
        System.out.println("  \"driver\": \"" + taxi.getDriver() + "\",");
        System.out.println("  \"mileage\": " + taxi.getMileage() + ",");
        System.out.println("  \"status\": \"" + taxi.getStatus() + "\"");
        System.out.println("}");
    }
}
