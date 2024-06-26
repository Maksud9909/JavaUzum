package org.example.HW12.visitor;


import org.example.HW12.model.Taxi;

public class XmlVisitor implements TaxiVisitor {
    @Override
    public void visit(Taxi taxi) {
        System.out.println("<Taxi>");
        System.out.println("  <Driver>" + taxi.getDriver() + "</Driver>");
        System.out.println("  <Mileage>" + taxi.getMileage() + "</Mileage>");
        System.out.println("  <Status>" + taxi.getStatus() + "</Status>");
        System.out.println("</Taxi>");
    }
}
