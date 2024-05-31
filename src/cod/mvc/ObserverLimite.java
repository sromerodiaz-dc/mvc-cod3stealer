package cod.mvc;

/**
 * Observador de límite de velocidad.
 */
public class ObserverLimite implements Observer {
    // Velocidad máxima permitida
    final static int LIMITE = 120;

    /**
     * Método que se ejecutará cuando el objeto observado cambie.
     * En este caso, se verifica si el coche ha excedido el límite de velocidad.
     * Si el coche ha excedido el límite, se mostrará un mensaje de "INFRACCION"
     * y se reducirá la velocidad del coche en 10 km/h.
     * @param coche Coche al que se le actualizó la velocidad
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