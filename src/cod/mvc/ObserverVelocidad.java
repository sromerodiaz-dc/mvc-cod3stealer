package cod.mvc;

/**
 * Clase que implementa el patrón de diseño Observer para detectar cuando se actualiza la velocidad de un coche.
 */
public class ObserverVelocidad implements Observer {
    /**
     * Método que se ejecutará cuando el objeto observado cambie.
     * -
     * Verifica si la velocidad del coche ha cambiado.
     * Si la velocidad del coche ha cambiado, se mostrará un mensaje en la consola
     * y se actualizará la vista para mostrar la nueva velocidad del coche.
     *
     * @param arg Coche al que se le actualizó la velocidad
     * @param model Modelo que se utiliza para actualizar la velocidad del coche en la vista
     */
    @Override
    public void update(Coche arg, Model model) {
        System.out.println("[ObserverVelocidad] Se ha cambiado la velocidad: " + arg.velocidad.toString() + " km/hr");

        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.matricula, arg.velocidad);
    }
}