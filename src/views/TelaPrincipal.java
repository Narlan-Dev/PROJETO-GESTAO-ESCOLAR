package views;
import controllers.Views.GerenteJanelas;

public class TelaPrincipal extends javax.swing.JFrame {
    GerenteJanelas gerenteDeJanelas; 
            
    public TelaPrincipal() {
        initComponents();
        this.gerenteDeJanelas = new GerenteJanelas(jPanelOverviewSalas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSala = new javax.swing.JPanel();
        jLabelIconSala = new javax.swing.JLabel();
        jLabelSalas = new javax.swing.JLabel();
        jPanelOverviewSalas = new javax.swing.JPanel();
        jLabelBackgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSala.setBackground(new java.awt.Color(91, 124, 254));
        jPanelSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSalaMouseClicked(evt);
            }
        });

        jLabelIconSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/iconSala.png"))); // NOI18N

        jLabelSalas.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabelSalas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalas.setText("SALAS");

        javax.swing.GroupLayout jPanelSalaLayout = new javax.swing.GroupLayout(jPanelSala);
        jPanelSala.setLayout(jPanelSalaLayout);
        jPanelSalaLayout.setHorizontalGroup(
            jPanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconSala, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanelSalaLayout.setVerticalGroup(
            jPanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalaLayout.createSequentialGroup()
                .addComponent(jLabelIconSala, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabelSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 50));

        jPanelOverviewSalas.setBackground(new java.awt.Color(231, 239, 248));
        jPanelOverviewSalas.setForeground(new java.awt.Color(231, 239, 248));
        getContentPane().add(jPanelOverviewSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -40, 1050, 760));

        jLabelBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/telaPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalaMouseClicked
        gerenteDeJanelas.abrirJanelas(TelaSalas.getInstancia());
    }//GEN-LAST:event_jPanelSalaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackgroud;
    private javax.swing.JLabel jLabelIconSala;
    private javax.swing.JLabel jLabelSalas;
    private javax.swing.JPanel jPanelOverviewSalas;
    private javax.swing.JPanel jPanelSala;
    // End of variables declaration//GEN-END:variables
}
