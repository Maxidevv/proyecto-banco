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

    public Persona(String dni, String nombre, int añoIngreso, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
        this.estado = estado;
    }

    public String getDni(){return dni;}
    public String getNombre(){return nombre;}
    public int getAñoIngreso(){return añoIngreso;}
    public boolean getEstado(){return estado;}
    public void setDni(String dni){this.dni = dni;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setAñoIngreso(int añoIngreso){this.añoIngreso = añoIngreso;}
    public void setEstado(boolean estado){this.estado = estado;}
}
