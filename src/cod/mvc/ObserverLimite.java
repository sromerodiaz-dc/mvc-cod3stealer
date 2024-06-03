package cod.mvc;

/**
 * Otro observador que se suscribe a los cambios de velocidad de un coche
 */
public class ObserverLimite implements Observer {
    // velocidad máxima
    final static int LIMITE_MAX = 120;
    final static int LIMITE_MIN = 60; // Añado un mínimo para implementar el método bajarVelocidad

    /**
     * Este es el observador de limite de velocidad
     * @param coche Coche al que se le actualizó la velocidad
     */
    @Override
    public void update(Coche coche, Model model) {
        if(coche.velocidad>LIMITE_MAX){
            System.out.println("INFRACCION"+
                    "\nSe ha reducido la velocidad");
            model.bajarVelocidad(coche.matricula, 10);
        } else if (coche.velocidad<LIMITE_MIN){
            System.out.println("INFRACCION"+
                    "\nSe ha aumentado la velocidad");
            model.subirVelocidad(coche.matricula, 10);
        }
    }
}