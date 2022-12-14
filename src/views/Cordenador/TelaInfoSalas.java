package views.Cordenador;
import controllers.Views.GerenteJanelas;
import controllers.Views.JTextFieldOnlyNumbers;
import javax.swing.DefaultListModel;
import models.Contatos.*;
import models.Coordenador.Sala;

public class TelaInfoSalas extends javax.swing.JInternalFrame {
    //private static TelaCadastroProfessor telaCadastroProfessor;
    //GerenteJanelas gerenteJanelas;
    private Sala sala;
    private DefaultListModel list;
    
    /*public static TelaCadastroProfessor getInstancia(){
        if(telaCadastroProfessor == null){
            telaCadastroProfessor = new TelaCadastroProfessor();
        }
        return telaCadastroProfessor;
    }*/
    public TelaInfoSalas(Sala sala, DefaultListModel list) {
        initComponents();
        this.sala = sala;
        this.list = list;
        jLabel1.setText(sala.getName());
        //this.gerenteJanelas = new GerenteJanelas(TelaPrincipal.jPanelOverview);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroud = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFinalizarCadastro = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 255));
        setMaximizable(true);
        setResizable(true);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(360, 500));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackgroud.setBackground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud.setForeground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud.setPreferredSize(new java.awt.Dimension(360, 500));
        jPanelBackgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");
        jPanelBackgroud.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jButtonFinalizarCadastro.setBorder(null);
        jButtonFinalizarCadastro.setContentAreaFilled(false);
        jButtonFinalizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFinalizarCadastro.setOpaque(true);
        jButtonFinalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCadastroActionPerformed(evt);
            }
        });
        jPanelBackgroud.add(jButtonFinalizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 90, 70));

        jButtonCancelar.setBorder(null);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setOpaque(true);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelBackgroud.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 90, 70));

        getContentPane().add(jPanelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonFinalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCadastroActionPerformed

    }//GEN-LAST:event_jButtonFinalizarCadastroActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFinalizarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBackgroud;
    // End of variables declaration//GEN-END:variables
}
