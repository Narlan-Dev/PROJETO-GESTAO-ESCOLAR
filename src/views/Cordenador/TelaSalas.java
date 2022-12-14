package views.Cordenador;
import controllers.Salas.ControllerSalas;
import controllers.Views.GerenteJanelas;
import controllers.Views.IconListRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import models.Coordenador.Sala;

public class TelaSalas extends javax.swing.JInternalFrame {
    //private static TelaSalas telaDasSalas;
    GerenteJanelas infoSalas;
    GerenteJanelas addSalas;
    DefaultListModel listaModel = new DefaultListModel();
    
    /*public static TelaSalas getInstancia(){
        if(telaDasSalas == null){
            telaDasSalas = new TelaSalas();
        }
        return telaDasSalas;
    }*/
    
    public TelaSalas() {
        initComponents();
        this.infoSalas = new GerenteJanelas(jPanelInfoSalas);
        this.addSalas = new GerenteJanelas(TelaPrincipal.jPanelOverview);
        jListAnoLetivo.setModel(listaModel);
        ControllerSalas.updateAllList(listaModel);
        jListAnoLetivo.setCellRenderer(new IconListRenderer(ControllerSalas.getMap()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroud = new javax.swing.JPanel();
        jButtonAdicionarSala = new javax.swing.JButton();
        jPanelInfoSalas = new javax.swing.JPanel();
        jLabelText = new javax.swing.JLabel();
        AnoLetivo = new javax.swing.JScrollPane();
        jListAnoLetivo = new javax.swing.JList<>();
        backgroudCadastro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 255));
        setMaximizable(true);
        setResizable(true);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1050, 790));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackgroud.setBackground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud.setForeground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarSala.setBorder(null);
        jButtonAdicionarSala.setContentAreaFilled(false);
        jButtonAdicionarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarSalaActionPerformed(evt);
            }
        });
        jPanelBackgroud.add(jButtonAdicionarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 180, 60));

        jPanelInfoSalas.setOpaque(false);

        jLabelText.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelText.setForeground(new java.awt.Color(24, 33, 53));
        jPanelInfoSalas.add(jLabelText);

        jPanelBackgroud.add(jPanelInfoSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 350, 570));

        AnoLetivo.setBorder(null);
        AnoLetivo.setColumnHeaderView(null);
        AnoLetivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jListAnoLetivo.setBackground(new java.awt.Color(245, 247, 251));
        jListAnoLetivo.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jListAnoLetivo.setForeground(new java.awt.Color(24, 33, 53));
        jListAnoLetivo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sala 1", "Sala 2", "Sala 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAnoLetivo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListAnoLetivo.setSelectionBackground(new java.awt.Color(83, 116, 239));
        jListAnoLetivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAnoLetivoMouseClicked(evt);
            }
        });
        AnoLetivo.setViewportView(jListAnoLetivo);

        jPanelBackgroud.add(AnoLetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 610, 530));

        backgroudCadastro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backgroudCadastro.setForeground(new java.awt.Color(0, 0, 0));
        backgroudCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/telaSalas.png"))); // NOI18N
        jPanelBackgroud.add(backgroudCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, 758));

        getContentPane().add(jPanelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //DefaultListModel m = new DefaultListModel();
    
    private void jButtonAdicionarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarSalaActionPerformed
        addSalas.abrirJanelas(new TelaAddSalas());
    }//GEN-LAST:event_jButtonAdicionarSalaActionPerformed

    private void jListAnoLetivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAnoLetivoMouseClicked
        //DefaultListModel<E> = (DefaultListModel) jListAnoLetivo.getModel();
        String data = jListAnoLetivo.getSelectedValue();
        Sala sala = ControllerSalas.shearchByName(data);
        infoSalas.abrirJanelas(new TelaInfoSalas(sala, listaModel));
        //jLabelText.setText(sala.getName());
    }//GEN-LAST:event_jListAnoLetivoMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AnoLetivo;
    private javax.swing.JLabel backgroudCadastro;
    private javax.swing.JButton jButtonAdicionarSala;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JList<String> jListAnoLetivo;
    private javax.swing.JPanel jPanelBackgroud;
    private javax.swing.JPanel jPanelInfoSalas;
    // End of variables declaration//GEN-END:variables
}
