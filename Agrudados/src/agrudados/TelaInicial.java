package agrudados;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class TelaInicial extends javax.swing.JFrame {


    /***
     * Construtor da classe TelaInicial.
     * Inicializa os componentes da tela.
     */
    public TelaInicial() {
        this.carregarIconeAplicacao();
        this.setExtendedState(NORMAL);
        this.setUndecorated(false);
        initComponents();

    }

    /***
     * Método utilizado para carregar o ícone da aplicação.
     */
    private void carregarIconeAplicacao() {
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(getClass().getResource("/imagens/agrudadosIco.png"));
        this.setIconImage(imageIcon.getImage());
    }
    
    /***
     * Inicialização dos componentes. 
     */
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
        medTend = new javax.swing.JMenu();
        itemCentralDispersao = new javax.swing.JMenuItem();
        graficosETabela = new javax.swing.JMenu();
        itemAnaliseDados = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();
        itemFormulas = new javax.swing.JMenuItem();

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

        medTend.setBorder(new javax.swing.border.MatteBorder(null));
        medTend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sum.png"))); // NOI18N
        medTend.setText("   Medidas de tendências");
        medTend.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        medTend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medTend.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        medTend.setPreferredSize(new java.awt.Dimension(200, 100));

        itemCentralDispersao.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        itemCentralDispersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/font.png"))); // NOI18N
        itemCentralDispersao.setText("Central e Dispersão");
        itemCentralDispersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCentralDispersaoActionPerformed(evt);
            }
        });
        medTend.add(itemCentralDispersao);

        jMenuBar1.add(medTend);

        graficosETabela.setBorder(new javax.swing.border.MatteBorder(null));
        graficosETabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_view_tile.png"))); // NOI18N
        graficosETabela.setText("Gráficos e Tabelas");
        graficosETabela.setFocusCycleRoot(true);
        graficosETabela.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        graficosETabela.setPreferredSize(new java.awt.Dimension(157, 19));

        itemAnaliseDados.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        itemAnaliseDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_bar.png"))); // NOI18N
        itemAnaliseDados.setText("Analise de dados");
        itemAnaliseDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAnaliseDadosActionPerformed(evt);
            }
        });
        graficosETabela.add(itemAnaliseDados);

        jMenuBar1.add(graficosETabela);

        sobre.setBorder(new javax.swing.border.MatteBorder(null));
        sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        sobre.setText("Sobre");
        sobre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        itemFormulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        itemFormulas.setText("Formulas");
        itemFormulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFormulasActionPerformed(evt);
            }
        });
        sobre.add(itemFormulas);

        jMenuBar1.add(sobre);

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

    /***
     * Exibição da tela de distribuição de freqências.
     * @param evt 
     */
    private void itemAnaliseDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAnaliseDadosActionPerformed

        TelaAnaliseDeDados telaDistFreq = new TelaAnaliseDeDados();
        labelImagemFundo.add(telaDistFreq);
        telaDistFreq.setVisible(true);
    }//GEN-LAST:event_itemAnaliseDadosActionPerformed

    /***
     * Exibição da tela de medidas de tendências.
     * @param evt 
     */
    private void itemCentralDispersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCentralDispersaoActionPerformed
        // TODO add your handling code here:
        TelaMedidasDeTendencia telaMedTendencia = new TelaMedidasDeTendencia();
        labelImagemFundo.add(telaMedTendencia);
        telaMedTendencia.setVisible(true);
    }//GEN-LAST:event_itemCentralDispersaoActionPerformed

    /***
     * Exibição da tela de fórmulas.
     * @param evt 
     */
    private void itemFormulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFormulasActionPerformed
     TelaFormulas telaAjuda = new TelaFormulas();
     labelImagemFundo.add(telaAjuda);
     telaAjuda.setVisible(true);

    }//GEN-LAST:event_itemFormulasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Inicia as cores para o Nimbus Look and Feel */
        UIManager.put( "control", new Color( 128, 128, 128) );
        UIManager.put( "info", new Color(128,128,128) );
        UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
        UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
        UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
        UIManager.put( "nimbusFocus", new Color(115,164,209) );
        UIManager.put( "nimbusGreen", new Color(176,179,50) );
        UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
        UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
        UIManager.put( "nimbusOrange", new Color(191,98,4) );
        UIManager.put( "nimbusRed", new Color(169,46,34) );
        UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
        UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
        UIManager.put( "text", new Color( 230, 230, 230) );
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenu graficosETabela;
    javax.swing.JMenuItem itemAnaliseDados;
    javax.swing.JMenuItem itemCentralDispersao;
    javax.swing.JMenuItem itemFormulas;
    javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    javax.swing.JComboBox<String> jComboBox1;
    javax.swing.JDesktopPane jDesktopPane1;
    javax.swing.JDesktopPane jDesktopPane2;
    javax.swing.JMenu jMenu10;
    javax.swing.JMenu jMenu11;
    javax.swing.JMenu jMenu12;
    javax.swing.JMenu jMenu13;
    javax.swing.JMenu jMenu14;
    javax.swing.JMenu jMenu15;
    javax.swing.JMenu jMenu16;
    javax.swing.JMenu jMenu17;
    javax.swing.JMenu jMenu18;
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
    javax.swing.JPopupMenu jPopupMenu1;
    javax.swing.JLabel labelImagemFundo;
    javax.swing.JMenu medTend;
    java.awt.Menu menu1;
    java.awt.Menu menu2;
    java.awt.MenuBar menuBar1;
    javax.swing.JMenu sobre;
    javax.swing.JPanel telaFundo;
    // End of variables declaration//GEN-END:variables
}
