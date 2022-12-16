package views.Cordenador;
import controllers.RegistrosControllers.ControllerAlunos;
import controllers.RegistrosControllers.ControllerSalas;
import controllers.Views.GerenteJanelas;
import controllers.Views.JTextFieldOnlyNumbers;
import java.util.List;
import javax.swing.DefaultListModel;
import models.Coordenador.Sala;
import models.Registros.Alunos;

public class TelaInfoSalas extends javax.swing.JInternalFrame {
    private ControllerSalas controllerSalas;
    private ControllerAlunos controllerAlunos;
    private List<Alunos> alunos;
    GerenteJanelas gerenteJanela;
    DefaultListModel listModel;
    Sala sala;
    
    public TelaInfoSalas(Sala sala) {
        initComponents();
        controllerSalas = new ControllerSalas();
        controllerAlunos = new ControllerAlunos();
        listModel = new DefaultListModel();
        this.sala = sala;
        gerenteJanela = new GerenteJanelas(TelaPrincipal.jPanelOverview);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        jTextFieldCapacidadeMaxima.setDocument(new JTextFieldOnlyNumbers());
        jTextFieldNomeSala.setText(sala.getName());
        jTextFieldCapacidadeMaxima.setText(Integer.toString(sala.getCapacidadeMax()));
        jListAlunos.setModel(listModel);
        alunos = controllerAlunos.searchBySala(sala);
        if(alunos != null){
            for(Alunos aluno : alunos){
                listModel.addElement(aluno.getNomeCompleto());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddSala = new javax.swing.JPanel();
        Alunos = new javax.swing.JScrollPane();
        jListAlunos = new javax.swing.JList<>();
        jButtonDeletar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldNomeSala = new javax.swing.JTextField();
        jTextFieldCapacidadeMaxima = new javax.swing.JTextField();
        jLabelBackgroud = new javax.swing.JLabel();

        setBorder(null);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAddSala.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAddSala.setForeground(new java.awt.Color(255, 255, 255));
        jPanelAddSala.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Alunos.setBorder(null);
        Alunos.setColumnHeaderView(null);
        Alunos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jListAlunos.setBackground(new java.awt.Color(241, 242, 244));
        jListAlunos.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jListAlunos.setForeground(new java.awt.Color(24, 33, 53));
        jListAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListAlunos.setSelectionBackground(new java.awt.Color(83, 116, 239));
        jListAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAlunosMouseClicked(evt);
            }
        });
        Alunos.setViewportView(jListAlunos);

        jPanelAddSala.add(Alunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 178, 321, 272));

        jButtonDeletar.setBorder(null);
        jButtonDeletar.setContentAreaFilled(false);
        jButtonDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        jPanelAddSala.add(jButtonDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 160, 40));

        jButtonEditar.setBorder(null);
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelAddSala.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, 40));

        jTextFieldNomeSala.setBackground(new java.awt.Color(241, 242, 244));
        jTextFieldNomeSala.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jTextFieldNomeSala.setForeground(new java.awt.Color(24, 33, 53));
        jTextFieldNomeSala.setToolTipText("");
        jTextFieldNomeSala.setBorder(null);
        jPanelAddSala.add(jTextFieldNomeSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 55, 320, 20));

        jTextFieldCapacidadeMaxima.setBackground(new java.awt.Color(241, 242, 244));
        jTextFieldCapacidadeMaxima.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jTextFieldCapacidadeMaxima.setForeground(new java.awt.Color(24, 33, 53));
        jTextFieldCapacidadeMaxima.setToolTipText("");
        jTextFieldCapacidadeMaxima.setBorder(null);
        jPanelAddSala.add(jTextFieldCapacidadeMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 118, 80, 20));

        jLabelBackgroud.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/TelaInfoSala.png"))); // NOI18N
        jPanelAddSala.add(jLabelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 540));

        getContentPane().add(jPanelAddSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        controllerSalas.delete(sala);
        /*alunos = controllerAlunos.searchBySala(sala);
        for (Alunos aluno : alunos){
            aluno.setSala();
        }*/
        gerenteJanela.abrirJanelas(new TelaSalas());
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        controllerSalas.update(sala, jTextFieldNomeSala.getText(), jTextFieldCapacidadeMaxima.getText());
        gerenteJanela.abrirJanelas(new TelaSalas());
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jListAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAlunosMouseClicked
        //DefaultListModel<E> = (DefaultListModel) jListAnoLetivo.getModel();
        /*try {
            String data = jListAnoLetivo.getSelectedValue();
            Sala sala = ControllerSalas.shearchByName(data);
            infoSalas.abrirJanelas(new TelaInfoSalas(sala, listaModel));
            //jLabelText.setText(sala.getName());
        } catch (Exception e) {
            //Exception Empty list
        }*/
    }//GEN-LAST:event_jListAlunosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Alunos;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabelBackgroud;
    private javax.swing.JList<String> jListAlunos;
    private javax.swing.JPanel jPanelAddSala;
    private javax.swing.JTextField jTextFieldCapacidadeMaxima;
    private javax.swing.JTextField jTextFieldNomeSala;
    // End of variables declaration//GEN-END:variables
}
