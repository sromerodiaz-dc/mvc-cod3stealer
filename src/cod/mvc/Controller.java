package cod.mvc;

public class Controller{

    // definimos la instancia del modelo
    // private final Model miModel;

    /**
     * Constructor. Inicializamos el controller
     * Creamos los observadores que necesitamos
     * @param miModel
     */
    Model miModel;

    public Controller(Model miModel){
        this.miModel = miModel;

        // instanciamos al observador de la velocidad
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModel.addObserver(observoVelocidad);

        // instanciamos un segundo observador para el limite de velocidad
        ObserverLimite observoLimite = new ObserverLimite();
        miModel.addObserver(observoLimite);
    }

    /**
     * Crea un coche
     * @param nombre del coche
     * @param matricula del coche
     */
    public void crearCoche(String nombre, String matricula){
        miModel.crearCoche(nombre, matricula, 100);
    }

    /**
     * Sube la velocidad de un coche
     * @param matricula del coche
     * @param velocidad nueva
     */
    public void subirVelocidad(String matricula, Integer velocidad){
        miModel.subirVelocidad(matricula, velocidad);
    }

    /**
     * Baja la velocidad de un coche
     * @param matricula del coche
     * @param velocidad nueva
     */
    public void bajarVelocidad(String matricula, Integer velocidad){
        miModel.subirVelocidad(matricula, velocidad);
    }
}