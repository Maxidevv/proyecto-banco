package src.models;
import java.time.LocalDate;

/**
 * Esta clase representa una tarjeta de credito en el sistema.
 * 
 * Gestiona el acceso a tarjetas de credito segun el tipo de cliente:
 * - Clientes Plata: Sin acceso a tarjeta
 * - Clientes Oro: Tarjeta Credix con limite de 250000
 * - Clientes Platino: Tarjeta Premium con limite de 500000
 * 
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar, Darull Farid
 * @version 3.0
 * @see Cuenta
 */
public class Credito extends Cuenta {
    
    private String tipoTarjeta;    
    private int limiteCredito;

    /**
     * 
     * @param tipoTarjeta es el nombre de la tarjeta
     * @param numeroCuenta es el identificador de la cuenta
     * @param fechaApertura es la fecha de apertura
     * @param limiteCredito es el limite de credito
     */
    public Credito(String tipoTarjeta, String numeroCuenta, LocalDate fechaApertura, int limiteCredito) {
        super(numeroCuenta, fechaApertura);
        this.tipoTarjeta = tipoTarjeta;
        this.limiteCredito = limiteCredito;
    }

    /**
     * Obtiene el tipo de tarjeta
     * 
     * @return el tipo de tarjeta
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Establece el tipo de tarjeta
     * 
     * @param tipoTarjeta es el nuevo tipo de tarjeta
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * Obtiene el limite de credito de la tarjeta
     * 
     * @return el limite de credito
     */
    public int getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * Establece el limite de credito de la tarjeta
     * 
     * @param limiteCredito es el nuevo limite de credito
     */
    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    /**
     * Se crea una tarjeta de credito segun el tipo de cliente
     * 
     * @param tipoCliente es el tipo de cliente (Plata, Oro, Platino)
     * @param numeroCuenta es el numero de la cuenta
     * @param fechaApertura es la fecha de apertura
     * @return una instancia de Credito configurada segun el tipo, o null si no tiene acceso
     * @throws IllegalArgumentException si el tipo de cliente no es valido
     */
    public static Credito crearTarjetaSegunCliente(String tipoCliente, String numeroCuenta, LocalDate fechaApertura) {
        if (tipoCliente == null || tipoCliente.isEmpty()) {
            throw new IllegalArgumentException("El tipo de cliente no puede estar vacio");
        }

        switch (tipoCliente) {
            case "Plata":
                return null; // Sin acceso a tarjeta de crédito
            case "Oro":
                return new Credito("Credix", numeroCuenta, fechaApertura, 250000);
            case "Platino":
                return new Credito("Premium", numeroCuenta, fechaApertura, 500000);
            default:
                throw new IllegalArgumentException("Tipo de cliente no valido: " + tipoCliente);
        }
    }

    /**
     * Valida si un cliente tiene acceso a tarjeta de credito segun su tipo.
     * 
     * @param tipoCliente el tipo de cliente
     * @return true si el cliente tiene acceso, false en caso contrario
     */
    public static boolean tieneAccesoTarjeta(String tipoCliente) {
        return !"Plata".equals(tipoCliente);
    }
}
