package cod.mvc;

/**
 * Clase que implementa el patrón de diseño Observer para detectar cuando un coche excede el límite de velocidad.
 */
public class ObserverLimite implements Observer {
    // Velocidad máxima permitida
    final static int LIMITE = 120;

    /**
     * Método que se ejecutará cuando el objeto observado cambie.
     * -
     * Verifica si el coche ha excedido el límite de velocidad.
     * Si el coche ha excedido el límite, se mostrará un mensaje de "INFRACCION"
     * y se reducirá la velocidad del coche en 10 km/h para evitar una infracción.
     *
     * @param coche Coche al que se le actualizó la velocidad
     * @param model Modelo que se utiliza para actualizar la velocidad del coche
     */
    @Override
    public void update(Coche coche, Model model) {
        if (coche.velocidad > LIMITE) {
            System.out.println("INFRACCION" +
                    "\nSe ha reducido la velocidad");
            model.cambiarVelocidad(coche.matricula, coche.velocidad - 10);
        }
    }
}