package models;
/**
 * Representa a un cliente dentro del sistema.
 * Hereda los atributos y métodos de la clase Persona.
 *
 * @author Matías, Maxi, Máximo, Farid
 * @version 1.0
 * @see Persona
 */
public class Cliente extends Persona {

    private String tipoCliente;

    /**
     * Constructor de la clase Cliente.
     *
     * @param dni         número de documento del cliente
     * @param nombre      nombre completo del cliente
     * @param añoIngreso  año en el que ingresó al sistema
     * @param estado      estado actual (true = activo, false = inactivo)
     * @param tipoCliente tipo de cliente
     */
    public Cliente(String dni, String nombre, int añoIngreso, boolean estado, String tipoCliente) {
        super(dni, nombre, añoIngreso, estado);
        this.tipoCliente = tipoCliente;
    }

    /**
     * Retorna el tipo de cliente.
     * @return tipo de cliente
     */
    public String getTipoCliente(){return tipoCliente;}

    /**
     * Setea el tipo de cliente.
     * @param tipoCliente nuevo tipo de cliente
     */
    public void setTipoCliente(String tipoCliente){this.tipoCliente = tipoCliente;}
}
