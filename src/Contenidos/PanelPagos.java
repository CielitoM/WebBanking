package Contenidos;

import Interfaces.Interface_Mensajes;
import Interfaces.Interface_Panel;
import Interfaces.Interface_reiniciojTexts;

import clasesSWB.Cliente;
import clasesSWB.Cuenta;
import clasesSWB.PagoServicios;
import clasesSWB.PersistenceManager;
import clasesSWB.TarjetaCredito;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Date;

import clasesSWB.Servicios;

/**
 * Panel de pagos para realizar operaciones relacionadas con el pago de servicios.
 * Implementa las interfaces Interface_Panel, Interface_Mensajes e Interface_reiniciojTexts.
 * Permite realizar operaciones como el pago de servicios y gestionar mensajes.
 * 
 * @author MAN-U
 */
public class PanelPagos extends javax.swing.JPanel implements Interface_Panel, Interface_Mensajes, Interface_reiniciojTexts {

    private PersistenceManager persistenceManager;
    private Cliente cliente;
  
    /**
     * Constructor de la clase PanelPagos.
     * Inicializa el panel de pagos con un PersistenceManager y un Cliente dados.
     * 
     * @param persistenceManager Instancia de PersistenceManager para interactuar con la capa de persistencia.
     * @param cliente Cliente asociado al panel de pagos.
     */
    public PanelPagos(PersistenceManager persistenceManager, Cliente cliente) {
        initComponents();
        changeComponentsProperties();
        this.persistenceManager = persistenceManager;
        this.cliente = cliente;
    }

    /**
     * Método que cambia el color y la transparencia del jPanel. 
     */
    @Override
    public final void changeComponentsProperties(){
        this.setBackground(new Color(0, 0, 0, 0));
    }//cierre del metodo

    
    /**
     * Llama al método desplegarX para desplegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void desplegarComponentes(){
        desplegarX(jLabelTituloPagoServicios, 290,1);
        desplegarX(jPanelPagoDeServicios, 290,1);
        desplegarX(jLabelCodigoServicio, 290,1);
        desplegarX(jLabelDeuda, 290,1);
        desplegarX(jComboBoxServiciosDisponibles, 290,1);
        desplegarX(jLabelMontoAPagarServicio, 290,1);
        desplegarX(jTextMontoAPagarServicio, 290,1);
        desplegarX(jLabelTituloPagoServicios, 290,1);
        desplegarX(jLabelTarjetasPagoServicio, 290,1);
        desplegarX(jComboBoxTarjetasPagoServicio, 290,1);
        desplegarX(jTextPINTransaccion, 290, 1);
        desplegarX(jTextCuentaPagante, 290, 1);
        desplegarX(jButtonConfirmarPagoServicio, 290, 1);
    }//cierre del metodo
    
    /**
     * Llama al método plegarX para plegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void plegarComponentes(){
        plegarX(jLabelTituloPagoServicios, 290,1);
        plegarX(jPanelPagoDeServicios, 290,1);
        plegarX(jLabelCodigoServicio, 290,1);
        plegarX(jLabelDeuda, 290,1);
        plegarX(jComboBoxServiciosDisponibles, 290,1);
        plegarX(jLabelMontoAPagarServicio, 290,1);
        plegarX(jTextMontoAPagarServicio, 290,1);
        plegarX(jLabelTituloPagoServicios, 290,1);
        plegarX(jLabelTarjetasPagoServicio, 290,1);
        plegarX(jComboBoxTarjetasPagoServicio, 290,1);
        plegarX(jTextCuentaPagante, 290, 1);
        plegarX(jTextPINTransaccion, 290, 1);
        plegarX(jButtonConfirmarPagoServicio, 290, 1);
    }//cierre del metodo
    
    /**
     * Método que cambia la dimensión de un Component simulando su despliegue en pantalla
     * @param jcomponent      Component a ser desplegado
     * @param totalDesplegarX Parámetro tipo int que determina cuanto se sumará a la anchura
     * actual del JPanel
     * @param time            Milisegundos para simular los intervalos de la animación
     */
    @Override
    public void desplegarX(Component jcomponent, int totalDesplegarX, int time){
        Thread hiloDesplegar = new Thread() { //declara un nuevo hilo
            @Override
            public void run(){
                int anchuraActual = jcomponent.getWidth();
                //ciclo en donde se redimensiona el widget
                for(int desplegarX = anchuraActual; desplegarX <= anchuraActual+totalDesplegarX; desplegarX++){
                    try {
                        Thread.sleep(time);
                        jcomponent.setSize(new Dimension(desplegarX, jcomponent.getHeight())); //redimensiona el JPanel
                    } catch (InterruptedException ex) {
                        System.err.print("No se pudo desplegar el Component");
                    }
                }
            }
        }; hiloDesplegar.start();
    }//cierre del metodo
    
    
    /**
     * Método que cambia la dimensión de un Component simulando su plegado
     * @param jcomponent   Component a ser plegado
     * @param totalPlegarX Parámetro tipo int que determina cuanto se restará a la anchura
     * actual del JPanel
     * @param time   Milisegundos para simular los intervalos de la animación
     */
    @Override
    public void plegarX(Component jcomponent, int totalPlegarX, int time){
        Thread hiloPlegar = new Thread() { //declara un nuevo hilo
            @Override
            public void run(){ 
                int anchuraActual = jcomponent.getWidth();
                //ciclo en donde se disminuye la dimensión del JPanel de uno en uno
                for(int plegarX = anchuraActual; plegarX >= anchuraActual-totalPlegarX; plegarX--){ 
                    //captura la excepción InterruptedException generada por .sleep()
                    try {
                        Thread.sleep(time);
                        jcomponent.setSize(new Dimension(plegarX, jcomponent.getHeight())); //redimensiona el JPanel
                    } catch (InterruptedException ex) {
                        System.err.print("No se pudo plegar el Component");
                    }
                }
            }
        }; hiloPlegar.start(); //comienza el hilo
    }//cierre del metodo
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPagoDeServicios = new javax.swing.JPanel();
        jLabelTituloPagoServicios = new javax.swing.JLabel();
        jLabelCodigoServicio = new javax.swing.JLabel();
        jLabelMontoAPagarServicio = new javax.swing.JLabel();
        jTextMontoAPagarServicio = new javax.swing.JTextField();
        jButtonConfirmarPagoServicio = new javax.swing.JButton();
        jComboBoxTarjetasPagoServicio = new javax.swing.JComboBox<>();
        jLabelTarjetasPagoServicio = new javax.swing.JLabel();
        jLabelIngresarPIN = new javax.swing.JLabel();
        jLabelCuentaPagante = new javax.swing.JLabel();
        jTextCuentaPagante = new javax.swing.JTextField();
        jTextPINTransaccion = new javax.swing.JPasswordField();
        jComboBoxServiciosDisponibles = new javax.swing.JComboBox<>();
        jLabelDeuda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        jPanelPagoDeServicios.setBackground(new java.awt.Color(68, 114, 196));

        jLabelTituloPagoServicios.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTituloPagoServicios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPagoServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPagoServicios.setText("PAGO DE SERVICIOS");

        jLabelCodigoServicio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCodigoServicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoServicio.setText("Servicios Disponibles");

        jLabelMontoAPagarServicio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMontoAPagarServicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMontoAPagarServicio.setText("Monto a Pagar");

        jTextMontoAPagarServicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextMontoAPagarServicio.setForeground(new java.awt.Color(102, 102, 102));
        jTextMontoAPagarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMontoAPagarServicioActionPerformed(evt);
            }
        });

        jButtonConfirmarPagoServicio.setBackground(new java.awt.Color(0, 15, 102));
        jButtonConfirmarPagoServicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonConfirmarPagoServicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmarPagoServicio.setText("Confirmar Pago");
        jButtonConfirmarPagoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarPagoServicioActionPerformed(evt);
            }
        });

        jComboBoxTarjetasPagoServicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBoxTarjetasPagoServicio.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxTarjetasPagoServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transferencia", "Tarjeta 1", "Tarjeta 2", "Tarjeta 3", "Tarjeta 4" }));
        jComboBoxTarjetasPagoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTarjetasPagoServicioActionPerformed(evt);
            }
        });

        jLabelTarjetasPagoServicio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTarjetasPagoServicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTarjetasPagoServicio.setText("Metodo de Pago");

        jLabelIngresarPIN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelIngresarPIN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngresarPIN.setText("Ingresar PIN de Transaccion");

        jLabelCuentaPagante.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCuentaPagante.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuentaPagante.setText("Cuenta Pagante");

        jTextCuentaPagante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextCuentaPagante.setForeground(new java.awt.Color(102, 102, 102));

        jTextPINTransaccion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextPINTransaccion.setForeground(new java.awt.Color(102, 102, 102));

        jComboBoxServiciosDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBoxServiciosDisponibles.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxServiciosDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxServiciosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxServiciosDisponiblesMouseClicked(evt);
            }
        });
        jComboBoxServiciosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServiciosDisponiblesActionPerformed(evt);
            }
        });

        jLabelDeuda.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelDeuda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDeuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeuda.setText("Deuda: {monto}");

        javax.swing.GroupLayout jPanelPagoDeServiciosLayout = new javax.swing.GroupLayout(jPanelPagoDeServicios);
        jPanelPagoDeServicios.setLayout(jPanelPagoDeServiciosLayout);
        jPanelPagoDeServiciosLayout.setHorizontalGroup(
            jPanelPagoDeServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTituloPagoServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addComponent(jLabelCodigoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jComboBoxServiciosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addComponent(jLabelTarjetasPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBoxTarjetasPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addComponent(jLabelCuentaPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextCuentaPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addComponent(jLabelMontoAPagarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jTextMontoAPagarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addComponent(jLabelIngresarPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextPINTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButtonConfirmarPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPagoDeServiciosLayout.setVerticalGroup(
            jPanelPagoDeServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagoDeServiciosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelTituloPagoServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanelPagoDeServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodigoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxServiciosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabelDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanelPagoDeServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTarjetasPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTarjetasPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelPagoDeServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCuentaPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCuentaPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelPagoDeServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMontoAPagarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMontoAPagarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanelPagoDeServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIngresarPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPINTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jButtonConfirmarPagoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPagoDeServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanelPagoDeServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Realiza acciones específicas cuando se ingresa un monto a pagar por el servicio.
    *
    * @param evt Evento de acción relacionado con el monto a pagar del servicio.
    */
    private void jTextMontoAPagarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMontoAPagarServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMontoAPagarServicioActionPerformed

    /**
     * Realiza acciones específicas cuando se confirma el pago del servicio.
     *
     * @param evt Evento de acción relacionado con la confirmación del pago del servicio.
     */
    private void jButtonConfirmarPagoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarPagoServicioActionPerformed
        Thread hilo = new Thread() {
            @Override
            public void run(){
                try{
                    int indexServicio = jComboBoxServiciosDisponibles.getSelectedIndex();
                    String nombreServicio = jComboBoxServiciosDisponibles.getItemAt(indexServicio);
                    Servicios servicio = persistenceManager.getServicio(nombreServicio);
                    int indice =  jComboBoxTarjetasPagoServicio.getSelectedIndex(); 
                    String nroTarjeta = jComboBoxTarjetasPagoServicio.getItemAt(indice);
                    String IDCuenta = jTextCuentaPagante.getText();

                    double monto = Double.parseDouble(jTextMontoAPagarServicio.getText());
                    String PIN = jTextPINTransaccion.getText();

                    if (!persistenceManager.getCuenta(IDCuenta).validarPINTransaccion(PIN)){
                        return;
                    }

                    if(mostrarMensajeConfirmacion("Está seguro que quiere pagar este servicio?") == 0){

                        if (nroTarjeta.equals("Transferencia")){
                            List<Cuenta> cuentasAsociadas = persistenceManager.getCuentas(cliente.getIDCliente()); 
                            for (Cuenta cuenta: cuentasAsociadas){
                                if (cuenta.getIDCuenta().equals(IDCuenta)){
                                    if(cuenta.getSaldo()>=monto){
                                        //reinicio de los jTexts
                                        reiniciojTexts();

                                        Date fecha = servicio.getFechaVencimiento();
                                        double deuda = servicio.getDeudaServicio();
                                        PagoServicios pagoServicio = new PagoServicios(servicio.getCodigoServicio(), fecha, deuda, "Pagado", IDCuenta, "333", new Date().toString(), monto, "PagoServicios");
                                        cuenta.setSaldoCuenta(cuenta.getSaldo()-monto);
                                        servicio.setDeudaServicio(servicio.getDeudaServicio()- deuda);
                                        persistenceManager.guardarPagoServicio(pagoServicio);
                                        servicio.setEstadoPago("Pagado");
                                        persistenceManager.imprimirPagoServicio();
                                        mostrarMensajeFinalizacion("El pago del servicio fue exitoso");
                                        return;
                                    }else{
                                        mostrarMensajeError("Saldo Insuficiente");
                                        return;
                                    }
                                }
                            }
                        mostrarMensajeError("La cuenta no pertence al cliente actual");
                        }else{
                            for (TarjetaCredito tarjeta : persistenceManager.getTarjetas()){
                                if (tarjeta.getNumeroTarjeta().equals(nroTarjeta)){
                                    //reinicio de los jTexts
                                    reiniciojTexts();

                                    Date fecha = servicio.getFechaVencimiento();
                                    double deuda = servicio.getDeudaServicio();
                                    double deudaTarjeta = tarjeta.getDeudaTarjeta();
                                    PagoServicios pagoServicio = new PagoServicios(servicio.getCodigoServicio(), fecha, deuda, "Pagado", IDCuenta, "333", new Date().toString(), monto, "PagoServicios");
                                    tarjeta.setDeudaTarjeta(deudaTarjeta+ monto);
                                    servicio.setDeudaServicio(servicio.getDeudaServicio()- deuda);
                                    persistenceManager.guardarPagoServicio(pagoServicio);
                                    servicio.setEstadoPago("Pagado");
                                    mostrarMensajeFinalizacion("El pago del servicio fue exitoso");
                                    break;
                                }
                            }
                        }
                    }
                }catch (NumberFormatException e){
                    mostrarMensajeError("Ingrese un monto valido");
                }catch (NullPointerException e){
                    mostrarMensajeError("Debe completar todos los campos antes de realizar el pago");
                }
            }
        }; hilo.start();
    }//GEN-LAST:event_jButtonConfirmarPagoServicioActionPerformed

    private void jComboBoxTarjetasPagoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTarjetasPagoServicioActionPerformed
        
    }//GEN-LAST:event_jComboBoxTarjetasPagoServicioActionPerformed

    /**
     * Actualiza la deuda en el jLabelDeuda
     * @param evt 
     */
    private void jComboBoxServiciosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServiciosDisponiblesActionPerformed
        int indexServicio = jComboBoxServiciosDisponibles.getSelectedIndex();// declara e
                                                                         //inicializa una variable
                                                                         //tipo int que contendrá
                                                                         //el índice del item seleccionado en el 
                                                                         //jComboBox
        Servicios servicio = persistenceManager.getServicio(
                jComboBoxServiciosDisponibles.getItemAt(indexServicio));// declara e inicializa
                                                                       // el servicio con el metodo
                                                                       //get de persistence
                                                                       
        jLabelDeuda.setText("Deuda: " + servicio.getDeudaServicio()); //actualiza el jLabel
                                                                    //con la deuda del servicio
                                                                    //seleccionado
    }//GEN-LAST:event_jComboBoxServiciosDisponiblesActionPerformed

    private void jComboBoxServiciosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxServiciosDisponiblesMouseClicked
        
    }//GEN-LAST:event_jComboBoxServiciosDisponiblesMouseClicked

    /**
     * Reinicia los componentes de entrada de texto en la interfaz del pago de servicios.
     * Se establecen valores vacíos en los campos de código de servicio, cuenta pagante, monto a pagar
     * por el servicio y PIN de transacción. Además, se coloca el foco en el campo de código de servicio.
     */
    @Override
    public void reiniciojTexts(){
        jTextCuentaPagante.setText("");
        jTextMontoAPagarServicio.setText("");
        jTextPINTransaccion.setText("");
       
    }//cierre del metodo
    
    /**
     * Muestra un cuadro de diálogo de error con el mensaje proporcionado.
     *
     * @param mensaje Mensaje de error a mostrar.
     */
    @Override
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error en el pago de servicios", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra un cuadro de diálogo de confirmación con el mensaje proporcionado y espera que el usuario responda.
     *
     * @param mensaje Mensaje de confirmación a mostrar.
     * @return Entero que representa la opción seleccionada por el usuario (ver constantes en JOptionPane).
     */
    @Override
    public int mostrarMensajeConfirmacion(String mensaje) {
        return JOptionPane.showConfirmDialog(this, mensaje, "Confirmar Pago de Servicios", WIDTH);
    }
    
    /**
     * Muestra un cuadro de diálogo informativo con el mensaje proporcionado.
     *
     * @param mensaje Mensaje de finalización a mostrar.
     */
    @Override
    public void mostrarMensajeFinalizacion(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    /**
     * Muestra las opciones de pago disponibles en el JComboBox según las tarjetas de crédito asociadas al cliente.
     */
    public void mostrarOpcionesPago(){
        List<TarjetaCredito> tarjetas = persistenceManager.getTarjetas();
        DefaultComboBoxModel<String> comboBoxTarjetasCredito = new DefaultComboBoxModel<>();
        comboBoxTarjetasCredito.addElement("Transferencia");

        for (TarjetaCredito t : tarjetas){
            if(t.getIDCliente().equals(cliente.getIDCliente())){
                comboBoxTarjetasCredito.addElement(t.getNumeroTarjeta());
            }
        }

        jComboBoxTarjetasPagoServicio.setModel(new DefaultComboBoxModel(convertirAArray(comboBoxTarjetasCredito)));
    }

     /**
     * Muestra las tarjetas de crédito asociadas al cliente actual en un JComboBox.
     */
    public void mostrarServicios(){
        // Obtener la lista de tarjetas de crédito del PersistenceManager
        List<Servicios> servicios = persistenceManager.getServicios();
        // Modelo para el JComboBox de tarjetas de crédito
        DefaultComboBoxModel<String> comboBoxServicios = new DefaultComboBoxModel<>();

        for (Servicios servicio: servicios){
            comboBoxServicios.addElement(servicio.getNombre());
        }

        jComboBoxServiciosDisponibles.setModel(new DefaultComboBoxModel<>(convertirAArray(comboBoxServicios)));
        jComboBoxServiciosDisponiblesActionPerformed(null);
    }//cierre del metodo
    
    /**
     * Convierte un DefaultComboBoxModel a un array de Strings.
     *
     * @param comboBoxModel Modelo de JComboBox a convertir.
     * @return Array de Strings obtenido a partir del modelo.
     */
    private String[] convertirAArray(DefaultComboBoxModel<String> comboBoxModel) {
        int size = comboBoxModel.getSize();
        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            array[i] = comboBoxModel.getElementAt(i);
        }

        return array;
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarPagoServicio;
    private javax.swing.JComboBox<String> jComboBoxServiciosDisponibles;
    private javax.swing.JComboBox<String> jComboBoxTarjetasPagoServicio;
    private javax.swing.JLabel jLabelCodigoServicio;
    private javax.swing.JLabel jLabelCuentaPagante;
    private javax.swing.JLabel jLabelDeuda;
    private javax.swing.JLabel jLabelIngresarPIN;
    private javax.swing.JLabel jLabelMontoAPagarServicio;
    private javax.swing.JLabel jLabelTarjetasPagoServicio;
    private javax.swing.JLabel jLabelTituloPagoServicios;
    private javax.swing.JPanel jPanelPagoDeServicios;
    private javax.swing.JTextField jTextCuentaPagante;
    private javax.swing.JTextField jTextMontoAPagarServicio;
    private javax.swing.JPasswordField jTextPINTransaccion;
    // End of variables declaration//GEN-END:variables
}
