package views;
import controllers.Salas.ControllerSalas;
import views.Cordenador.TelaPrincipal;
import controllers.Usuarios.Usuarios;
import models.Coordenador.Sala;
import models.Usuario.*;

public class Login extends javax.swing.JFrame {
    private static Login log;
    private Usuario user;
    private Usuarios controllerUsuarios;
    private ControllerSalas controllerSalas;
    
    public static Login getInstancia(){
        if(log == null){
            log = new Login();
        }
        return log;
    }
  
    public Login() {
        initComponents();
        controllerSalas = new ControllerSalas();
        controllerUsuarios = new Usuarios();
        /*Teste*/
        controllerSalas.add(new Sala("Sala 1", 21));
        controllerSalas.add(new Sala("Sala 2", 22));
        controllerSalas.add(new Sala("Sala 3", 23));
        controllerSalas.add(new Sala("Sala 4", 24));
        controllerUsuarios.add(new ADM("ADM", "1", "1"));
        controllerUsuarios.add(new ADM("Narlan", "1", "2"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jLabelBackgorud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldLogin.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLogin.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jTextFieldLogin.setToolTipText("");
        jTextFieldLogin.setBorder(null);
        jTextFieldLogin.setOpaque(false);
        getContentPane().add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 300, 30));

        jPasswordField1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jPasswordField1.setBorder(null);
        jPasswordField1.setOpaque(false);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 300, 40));

        jButtonEntrar.setBorder(null);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jButtonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 170, 50));

        jLabelBackgorud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/LoginBackgroud.png"))); // NOI18N
        getContentPane().add(jLabelBackgorud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        /* Apenas testes, mas ta funcional */
        try {
            user = controllerUsuarios.shearchByMatriculaAndSenha(jTextFieldLogin.getText(), jPasswordField1.getText());
            if(user instanceof ADM){
                TelaPrincipal tela = new TelaPrincipal();
                tela.changeApresentacaoName(user);
                tela.show();
                this.dispose();
                //Terminar funcionalidades
            }
            /*if(user.getType().equals("coordenador")){
                TelaPrincipal tela = new TelaPrincipal();
                tela.changeApresentacaoName(user);
                tela.show();
                this.dispose();
                //Terminar funcionalidades
            }
            if(user.getType().equals("professor")){
                //Criar as telas e as classes
            }
            if(user instanceof Alunos){
                //Criar as telas e as terminar classes
            }*/
        } catch (Exception e) {
            jTextFieldLogin.setText("conta invalida");
        }
        /*TelaPrincipal tela = new TelaPrincipal();
        //tela.changeApresentacaoName(user);
        tela.show();
        this.hide();*/
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEntrarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {                    
            try {
                user = controllerUsuarios.shearchByMatriculaAndSenha(jTextFieldLogin.getText(), jPasswordField1.getText());
                if(user instanceof ADM){
                    TelaPrincipal tela = new TelaPrincipal();
                    tela.changeApresentacaoName(user);
                    tela.show();
                    this.dispose();
                    //Terminar funcionalidades
                }
                /*if(user.getType().equals("coordenador")){
                    TelaPrincipal tela = new TelaPrincipal();
                    tela.changeApresentacaoName(user);
                    tela.show();
                    this.dispose();
                    //Terminar funcionalidades
                }
                if(user.getType().equals("professor")){
                    //Criar as telas e as classes
                }
                if(user instanceof Alunos){
                    //Criar as telas e as terminar classes
                }*/
            } catch (Exception e) {
                jTextFieldLogin.setText("conta invalida");
            }
        }
    }//GEN-LAST:event_jButtonEntrarKeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Login.getInstancia().show();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelBackgorud;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
