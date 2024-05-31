package cod.mvc;

/**
 * Clase Controller, la cual gestiona la lógica de control del programa.
 * Implementa el patrón Observer para actualizar a los observadores cuando se crea un coche o
 * cambia su velocidad.
 */
public class Controller {
    Model model; // Modelo del programa

    /**
     Constructor de la clase Controller, inicializa el modelo y añade y elimina observadores.
     @param model Modelo del programa
     */
    public Controller(Model model) {
        this.model = model;

        // Añade y elimina observadores de velocidad y límite
        ObserverVelocidad velocidad = new ObserverVelocidad();
        model.addObserver(velocidad);
        model.notifyAll();
        ObserverLimite limit = new ObserverLimite();
        model.addObserver(limit);
        model.notifyAll();
        model.removeObserver(limit);
        model.notifyAll();
    }

    /**
     * Método que crea un coche con el nombre y matrícula especificados.
     * @param nombre Nombre del coche
     * @param matricula Matrícula del coche
     */
    public void crearCoche(String nombre, String matricula) {
        model.crearCoche(nombre, matricula, 100);
    }

    /**
     * Método que cambia la velocidad del coche con la matrícula especificada.
     * @param matricula Matrícula del coche
     * @param velocidad Nueva velocidad del coche
     */
    public void cambiarVelocidad(String matricula, Integer velocidad) {
        model.cambiarVelocidad(matricula, velocidad);
    }
}