package cod.mvc;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewTest {

    @Test
    public void testMuestraVelocidad() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        View.muestraVelocidad("7955BRP", 70);
        String expectedOutput = "El coche con matrícula 7955BRP-velocidad de 70 km/h\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
