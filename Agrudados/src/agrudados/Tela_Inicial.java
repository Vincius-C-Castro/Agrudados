package agrudados;

import telas.Ajuda;
import javax.swing.ImageIcon;


public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public Tela_Inicial() {
       this.carregarIconeAplicacao();
       this.setExtendedState(NORMAL);
       this.setUndecorated(false);
       initComponents();

    }
    private void carregarIconeAplicacao(){
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(getClass().getResource("/imagens/agrudadosIco.png"));
        this.setIconImage(imageIcon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        telaFundo = new javax.swing.JPanel();
        labelImagemFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout jDesktopPane1Layout = new org.jdesktop.layout.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jDesktopPane2Layout = new org.jdesktop.layout.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("jMenu11");

        jMenu12.setText("File");
        jMenuBar5.add(jMenu12);

        jMenu13.setText("Edit");
        jMenuBar5.add(jMenu13);

        jMenu14.setText("File");
        jMenuBar6.add(jMenu14);

        jMenu15.setText("Edit");
        jMenuBar6.add(jMenu15);

        jMenu16.setText("File");
        jMenuBar7.add(jMenu16);

        jMenu17.setText("Edit");
        jMenuBar7.add(jMenu17);

        jMenu6.setText("File");
        jMenuBar8.add(jMenu6);

        jMenu18.setText("Edit");
        jMenuBar8.add(jMenu18);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agrudados");
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);
        setFocusable(false);
        setName(""); // NOI18N
        setResizable(false);

        telaFundo.setBackground(new java.awt.Color(51, 51, 51));
        telaFundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaInicialfinal.jpg"))); // NOI18N

        org.jdesktop.layout.GroupLayout telaFundoLayout = new org.jdesktop.layout.GroupLayout(telaFundo);
        telaFundo.setLayout(telaFundoLayout);
        telaFundoLayout.setHorizontalGroup(
            telaFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(telaFundoLayout.createSequentialGroup()
                .add(labelImagemFundo)
                .add(0, 0, Short.MAX_VALUE))
        );
        telaFundoLayout.setVerticalGroup(
            telaFundoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(telaFundoLayout.createSequentialGroup()
                .add(labelImagemFundo)
                .add(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(new java.awt.Color(222, 52, 52));
        jMenuBar1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(2, 4));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(507, 35));

        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sum.png"))); // NOI18N
        jMenu1.setText("   Medidas de tendências");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 100));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/font.png"))); // NOI18N
        jMenuItem2.setText("Central e Dispersão");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_view_tile.png"))); // NOI18N
        jMenu2.setText("Gráficos e Tabelas");
        jMenu2.setFocusCycleRoot(true);
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(157, 19));

        jMenuItem3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_bar.png"))); // NOI18N
        jMenuItem3.setText("Analise de dados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        jMenu3.setText("Sobre");
        jMenu3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        jMenuItem4.setText("Formulas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(telaFundo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(telaFundo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Tela_DistribuicaoDeFrequencia tela4 = new Tela_DistribuicaoDeFrequencia();
        labelImagemFundo.add(tela4);
        tela4.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Tela_MedidasDeTendencia tela = new Tela_MedidasDeTendencia();
        labelImagemFundo.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     Ajuda tela5 = new Ajuda();
     labelImagemFundo.add(tela5);
     tela5.setVisible(true);
     
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_Inicial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    javax.swing.JComboBox<String> jComboBox1;
    javax.swing.JDesktopPane jDesktopPane1;
    javax.swing.JDesktopPane jDesktopPane2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu10;
    javax.swing.JMenu jMenu11;
    javax.swing.JMenu jMenu12;
    javax.swing.JMenu jMenu13;
    javax.swing.JMenu jMenu14;
    javax.swing.JMenu jMenu15;
    javax.swing.JMenu jMenu16;
    javax.swing.JMenu jMenu17;
    javax.swing.JMenu jMenu18;
    javax.swing.JMenu jMenu2;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenu jMenu4;
    javax.swing.JMenu jMenu5;
    javax.swing.JMenu jMenu6;
    javax.swing.JMenu jMenu7;
    javax.swing.JMenu jMenu8;
    javax.swing.JMenu jMenu9;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuBar jMenuBar2;
    javax.swing.JMenuBar jMenuBar3;
    javax.swing.JMenuBar jMenuBar4;
    javax.swing.JMenuBar jMenuBar5;
    javax.swing.JMenuBar jMenuBar6;
    javax.swing.JMenuBar jMenuBar7;
    javax.swing.JMenuBar jMenuBar8;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JMenuItem jMenuItem3;
    javax.swing.JMenuItem jMenuItem4;
    javax.swing.JPopupMenu jPopupMenu1;
    javax.swing.JLabel labelImagemFundo;
    java.awt.Menu menu1;
    java.awt.Menu menu2;
    java.awt.MenuBar menuBar1;
    javax.swing.JPanel telaFundo;
    // End of variables declaration//GEN-END:variables
}
