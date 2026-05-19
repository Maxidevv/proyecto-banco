package src.models;
import java.time.LocalDate;

/**
 * Representa una cuenta bancaria genérica en el sistema.
 * 
 * Esta es la clase padre para (Caja de Ahorro, Crédito).
 * Almacena la información básica de una cuenta: su identificador único y la fecha
 * en que fue abierta.
 * 
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar, Farid Darull
 * @version 2.0
 * @see Credito
 * @see CajaDeAhorro
 */

public class Cuenta {

    /** Identificador único de la cuenta. Formato flexible para adaptarse a diferentes sistemas. */
    private String numeroCuenta;
    
    /** Fecha en la cual la cuenta fue abierta en el banco. */
    private LocalDate fechaApertura;

    /**
     * Construye una nueva Cuenta con el número y fecha de apertura especificados.
     * 
     * @param numeroCuenta el identificador único de la cuenta
     * @param fechaApertura la fecha en que se abrió la cuenta
     */
    public Cuenta(String numeroCuenta, LocalDate fechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
    }

    /**
     * Obtiene el número (identificador) de la cuenta.
     * 
     * @return el número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Obtiene la fecha de apertura de la cuenta.
     * 
     * @return la fecha de apertura
     */
    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param numeroCuenta el nuevo número de cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Establece la fecha de apertura de la cuenta.
     * 
     * @param fechaApertura la nueva fecha de apertura
     */
    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }


    
}
