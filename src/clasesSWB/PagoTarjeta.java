package clasesSWB;

/**
 * Clase que representa un pago asociado a una tarjeta de crédito.
 */
public class PagoTarjeta extends Transaccion{
    
    private String numeroTarjeta;
    private double saldoActual;
    private double deudaTarjeta;
    private double montoMinimo; 

     /**
     * Constructor de la clase PagoTarjeta.
     *
     * @param numeroTarjeta Número de la tarjeta asociada al pago.
     * @param saldoActual Saldo actual de la tarjeta.
     * @param deudaTarjeta Deuda acumulada en la tarjeta.
     * @param montoMinimo Monto mínimo requerido para el pago.
     * @param IDCuenta Identificacion de la cuenta
     * @param IDTransaccion Identificador de la transacción.
     * @param fechaTransaccion Fecha de la transacción.
     * @param monto Monto de la transacción.
     * @param tipoTransaccion Tipo de la transacción.
     */
    public PagoTarjeta(String numeroTarjeta, double saldoActual, double deudaTarjeta, double montoMinimo, String IDCuenta, String IDTransaccion, String fechaTransaccion, double monto, String tipoTransaccion) {
        super(IDCuenta, IDTransaccion, fechaTransaccion, monto, tipoTransaccion);
        this.numeroTarjeta = numeroTarjeta;
        this.saldoActual = saldoActual;
        this.deudaTarjeta = deudaTarjeta;
        this.montoMinimo = montoMinimo;
    }//cierre del constructor

    // Métodos de acceso y modificación
    /**
     * Obtiene el número de la tarjeta asociada al pago.
     *
     * @return Número de tarjeta.
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }//cierre del metodo
    
    /**
     * Establece el número de la tarjeta asociada al pago.
     *
     * @param numeroTarjeta Nuevo número de tarjeta.
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }//cierre del metodo

    /**
     * Obtiene el saldo actual de la tarjeta.
     *
     * @return Saldo actual.
     */
    public double getSaldoActual() {
        return saldoActual;
    }//cierre del metodo

    /**
     * Establece el saldo actual de la tarjeta.
     *
     * @param saldoActual Nuevo saldo actual.
     */
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }//cierre del metodo

    /**
     * Obtiene la deuda acumulada en la tarjeta.
     *
     * @return Deuda acumulada.
     */
    public double getDeudaTarjeta() {
        return deudaTarjeta;
    }//cierre del metodo

    /**
     * Establece la deuda acumulada en la tarjeta.
     *
     * @param deudaTarjeta Nueva deuda acumulada.
     */
    public void setDeudaTarjeta(double deudaTarjeta) {
        this.deudaTarjeta = deudaTarjeta;
    }//cierre del metodo

    /**
     * Obtiene el monto mínimo requerido para el pago.
     *
     * @return Monto mínimo.
     */
    public double getMontoMinimo() {
        return montoMinimo;
    }//cierre del metodo

    /**
     * Establece el monto mínimo requerido para el pago.
     *
     * @param montoMinimo Nuevo monto mínimo.
     */
    public void setMontoMinimo(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }//cierre del metodo
    
}//cierre de la clase