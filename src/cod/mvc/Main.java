package cod.mvc;

/**
 * @author Santiago Agustin Romero Diaz
 * 5/31/2024 - Examen COD 3ª evaluación
 * Clase Main, punto de entrada del programa.
 */
public class Main {
    /**
     * Método main, punto de entrada del programa.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Model model = Model.getInstance(); // Obtiene la única instancia del modelo
        Controller controller = new Controller(model);

        // Crea un coche y cambia su velocidad
        controller.crearCoche("Maserati brutal", "SPQUWU77");
        controller.cambiarVelocidad("SPQUWU77", 120);

        // Crea otro coche y cambia su velocidad
        controller.crearCoche("reanultclio", "7955BRP");
        controller.cambiarVelocidad("7955BRP", 220);

        // Crear coche y recibir datos
        controller.crearCoche("Miata Classic", "8888 PRR");
        controller.buscarCoche("8888 PRR");
        controller.buscarCoche("no existe");
    }
}
