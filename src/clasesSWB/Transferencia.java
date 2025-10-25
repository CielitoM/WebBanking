package clasesSWB;


/**
 * Clase que representa una transacción de tipo transferencia.
 * Hereda de la clase Transaccion.
 */
public class Transferencia extends Transaccion {
    
    private String cuentaDestino;
    private String comentario;

    /**
     * Constructor de la clase Transferencia.
     *
     * @param cuentaDestino Número de cuenta de destino de la transferencia.
     * @param comentario Comentario asociado a la transferencia.
     * @param IDCuenta Identificador de la cuenta
     * @param IDTransaccion Identificador de la transacción.
     * @param fechaTransaccion Fecha de la transacción.
     * @param monto Monto de la transacción.
     * @param tipoTransaccion Tipo de la transacción.
     */
    public Transferencia( String cuentaDestino, String comentario, String IDCuenta, String IDTransaccion, String fechaTransaccion, double monto, String tipoTransaccion) {    
        super(IDCuenta, IDTransaccion, fechaTransaccion, monto, tipoTransaccion);
        this.cuentaDestino = cuentaDestino;
        this.comentario = comentario;
    }

    // Métodos de acceso y modificación
    
    /**
     * Obtiene el número de cuenta de destino de la transferencia.
     *
     * @return Número de cuenta de destino.
     */
    public String getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     * Establece el número de cuenta de destino de la transferencia.
     *
     * @param cuentaDestino Nuevo número de cuenta de destino.
     */
    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    /**
     * Obtiene el comentario asociado a la transferencia.
     *
     * @return Comentario de la transferencia.
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece un comentario para la transferencia.
     *
     * @param comentario Nuevo comentario para la transferencia.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}

