package Contenidos;

import Interfaces.Interface_Mensajes;
import Interfaces.Interface_Panel;

import clasesSWB.Cliente;
import clasesSWB.Cuenta;
import clasesSWB.PagoTarjeta;
import clasesSWB.PersistenceManager;
import clasesSWB.TarjetaCredito;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Panel que permite realizar pagos de tarjetas de crédito asociadas al cliente.
 * Implementa las interfaces Interface_Panel e Interface_Mensajes.
 * @author MAN-U
 */
public class PanelPagarMisTarjetas extends javax.swing.JPanel implements Interface_Panel, Interface_Mensajes {

    private PersistenceManager persistenceManager;
    private Cliente cliente;

    /**
     * Constructor de la clase PanelPagarMisTarjetas.
     * @param persistenceManager Instancia de PersistenceManager para interactuar con la capa de persistencia.
     * @param cliente Cliente asociado al panel.
     */
    public PanelPagarMisTarjetas(PersistenceManager persistenceManager, Cliente cliente) {
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
        desplegarX(jLabelTituloPagarMisTarjetas, 290,1);
        desplegarX(jLabelCodigoTarjetaAPagar, 290,1);
        desplegarX(jPanelPagarMisTarjetas, 290,1);
        desplegarX(jLabelMontoAPagarTarjeta, 290,1);
        desplegarX(jComboBoxCodigosTarjetas, 290,1);
        desplegarX(jTextMontoAPagarTarjeta, 290,1);
        desplegarX(jButtonConfirmarPagoMiTarjeta, 290,1);
        desplegarX(jLabelPagoMinimoTarjeta, 290,1);
        desplegarX(jLabelDatoPagoMinimo, 290,1);
        desplegarX(jLabelCuentaPagante, 290,1);
        desplegarX(jTextCuentaPagante, 290,1);
        desplegarX(jButtonVerTarjeta, 290,1);
    }//cierre del metodo
    
    /**
     * Llama al método plegarX para plegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void plegarComponentes(){
        plegarX(jLabelTituloPagarMisTarjetas, 290,1);
        plegarX(jLabelCodigoTarjetaAPagar, 290,1);
        plegarX(jPanelPagarMisTarjetas, 290,1);
        plegarX(jLabelMontoAPagarTarjeta, 290,1);
        plegarX(jComboBoxCodigosTarjetas, 290,1);
        plegarX(jTextMontoAPagarTarjeta, 290,1);
        plegarX(jButtonConfirmarPagoMiTarjeta, 290,1);
        plegarX(jLabelPagoMinimoTarjeta, 290,1);
        plegarX(jLabelDatoPagoMinimo, 290,1);
        plegarX(jLabelCuentaPagante, 290,1);
        plegarX(jTextCuentaPagante, 290,1);
        plegarX(jButtonVerTarjeta, 290,1);
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

        jPanelPagarMisTarjetas = new javax.swing.JPanel();
        jLabelTituloPagarMisTarjetas = new javax.swing.JLabel();
        jTextMontoAPagarTarjeta = new javax.swing.JTextField();
        jLabelCodigoTarjetaAPagar = new javax.swing.JLabel();
        jLabelMontoAPagarTarjeta = new javax.swing.JLabel();
        jButtonConfirmarPagoMiTarjeta = new javax.swing.JButton();
        jComboBoxCodigosTarjetas = new javax.swing.JComboBox<>();
        jLabelPagoMinimoTarjeta = new javax.swing.JLabel();
        jLabelDatoPagoMinimo = new javax.swing.JLabel();
        jButtonVerTarjeta = new javax.swing.JButton();
        jLabelCuentaPagante = new javax.swing.JLabel();
        jTextCuentaPagante = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(755, 652));

        jPanelPagarMisTarjetas.setBackground(new java.awt.Color(68, 114, 196));
        jPanelPagarMisTarjetas.setPreferredSize(new java.awt.Dimension(707, 388));

        jLabelTituloPagarMisTarjetas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTituloPagarMisTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPagarMisTarjetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPagarMisTarjetas.setText("PAGAR MIS TARJETAS");

        jTextMontoAPagarTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextMontoAPagarTarjeta.setForeground(new java.awt.Color(102, 102, 102));

        jLabelCodigoTarjetaAPagar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCodigoTarjetaAPagar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoTarjetaAPagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCodigoTarjetaAPagar.setText("Codigo de Tarjeta a Pagar");

        jLabelMontoAPagarTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMontoAPagarTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMontoAPagarTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMontoAPagarTarjeta.setText("Monto a Pagar");
        jLabelMontoAPagarTarjeta.setToolTipText("");

        jButtonConfirmarPagoMiTarjeta.setBackground(new java.awt.Color(0, 51, 102));
        jButtonConfirmarPagoMiTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonConfirmarPagoMiTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmarPagoMiTarjeta.setText("Confirmar Pago");
        jButtonConfirmarPagoMiTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarPagoMiTarjetaActionPerformed(evt);
            }
        });

        jComboBoxCodigosTarjetas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBoxCodigosTarjetas.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCodigosTarjetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta 1", "Tarjeta 2", "Tarjeta 3", "Tarjeta 4" }));

        jLabelPagoMinimoTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelPagoMinimoTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagoMinimoTarjeta.setText("Pago Minimo");

        jLabelDatoPagoMinimo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelDatoPagoMinimo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatoPagoMinimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDatoPagoMinimo.setText("0.0");

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
        jLabelCuentaPagante.setText("Cuenta Pagante");

        jTextCuentaPagante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextCuentaPagante.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanelPagarMisTarjetasLayout = new javax.swing.GroupLayout(jPanelPagarMisTarjetas);
        jPanelPagarMisTarjetas.setLayout(jPanelPagarMisTarjetasLayout);
        jPanelPagarMisTarjetasLayout.setHorizontalGroup(
            jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloPagarMisTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                        .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                                .addComponent(jLabelCodigoTarjetaAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(jLabelMontoAPagarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagarMisTarjetasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCuentaPagante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPagoMinimoTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCodigosTarjetas, 0, 276, Short.MAX_VALUE)
                            .addComponent(jTextMontoAPagarTarjeta)
                            .addComponent(jLabelDatoPagoMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextCuentaPagante))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagarMisTarjetasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmarPagoMiTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPagarMisTarjetasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVerTarjeta)
                .addGap(83, 83, 83))
        );
        jPanelPagarMisTarjetasLayout.setVerticalGroup(
            jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloPagarMisTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPagarMisTarjetasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelCodigoTarjetaAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(jComboBoxCodigosTarjetas))
                .addGap(27, 27, 27)
                .addComponent(jButtonVerTarjeta)
                .addGap(18, 18, 18)
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCuentaPagante, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jTextCuentaPagante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatoPagoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPagoMinimoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPagarMisTarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMontoAPagarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMontoAPagarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonConfirmarPagoMiTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPagarMisTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanelPagarMisTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerTarjetaActionPerformed
        int indice =  jComboBoxCodigosTarjetas.getSelectedIndex(); 
        String nroTarjeta = jComboBoxCodigosTarjetas.getItemAt(indice);

        for (TarjetaCredito tarjeta : persistenceManager.getTarjetas()){
            if (tarjeta.getNumeroTarjeta().equals(nroTarjeta)){
                double pagoMinimo = tarjeta.getDeudaTarjeta()*0.05;
                jLabelDatoPagoMinimo.setText(String.valueOf(pagoMinimo));
                break;
            }
        }
    }//GEN-LAST:event_jButtonVerTarjetaActionPerformed

    private void jButtonConfirmarPagoMiTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarPagoMiTarjetaActionPerformed
        Thread hilo = new Thread(){
            @Override
            public void run(){
                int indice =  jComboBoxCodigosTarjetas.getSelectedIndex(); 
                String nroTarjeta = jComboBoxCodigosTarjetas.getItemAt(indice);
                String IDCuenta = jTextCuentaPagante.getText();
                double pagoMinimo = Double.parseDouble(jLabelDatoPagoMinimo.getText());
                double monto = Double.parseDouble(jTextMontoAPagarTarjeta.getText());
                List<Cuenta> cuentasAsociadas = persistenceManager.getCuentas(cliente.getIDCliente()); 

                if (monto < pagoMinimo){
                     mostrarMensajeError("El monto debe ser mayor que el pago minimo");
                     return;
                }

                if(mostrarMensajeConfirmacion("Está seguro que quiere pagar esta tarjeta?") == 0){
                    for (Cuenta cuenta : cuentasAsociadas){
                        if (cuenta.getIDCuenta().equals(IDCuenta)){
                            if (cuenta.getSaldo() > monto){
                                for (TarjetaCredito tarjeta: persistenceManager.getTarjetas()){
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
                            }else {
                                mostrarMensajeError("Saldo Insuficiente");
                            }
                        }
                        
                    }
                    mostrarMensajeError("La cuenta no pertenece al cliente actual");
                }
            }
        }; hilo.start();
    }//GEN-LAST:event_jButtonConfirmarPagoMiTarjetaActionPerformed

    /**
    * Muestra las tarjetas de crédito asociadas al cliente actual en un JComboBox.
    */
    public void mostrarTarjetas(){
        // Obtener la lista de tarjetas de crédito del PersistenceManager
        List<TarjetaCredito> tarjetas = persistenceManager.getTarjetas();
        // Modelo para el JComboBox de tarjetas de crédito
        DefaultComboBoxModel<String> comboBoxTarjetasCredito = new DefaultComboBoxModel<>();

        for (TarjetaCredito t: tarjetas){
            if (t.getIDCliente().equals(cliente.getIDCliente())){
                comboBoxTarjetasCredito.addElement(t.getNumeroTarjeta());
            }
        }

        jComboBoxCodigosTarjetas.setModel(new DefaultComboBoxModel<>(convertirAArray(comboBoxTarjetasCredito)));
    }//cierre del metodo

    /**
     * Convierte un DefaultComboBoxModel a un array de String.
     * @param comboBoxModel Modelo de JComboBox a convertir.
     * @return Array de String con los elementos del modelo.
     */
    private String[] convertirAArray(DefaultComboBoxModel<String> comboBoxModel) {
        int size = comboBoxModel.getSize();
        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            array[i] = comboBoxModel.getElementAt(i);
        }

        return array;
    }   

    /**
     * Muestra un mensaje de error en un cuadro de diálogo.
     * @param mensaje Mensaje de error a mostrar.
     */
    @Override
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error en el pago de mis tarjetas", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra un cuadro de diálogo de confirmación con el mensaje proporcionado.
     * @param mensaje Mensaje a mostrar en el cuadro de diálogo.
     * @return Entero que representa la opción seleccionada (JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, etc.).
     */
    @Override
    public int mostrarMensajeConfirmacion(String mensaje) {
        return JOptionPane.showConfirmDialog(this, mensaje, "Confirmar Pago Tarjeta", WIDTH);
    }
    
    /**
     * Muestra un mensaje en un cuadro de diálogo.
     * @param mensaje Mensaje a mostrar.
     */
    @Override
    public void mostrarMensajeFinalizacion(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarPagoMiTarjeta;
    private javax.swing.JButton jButtonVerTarjeta;
    private javax.swing.JComboBox<String> jComboBoxCodigosTarjetas;
    private javax.swing.JLabel jLabelCodigoTarjetaAPagar;
    private javax.swing.JLabel jLabelCuentaPagante;
    private javax.swing.JLabel jLabelDatoPagoMinimo;
    private javax.swing.JLabel jLabelMontoAPagarTarjeta;
    private javax.swing.JLabel jLabelPagoMinimoTarjeta;
    private javax.swing.JLabel jLabelTituloPagarMisTarjetas;
    private javax.swing.JPanel jPanelPagarMisTarjetas;
    private javax.swing.JTextField jTextCuentaPagante;
    private javax.swing.JTextField jTextMontoAPagarTarjeta;
    // End of variables declaration//GEN-END:variables
}
