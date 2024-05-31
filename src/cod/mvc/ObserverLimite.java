package cod.mvc;

/**
 * Otro observador que se suscribe a los cambios de velocidad de un coche
 */
public class ObserverLimite implements Observer {
    // velocidad máxima
    final static int LIMITE = 120;
    /**
     * Este es el observador de limite de velocidad
     * @param coche Coche al que se le actualizó la velocidad
     */
    @Override
    public void update(Coche coche, Model model) {
        if(coche.velocidad>LIMITE){
            System.out.println("INFRACCION"+
                    "\nSe ha reducido la velocidad");
            model.cambiarVelocidad(coche.matricula, coche.velocidad-10);

        }
    }
}