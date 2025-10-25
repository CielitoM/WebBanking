package clasesSWB;

/**
 * La clase Transaccion representa una transacción financiera genérica.
 * Contiene información como el identificador de la transacción, la fecha,
 * el monto y el tipo de transacción.
 */
public class Transaccion {

    private String IDCuenta;
    private String IDTransaccion;
    private String fechaTransaccion; 
    private double monto;
    private String tipoTransaccion;

    /**
     * Constructor de la clase Transaccion.
     *
     * @param IDCuenta Identificacion de la cuenta
     * @param IDTransaccion Identificador único de la transacción.
     * @param fechaTransaccion Fecha en la que se realizó la transacción.
     * @param monto Monto asociado a la transacción.
     * @param tipoTransaccion Tipo de la transacción.
     */
    public Transaccion(String IDCuenta, String IDTransaccion, String fechaTransaccion, double monto, String tipoTransaccion) {
        this.IDCuenta = IDCuenta;
        this.IDTransaccion = IDTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.monto = monto;
        this.tipoTransaccion = tipoTransaccion;
    }

    // Métodos de acceso y modificación

     /**
     * Obtiene el identificador de la Cuenta.
     *
     * @return Identificador de la Cuenta.
     */
    public String getIDCuenta() {
        return IDCuenta;
    }
    
    /**
     * Establece el identificador de la cuenta.
     *
     * @param IDCuenta identificador de la cuenta.
     */    
    public void setIDCuenta(String IDCuenta) {
        this.IDCuenta = IDCuenta;
    }
   
    /**
     * Obtiene el identificador de la transacción.
     *
     * @return Identificador de la transacción.
     */
    public String getIDTransaccion() {
        return IDTransaccion;
    }

    /**
     * Establece el identificador de la transacción.
     *
     * @param IDTransaccion Nuevo identificador de la transacción.
     */
    public void setIDTransaccion(String IDTransaccion) {
        this.IDTransaccion = IDTransaccion;
    }

    /**
     * Obtiene la fecha de la transacción.
     *
     * @return Fecha de la transacción.
     */
    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Establece la fecha de la transacción.
     *
     * @param fechaTransaccion Nueva fecha de la transacción.
     */
    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    /**
     * Obtiene el monto de la transacción.
     *
     * @return Monto de la transacción.
     */
    public double getMontoTransaccion() {
        return monto;
    }

    /**
     * Establece el monto de la transacción.
     *
     * @param monto Nuevo monto de la transacción.
     */
    public void setMontoTransaccion(double monto) {
        this.monto = monto;
    }

    /**
     * Obtiene el tipo de la transacción.
     *
     * @return Tipo de la transacción.
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Establece el tipo de la transacción.
     *
     * @param tipoTransaccion Nuevo tipo de la transacción.
     */
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }    
}
