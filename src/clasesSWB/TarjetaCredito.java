package clasesSWB;

/**
 * Clase que representa una tarjeta de crédito y se compone de un pago asociado.
 */
public class TarjetaCredito {
    
    private String IDCliente;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private double deudaTarjeta;
    private PagoTarjeta pagoAsociado; // Composicion

    /**
     * Constructor de la clase TarjetaCredito.
     *
     * @param IDCliente ID del cliente asociado a la tarjeta.
     * @param numeroTarjeta Número de la tarjeta de crédito.
     * @param tipoTarjeta Tipo de la tarjeta de crédito.
     * @param deudaTarjeta Parámetro tipo double que contiene la deuda de la tarjeta
     * @param pagoAsociado Pago asociado a la tarjeta de crédito.
     */
    public TarjetaCredito(String IDCliente,String numeroTarjeta , String tipoTarjeta, double deudaTarjeta, PagoTarjeta pagoAsociado) {
        this.IDCliente = IDCliente;
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.deudaTarjeta = deudaTarjeta;
        this.pagoAsociado = pagoAsociado;
    }

    /**
     * Obtiene el Id del cliente al que pertenece la tarjeta
     *
     * @return IDCliente Id del cliente
     */
    public String getIDCliente() {
        return IDCliente;
    }

    
    /**
    * Obtiene el numero de tarjeta de crédito.
    *
    * @return Numero de tarjeta.
    */
    
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Establece el Numero de tarjeta de crédito.
     *
     * @param numeroTarjeta Numero de tarjeta.
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Obtiene el tipo de la tarjeta de crédito.
     *
     * @return Tipo de tarjeta.
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Establece el tipo de tarjeta de crédito.
     *
     * @param tipoTarjeta Nuevo tipo de tarjeta.
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * Obtiene el la deuda la tarjeta de crédito.
     *
     * @return Deuda de la tarjeta.
     */
    public double getDeudaTarjeta() {
        return deudaTarjeta;
    }

    /**
     * Establece la deuda de la tarjeta de crédito.
     *
     * @param deudaTarjeta Deuda de la tarjeta.
     */
    public void setDeudaTarjeta(double deudaTarjeta) {
        this.deudaTarjeta = deudaTarjeta;
    }
    
    /**
     * Obtiene el pago asociado a la tarjeta de crédito.
     *
     * @return Pago asociado.
     */
    public PagoTarjeta getPagoAsociado() {
        return pagoAsociado;
    }

    /**
     * Establece el pago asociado a la tarjeta de crédito.
     *
     * @param pagoAsociado Nuevo pago asociado.
     */
    public void setPagoAsociado(PagoTarjeta pagoAsociado) {
        this.pagoAsociado = pagoAsociado;
    }
    
}
