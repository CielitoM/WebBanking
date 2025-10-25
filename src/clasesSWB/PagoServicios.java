package clasesSWB;
import java.util.Date;

/**
 * Clase que representa un pago asociado a un servicio.
 */
public class PagoServicios extends Transaccion {
    
    private String codigoServicio;
    private Date fechaVencimiento;
    private Double deudaServicio;
    private String estadoPago;

    /**
     * Constructor de la clase PagoServicios.
     *
     * @param codigoServicio Código identificador del servicio.
     * @param fechaVencimiento Fecha de vencimiento del pago.
     * @param deudaServicio Monto de la deuda asociada al servicio.
     * @param estadoPago Estado del pago (pendiente, pagado, etc.).
     * @param IDCuenta Identificacion de la cuenta
     * @param IDTransaccion Identificador de la transacción.
     * @param fechaTransaccion Fecha de la transacción.
     * @param monto Monto de la transacción.
     * @param tipoTransaccion Tipo de la transacción.
     */
    public PagoServicios(String codigoServicio, Date fechaVencimiento, Double deudaServicio, String estadoPago, String IDCuenta, String IDTransaccion, String fechaTransaccion, double monto, String tipoTransaccion) {  
        super(IDCuenta, IDTransaccion, fechaTransaccion, monto, tipoTransaccion);
        this.codigoServicio = codigoServicio;
        this.fechaVencimiento = fechaVencimiento;
        this.deudaServicio = deudaServicio;
        this.estadoPago = estadoPago;
    }//cierre del constructor

    // Métodos de acceso y modificación
    /**
     * Obtiene el código identificador del servicio.
     *
     * @return Código del servicio.
     */
    public String getCodigoServicio() {
        return codigoServicio;
    }//cierre del metodo

    /**
     * Establece el código identificador del servicio.
     *
     * @param codigoServicio Nuevo código del servicio.
     */
    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }//cierre del metodo

    /**
     * Obtiene la fecha de vencimiento del pago.
     *
     * @return Fecha de vencimiento.
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }//cierre del metodo

    /**
     * Establece la fecha de vencimiento del pago.
     *
     * @param fechaVencimiento Nueva fecha de vencimiento.
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }//cierre del metodo

    /**
     * Obtiene el monto de la deuda asociada al servicio.
     *
     * @return Monto de la deuda.
     */
    public Double getDeudaServicio() {
        return deudaServicio;
    }//cierre del metodo

    /**
     * Establece el monto de la deuda asociada al servicio.
     *
     * @param deudaServicio Nuevo monto de la deuda.
     */
    public void setDeudaServicio(Double deudaServicio) {
        this.deudaServicio = deudaServicio;
    }//cierre del metodo

    /**
     * Obtiene el estado del pago asociado al servicio.
     *
     * @return Estado del pago.
     */
    public String getEstadoPago() {
        return estadoPago;
    }//cierre del metodo

    /**
     * Establece el estado del pago asociado al servicio.
     *
     * @param estadoPago Nuevo estado del pago.
     */
    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }//cierre del metodo
}//cierre de la clase
