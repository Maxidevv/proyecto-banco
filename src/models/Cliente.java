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

    public Cliente(String dni, String nombre, int añoIngreso, boolean estado, String tipoCliente) {
        super(dni, nombre, añoIngreso, estado);
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente(){return tipoCliente;}
    public void setTipoCliente(String tipoCliente){this.tipoCliente = tipoCliente;}
}
