package src.models;
import java.time.LocalDateTime;

/**
 * Representa una transaccion bancaria de caja de ahorro
 * 
 * Registra operaciones de deposito y retiro en pesos o dolares.
 * 
 * @author Maxi Moncada, Mayias Moyano, Maximo Zalazar, Farid Darull
 * @version 1.0
 * @see CajaDeAhorro
 * @see Registro
 */
public class Transaccion {

    private int id;
    private String tipo; // "deposito" o "retiro"
    private float monto;
    private LocalDateTime fecha;
    private String numeroCuenta;
    private String moneda; // "pesos" o "dolares"

    /**
     * Constructor
     * 
     * @param id identificador unico de la transaccion
     * @param tipo tipo de transaccion (deposito/retiro)
     * @param monto cantidad movida
     * @param fecha fecha y hora de la transaccion
     * @param numeroCuenta numero de la cuenta
     * @param moneda moneda (pesos/dolares)
     */
    public Transaccion(int id, String tipo, float monto, LocalDateTime fecha, String numeroCuenta, String moneda) {
        this.id = id;
        this.tipo = tipo.toLowerCase();
        this.monto = monto;
        this.fecha = fecha;
        this.numeroCuenta = numeroCuenta;
        this.moneda = moneda.toLowerCase();
    }

    /**
     * Obtiene el identificador de la transaccion
     * @return identificador de la transaccion
     */
    public int getId() { return id; }

    /**
     * Establece el identificador de la transaccion
     * @param id identificador de la transaccion
     */
    public void setId(int id) { this.id = id; }

    /**
     * Obtiene el tipo de transaccion
     * @return tipo de transaccion
     */
    public String getTipo() { return tipo; }

    /**
     * Establece el tipo de transaccion
     * @param tipo tipo de transaccion
     */
    public void setTipo(String tipo) { this.tipo = tipo.toLowerCase(); }

    /**
     * Obtiene el monto de la transaccion
     * @return monto de la transaccion
     */
    public float getMonto() { return monto; }

    /**
     * Establece el monto de la transaccion
     * @param monto monto de la transaccion
     */
    public void setMonto(float monto) { this.monto = monto; }
    
    /**
     * Obtiene la fecha y hora de la transaccion
     * @return fecha y hora de la transaccion
     */
    public LocalDateTime getFecha() { return fecha; }

    /**
     * Establece la fecha y hora de la transaccion
     * @param fecha fecha y hora de la transaccion
     */
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    /**
     * Obtiene el numero de la cuenta
     * @return numero de la cuenta
     */
    public String getNumeroCuenta() { return numeroCuenta; }

    /**
     * Establece el numero de la cuenta
     * @param numeroCuenta numero de la cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    /**
     * Obtiene la moneda de la transaccion
     * @return moneda de la transaccion
     */
    public String getMoneda() { return moneda; }

    /**
     * Establece la moneda de la transaccion
     * @param moneda moneda de la transaccion
     */
    public void setMoneda(String moneda) { this.moneda = moneda.toLowerCase(); }
}
