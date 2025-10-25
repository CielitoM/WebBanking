package Contenidos;

import Interfaces.Interface_Mensajes;
import Interfaces.Interface_Panel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;

import clasesSWB.TarjetaCredito;
import clasesSWB.PersistenceManager;
import clasesSWB.Cliente;
import clasesSWB.Cuenta;
import clasesSWB.PagoTarjeta;

import java.util.Date;
import java.util.List;

/**
 * Panel que permite al cliente realizar pagos a otras tarjetas de crédito.
 *
 * <p>Este panel incluye la interfaz {@code Interface_Panel} para gestionar componentes
 * y la interfaz {@code Interface_Mensajes} para mostrar mensajes al usuario.</p>
 *
 * @author MAN-U
 */

public class PanelPagarOtrasTarjetas extends javax.swing.JPanel implements Interface_Panel, Interface_Mensajes{

    private PersistenceManager persistenceManager;
    private Cliente cliente;

    /**
     * Crea un nuevo formulario de PanelPagarOtrasTarjetas.
     *
     * @param persistenceManager Instancia de PersistenceManager para interactuar con la capa de persistencia.
     * @param cliente Cliente asociado al panel.
     */
    public PanelPagarOtrasTarjetas(PersistenceManager persistenceManager, Cliente cliente) {
        initComponents();
        changeComponentsProperties();
        this.persistenceManager = persistenceManager;
        this.cliente = cliente;
    }//cierre del constructor

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
        desplegarX(jLabelPagarOtrasTarjetas, 290, 1);
        desplegarX(jLabelTarjetaAPagarIngresar, 290, 1);
        desplegarX(jTextCodigoTarjetaAPagar, 290, 1);
        desplegarX(jLabelMontoAPagar, 290, 1);
        desplegarX(jTextMontoAPagar, 290, 1);
        desplegarX(jButtonConfirmarPagoTarjeta, 290, 1);
        desplegarX(jPanelPagarOtrasTarjetas, 290, 1);
        desplegarX(jLabelPagoMinimo, 290, 1);
        desplegarX(jLabelDatoPagoMinimo, 290, 1);
        desplegarX(jButtonVerTarjeta, 290,1);
        desplegarX(jLabelCuentaPagante, 290,1);
        desplegarX(jTextCuentaPagante, 290,1);
    }//cierre del metodo
    
    /**
     * Llama al método plegarX para plegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void plegarComponentes(){
        plegarX(jLabelPagarOtrasTarjetas, 290, 1);
        plegarX(jLabelTarjetaAPagarIngresar, 290, 1);
        plegarX(jTextCodigoTarjetaAPagar, 290, 1);
        plegarX(jLabelMontoAPagar, 290, 1);
        plegarX(jTextMontoAPagar, 290, 1);
        plegarX(jButtonConfirmarPagoTarjeta, 290, 1);
        plegarX(jPanelPagarOtrasTarjetas, 290, 1);
        plegarX(jLabelPagoMinimo, 290, 1);
        plegarX(jLabelDatoPagoMinimo, 290, 1);
        plegarX(jButtonVerTarjeta, 290,1);
        plegarX(jLabelCuentaPagante, 290,1);
        plegarX(jTextCuentaPagante, 290,1);
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

        jPanelPagarOtrasTarjetas = new javax.swing.JPanel();
        jLabelTarjetaAPagarIngresar = new javax.swing.JLabel();
        jTextCodigoTarjetaAPagar = new javax.swing.JTextField();
        jLabelMontoAPagar = new javax.swing.JLabel();
        jTextMontoAPagar = new javax.swing.JTextField();
        jButtonConfirmarPagoTarjeta = new javax.swing.JButton();
        jLabelPagoMinimo = new javax.swing.JLabel();
        jLabelDatoPagoMinimo = new javax.swing.JLabel();
        jLabelPagarOtrasTarjetas = new javax.swing.JLabel();
        jButtonVerTarjeta = new javax.swing.JButton();
        jLabelCuentaPagante = new javax.swing.JLabel();
        jTextCuentaPagante = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 0, 51));
        setPreferredSize(new java.awt.Dimension(755, 652));

        jPanelPagarOtrasTarjetas.setBackground(new java.awt.Color(68, 114, 196));

        jLabelTarjetaAPagarIngresar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTarjetaAPagarIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTarjetaAPagarIngresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTarjetaAPagarIngresar.setText("Codigo de Tarjeta a Pagar");

        jTextCodigoTarjetaAPagar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextCodigoTarjetaAPagar.setForeground(new java.awt.Color(102, 102, 102));

        jLabelMontoAPagar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMontoAPagar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMontoAPagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMontoAPagar.setText("Monto a Pagar");

        jTextMontoAPagar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextMontoAPagar.setForeground(new java.awt.Color(102, 102, 102));
        jTextMontoAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMontoAPagarActionPerformed(evt);
            }
        });

        jButtonConfirmarPagoTarjeta.setBackground(new java.awt.Color(0, 51, 102));
        jButtonConfirmarPagoTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonConfirmarPagoTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmarPagoTarjeta.setText("Confirmar Pago");
        jButtonConfirmarPagoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarPagoTarjetaActionPerformed(evt);
            }
        });

        jLabelPagoMinimo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelPagoMinimo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagoMinimo.setText("Pago Minimo");

        jLabelDatoPagoMinimo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelDatoPagoMinimo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatoPagoMinimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDatoPagoMinimo.setText("0.0");

        jLabelPagarOtrasTarjetas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelPagarOtrasTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagarOtrasTarjetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPagarOtrasTarjetas.setText("PAGAR OTRAS TARJETAS");

        jButtonVerTarjeta.setBackground(new java.awt.Color(0, 51, 102));
        jButtonVerTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonVerTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerTarjeta.setText("Ver Tarjeta");
        jButtonVerTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerTarjetaActionPerformed(evt);
            }
        });

        jLabelCuentaPagante.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCuentaPagante.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuentaPagante.setText("Cuenta pagante");

        jTextCuentaPagante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextCuentaPagante.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanelPagarOtrasTarjetasLayout = new javax.swing.GroupLayout(jPanelPagarOtrasTarjetas);
        jPanelPagarOtrasTarjetas.setLayout(jPanelPagarOtrasTarjetasLayout);
        jPanelPagarOtrasTarjetasLayout.setHorizontalGroup(
            jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPagarOtrasTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPagarOtrasTarjetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagarOtrasTarjetasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarPagoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(jPanelPagarOtrasTarjetasLayout.createSequentialGroup()
                        .addGroup(jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCuentaPagante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMontoAPagar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPagoMinimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTarjetaAPagarIngresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextMontoAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(jTextCodigoTarjetaAPagar)
                            .addComponent(jTextCuentaPagante)
                            .addComponent(jLabelDatoPagoMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagarOtrasTarjetasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVerTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanelPagarOtrasTarjetasLayout.setVerticalGroup(
            jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagarOtrasTarjetasLayout.createSequentialGroup()
                .addComponent(jLabelPagarOtrasTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTarjetaAPagarIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCodigoTarjetaAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonVerTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCuentaPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCuentaPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDatoPagoMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPagoMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPagarOtrasTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMontoAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jTextMontoAPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfirmarPagoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPagarOtrasTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanelPagarOtrasTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
        );
    }// </editor-fold>//GEN-END:initComponents

     /**
     * Maneja el evento de acción cuando se ingresa el monto a pagar en el campo de texto.
     * @param evt Evento de acción generado por el campo de texto.
     */
    private void jTextMontoAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMontoAPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMontoAPagarActionPerformed

     /**
     * Maneja el evento de acción cuando se hace clic en el botón "Confirmar Pago de Tarjeta".
     * Inicia un hilo para realizar el pago de la tarjeta de crédito.
     * @param evt Evento de acción generado por el botón.
     */
    private void jButtonConfirmarPagoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarPagoTarjetaActionPerformed
        Thread hilo = new Thread(){
            @Override
            public void run(){
                String nroTarjeta = jTextCodigoTarjetaAPagar.getText(); 
                String IDCuenta = jTextCuentaPagante.getText();
                double monto = Double.parseDouble(jTextMontoAPagar.getText());
                double pagoMinimo = Double.parseDouble(jTextMontoAPagar.getText()); 
                List<Cuenta> cuentasAsociadas = persistenceManager.getCuentas(cliente.getIDCliente()); 

                if (!persistenceManager.VerificarCuenta(IDCuenta)){
                    mostrarMensajeError("La cuenta no existe");
                }

                if (monto < pagoMinimo){
                    mostrarMensajeError("El monto debe ser mayor que el pago minimo");
                }        

                if(mostrarMensajeConfirmacion("Está seguro que quiere pagar esta tarjeta?") == 0){
                    for (Cuenta cuenta :cuentasAsociadas){
                        if (cuenta.getIDCuenta().equals(IDCuenta)){
                            if (cuenta.getSaldo() > monto){
                                for (TarjetaCredito tarjeta : persistenceManager.getTarjetas()){
                                    if (tarjeta.getNumeroTarjeta().equals(nroTarjeta)){
                                        double deudaTarjeta = tarjeta.getDeudaTarjeta();
                                        double saldoActual = 0;          
                                        PagoTarjeta pagoTarjeta = new PagoTarjeta(nroTarjeta, saldoActual, deudaTarjeta, pagoMinimo, IDCuenta,"333", new Date().toString(), monto, "Pago Tarjeta");
                                        cuenta.setSaldoCuenta(cuenta.getSaldo() - monto);
                                        persistenceManager.guardarPagoTarjeta(pagoTarjeta);
                                        mostrarMensajeFinalizacion("El pago de la tarjeta fue exitoso");
                                        return;
                                    }
                                }
                            }else{
                                mostrarMensajeError("Saldo Insuficiente");
                            }
                        }else{
                            mostrarMensajeError("La cuenta no pertenece al cliente actual");
                        }
                    }
                }
            }
        }; hilo.start();
    }//GEN-LAST:event_jButtonConfirmarPagoTarjetaActionPerformed

    /**
     * Maneja el evento de acción cuando se hace clic en el botón "Ver Tarjeta".
     * Muestra el pago mínimo asociado a la tarjeta de crédito en la interfaz gráfica.
     * @param evt Evento de acción generado por el botón.
     */
    private void jButtonVerTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerTarjetaActionPerformed
        String nroTarjeta = jTextCodigoTarjetaAPagar.getText(); 
        for (TarjetaCredito tarjeta : persistenceManager.getTarjetas()){
            if (tarjeta.getNumeroTarjeta().equals(nroTarjeta)){
                double pagoMinimo = tarjeta.getDeudaTarjeta()*0.05;
                jLabelDatoPagoMinimo.setText(String.valueOf(pagoMinimo));
                break;
            }
        }
            
        
    }//GEN-LAST:event_jButtonVerTarjetaActionPerformed
    
    /**
     * Muestra un mensaje de error en la interfaz gráfica.
     * @param mensaje Mensaje de error a mostrar.
     */
    @Override
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error en el pago de tarjeta", JOptionPane.ERROR_MESSAGE);
    }//cierre del metodo

    /**
     * Muestra un mensaje de confirmación en la interfaz gráfica.
     * @param mensaje Mensaje de confirmación a mostrar.
     * @return Retorna la opción seleccionada por el usuario (confirmar, cancelar, etc.).
     */
    @Override
    public int mostrarMensajeConfirmacion(String mensaje){
        return JOptionPane.showConfirmDialog(this, mensaje, "Confirmar Pago de Tarjeta", WIDTH);
    }//cierre del metodo
    
    /**
     * Muestra un mensaje de finalización en la interfaz gráfica.
     * @param mensaje Mensaje de finalización a mostrar.
     */
    @Override
    public void mostrarMensajeFinalizacion(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }//cierre del metodo
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarPagoTarjeta;
    private javax.swing.JButton jButtonVerTarjeta;
    private javax.swing.JLabel jLabelCuentaPagante;
    private javax.swing.JLabel jLabelDatoPagoMinimo;
    private javax.swing.JLabel jLabelMontoAPagar;
    private javax.swing.JLabel jLabelPagarOtrasTarjetas;
    private javax.swing.JLabel jLabelPagoMinimo;
    private javax.swing.JLabel jLabelTarjetaAPagarIngresar;
    private javax.swing.JPanel jPanelPagarOtrasTarjetas;
    private javax.swing.JTextField jTextCodigoTarjetaAPagar;
    private javax.swing.JTextField jTextCuentaPagante;
    private javax.swing.JTextField jTextMontoAPagar;
    // End of variables declaration//GEN-END:variables
}
