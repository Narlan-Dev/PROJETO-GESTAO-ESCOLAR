package views;
import controllers.RegistrosControllers.*;
import views.Cordenador.TelaPrincipal;
import controllers.SerializationManager.Usuarios;
import java.util.List;
import java.io.File;
import javax.swing.JOptionPane;
import models.CustomExceptions.ContaInvalida;
import models.CustomExceptions.EmptyCamp;
import models.Registros.*;
import models.Usuario.*;
import views.Aluno.TelaPrincipalAluno;

public class Login extends javax.swing.JFrame {
    private static Login log;
    private List<Sala> listaSalas;
    private Usuario user;
    private Usuarios controllerUsuarios;
    private ControllerAlunos controllerAlunos;
    private ControllerProfessores controllerProfessores;
    private ControllerSalas controllerSalas;
    private List<Alunos> alunos;
    private List<Professores> professores;
    
    public static Login getInstancia(){
        if(log == null){
            log = new Login();
        }
        return log;
    }
  
    public Login(){
        initComponents();
        controllerSalas = new ControllerSalas();
        controllerUsuarios = new Usuarios();
        controllerProfessores = new ControllerProfessores();
        controllerAlunos = new ControllerAlunos();
        File pastas;
        boolean check;
        for (RegistroEnumeration reg : RegistroEnumeration.values()){
            pastas = new File(reg.directoryPath);
            check = pastas.mkdir();
            if(!check){
                // implement error
            }
        }
        /*Teste*/
        Usuarios.usuarios.clear();
        controllerUsuarios.add(new ADM("ADM", "1", "1"));
        update();
        ControllerSalas.icons.clear();
        ControllerSalas.salas.clear();
        for(Sala sala : listaSalas){
            ControllerSalas.icons.put(sala.getName(), sala.getIcon());
            ControllerSalas.salas.put(sala, sala.getName());
        } 
    }
    
    private void update(){
        listaSalas = controllerSalas.deserializeAll();
        alunos = controllerAlunos.deserializeAll();
        professores = controllerProfessores.deserializeAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jPanelCaixaError = new javax.swing.JPanel();
        jLabelBackgorud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldLogin.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jTextFieldLogin.setToolTipText("");
        jTextFieldLogin.setBorder(null);
        getContentPane().add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 300, 30));

        jPasswordField1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        jPasswordField1.setBorder(null);
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

        jPanelCaixaError.setOpaque(false);
        getContentPane().add(jPanelCaixaError, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 250, 130));

        jLabelBackgorud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/resources/LoginBackgroud.png"))); // NOI18N
        getContentPane().add(jLabelBackgorud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        /* Apenas testes, mas ta funcional */
        try {
            testaCamposObrigatorios();
            String senha = jPasswordField1.getText();
            String login = jTextFieldLogin.getText();
            
            user = controllerUsuarios.shearchByMatriculaAndSenha(jTextFieldLogin.getText(), jPasswordField1.getText());
            if(user instanceof ADM){
                TelaPrincipal tela = new TelaPrincipal();
                tela.changeApresentacaoName(user.getName());
                tela.show();
                this.dispose();
            }
            
            for(Alunos aluno : alunos){
                if(aluno.getSenha().equals(senha) &&
                        aluno.getLogin().equals(login)){
                    // lança a braba
                    TelaPrincipalAluno tela = new TelaPrincipalAluno();
                    tela.recebeAluno(aluno);
                    tela.changeApresentacaoName(aluno.getNomeCompleto());
                    tela.show();
                    this.dispose();
                }
            }
        } catch (EmptyCamp e) {
            JOptionPane.showMessageDialog(jPanelCaixaError, "Campo/s obrigatório/s");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEntrarKeyPressed
       /*try {
            testaCamposObrigatorios();
            pesquisaConta();   
        } catch (EmptyCamp e) {
            jPanelCaixaError.removeAll();
            JOptionPane.showMessageDialog(jPanelCaixaError, "Campo/s obrigatório/s");
        } catch (ContaInvalida ex) {
            jPanelCaixaError.removeAll();
            JOptionPane.showMessageDialog(jPanelCaixaError, "Conta inválida");
        }*/
    }//GEN-LAST:event_jButtonEntrarKeyPressed
    
    public void testaCamposObrigatorios() throws EmptyCamp{
        if(jTextFieldLogin.getText().equals("") ||
                jPasswordField1.getText().equals("")){
            throw new EmptyCamp();
        }
    }
    
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
            new Login().setVisible(true);
            //Login.getInstancia().show();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelBackgorud;
    private javax.swing.JPanel jPanelCaixaError;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
