package src.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Gestiona el registro de datos en archivos de texto
 * 
 * Mantiene dos archivos:
 * - datoCuenta.txt: Guarda informacion de la cuenta del cliente
 * - transaccionCuenta.txt: Guarda el historial de transacciones
 * 
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar, Farid Darull
 * @version 3.0
 * @see Cuenta
 * @see Transaccion
 */
public class Registro {
    
    private static final String ARCHIVO_DATOS = "datoCuenta.txt";
    private static final String ARCHIVO_TRANSACCIONES = "transaccionCuenta.txt";

    /**
     * Registra los datos de la cuenta de ahorro
     * Formato: numeroCuenta | fechaApertura
     * 
     * @param caja la CajaDeAhorro a registrar
     */
    public static void registrarDatoCuenta(CajaDeAhorro caja) {
        try {
            boolean archivoExiste = new File(ARCHIVO_DATOS).exists();
            
            try (FileWriter fw = new FileWriter(ARCHIVO_DATOS, true)) {
                if (!archivoExiste) {
                    fw.write("numeroCuenta | fechaApertura\n");
                }
                
                String linea = caja.getNumeroCuenta() + " | " + caja.getFechaApertura() + "\n";
                fw.write(linea);
                System.out.println("Dato de cuenta registrado");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en " + ARCHIVO_DATOS + ": " + e.getMessage());
        }
    }

    /**
     * Registra una transaccion en el archivo
     * Formato: id | tipo | monto | fecha | numeroCuenta | moneda
     * 
     * @param transaccion la Transaccion a registrar
     */
    public static void registrarTransaccion(Transaccion transaccion) {
        try {
            boolean archivoExiste = new File(ARCHIVO_TRANSACCIONES).exists();
            
            try (FileWriter fw = new FileWriter(ARCHIVO_TRANSACCIONES, true)) {
                if (!archivoExiste) {
                    fw.write("id | tipo | monto | fecha | numeroCuenta | moneda\n");
                }
                
                String linea = transaccion.getId() + " | " + transaccion.getTipo() + " | " + transaccion.getMonto() + " | " + transaccion.getFecha() + " | " + transaccion.getNumeroCuenta() + " | " + transaccion.getMoneda() + "\n";
                fw.write(linea);
                System.out.println("Transaccion registrada");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en " + ARCHIVO_TRANSACCIONES + ": " + e.getMessage());
        }
    }
}
