package guiwebbanking;

import clasesSWB.PersistenceManager;

/**
 * La clase GUI representa la interfaz gráfica principal del sistema de Web Banking.
 * Incluye métodos para iniciar la aplicación y mostrar la interfaz de inicio de sesión.
 * Utiliza una instancia de PersistenceManager para gestionar la persistencia de datos.
 *
 * @author MAN-U
 */
public class GUI {
    private PersistenceManager persistenceManager = new PersistenceManager();
   
    /**
     * Método principal para ejecutar la aplicación.
     *
     * @param guiWebBanking Instancia de la clase GUI para ejecutar la aplicación.
     */
    public void run(GUI guiWebBanking){
        Login login = new Login();
        login.setVisible(true);
        System.out.print(persistenceManager);
        login.Login(persistenceManager, guiWebBanking);
    }

     /**
     * Método principal para iniciar la aplicación.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este contexto).
     */
    public static void main(String args[]){
        GUI guiWebBanking = new GUI();
        guiWebBanking.run(guiWebBanking);
    }
}
