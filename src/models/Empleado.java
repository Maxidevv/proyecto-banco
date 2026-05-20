package models;
/**
 * Representa a un empleado dentro del sistema.
 * Hereda los atributos y métodos de la clase Persona.
 *
 * @author Matías, Maxi, Máximo, Farid
 * @version 1.0
 * @see Persona
 */

public class Empleado extends Persona {

    private String tipoEmpleado;

    /**
     * Constructor de la clase Empleado.
     *
     * @param dni          número de documento del empleado
     * @param nombre       nombre completo del empleado
     * @param añoIngreso   año en el que ingresó al sistema
     * @param estado       estado actual (true = activo, false = inactivo)
     * @param tipoEmpleado tipo de empleado
     */
    public Empleado(String dni, String nombre, int añoIngreso, boolean estado, String tipoEmpleado) {
        super(dni, nombre, añoIngreso, estado);
        this.tipoEmpleado = tipoEmpleado;
    }

    /**
     * Retorna el tipo de empleado.
     * @return tipo de empleado
     */
    public String getTipoEmpleado(){return tipoEmpleado;}

    /**
     * Establece el tipo de empleado.
     * @param tipoEmpleado nuevo tipo de empleado
     */
    public void setTipoEmpleado(String tipoEmpleado){this.tipoEmpleado = tipoEmpleado;}
}