package Contenidos;

import Interfaces.Interface_Panel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import clasesSWB.Cuenta;
import clasesSWB.Cliente;
import clasesSWB.PersistenceManager;

/**
 * Representa un panel que muestra información sobre la cuenta del usuario.
 * Implementa la interfaz Interface_Panel para gestionar componentes de la interfaz.
 * @author MAN-U
 */
public class PanelMiCuenta extends javax.swing.JPanel implements Interface_Panel{
    // Instancia de PersistenceManager para interactuar con la capa de persistencia
    private PersistenceManager persistenceManager;
    
    /**
     * Constructor de la clase PanelMiCuenta.
     * 
     * @param persistenceManager Instancia de PersistenceManager para la gestión de datos.
     */
    public PanelMiCuenta(PersistenceManager persistenceManager) {
        initComponents();
        changeComponentsProperties();
        this.persistenceManager = persistenceManager;
        
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
        desplegarX(jLabelTituloMiCuenta, 290, 1);
        desplegarX(jLabelSaldo, 290, 1);
        desplegarX(jLabelSaldoDisponible, 290, 1);
        desplegarX(jLabelDatosCuenta, 290, 1);
        desplegarX(jLabelNombreUsuario, 290, 1);
        desplegarX(jPanelCuenta, 290, 1);
    }//cierre del metodo
    
    /**
     * Llama al método plegarX para plegar de manera horizontal cada uno de los 
     * componentes contenidos en el jPanel
     */
    @Override
    public void plegarComponentes(){
        plegarX(jLabelTituloMiCuenta, 290, 1);
        plegarX(jLabelSaldo, 290, 1);
        plegarX(jLabelSaldoDisponible, 290, 1);
        plegarX(jLabelDatosCuenta, 290, 1);
        plegarX(jLabelNombreUsuario, 290, 1);
        plegarX(jPanelCuenta, 290, 1);
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

        jPanelCuenta = new javax.swing.JPanel();
        jLabelSaldo = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelDatosCuenta = new javax.swing.JLabel();
        jLabelSaldoDisponible = new javax.swing.JLabel();
        jLabelTituloMiCuenta = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(755, 652));

        jPanelCuenta.setBackground(new java.awt.Color(68, 114, 196));

        jLabelSaldo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaldo.setText("$$$ DOLARES ");
        jLabelSaldo.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelSaldo.setPreferredSize(new java.awt.Dimension(755, 32));

        jLabelNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreUsuario.setText("[Nombre del Usuario]");
        jLabelNombreUsuario.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelNombreUsuario.setPreferredSize(new java.awt.Dimension(755, 32));

        jLabelDatosCuenta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelDatosCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatosCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDatosCuenta.setText("Caja de Ahorro [Numero de Cuenta] ");
        jLabelDatosCuenta.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelDatosCuenta.setPreferredSize(new java.awt.Dimension(755, 32));

        jLabelSaldoDisponible.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSaldoDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSaldoDisponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaldoDisponible.setText("Saldo Disponible");
        jLabelSaldoDisponible.setMaximumSize(new java.awt.Dimension(1366, 748));
        jLabelSaldoDisponible.setPreferredSize(new java.awt.Dimension(755, 32));

        javax.swing.GroupLayout jPanelCuentaLayout = new javax.swing.GroupLayout(jPanelCuenta);
        jPanelCuenta.setLayout(jPanelCuentaLayout);
        jPanelCuentaLayout.setHorizontalGroup(
            jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelSaldoDisponible, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelDatosCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCuentaLayout.setVerticalGroup(
            jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuentaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelDatosCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSaldoDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabelTituloMiCuenta.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTituloMiCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloMiCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloMiCuenta.setText("Información de la Cuenta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloMiCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addComponent(jPanelCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelTituloMiCuenta)
                .addGap(55, 55, 55)
                .addComponent(jPanelCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDatosCuenta;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JLabel jLabelSaldoDisponible;
    private javax.swing.JLabel jLabelTituloMiCuenta;
    private javax.swing.JPanel jPanelCuenta;
    // End of variables declaration//GEN-END:variables
 
/**
 * Muestra la información del cliente y su cuenta en el panel "Mi Cuenta".
 *
 * @param cuenta La cuenta del cliente.
 * @param cliente El cliente cuya información se mostrará.
 */
    public void mostrarInformacionCliente(Cuenta cuenta, Cliente cliente){
        // Mostrar la informacion en el jPanel Mi Cuenta
        jLabelDatosCuenta.setText(cuenta.getTipoCuenta() + " Nº" + cuenta.getIDCuenta());
        jLabelNombreUsuario.setText(cliente.getNombre());
        jLabelSaldo.setText(String.valueOf(cuenta.getSaldo()) + "$");
      
    }
}
