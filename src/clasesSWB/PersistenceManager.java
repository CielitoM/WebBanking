package clasesSWB;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Clase que gestiona la persistencia de datos en memoria.
 * Contiene listas para almacenar temporalmente datos como tarjetas de crédito, transferencias, depósitos, pagos de servicios, pagos de tarjetas,
 * clientes, cuentas y servicios.
 * Proporciona métodos para interactuar con estas listas y cargar datos iniciales.
 *
 * @author Maria Melgarejo
 * 
 */
public class PersistenceManager {

    // Listas para almacenar datos temporalmente en memoria
    private List<TarjetaCredito> tarjetas = new ArrayList<>();
    private List<Transferencia> transferencias = new ArrayList<>();
    private List<Transaccion> depositos = new ArrayList<>();
    private List<PagoServicios> pagosServicio = new ArrayList<>();
    private List<PagoTarjeta> pagosTarjeta = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Cuenta> cuentas = new ArrayList<>();
    private List<Servicios> servicios = new ArrayList<>();
    
    /**
     * Constructor: inicialización con datos iniciales.
     * Carga datos iniciales mediante el método {@code cargarDatosIniciales()}.
     */
    public PersistenceManager() {
        // Cargar datos iniciales
        cargarDatosIniciales();
    }
    

    /**
     * Método para cargar datos iniciales en las listas.
     * Agrega clientes, cuentas y tarjetas de crédito con valores predefinidos.
     */
    private void cargarDatosIniciales() {
        // Agregar clientes
        /*{ID, CIcliente, nombre, tipoCliente}*/
        agregarCliente(new Cliente("1", "5548822", "Maria Cielito Melgarejo Baez", "null"));
        agregarCliente(new Cliente("2", "5564852", "Manuel Agüero", "null"));

        // Agregar cuentas
        /*{IDCliente, IDCuenta, PINCuenta, PINtransaccion, tipoCuenta, saldo}*/
        agregarCuenta(new Cuenta("1", "111", "2222", "3333", "Cuenta Corriente", 6000));
        agregarCuenta(new Cuenta("1", "444", "5555", "6666", "Caja de Ahorro", 3000));
        agregarCuenta(new Cuenta("2", "222", "6666", "7777", "Cuenta Corriente", 9000));
        agregarCuenta(new Cuenta("2", "333", "8888", "9999", "Caja de Ahorro", 4000));

        // Agregar tarjetas de crédito
        /*{IDCliente, IDCuenta, PINCuenta, PINtransaccion, tipoCuenta, saldo}*/
        TarjetaCredito tarjeta1 = new TarjetaCredito("1", "88888", "Tarjeta de Credito", 5000, new PagoTarjeta("88888", 0.0, 0.0, 0.0, "111", "04", new Date().toString(), 0.0, "PagoTarjeta"));
        TarjetaCredito tarjeta2 = new TarjetaCredito("1", "99999", "Tarjeta de Debito", 3000, new PagoTarjeta("99999", 0.0, 0.0, 0.0, "444", "04", new Date().toString(), 0.0, "PagoTarjeta"));
        TarjetaCredito tarjeta3 = new TarjetaCredito("2", "55555", "Tarjeta de Credito", 6000, new PagoTarjeta("55555", 0.0, 0.0, 0.0, "222", "04", new Date().toString(), 0.0, "PagoTarjeta"));
        TarjetaCredito tarjeta4 = new TarjetaCredito("2", "55555", "Tarjeta de Credito", 2000, new PagoTarjeta("55555", 0.0, 0.0, 0.0, "333", "04", new Date().toString(), 0.0, "PagoTarjeta"));

        tarjetas.add(tarjeta1);
        tarjetas.add(tarjeta2);
        tarjetas.add(tarjeta3);
        tarjetas.add(tarjeta4);
        
        // Agregar Transferencias
        Transferencia transferencia1 = new Transferencia("222", "Prestamo", "111", "01", new Date().toString(), 0.0, "Transferencia");
        Transferencia transferencia2 = new Transferencia("333", "Prestamo", "444", "01", new Date().toString(), 0.0, "Transferencia");
        
        transferencias.add(transferencia1);
        transferencias.add(transferencia2);
        
        // Agregar Depositos
        Transaccion deposito1 = new Transaccion("111","02", new Date().toString(), 0.0, "Deposito");
        Transaccion deposito2 = new Transaccion("222","02", new Date().toString(), 0.0, "Deposito");
        Transaccion deposito3 = new Transaccion("333","02", new Date().toString(), 0.0, "Deposito");
        Transaccion deposito4 = new Transaccion("444","02", new Date().toString(), 0.0, "Deposito");
        
        depositos.add(deposito1);
        depositos.add(deposito2);
        depositos.add(deposito3);
        depositos.add(deposito4);
        
        Servicios servicio1 = new Servicios("11", "ESSAP", new Date(), 1102.4, "NoPagado");
        Servicios servicio2 = new Servicios("12", "ANDE", new Date(), 100.53, "NoPagado");
        Servicios servicio3 = new Servicios("13", "COPACO", new Date(), 500, "NoPagado");
        
        servicios.add(servicio1);
        servicios.add(servicio2);
        servicios.add(servicio3);
        
        // Agregar Pagos de Servicio
        PagoServicios pago1 = new PagoServicios("11", new Date(), 0.0, "Pagado", "111", "03", new Date().toString(), 0.0, "PagoServicio");
        PagoServicios pago2 = new PagoServicios("22", new Date(), 0.0, "Pagado", "222", "03", new Date().toString(), 0.0, "PagoServicio");
        PagoServicios pago3 = new PagoServicios("33", new Date(), 0.0, "Pagado", "333", "03", new Date().toString(), 0.0, "PagoServicio");
        PagoServicios pago4 = new PagoServicios("44", new Date(), 0.0, "Pagado", "444", "03", new Date().toString(), 0.0, "PagoServicio");
        
        pagosServicio.add(pago1);
        pagosServicio.add(pago2);
        pagosServicio.add(pago3);
        pagosServicio.add(pago4);
    }//Cierre del metodo
    
    /**
     * Método que establece la lista de servicios
     * @param servicios Parámetro tipo List que contiene la lista de 
     * servicios
     */
    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }
    
    /**
     * Método para obtener la lista de servicios
     * @return servicios Lista de servicios
     */
    public List<Servicios> getServicios() {
        return servicios;
    }

    /**
     * Agrega un cliente al sistema.
     *
     * @param cliente Cliente a ser agregado.
     */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Agrega una cuenta al sistema.
     *
     * @param cuenta Cuenta a ser agregada.
     */
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
    
    /**
     * Realiza una transferencia entre cuentas, actualizando los saldos y registrando la transacción.
     *
     * @param cuentaOrigen   Cuenta de origen.
     * @param cuentaDestino  Cuenta de destino.
     * @param comentario     Comentario asociado a la transferencia.
     * @param monto          Monto a transferir.
     */
    public void guardarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, String comentario, double monto) {

        // Realiza la transferencia
        cuentaOrigen.setSaldoCuenta(cuentaOrigen.getSaldo() - monto);
        cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldo() + monto);

        //Crear una instancia de la clase Transferencia
        Transferencia transferencia = new Transferencia(cuentaDestino.getIDCuenta(), comentario,
               cuentaOrigen.getIDCuenta(), "01", new Date().toString(), monto, "Transferencia");

        // Agregar la transferencia a la lista
        transferencias.add(transferencia);
        
    }

    /**
     * Guarda un depósito en la cuenta especificada.
     *
     * @param cuenta Cuenta en la que se realiza el depósito.
     * @param monto  Monto del depósito.
     */
    public void guardarDeposito(Cuenta cuenta, double monto) {
        
        // Realiza el deposito
        cuenta.setSaldoCuenta(cuenta.getSaldo() + monto);
        
        System.err.println("Cuenta: " + cuenta.getSaldo());

        //Crear una instancia de la clase Transaccion para deposito
        Transaccion deposito = new Transaccion(cuenta.getIDCuenta(), "02", new Date().toString(), monto, "Deposito");

        //Agregar el deposito a la lista
        depositos.add(deposito);
        
    }
    

    /**
     * Guarda un pago de servicio en la lista de pagos de servicios.
     *
     * @param pagoServicio Pago de servicio a ser registrado.
     */
    public void guardarPagoServicio(PagoServicios pagoServicio) {
        pagosServicio.add(pagoServicio);
    }

    /**
     * Guarda un pago de tarjeta de crédito en la lista de pagos de tarjetas.
     *
     * @param pagoTarjeta Pago de tarjeta de crédito a ser registrado.
     */
    public void guardarPagoTarjeta(PagoTarjeta pagoTarjeta) {
        pagosTarjeta.add(pagoTarjeta);
    }

    /**
     * Obtiene todas las transferencias registradas en el sistema.
     *
     * @return Lista de transferencias.
     */
    public List<Transferencia> getTransferencias() {
        return transferencias;
    }
    
     /**
     * Imprime la lista de transferencias en la consola.
     */
    public void imprimirTransferencias() {
        List<Transferencia> transferencias = getTransferencias();

        System.out.println("Lista de transferencias:");

        for (Transferencia transferencia : transferencias) {
            System.out.println("ID: " + transferencia.getIDTransaccion());
            System.out.println("Cuenta Origen: " + transferencia.getIDCuenta());
            System.out.println("Cuenta Destino: " + transferencia.getCuentaDestino());
            System.out.println("Comentario: " + transferencia.getComentario());
            System.out.println("Fecha: " + transferencia.getFechaTransaccion());
            System.out.println("Monto: " + transferencia.getMontoTransaccion());
            System.out.println("Tipo: " + transferencia.getTipoTransaccion());
            System.out.println("----------------------------------");
        }
    }

    /**
     * Obtiene todos los depósitos.
     *
     * @return Lista de transacciones de depósito.
     */
    public List<Transaccion> getDepositos() {
        return depositos;
    }
    
     /**
     * Imprime la lista de depósitos en la consola.
     */
    public void imprimirDeposito() {
        List<Transaccion> depositos = getDepositos();

        System.out.println("Lista de Depositos:");

        for (Transaccion deposito : depositos) {
            System.out.println("ID: " + deposito.getIDTransaccion());
            System.out.println("Cuenta: " + deposito.getIDCuenta());
            System.out.println("Fecha: " + deposito.getFechaTransaccion());
            System.out.println("Monto: " + deposito.getMontoTransaccion());
            System.out.println("Tipo: " + deposito.getTipoTransaccion());
            System.out.println("----------------------------------");
        }
    }

    /**
     * Imprime la lista de pagos de servicios en la consola.
     */
    public void imprimirPagoServicio(){
        List <PagoServicios> pagoservicio = getPagoServicios();

        for (PagoServicios pago: pagoservicio){
            System.out.println("ID: " + pago.getIDTransaccion());
            System.out.println("Fecha de vencimiento:  " + pago.getFechaVencimiento());
            System.out.println("Monto: " + pago.getMontoTransaccion());
            System.out.println("Estado: Pagado");
            System.out.println("Tipo: " + pago.getTipoTransaccion());
            System.out.println("----------------------------------");
        }
    }

    /**
     * Obtiene todos los pagos de servicio.
     *
     * @return Lista de pagos de servicios.
     */
    public List<PagoServicios> getPagoServicios() {
        return pagosServicio;
    }
    
    /**
     * Obtiene todas las tarjetas de crédito.
     *
     * @return Lista de tarjetas de crédito.
     */
    public List<TarjetaCredito> getTarjetas() {
        return tarjetas;
    }
    
    /**
     * Obtiene todos los pagos de las tarjetas de crédito.
     *
     * @return Lista de pagos de tarjetas de crédito.
     */
    public List<PagoTarjeta> getPagosTarjeta() {
        return pagosTarjeta;
    }
    
    /**
     * Obtiene un cliente por su ID.
     *
     * @param IDCliente ID del cliente a buscar.
     * @return Cliente correspondiente al ID proporcionado, o null si no se encuentra.
     */
    public Cliente getCliente(String IDCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getIDCliente().equals(IDCliente)) {
                return cliente;
            }
        }
        return null;
    }
    
    /**
     * Obtiene una cuenta por su ID.
     *
     * @param IDCuenta ID de la cuenta a buscar.
     * @return Cuenta correspondiente al ID proporcionado, o null si no se encuentra.
     */
    public Cuenta getCuenta(String IDCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getIDCuenta().equals(IDCuenta)) {
                return cuenta;
            }
        }
        return null;
    }
   
    /**
     * Obtiene una lista de cuentas asociadas a un cliente.
     *
     * @param IDCliente ID del cliente para el cual se buscan cuentas asociadas.
     * @return Lista de cuentas asociadas al cliente.
     */
    public List<Cuenta> getCuentas(String IDCliente){
        List<Cuenta> cuentasAsociadas = new ArrayList<>();
        for(Cuenta cuenta: cuentas ){
            if (cuenta.getIDCliente().equals(IDCliente)){
                cuentasAsociadas.add(cuenta);
            }                
        }
        return cuentasAsociadas;
    }
            
    /**
     * Verifica si la cuenta especifica existe.
     *
     * @param IDCuenta ID de la cuenta a verificar.
     * @return true si la cuenta existe, false de lo contrario.
     */
    public boolean VerificarCuenta(String IDCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getIDCuenta().equals(IDCuenta)) {
                return true; // La cuenta existe
            }
        }
        return false; // La cuenta no existe
    }
    
    /**
     * Obtiene un servicio por su código.
     *
     * @param nombreServicio Parámetro tipo String con el nombre del servicio a buscar.
     * @return Servicio correspondiente al código proporcionado, o null si no se encuentra.
     */
    public Servicios getServicio(String nombreServicio){
        for (Servicios servicio: servicios){
            if (servicio.getNombre().equals(nombreServicio)){
                return servicio;
            }
        }
        return null;
    }
    
    /**
     * Método para validar el inicio de sesión de un usuario.
     *
     * @param numeroCuenta Número de cuenta proporcionado por el usuario.
     * @param pin PIN proporcionado por el usuario.
     * @return true si la validación es exitosa, false de lo contrario.
     */
    public boolean validarInicioSesion(String numeroCuenta, String pin) {

        // Obtener la cuenta correspondiente al número de cuenta proporcionado
        Cuenta cuenta = getCuenta(numeroCuenta);

        // Verificar si la cuenta existe
        if (cuenta != null) {
            // Obtener el cliente asociado a la cuenta (PUEDE SERVIR PARA MAS TARDE) no borrar.
            Cliente cliente = getCliente(cuenta.getIDCliente());

            // Verificar el PIN
            if (cuenta.validarPINcuenta(pin, cuenta.getIDCuenta())) {
                // La validación fue exitosa
                return true;
            } else {
                // PIN incorrecto
                mostrarMensajeError("PIN incorrecto.");
            }
        } else {
            // Número de cuenta no encontrado
            mostrarMensajeError("Número de cuenta no encontrado. Intento fallido.");
        }
        

        // La validación ha fallado
        return false;
    }//Cierre del metodo
    
    /**
     * Muestra un mensaje de error en una ventana emergente.
     *
     * @param mensaje Mensaje de error a mostrar.
     */
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error en la Validacion", JOptionPane.ERROR_MESSAGE);
    }
}
