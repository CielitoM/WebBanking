package guiwebbanking;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DocumentacionThread extends Thread {
    @Override
    public void run() {
        try {
            String url = "file:///C:/Users/Lenovo/Downloads/GUIWebBanking%20(1)/GUIWebBanking/GUIWebBanking/dist/javadoc/index.html";
            JFrame documentation = new JFrame();
            documentation.setSize(1000, 600);
            documentation.setLocationRelativeTo(null);
            documentation.setVisible(true);
            
            JEditorPane jEditorPaneDocumentacion =  new JEditorPane();
            jEditorPaneDocumentacion.setSize(documentation.getWidth(), documentation.getHeight());
            jEditorPaneDocumentacion.setLocation(0, 0);
            jEditorPaneDocumentacion.setPage(new URI(url).toURL());
            
            documentation.add(jEditorPaneDocumentacion);
        } catch (IOException e) {
            // Manejar la excepción

        } catch (URISyntaxException ex) {
            Logger.getLogger(DocumentacionThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
