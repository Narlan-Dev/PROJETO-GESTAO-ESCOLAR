package views.Cordenador;
import controllers.Views.GerenteJanelas;
import controllers.Views.JTextFieldOnlyNumbers;
import javax.swing.DefaultListModel;
import models.Coordenador.Sala;

public class TelaInfoSalas extends javax.swing.JInternalFrame {
    //GerenteJanelas gerenteJanela;
    
    public TelaInfoSalas(Sala sala, DefaultListModel list) {
        initComponents();
        jLabel1.setText(sala.getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddSala = new javax.swing.JPanel();
        jButtonRetornar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAddSala.setBackground(new java.awt.Color(231, 239, 248));
        jPanelAddSala.setForeground(new java.awt.Color(231, 239, 248));
        jPanelAddSala.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRetornar.setBorder(null);
        jButtonRetornar.setContentAreaFilled(false);
        jButtonRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRetornar.setOpaque(true);
        jButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornarActionPerformed(evt);
            }
        });
        jPanelAddSala.add(jButtonRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 90, 90));

        jButtonSalvar.setBorder(null);
        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setOpaque(true);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelAddSala.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 90));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");
        jPanelAddSala.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, 50));

        getContentPane().add(jPanelAddSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //implementar o codigo
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarActionPerformed
        //implementar o codigo
    }//GEN-LAST:event_jButtonRetornarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelAddSala;
    // End of variables declaration//GEN-END:variables
}
