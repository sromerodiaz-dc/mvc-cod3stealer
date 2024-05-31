package cod.mvc;

/**
 * Interfaz Observer
 */
public interface Observer {
    // metodo que se ejecutará cuando el objeto observado cambie
    void update(Coche arg, Model model);
}