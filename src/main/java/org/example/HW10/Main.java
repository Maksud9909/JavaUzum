package org.example.HW10;

import org.example.HW10.factory.HorseDrawnCarriageFactory;
import org.example.HW10.factory.MotorCycleFactory;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new HorseDrawnCarriageFactory());
        client1.start();

        System.out.println("-------");

        Client client2 = new Client(new MotorCycleFactory());
        client2.start();
    }

}
