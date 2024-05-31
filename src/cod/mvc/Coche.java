package cod.mvc;

/**
 * Clase Coche, representa un coche con sus características.
 */
public class Coche {
    /**
     * Matrícula del coche.
     */
    public String matricula;
    /**
     * Modelo del coche.
     */
    public String modelo;
    /**
     * Velocidad actual del coche.
     */
    public Integer velocidad;

    /**
     * Constructor de la clase Coche, inicializa el modelo y la matrícula del coche.
     * La velocidad se establece en 0 por defecto.
     * @param modelo del coche
     * @param matricula del coche
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    /**
     * Constructor de la clase Coche, inicializa el modelo, la matrícula y la velocidad del coche.
     * @param modelo del coche
     * @param matricula del coche
     * @param velocidad inicial del coche (se ignora y se establece en 0)
     */
    public Coche(String modelo, String matricula, int velocidad) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0; // Se ignora el parámetro velocidad y se establece en 0
    }

    /**
     * Método que devuelve la matrícula del coche.
     * @return matrícula del coche
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método que establece la matrícula del coche.
     * @param matricula nueva matrícula del coche
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Método que devuelve el modelo del coche.
     * @return modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método que establece el modelo del coche.
     * @param modelo nuevo modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que devuelve la velocidad actual del coche.
     * @return velocidad actual del coche
     */
    public Integer getVelocidad() {
        return velocidad;
    }

    /**
     * Método que establece la velocidad actual del coche.
     * @param velocidad nueva velocidad del coche
     */
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}