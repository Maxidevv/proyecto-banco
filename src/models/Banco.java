package src.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Representa el Banco como main 
 */
public class Banco {
    
    private ArrayList<Persona> personas;
    private ArrayList<Transaccion> transacciones;
    private ArrayList<CajaDeAhorro> cajas;
    private ArrayList<Credito> creditos;
    private int idTransaccion;

    public Banco() {
        this.personas = new ArrayList<>();
        this.cajas = new ArrayList<>();
        this.creditos = new ArrayList<>();
        this.transacciones = new ArrayList<>();
        this.idTransaccion = 1;
    }

    public void agregarPersona(Persona persona) {
        if (persona != null) personas.add(persona);
    }

    public Persona buscarPersona(String dni) {
        for (Persona p : personas) {
            if (p.getDni().equals(dni)) return p;
        }
        return null;
    }

    public void agregarCuenta(CajaDeAhorro caja) {
        if (caja != null) {
            cajas.add(caja);
            Registro.registrarDatoCuenta(caja);
        }
    }

    public CajaDeAhorro buscarCuenta(String numeroCuenta) {
        for (CajaDeAhorro caja : cajas) {
            if (caja.getNumeroCuenta().equals(numeroCuenta)) return caja;
        }
        return null;
    }

    public void agregarCredito(Credito credito) {
        if (credito != null) creditos.add(credito);
    }

    public void registrarTransaccion(Transaccion transaccion) {
        if (transaccion != null) transacciones.add(transaccion);
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void incrementarIdTransaccion() {
        idTransaccion++;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public ArrayList<CajaDeAhorro> getCajas() {
        return cajas;
    }

    public ArrayList<Credito> getCreditos() {
        return creditos;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public static void main(String[] args) {

        Banco banco = new Banco();
        
        // Clientes
        Cliente c1 = new Cliente("12345678", "Maxi Moncada", 2024, true, "oro");
        Cliente c2 = new Cliente("87654321", "Matias Moyano", 2023, true, "platino");
        Cliente c3 = new Cliente("11111111", "Maximo Zalazar", 2025, true, "plata");
        
        banco.agregarPersona(c1);
        banco.agregarPersona(c2);
        banco.agregarPersona(c3);
        System.out.println("Clientes agregados\n");
        
        // Empleado
        Empleado empleado = new Empleado("49192491", "Farid Darrull", 2020, true, "Gestor");
        banco.agregarPersona(empleado);
        System.out.println("Empleado creado\n");
        
        // Cuentas
        CajaDeAhorro cuenta1 = new CajaDeAhorro("001", LocalDate.now(), 5000, 1000);
        CajaDeAhorro cuenta2 = new CajaDeAhorro("002", LocalDate.now(), 10000, 5000);
        CajaDeAhorro cuenta3 = new CajaDeAhorro("003", LocalDate.now(), 2000, 500);
        
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);
        banco.agregarCuenta(cuenta3);
        System.out.println("Cuentas creadas\n");
        
        // Operaciones con CajaDeAhorro
        System.out.println("Operacion\n");
        CajaDeAhorro c = banco.buscarCuenta("001");
        if (c != null) {
            c.depositarPesos(1000);
            Transaccion t1 = new Transaccion(banco.getIdTransaccion(), "deposito", 1000, LocalDateTime.now(), "001", "pesos");
            banco.incrementarIdTransaccion();
            banco.registrarTransaccion(t1);
            Registro.registrarTransaccion(t1);
            System.out.println("Deposito registrado");
            
            c.retirarPesos(500);
            Transaccion t2 = new Transaccion(banco.getIdTransaccion(), "retiro", 500, LocalDateTime.now(), "001", "pesos");
            banco.incrementarIdTransaccion();
            banco.registrarTransaccion(t2);
            Registro.registrarTransaccion(t2);
            System.out.println("Retiro registrado");
        }
        
        System.out.println("\nSistema inicializado");
    }
}
