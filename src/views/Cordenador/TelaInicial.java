package views.Cordenador;

public class TelaInicial extends javax.swing.JInternalFrame {
    private static TelaInicial telaDasSalas;
    
    public static TelaInicial getInstancia(){
        if(telaDasSalas == null){
            telaDasSalas = new TelaInicial();
        }
        return telaDasSalas;
    }
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroud = new javax.swing.JPanel();
        jLabelTelaInicial = new javax.swing.JLabel();

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

        jPanelBackgroud.setBackground(new java.awt.Color(79, 102, 216));
        jPanelBackgroud.setForeground(new java.awt.Color(231, 239, 248));

        jLabelTelaInicial.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelTelaInicial.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/telaInicial.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBackgroudLayout = new javax.swing.GroupLayout(jPanelBackgroud);
        jPanelBackgroud.setLayout(jPanelBackgroudLayout);
        jPanelBackgroudLayout.setHorizontalGroup(
            jPanelBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroudLayout.createSequentialGroup()
                .addComponent(jLabelTelaInicial)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelBackgroudLayout.setVerticalGroup(
            jPanelBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroudLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabelTelaInicial)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTelaInicial;
    private javax.swing.JPanel jPanelBackgroud;
    // End of variables declaration//GEN-END:variables
}
