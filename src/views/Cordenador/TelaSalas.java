package views.Cordenador;

public class TelaSalas extends javax.swing.JInternalFrame {
    private static TelaSalas telaDasSalas;
    
    public static TelaSalas getInstancia(){
        if(telaDasSalas == null){
            telaDasSalas = new TelaSalas();
        }
        return telaDasSalas;
    }
    public TelaSalas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroud = new javax.swing.JPanel();
        jLabelTeste = new javax.swing.JLabel();

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

        jLabelTeste.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelTeste.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTeste.setText("SALAS");

        javax.swing.GroupLayout jPanelBackgroudLayout = new javax.swing.GroupLayout(jPanelBackgroud);
        jPanelBackgroud.setLayout(jPanelBackgroudLayout);
        jPanelBackgroudLayout.setHorizontalGroup(
            jPanelBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroudLayout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(jLabelTeste)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanelBackgroudLayout.setVerticalGroup(
            jPanelBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTeste)
                .addContainerGap(726, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTeste;
    private javax.swing.JPanel jPanelBackgroud;
    // End of variables declaration//GEN-END:variables
}
