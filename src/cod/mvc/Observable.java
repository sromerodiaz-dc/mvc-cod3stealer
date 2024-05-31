package cod.mvc;

/**
 * Interfaz Observable, define los métodos para agregar, eliminar y notificar observadores.
 */
public interface Observable {
    /**
     * Añade un observador a la lista de observadores.
     * @param observer el observador a agregar
     */
    void addObserver(Observer observer);

    /**
     * Elimina un observador de la lista de observadores.
     * @param observer el observador a eliminar
     */
    void removeObserver(Observer observer);

    /**
     * Notifica a todos los observadores registrados cuando ocurre un cambio en el estado del objeto observable.
     * @param coche el coche que ha cambiado
     * @param model el modelo actual
     */
    void notifyObservers(Coche coche, Model model);
}