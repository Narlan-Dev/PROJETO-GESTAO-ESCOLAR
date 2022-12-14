package views.Cordenador;
import controllers.Salas.ControllerSalas;
import controllers.Views.GerenteJanelas;
import controllers.Views.IconListRenderer;
import controllers.Views.JTextFieldOnlyNumbers;
import static java.util.Collections.list;
import javax.swing.DefaultListModel;
import models.Coordenador.Sala;
import models.CustomExceptions.FileExistsException;

public class TelaAddSalas extends javax.swing.JInternalFrame {
    GerenteJanelas gerenteJanela;
    DefaultListModel listModel;
    
    public TelaAddSalas(DefaultListModel list) {
        initComponents();
        this.listModel = list;
        this.gerenteJanela = new GerenteJanelas(TelaPrincipal.jPanelOverview);
        jTextFieldCapacidadeMaxima.setDocument(new JTextFieldOnlyNumbers());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddSala = new javax.swing.JPanel();
        jTextFieldCapacidadeMaxima = new javax.swing.JTextField();
        jTextFieldNomeSala = new javax.swing.JTextField();
        jButtonRetornar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        backgroudCadastro = new javax.swing.JLabel();

        setBorder(null);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAddSala.setBackground(new java.awt.Color(231, 239, 248));
        jPanelAddSala.setForeground(new java.awt.Color(231, 239, 248));
        jPanelAddSala.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCapacidadeMaxima.setBackground(new java.awt.Color(241, 242, 244));
        jTextFieldCapacidadeMaxima.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jTextFieldCapacidadeMaxima.setForeground(new java.awt.Color(24, 33, 53));
        jTextFieldCapacidadeMaxima.setToolTipText("");
        jTextFieldCapacidadeMaxima.setBorder(null);
        jTextFieldCapacidadeMaxima.setOpaque(false);
        jPanelAddSala.add(jTextFieldCapacidadeMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 358, 200, 28));

        jTextFieldNomeSala.setBackground(new java.awt.Color(241, 242, 244));
        jTextFieldNomeSala.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jTextFieldNomeSala.setForeground(new java.awt.Color(24, 33, 53));
        jTextFieldNomeSala.setToolTipText("");
        jTextFieldNomeSala.setBorder(null);
        jPanelAddSala.add(jTextFieldNomeSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 250, 770, 28));

        jButtonRetornar.setBorder(null);
        jButtonRetornar.setContentAreaFilled(false);
        jButtonRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornarActionPerformed(evt);
            }
        });
        jPanelAddSala.add(jButtonRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 250, 30));

        jButtonSalvar.setBorder(null);
        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelAddSala.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 220, 80));

        backgroudCadastro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backgroudCadastro.setForeground(new java.awt.Color(0, 0, 0));
        backgroudCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/TelaAdicionarSala.png"))); // NOI18N
        jPanelAddSala.add(backgroudCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1050, 758));

        getContentPane().add(jPanelAddSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            ControllerSalas.add(new Sala(jTextFieldNomeSala.getText(), Integer.parseInt(jTextFieldCapacidadeMaxima.getText())));
            gerenteJanela.abrirJanelas(new TelaSalas());
        } catch (FileExistsException e) {
            //alguam impletação gráfica
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarActionPerformed
        gerenteJanela.abrirJanelas(new TelaSalas());
    }//GEN-LAST:event_jButtonRetornarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroudCadastro;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JPanel jPanelAddSala;
    private javax.swing.JTextField jTextFieldCapacidadeMaxima;
    private javax.swing.JTextField jTextFieldNomeSala;
    // End of variables declaration//GEN-END:variables
}
