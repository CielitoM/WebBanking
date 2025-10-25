package clasesSWB;
import java.util.Date;

/**
 * Clase que representa los servicios que pagara el cliente
 * @author Iván Figueredo
 */
public class Servicios {
    private String codigoServicio;
    private String nombre;
    private Date fechaVencimiento;
    private double deudaServicio;
    private String estadoPago;

    /**
    * Constructor de la clase Servicios 
     * @param codigoServicio   Codigo que representa al servicio a ser pagado
     * @param nombre           Parámetro tipo String que contiene el nombre del servicio
     * @param fechaVencimiento Fecha en la que vence el pago del servicio 
     * @param deudaServicio    Cantidad de dinero que se debe pagar 
     * @param estadoPago       Estado del pago del servicio, puede ser "Pagado" o "No ppagado"
    */
    public Servicios(String codigoServicio, String nombre, Date fechaVencimiento, double deudaServicio, String estadoPago){
        this.codigoServicio = codigoServicio;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.deudaServicio = deudaServicio;
        this.estadoPago = estadoPago;
    }

    /**
     * Obtiene el código del servicio.
     * @return Código del servicio.
     */
    public String getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Establece el código del servicio.
     * @param codigoServicio Código del servicio.
     */
    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }
    
    /**
     * Obtiene el nombre del servicio
     * @return nombre Atributo tipo String que contiene el nombre del servicio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del servicio
     * @param nombre Parámetro tipo String que contiene el nombre del servicio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la fecha de vencimiento del servicio.
     * @return Fecha de vencimiento del servicio.
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Establece la fecha de vencimiento del servicio.
     * @param fechaVencimiento Fecha de vencimiento del servicio.
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene la deuda del servicio.
     * @return Cantidad de dinero que se debe pagar.
     */
    public double getDeudaServicio() {
        return deudaServicio;
    }

    /**
     * Establece la deuda del servicio.
     * @param deudaServicio Cantidad de dinero que se debe pagar.
     */
    public void setDeudaServicio(double deudaServicio) {
        this.deudaServicio = deudaServicio;
    }

    /**
     * Obtiene el estado de pago del servicio.
     * @return Estado del pago del servicio ("Pagado" o "No pagado").
     */
    public String getEstadoPago() {
        return estadoPago;
    }

    /**
     * Establece el estado de pago del servicio.
     * @param estadoPago Estado del pago del servicio ("Pagado" o "No pagado").
     */
    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
}