package cod.mvc;

/**
 * Clase que representa la vista de la aplicación, responsable de mostrar la información al usuario.
 */
public class View {
    /**
     * Muestra la velocidad del coche en la consola.
     *
     * @param matricula Matrícula del coche
     * @param v Velocidad del coche en km/hr
     */
    public static void muestraVelocidad(String matricula, Integer v){
        System.out.println("Radar => " + matricula + ": " + v + " km/hr");
    }
}