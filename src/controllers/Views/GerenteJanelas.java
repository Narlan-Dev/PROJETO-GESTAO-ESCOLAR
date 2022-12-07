package controllers.Views;
import javax.swing.*;

public class GerenteJanelas {
    private static JPanel jPanel;
    
    public GerenteJanelas(JPanel jPanel){
        GerenteJanelas.jPanel = jPanel;
    }
    public void abrirJanelas(JInternalFrame jInternalFrame){
            if(jInternalFrame.isVisible()){
                jInternalFrame.toFront();
                jInternalFrame.requestFocus();
            }else{
            jPanel.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
}
