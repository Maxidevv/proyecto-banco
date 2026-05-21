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

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo.toLowerCase(); }

    public float getMonto() { return monto; }
    public void setMonto(float monto) { this.monto = monto; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda.toLowerCase(); }
}
