package controllers.Views;
import javax.swing.*;

public class GerenteJanelas {
    private static JPanel jPanel;
    
    public GerenteJanelas(JPanel jPanel){
        GerenteJanelas.jPanel = jPanel;
    }
    public void abrirJanelas(JInternalFrame jInternalFrame){
            jPanel.removeAll();
            if(jInternalFrame.isVisible()){
                jPanel.add(jInternalFrame);
            }else{
            jPanel.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
}
