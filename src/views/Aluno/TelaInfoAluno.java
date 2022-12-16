package views.Aluno;
import controllers.Views.GerenteJanelas;

public class TelaInfoAluno extends javax.swing.JInternalFrame {
    GerenteJanelas gerenteDeJanelas;
    
    public TelaInfoAluno() {
        initComponents();
        this.gerenteDeJanelas = new GerenteJanelas(TelaPrincipalAluno.jPanelOverview);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroud = new javax.swing.JPanel();
        jButtonRetornar = new javax.swing.JButton();
        backgroudInfoAluno = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 255));
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1050, 790));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackgroud.setBackground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud.setForeground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRetornar.setBorder(null);
        jButtonRetornar.setContentAreaFilled(false);
        jButtonRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornarActionPerformed(evt);
            }
        });
        jPanelBackgroud.add(jButtonRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 230, 50));

        backgroudInfoAluno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backgroudInfoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Aluno/Resources/TelaInfoAluno.png"))); // NOI18N
        jPanelBackgroud.add(backgroudInfoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, 758));

        getContentPane().add(jPanelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarActionPerformed
        gerenteDeJanelas.abrirJanelas(new TelaInicialAluno());
    }//GEN-LAST:event_jButtonRetornarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroudInfoAluno;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JPanel jPanelBackgroud;
    // End of variables declaration//GEN-END:variables
}
