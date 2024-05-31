package cod.mvc;

public class ObserverVelocidad implements Observer {
    /**
     * Este método es llamado siempre que hay un cambio
     * El observable cuando hace el notifyObservers
     * 'dispara' todos los update de los Observers
     * @param arg el argumento pasado por el observable, el coche actualizado
     */
    @Override
    public void update(Coche arg, Model model) {
        System.out.println("[ObserverVelocidad] Se ha cambiado la velocidad: " + arg.velocidad.toString() + "km/hr");

        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.matricula, arg.velocidad);

    }
}