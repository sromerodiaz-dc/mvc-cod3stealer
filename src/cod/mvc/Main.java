package cod.mvc;

public class Main {
    public static void main(String[] args) {
        // Inicializamos la app
        // obtenemos la instancia única del modelo
        Model miModel = Model.getInstance();
        // instanciamos el controlador
        // le pasamos el Model instanciado
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("BMW", "SPQ 5432");
        miController.crearCoche("Audi", "JFK 9876");
        miController.crearCoche("Mercedes", "MNO 8546");

        // Cambiar la velocidad de un coche (DOS MÉTODOS NUEVOS)
        miController.subirVelocidad("SPQ 5432", 50);

        // otro cambio de velocidad
        // sobrepasando la velocidad máxima
        miController.bajarVelocidad("JFK 9876", 140);
    }
}
