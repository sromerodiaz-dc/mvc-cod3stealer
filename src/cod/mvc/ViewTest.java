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

        View.muestraVelocidad("9876WXZ", 150);

        String expectedOutput = "El coche con matrícula 9876WXZ tiene una velocidad de 150 km/h\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}
