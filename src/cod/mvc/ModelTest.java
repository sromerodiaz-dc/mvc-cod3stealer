package cod.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class ModelTest {

    Model model = new Model();
    @BeforeEach
    void setUp() {
        model.crearCoche("1234ABC", "ModeloTest1", 100);
    }

    @Test
    void testCrearCoche() {
        Coche coche = model.crearCoche("5678DEF", "ModeloTest2", 200);
        assertNotNull(coche);
        assertEquals("5678DEF", coche.getMatricula());
        assertEquals("ModeloTest2", coche.getModelo());
        assertEquals(Optional.of(200), coche.getVelocidad());
    }

    @Test
    void testGetCoche() {
        Coche coche = model.getCoche("1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
    }

    // Nuevos TEST
    @Test
    void testSubirVelocidad() {
        model.subirVelocidad("1234ABC", 5); // Sube velocidad
        Integer velocidad = model.getVelocidad("1234ABC"); // Guarda nueva velocidad
        assertEquals(Optional.of(105),velocidad); // Comprueba nueva velocidad
    }

    @Test
    void testBajarVelocidad() {
        model.subirVelocidad("1234ABC", 5); // Sube velocidad
        Integer velocidad = model.getVelocidad("1234ABC"); // Guarda nueva velocidad
        assertEquals(Optional.of(100),velocidad); // Comprueba nueva velocidad
    }

    @Test
    void testGetVelocidad() {
        Integer velocidad = model.getVelocidad("1234ABC");
        assertEquals(Optional.of(100), velocidad);
    }
}