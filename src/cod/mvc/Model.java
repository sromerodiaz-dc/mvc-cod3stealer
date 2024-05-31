package cod.mvc;

import java.util.ArrayList;

/**
 * Clase Model, representa el modelo de la aplicación.
 * Implementa la interfaz Observable.
 */
public class Model implements Observable {
    /**
     * Instancia única del modelo.
     */
    private static Model instance = new Model();

    /**
     * ArrayList de coches en el parking.
     */
    private final ArrayList<Coche> parking;

    /**
     * ArrayList de observadores.
     */
    private final ArrayList<Observer> observers;

    /**
     * Constructor privado para evitar instanciación externa.
     */
    private Model() {
        parking = new ArrayList<>();
        observers = new ArrayList<>();
    }

    /**
     * Obtiene la única instancia del modelo.
     * @return instancia única del modelo
     */
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    // Implementación de la interfaz Observable
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche, Model model) {
        for (Observer observer : observers) {
            observer.update(coche, model);
        }
    }

    /**
     * Crea un coche y lo añade al parking.
     * @param modelo    del coche
     * @param matricula identificador único
     * @param velocidad velocidad del coche
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula, int velocidad) {
        Coche aux = new Coche(modelo, matricula, velocidad);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca un coche en el parking según la matrícula.
     * @param matricula a buscar
     * @return coche o null si no existe
     */
    public Coche getCoche(String matricula) {
        Coche aux = null;
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche y notifica a los observadores.
     * @param matricula identificador del coche
     * @param v nueva velocidad
     */
    public void cambiarVelocidad(String matricula, int v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad = v;
            notifyObservers(coche, this);
        }
    }

    /**
     * Devuelve la velocidad de un coche según la matrícula.
     * @param matricula identificador del coche
     * @return velocidad del coche actual
     */
    public int getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche != null ? coche.velocidad : -1;
    }
}