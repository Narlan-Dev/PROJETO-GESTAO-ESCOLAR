package views.Aluno;
import views.Cordenador.*;
import controllers.Views.GerenteJanelas;
import models.Registros.Alunos;
import views.Login;
import models.Usuario.*;

public class TelaPrincipalAluno extends javax.swing.JFrame {
    private GerenteJanelas gerenteDeJanelas;
    private Alunos aluno;
            
    public TelaPrincipalAluno() {
        initComponents();
        this.gerenteDeJanelas = new GerenteJanelas(jPanelOverview);
        gerenteDeJanelas.abrirJanelas(TelaInicial.getInstancia());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaInicial = new javax.swing.JPanel();
        jPanelDeslogar = new javax.swing.JPanel();
        jLabelApresentacao = new javax.swing.JLabel();
        jPanelOverview = new javax.swing.JPanel();
        jPanelInfoAluno = new javax.swing.JPanel();
        jLabelInfoAluno = new javax.swing.JLabel();
        jLabelIconAluno = new javax.swing.JLabel();
        jLabelBackgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelTelaInicial.setOpaque(false);
        jPanelTelaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelTelaInicialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTelaInicialLayout = new javax.swing.GroupLayout(jPanelTelaInicial);
        jPanelTelaInicial.setLayout(jPanelTelaInicialLayout);
        jPanelTelaInicialLayout.setHorizontalGroup(
            jPanelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanelTelaInicialLayout.setVerticalGroup(
            jPanelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelTelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 170));

        jPanelDeslogar.setBackground(new java.awt.Color(91, 124, 254));
        jPanelDeslogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelDeslogar.setOpaque(false);
        jPanelDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDeslogarMouseClicked(evt);
            }
        });

        jLabelApresentacao.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelApresentacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApresentacao.setText("Oi, Nome da pessoa");

        javax.swing.GroupLayout jPanelDeslogarLayout = new javax.swing.GroupLayout(jPanelDeslogar);
        jPanelDeslogar.setLayout(jPanelDeslogarLayout);
        jPanelDeslogarLayout.setHorizontalGroup(
            jPanelDeslogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeslogarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanelDeslogarLayout.setVerticalGroup(
            jPanelDeslogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelDeslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 230, 50));

        jPanelOverview.setBackground(new java.awt.Color(231, 239, 248));
        jPanelOverview.setForeground(new java.awt.Color(231, 239, 248));
        getContentPane().add(jPanelOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -40, 1050, 760));

        jPanelInfoAluno.setBackground(new java.awt.Color(91, 124, 254));
        jPanelInfoAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelInfoAluno.setOpaque(false);
        jPanelInfoAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelInfoAlunoMouseClicked(evt);
            }
        });

        jLabelInfoAluno.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelInfoAluno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInfoAluno.setText("INFORMAÇÕES");
        jLabelInfoAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelIconAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconStudent.png"))); // NOI18N

        javax.swing.GroupLayout jPanelInfoAlunoLayout = new javax.swing.GroupLayout(jPanelInfoAluno);
        jPanelInfoAluno.setLayout(jPanelInfoAlunoLayout);
        jPanelInfoAlunoLayout.setHorizontalGroup(
            jPanelInfoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoAlunoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelIconAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInfoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelInfoAlunoLayout.setVerticalGroup(
            jPanelInfoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoAlunoLayout.createSequentialGroup()
                        .addComponent(jLabelIconAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelInfoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanelInfoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 60));

        jLabelBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/telaPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelInfoAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelInfoAlunoMouseClicked
        gerenteDeJanelas.abrirJanelas(new TelaInfoAluno(aluno));
    }//GEN-LAST:event_jPanelInfoAlunoMouseClicked

    private void jPanelDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDeslogarMouseClicked
        //Login.getInstancia().show();
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_jPanelDeslogarMouseClicked

    private void jPanelTelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTelaInicialMouseClicked
        gerenteDeJanelas.abrirJanelas(TelaInicialAluno.getInstancia());
    }//GEN-LAST:event_jPanelTelaInicialMouseClicked
    
    public void changeApresentacaoName(String nome){
        jLabelApresentacao.setText("Oi, "+nome);
    }
    
    public void recebeAluno(Alunos aluno){
        this.aluno = aluno;
    }
    
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
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipalAluno().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelApresentacao;
    private javax.swing.JLabel jLabelBackgroud;
    private javax.swing.JLabel jLabelIconAluno;
    private javax.swing.JLabel jLabelInfoAluno;
    private javax.swing.JPanel jPanelDeslogar;
    private javax.swing.JPanel jPanelInfoAluno;
    protected static javax.swing.JPanel jPanelOverview;
    private javax.swing.JPanel jPanelTelaInicial;
    // End of variables declaration//GEN-END:variables
}
