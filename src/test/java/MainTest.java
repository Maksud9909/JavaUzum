import org.example.HW10.Client;
import org.example.HW10.factory.HorseDrawnCarriageFactory;
import org.example.HW10.factory.MotorCycleFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testHorseDrawnCarriageFactory() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Client client1 = new Client(new HorseDrawnCarriageFactory());
        client1.start();

        // Verify
        String expectedOutput = "HorseDrawnCarriageTaxi\nBounces, скачет\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r", ""));
    }

    @Test
    void testMotorCycleFactory() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Client client2 = new Client(new MotorCycleFactory());
        client2.start();

        // Verify
        String expectedOutput = "MotorcycleTaxi\nride, мчит\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r", ""));
    }
}
