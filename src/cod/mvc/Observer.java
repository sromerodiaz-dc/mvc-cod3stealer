package cod.mvc;

/**
 * Interfaz Observer, define el método que se ejecutará cuando el objeto observado cambie.
 */
public interface Observer {
    /**
     * Método que se ejecutará cuando el objeto observado cambie.
     * @param arg el coche que ha cambiado
     * @param model el modelo actual
     */
    void update(Coche arg, Model model);
}