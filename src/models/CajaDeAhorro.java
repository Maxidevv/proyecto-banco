package src.models;

import java.time.LocalDate;

/**
 * Representa una cuenta de caja de ahorro
 * 
 * Permite guardar plata en dos monedas, pesos y dolares
 * Cada cliente puede realizar operaciones de deposito y retiro en las dos monedas
 * 
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar, Darull Farid
 * @version 1.3
 * @see Cuenta
 */
public class CajaDeAhorro extends Cuenta {

    /** Cantidad de plata ahorrada en pesos */
    private float pesos;
    
    /** Cantidad de plata ahorrada en dolares */
    private float dolares;

    /**
     * Constructor
     * 
     * @param numeroCuenta es el identificador unico de la cuenta
     * @param fechaApertura es la fecha en que se abrio la cuenta
     * @param pesos es saldo en pesos
     * @param dolares es el saldo en dolares
     */
    public CajaDeAhorro(String numeroCuenta, LocalDate fechaApertura, float pesos, float dolares) {
        super(numeroCuenta, fechaApertura);
        this.pesos = pesos;
        this.dolares = dolares;
    }

    /**
     * Se obtiene el saldo en pesos
     * 
     * @return el saldo actual en pesos
     */
    public float getPesos() { 
        return pesos; 
    }

    /**
     * Se establece el saldo en pesos
     * 
     * @param pesos el nuevo saldo en pesos
     */
    public void setPesos(float pesos) { 
        this.pesos = pesos; 
    }
    
    /**
     * Se obtiene el saldo en dolares
     * 
     * @return el saldo actual en dolares
     */
    public float getDolares() { 
        return dolares; 
    }

    /**
     * Se establece el saldo en dolares.
     * 
     * @param dolares el nuevo saldo en dolares
     */
    public void setDolares(float dolares) { 
        this.dolares = dolares; 
    }

    /**
     * Realiza un deposito de plata en en pesos
     * Solo deposita si el monto es positivo
     * 
     * @param monto es la cantidad a depositar
     */
    public void depositarPesos(float monto) {
        if (monto > 0) {
            this.pesos += monto;
        }
    }
    
    /**
     * Realiza un retiro de plata en pesos
     * Solo permite el retiro si hay saldo suficiente
     * 
     * @param monto es la cantidad a retirar
     * @return true si el retiro fue exitoso, false si no hay saldo suficiente
     */
    public boolean retirarPesos(float monto) {
        if (monto > 0 && pesos >= monto) {
            this.pesos -= monto;
            return true;
        }
        return false;
    }

    /**
     * Realiza un deposito de plata en dolares
     * Solo deposita si el monto es positivo
     * 
     * @param monto la cantidad a depositar
     */
    public void depositarDolares(float monto) {
        if (monto > 0) {
            this.dolares += monto;
        }
    }
    
    /**
     * Realiza un retiro de plata en dolares
     * Solo permite el retiro si hay saldo suficiente
     * 
     * @param monto la cantidad a retirar
     * @return true si el retiro fue exitoso, false si no hay saldo suficiente
     */
    public boolean retirarDolares(float monto) {
        if (monto > 0 && dolares >= monto) {
            this.dolares -= monto;
            return true;
        }
        return false;
    }

    /**
     * Se obtiene el saldo total en la moneda especificada
     * 
     * @param moneda la moneda requerida, pesos o dolares
     * @return el saldo en la moneda solicitada, o 0 si la moneda no es valida
     */
    public float getSaldoTotal(String moneda) {
        if ("pesos".equalsIgnoreCase(moneda) || "peso".equalsIgnoreCase(moneda)) {
            return pesos;
        }
        if ("dolares".equalsIgnoreCase(moneda) || "dolar".equalsIgnoreCase(moneda)) {
            return dolares;
        }
        return 0;
    }
}