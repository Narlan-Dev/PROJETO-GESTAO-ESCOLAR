package views.Cordenador;
import controllers.Views.GerenteJanelas;
import views.Login;
import models.Usuario.*;

public class TelaPrincipal extends javax.swing.JFrame {
    GerenteJanelas gerenteDeJanelas; 
            
    public TelaPrincipal() {
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
        jPanelSala = new javax.swing.JPanel();
        jLabelIconSala = new javax.swing.JLabel();
        jLabelSalas = new javax.swing.JLabel();
        jPanelCadastroProfessor = new javax.swing.JPanel();
        jLabelIconTeacher = new javax.swing.JLabel();
        jLabelTeacher = new javax.swing.JLabel();
        jPanelCadastroAluno = new javax.swing.JPanel();
        jLabelIconAluno = new javax.swing.JLabel();
        jLabelAluno = new javax.swing.JLabel();
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

        jPanelSala.setBackground(new java.awt.Color(91, 124, 254));
        jPanelSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSala.setOpaque(false);
        jPanelSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSalaMouseClicked(evt);
            }
        });

        jLabelIconSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconSala.png"))); // NOI18N
        jLabelIconSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelSalas.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelSalas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalas.setText("SALAS");
        jLabelSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 60));

        jPanelCadastroProfessor.setBackground(new java.awt.Color(91, 124, 254));
        jPanelCadastroProfessor.setOpaque(false);
        jPanelCadastroProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastroProfessorMouseClicked(evt);
            }
        });

        jLabelIconTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconTeacher.png"))); // NOI18N
        jLabelIconTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelTeacher.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelTeacher.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTeacher.setText("CADASTRO PROFESSOR");
        jLabelTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelCadastroProfessorLayout = new javax.swing.GroupLayout(jPanelCadastroProfessor);
        jPanelCadastroProfessor.setLayout(jPanelCadastroProfessorLayout);
        jPanelCadastroProfessorLayout.setHorizontalGroup(
            jPanelCadastroProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCadastroProfessorLayout.setVerticalGroup(
            jPanelCadastroProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProfessorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabelIconTeacher)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelCadastroProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelCadastroProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, 60));

        jPanelCadastroAluno.setBackground(new java.awt.Color(91, 124, 254));
        jPanelCadastroAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCadastroAluno.setOpaque(false);
        jPanelCadastroAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastroAlunoMouseClicked(evt);
            }
        });

        jLabelIconAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconStudent.png"))); // NOI18N

        jLabelAluno.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelAluno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAluno.setText("CADASTRO ALUNO");

        javax.swing.GroupLayout jPanelCadastroAlunoLayout = new javax.swing.GroupLayout(jPanelCadastroAluno);
        jPanelCadastroAluno.setLayout(jPanelCadastroAlunoLayout);
        jPanelCadastroAlunoLayout.setHorizontalGroup(
            jPanelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCadastroAlunoLayout.setVerticalGroup(
            jPanelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCadastroAlunoLayout.createSequentialGroup()
                .addComponent(jLabelIconAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCadastroAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 220, 50));

        jLabelBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/telaPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalaMouseClicked
        gerenteDeJanelas.abrirJanelas(new TelaSalas());
    }//GEN-LAST:event_jPanelSalaMouseClicked

    private void jPanelCadastroProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroProfessorMouseClicked
        gerenteDeJanelas.abrirJanelas(new TelaCadastroProfessor());
    }//GEN-LAST:event_jPanelCadastroProfessorMouseClicked

    private void jPanelCadastroAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroAlunoMouseClicked
        gerenteDeJanelas.abrirJanelas(new TelaCadastroAluno());
    }//GEN-LAST:event_jPanelCadastroAlunoMouseClicked

    private void jPanelDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDeslogarMouseClicked
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_jPanelDeslogarMouseClicked

    private void jPanelTelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTelaInicialMouseClicked
        gerenteDeJanelas.abrirJanelas(TelaInicial.getInstancia());
    }//GEN-LAST:event_jPanelTelaInicialMouseClicked
    
    public void changeApresentacaoName(Usuario user){
        jLabelApresentacao.setText("Oi, "+user.getName());
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
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAluno;
    private javax.swing.JLabel jLabelApresentacao;
    private javax.swing.JLabel jLabelBackgroud;
    private javax.swing.JLabel jLabelIconAluno;
    private javax.swing.JLabel jLabelIconSala;
    private javax.swing.JLabel jLabelIconTeacher;
    private javax.swing.JLabel jLabelSalas;
    private javax.swing.JLabel jLabelTeacher;
    private javax.swing.JPanel jPanelCadastroAluno;
    private javax.swing.JPanel jPanelCadastroProfessor;
    private javax.swing.JPanel jPanelDeslogar;
    protected static javax.swing.JPanel jPanelOverview;
    private javax.swing.JPanel jPanelSala;
    private javax.swing.JPanel jPanelTelaInicial;
    // End of variables declaration//GEN-END:variables
}
