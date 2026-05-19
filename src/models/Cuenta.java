package src.models;
import java.time.LocalDate;

/**
 * Representa una cuenta bancaria comun
 * 
 * Esta es la clase padre para (Caja de Ahorro, Credito).
 * Almacena la informacion basica de una cuenta: su identificador unico y la fecha
 * en que fue abierta
 * 
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar, Farid Darull
 * @version 2.0
 * @see Credito
 * @see CajaDeAhorro
 */

public class Cuenta {

    /** Es el identificador unico de la cuenta*/
    private String numeroCuenta;
    
    /** La fecha en la cual la cuenta fue abierta en el banco*/
    private LocalDate fechaApertura;

    /**
     * Construye una nueva Cuenta con el numero y fecha de apertura especificados
     * 
     * @param numeroCuenta es el identificador unico de la cuenta
     * @param fechaApertura es la fecha en que se abrio la cuenta
     */
    public Cuenta(String numeroCuenta, LocalDate fechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
    }

    /**
     * Obtiene el numero (identificador) de la cuenta
     * 
     * @return el numero de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Obtiene la fecha de apertura de la cuenta
     * 
     * @return la fecha de apertura
     */
    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Establece el numero de cuenta.
     * 
     * @param numeroCuenta es el nuevo numero de cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Establece la fecha de apertura de la cuenta
     * 
     * @param fechaApertura es la nueva fecha de apertura
     */
    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

}
