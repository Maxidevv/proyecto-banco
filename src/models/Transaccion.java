package src.models;
import java.time.LocalDateTime;
import java.util.Random;

public class Transaccion {
    private Integer id;
    private String tipo;
    private Float monto;
    private LocalDateTime fecha;
    private String numeroCuenta;
    private String moneda;
    private CajaDeAhorro cajaDeAhorro;

    private Random rd = new Random();
    /**
     * Construye una transaccion validando el tipo y determinando la moneda 
     * segun los saldos actuales de la caja de ahorro
     * 
     * @param tipo el tipo de transaccion, debe ser "deposito" o "retiro".
     * @param cajaDeAhorro la caja de ahorro asociada a la transaccion
     * @param monto el monto de la transaccion, debe ser mayor a 0.
     * 
     * @throws IllegalArgumentException si el tipo no es "deposito" o "retiro",
     *  o si el monto es menor o igual a 0.
     */
    
    public Transaccion(String tipo,CajaDeAhorro cajaDeAhorro, Float monto){
        this.cajaDeAhorro = cajaDeAhorro;
        Integer id = rd.nextInt(1000);
        this.id = id;

        if(!tipo.equals("deposito") && !tipo.equals("retiro")){
            throw new IllegalArgumentException("Tipo invalido: debe ser 'deposito' o 'retiro'");
        }
        this.tipo = tipo;

        if(monto <= 0){
            throw new IllegalArgumentException("Monto invalido: debe ser mayor a 0");
        }
        this.monto = monto;

        this.fecha = LocalDateTime.now();
        this.numeroCuenta = cajaDeAhorro.getNumeroCuenta();

        if(cajaDeAhorro.getPesos() > 0 && cajaDeAhorro.getDolares() == 0){
            //cuando tiene pesos y no tiene dolares
            this.moneda = "pesos";
        } else if(cajaDeAhorro.getDolares() > 0 && cajaDeAhorro.getPesos() == 0){
            //cuando tiene dolares y no tiene pesos
            this.moneda = "dolares";
        }else{
            //si tiene ambas o no tiene ninguna se la considera hibrida
            this.moneda = "hibrida";
        }

    }
    public Integer getId(){
        return id;
    }
    public String getTipo(){
        return tipo;
    }
    public Float getMonto(){
        return monto;
    }
    public String getMoneda(){
        return moneda;
    }
    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public void setTipo(String tipo){
        if(!tipo.equals("deposito") && !tipo.equals("retiro")){
            throw new IllegalArgumentException("Tipo invalido: debe ser 'deposito' o 'retiro'");
        }
        this.tipo = tipo;
    }
    public void setMonto(Float monto){
        if(monto <= 0){
            throw new IllegalArgumentException("Monto invalido: debe ser mayor a 0");
        }
        this.monto = monto;
    }
    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }
    public void setMoneda(String moneda){
        if(!moneda.equals("pesos") && !moneda.equals("dolares") && !moneda.equals("hibrida")){
            throw new IllegalArgumentException("Moneda invalida: debe ser 'pesos', 'dolares' o 'hibrida'");
        }
        this.moneda = moneda;
    }
    public void setCajaDeAhorro(CajaDeAhorro cajaDeAhorro){
        this.cajaDeAhorro = cajaDeAhorro;
    }
}
