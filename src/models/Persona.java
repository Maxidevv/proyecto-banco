package models;
/**
 * Representa a una persona dentro del sistema.
 * Actúa como clase padre de Empleado y Cliente.
 *
 * @author Matías, Maxi, Máximo, Farid
 * @version 1.0
 * @see Empleado
 * @see Cliente
 */

public class Persona {
    private String dni;
    private String nombre;
    private int añoIngreso;
    private boolean estado;

    /**
     * Constructor de la clase Persona.
     *
     * @param dni        número de documento de la persona
     * @param nombre     nombre completo de la persona
     * @param añoIngreso año en el que ingresó al sistema
     * @param estado     estado actual (true = activo, false = inactivo)
     */
    public Persona(String dni, String nombre, int añoIngreso, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
        this.estado = estado;
    }

    /**
     * Retorna el DNI de la persona.
     * @return dni de la persona
     */
    public String getDni(){return dni;}

    /**
     * Retorna el nombre de la persona.
     * @return nombre de la persona
     */
    public String getNombre(){return nombre;}

    /**
     * Retorna el año de ingreso de la persona.
     * @return año de ingreso
     */
    public int getAñoIngreso(){return añoIngreso;}

    /**
     * Retorna el estado de la persona.
     * @return true si está activo, false si está inactivo
     */
    public boolean getEstado(){return estado;}
    
    /**
     * Establece el DNI de la persona.
     * @param dni nuevo DNI
     */
    public void setDni(String dni){this.dni = dni;}

    /**
     * Establece el nombre de la persona.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre){this.nombre = nombre;}

    /**
     * Establece el año de ingreso de la persona.
     * @param añoIngreso nuevo año de ingreso
     */
    public void setAñoIngreso(int añoIngreso){this.añoIngreso = añoIngreso;}

    /**
     * Establece el estado de la persona.
     * @param estado nuevo estado
     */
    public void setEstado(boolean estado){this.estado = estado;}
}
