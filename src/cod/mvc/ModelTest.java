package cod.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testCambiarVelocidad() {
        model.cambiarVelocidad("1234ABC", 150);
    }

    @Test
    void testGetVelocidad() {
        Integer velocidad = model.getVelocidad("1234ABC");
        assertEquals(Optional.of(100), velocidad);
    }
}