package views.Aluno;
import controllers.Views.GerenteJanelas;
import models.Registros.Alunos;
import models.Registros.Contatos.Contatos;
import models.Registros.Endereco;

public class TelaInfoAluno extends javax.swing.JInternalFrame {
    private GerenteJanelas gerenteDeJanelas;
    private Alunos aluno;
    private Contatos contato;
    private Endereco endereco;
    
    public TelaInfoAluno(Alunos aluno) {
        initComponents();
        this.aluno = aluno;
        this.contato = aluno.getContatos();
        this.endereco = aluno.getEndereco();
        this.gerenteDeJanelas = new GerenteJanelas(TelaPrincipalAluno.jPanelOverview);
        jLabelOutCPF.setText(aluno.getCadastroPessoaFisica());
        //jLabelOutEmail.setText(contato.get);
        jLabelOutMatricula.setText(aluno.getSenha());
        jLabelOutNomeCompleto.setText(aluno.getNomeCompleto());
        jLabelOutResponsaveis.setText(aluno.getResponsaveis());
        //jLabelOutTelefone.setText(aluno.get);
        jLabelOutTurma.setText(aluno.getSala().getName());
        jTextAreaContatos.setText(endereco.getCIDADE()+"\n"+endereco.getUF()+"\n"+
                endereco.getCEP()+"\n"+endereco.getBAIRRO()+"\n"+endereco.getRUA()+"\n"+
                endereco.getNUMERO()+"\n"+endereco.getCOMPLEMENTO());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroud = new javax.swing.JPanel();
        jButtonRetornar = new javax.swing.JButton();
        jLabelTytleEmail = new javax.swing.JLabel();
        jLabelTytleResponsaveis = new javax.swing.JLabel();
        jLabelTytleCPF = new javax.swing.JLabel();
        jLabelTytleTelefone = new javax.swing.JLabel();
        jLabelTytleMatricula = new javax.swing.JLabel();
        jLabelTytleNomeCompleto5 = new javax.swing.JLabel();
        jLabelOutEmail = new javax.swing.JLabel();
        jLabelOutResponsaveis = new javax.swing.JLabel();
        jLabelOutCPF = new javax.swing.JLabel();
        jLabelOutTelefone = new javax.swing.JLabel();
        jLabelOutMatricula = new javax.swing.JLabel();
        jLabelOutNomeCompleto = new javax.swing.JLabel();
        jLabelTytleTurma = new javax.swing.JLabel();
        jLabelOutTurma = new javax.swing.JLabel();
        jLabelTytleEndereço = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaContatos = new javax.swing.JTextArea();
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

        jLabelTytleEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleEmail.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleEmail.setText("Email");
        jPanelBackgroud.add(jLabelTytleEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 20));

        jLabelTytleResponsaveis.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleResponsaveis.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleResponsaveis.setText("Responsavéis");
        jPanelBackgroud.add(jLabelTytleResponsaveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 20));

        jLabelTytleCPF.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleCPF.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleCPF.setText("CPF");
        jPanelBackgroud.add(jLabelTytleCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 100, 20));

        jLabelTytleTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleTelefone.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleTelefone.setText("Telefone");
        jPanelBackgroud.add(jLabelTytleTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 20));

        jLabelTytleMatricula.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleMatricula.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleMatricula.setText("Matrícula");
        jPanelBackgroud.add(jLabelTytleMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 100, 20));

        jLabelTytleNomeCompleto5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleNomeCompleto5.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleNomeCompleto5.setText("Nome completo ");
        jPanelBackgroud.add(jLabelTytleNomeCompleto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 20));

        jLabelOutEmail.setBackground(new java.awt.Color(187, 187, 187));
        jLabelOutEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelOutEmail.setForeground(java.awt.Color.black);
        jLabelOutEmail.setOpaque(true);
        jPanelBackgroud.add(jLabelOutEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 320, 30));

        jLabelOutResponsaveis.setBackground(new java.awt.Color(187, 187, 187));
        jLabelOutResponsaveis.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelOutResponsaveis.setForeground(java.awt.Color.black);
        jLabelOutResponsaveis.setOpaque(true);
        jPanelBackgroud.add(jLabelOutResponsaveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 320, 30));

        jLabelOutCPF.setBackground(new java.awt.Color(187, 187, 187));
        jLabelOutCPF.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelOutCPF.setForeground(java.awt.Color.black);
        jLabelOutCPF.setOpaque(true);
        jPanelBackgroud.add(jLabelOutCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 320, 30));

        jLabelOutTelefone.setBackground(new java.awt.Color(187, 187, 187));
        jLabelOutTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelOutTelefone.setForeground(java.awt.Color.black);
        jLabelOutTelefone.setOpaque(true);
        jPanelBackgroud.add(jLabelOutTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 320, 30));

        jLabelOutMatricula.setBackground(new java.awt.Color(187, 187, 187));
        jLabelOutMatricula.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelOutMatricula.setForeground(java.awt.Color.black);
        jLabelOutMatricula.setOpaque(true);
        jPanelBackgroud.add(jLabelOutMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 320, 30));

        jLabelOutNomeCompleto.setBackground(new java.awt.Color(187, 187, 187));
        jLabelOutNomeCompleto.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelOutNomeCompleto.setForeground(java.awt.Color.black);
        jLabelOutNomeCompleto.setOpaque(true);
        jPanelBackgroud.add(jLabelOutNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 320, 30));

        jLabelTytleTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleTurma.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleTurma.setText("Turma");
        jPanelBackgroud.add(jLabelTytleTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 100, 20));

        jLabelOutTurma.setBackground(new java.awt.Color(187, 187, 187));
        jLabelOutTurma.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelOutTurma.setForeground(java.awt.Color.black);
        jLabelOutTurma.setOpaque(true);
        jPanelBackgroud.add(jLabelOutTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 320, 30));

        jLabelTytleEndereço.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelTytleEndereço.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTytleEndereço.setText("Endereço");
        jPanelBackgroud.add(jLabelTytleEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 130, 20));

        jScrollPane1.setBackground(new java.awt.Color(187, 187, 187));
        jScrollPane1.setBorder(null);

        jTextAreaContatos.setBackground(new java.awt.Color(187, 187, 187));
        jTextAreaContatos.setColumns(20);
        jTextAreaContatos.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jTextAreaContatos.setForeground(new java.awt.Color(24, 33, 53));
        jTextAreaContatos.setRows(5);
        jTextAreaContatos.setBorder(null);
        jScrollPane1.setViewportView(jTextAreaContatos);

        jPanelBackgroud.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 510, 540));

        backgroudInfoAluno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backgroudInfoAluno.setForeground(new java.awt.Color(0, 0, 0));
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
    private javax.swing.JLabel jLabelOutCPF;
    private javax.swing.JLabel jLabelOutEmail;
    private javax.swing.JLabel jLabelOutMatricula;
    private javax.swing.JLabel jLabelOutNomeCompleto;
    private javax.swing.JLabel jLabelOutResponsaveis;
    private javax.swing.JLabel jLabelOutTelefone;
    private javax.swing.JLabel jLabelOutTurma;
    private javax.swing.JLabel jLabelTytleCPF;
    private javax.swing.JLabel jLabelTytleEmail;
    private javax.swing.JLabel jLabelTytleEndereço;
    private javax.swing.JLabel jLabelTytleMatricula;
    private javax.swing.JLabel jLabelTytleNomeCompleto5;
    private javax.swing.JLabel jLabelTytleResponsaveis;
    private javax.swing.JLabel jLabelTytleTelefone;
    private javax.swing.JLabel jLabelTytleTurma;
    private javax.swing.JPanel jPanelBackgroud;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaContatos;
    // End of variables declaration//GEN-END:variables
}
