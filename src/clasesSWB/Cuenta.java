package clasesSWB;

import javax.swing.JOptionPane;

/**
 * La clase Cuenta representa una cuenta bancaria con información como ID del cliente,
 * ID de cuenta, PIN de cuenta, PIN de transacción, tipo de cuenta y saldo.
 */
public class Cuenta {
    private String IDCliente;
    private String IDCuenta;
    private String PINcuenta;
    private String PINtransaccion;
    private String tipoCuenta;
    private double saldo;

    /**
     * Constructor para la clase Cuenta.
     *
     * @param IDCliente      El ID del cliente asociado a la cuenta.
     * @param IDCuenta       El ID de la cuenta.
     * @param PINcuenta      El PIN de la cuenta.
     * @param PINtransaccion El PIN de transacción.
     * @param tipoCuenta     El tipo de cuenta.
     * @param saldo          El saldo de la cuenta.
     */
    public Cuenta(String IDCliente, String IDCuenta, String PINcuenta, String PINtransaccion, String tipoCuenta, double saldo) {
        this.IDCliente = IDCliente;
        this.IDCuenta = IDCuenta;
        this.PINcuenta = PINcuenta;
        this.PINtransaccion = PINtransaccion;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }//cierre del constructor

     /**
     * Obtiene el ID del cliente.
     *
     * @return El ID del cliente.
     */
    public String getIDCliente() {
        return IDCliente;
    }//cierre del metodo

    /**
     * Obtiene el ID de la cuenta.
     *
     * @return El ID de la cuenta.
     */
    public String getIDCuenta() {
        return IDCuenta;
    }//cierre del metodo

    /**
     * Establece el ID de la cuenta.
     *
     * @param IDCuenta El nuevo ID de la cuenta.
     */
    public void setIDCuenta(String IDCuenta) {
        this.IDCuenta = IDCuenta;
    }//cierre del metodo

    /**
     * Obtiene el PIN de la cuenta.
     *
     * @return El PIN de la cuenta.
     */
    public String getPINcuenta() {
        return PINcuenta;
    }//cierre del metodo

    /**
     * Establece el PIN de la cuenta.
     *
     * @param PINcuenta El nuevo PIN de la cuenta.
     */
    public void setPINcuenta(String PINcuenta) {
        this.PINcuenta = PINcuenta;
    }//cierre del metodo

    /**
     * Obtiene el PIN de transacción.
     *
     * @return El PIN de transacción.
     */
    public String getPINtransaccion() {
        return PINtransaccion;
    }//cierre del metodo

    /**
     * Establece el PIN de transacción.
     *
     * @param PINtransaccion El nuevo PIN de transacción.
     */
    public void setPINtransaccion(String PINtransaccion) {
        this.PINtransaccion = PINtransaccion;
    }//cierre del metodo

    /**
     * Obtiene el tipo de cuenta.
     *
     * @return El tipo de cuenta.
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }//cierre del metodo

    /**
     * Establece el tipo de cuenta.
     *
     * @param tipoCuenta El nuevo tipo de cuenta.
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }//cierre del metodo

    /**
     * Obtiene el saldo de la cuenta.
     *
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }//cierre del metodo

    /**
     * Valida el PIN de la cuenta.
     *
     * @param PINcuenta El PIN ingresado por el usuario.
     * @param IDCuenta  El ID de la cuenta asociada.
     * @return true si el PIN es válido, false de lo contrario.
     */
    public boolean validarPINcuenta(String PINcuenta, String IDCuenta) {
        // Validar el PIN de la cuenta
        return this.PINcuenta.equals(PINcuenta) && this.IDCuenta.equals(IDCuenta);
    }//cierre del metodo
    
    /**
     * Valida un PIN de transferencia.
     *
     * @param PINTransferencia El PIN a validar.
     * @return true si el PIN es válido, false en caso contrario.
     */
    public boolean validarPINTransaccion(String PINTransferencia) {
        
        // Verificar que el PIN tenga 4 digitos
        int longitudEsperada = 4;
        if (PINTransferencia.length() != longitudEsperada){
            mostrarMensajeError("El PIN debe tener " + longitudEsperada + " dígitos");
            return false;
        }

        // Verificar que el PIN consista solo en dígitos numéricos
        if (!PINTransferencia.matches("[0-9]+")) {
            mostrarMensajeError("El PIN debe contener solo dígitos numéricos.");
            return false;
        }

        // Si todas las verificaciones son exitosas, el PIN es válido
        return true;
    }//cierre del metodo    
    
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error en la transferencia", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Realiza un depósito en la cuenta.
     *
     * @param monto El monto a depositar.
     */
    public void deposito(double monto) {
        // Verificar si el monto es positivo antes de realizar el depósito
        if (monto > 0) {
            this.saldo += monto;
            // Instancia de transacción
            Transaccion transaccion = new Transaccion("IDCuenta", "IDTransaccion", "Fecha Deposito", 1000, "Deposito");
            System.out.println("ID Cliente: " + IDCliente);
            System.out.println("ID Cuenta: " + IDCuenta);
            System.out.println("ID Transaccion: " + transaccion.getIDTransaccion());
            System.out.println("Fecha Deposito: " + transaccion.getFechaTransaccion());
            System.out.println("Monto Deposito: " + transaccion.getMontoTransaccion());
        } else {
            System.out.println("Error: El monto del deposito debe ser positivo.");
        }
    }//cierre del metodo

    /**
     * Actualiza el saldo de la cuenta según el tipo de transacción.
     *
     * @param saldoNuevo Nuevo saldo de la cuenta.
     */
    public void setSaldoCuenta(double saldoNuevo) {
        this.saldo = saldoNuevo;
        System.out.println(saldo);
    }//cierre del metodo
}//cierre de la clase