package clasesSWB;

/**
 * La clase Cliente representa a un cliente bancario con información como ID, CI (Cédula de Identidad),
 * nombre y tipo de cliente.
 */
public class Cliente {
    
    // Atributos de la clase
    private String IDCliente;
    private String CIcliente;
    private String nombre;
    private String tipoCliente; 

    /**
     * Constructor para la clase Cliente.
     *
     * @param IDCliente           El ID del cliente.
     * @param CIcliente    La Cédula de Identidad del cliente.
     * @param nombre       El nombre del cliente.
     * @param tipoCliente  El tipo de cliente (por ejemplo, "Persona" o "Empresa").
     */
    public Cliente(String IDCliente, String CIcliente, String nombre, String tipoCliente) {
        this.IDCliente = IDCliente;
        this.CIcliente = CIcliente;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }//cierre del constructor

    /**
     * Obtiene el ID del cliente del cliente.
     *
     * @return ID del cliente.
     */
    
    public String getIDCliente() {
        return IDCliente;
    }//cierre del metodo
    
    /**
     * Establece el ID del cliente del cliente.
     *
     * @param IDCliente El ID del cliente.
     */
    
    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }//cierre del metodo
    
    /**
     * Obtiene la Cédula de Identidad del cliente.
     *
     * @return La Cédula de Identidad del cliente.
     */
    
    public String getCIcliente() {
        return CIcliente;
    }//cierre del metodo

    /**
     * Establece la Cédula de Identidad del cliente.
     *
     * @param CIcliente La nueva Cédula de Identidad del cliente.
     */
    public void setCIcliente(String CIcliente) {
        this.CIcliente = CIcliente;
    }//cierre del metodo

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }//cierre del metodo

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//cierre del metodo

    /**
     * Obtiene el tipo de cliente.
     *
     * @return El tipo de cliente.
     */
    public String getTipoCliente() {
        return tipoCliente;
    }//cierre del metodo

    /**
     * Muestra información sobre las transacciones del cliente en el banco.
     */
    public void visualizarTransaccion() {
        // Instancia de transaccion
        Transaccion transaccion = new Transaccion("IDCuenta", "IDTransaccion","Fecha Transaccion", 0000, "Tipo Transaccion");
        
        System.out.println("Cliente: " + nombre);
        System.out.println("ID: " + IDCliente);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("ID Transaccion: " + transaccion.getIDTransaccion());
        System.out.println("Fecha de Transaccion: " + transaccion.getFechaTransaccion());
        System.out.println("Monto de Transaccion: " + transaccion.getMontoTransaccion());
        System.out.println("Tipo de Transaccion: " + transaccion.getTipoTransaccion());
    }//cierre del metodo    

}//cierre de la clase
