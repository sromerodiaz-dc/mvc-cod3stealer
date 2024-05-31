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

    /**
     * Muestra el coche si existe y avisa del error de busqueda si no existe.
     * @param matricula Matrícula del coche
     * @param v Velocidad del coche
     * @param controlador Controla el output dado al usuario
     * */
    public static void muestraDatos(String matricula, Integer v, int controlador){
        if (controlador == 1) System.out.println("Datos => " + matricula + ": " + v + " km/hr");
        else System.out.println("vehiculo no encontrado");
    }
}