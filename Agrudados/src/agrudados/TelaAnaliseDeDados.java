package agrudados;

import estatistica.Calculos;
import estatistica.DistribuicaoDeFrequencias;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import modelostabelas.ElementosModel;
import modelostabelas.elementos;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

/**
 *
 * @author Willian
 */
public class TelaAnaliseDeDados extends javax.swing.JInternalFrame {

    /**
     * Instancia dos modelos das tabelas construídas nesta tela.
     */
    String[] colunas = {""};
    ElementosModel modeloTabela = new ElementosModel(colunas);
    DefaultTableModel modelDefault = new DefaultTableModel();


    /**
     * Construtor da classe.
     * Inicializa os componetes.
     */
    public TelaAnaliseDeDados() {

        initComponents();
        tabelaElementos.setModel(modeloTabela);
        tabelaDistFreq.setModel(modelDefault);
        modelDefault.addColumn("  Classes  ");
        modelDefault.addColumn("Frequência");
        modelDefault.addColumn("Freq. Acumulada");
        modelDefault.addColumn("Freq. Absoluta");
        modelDefault.addColumn("Freq. Abs. Acum.");

    }

    /**
     * Inicialização dos objetos.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        painelAnaliseDados = new javax.swing.JPanel();
        barraFerramenta = new javax.swing.JToolBar();
        btnHistograma = new javax.swing.JButton();
        btnOgiva = new javax.swing.JButton();
        btnPoligono = new javax.swing.JButton();
        panelElementosConjunto = new javax.swing.JPanel();
        botaoAlterarDist = new javax.swing.JButton();
        botaoExcluirDist = new javax.swing.JButton();
        botaoCalcularDist = new javax.swing.JButton();
        caixaDeTextoDist = new javax.swing.JTextField();
        botaoEnviarDist = new javax.swing.JButton();
        distInfoLabel = new javax.swing.JLabel();
        btnDeleteConj = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaElementos = new javax.swing.JTable();
        tipoFrequencia = new javax.swing.JPanel();
        freqAbsoluta = new javax.swing.JRadioButton();
        freqRelativa = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDistFreq = new javax.swing.JTable();
        painelGrafico = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_view_tile.png"))); // NOI18N
        setOpaque(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        painelAnaliseDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        barraFerramenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de gráfico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        barraFerramenta.setFloatable(false);

        btnHistograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_bar.png"))); // NOI18N
        btnHistograma.setText("Histograma");
        btnHistograma.setFocusable(false);
        btnHistograma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistograma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistogramaActionPerformed(evt);
            }
        });
        barraFerramenta.add(btnHistograma);

        btnOgiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_line.png"))); // NOI18N
        btnOgiva.setText("Ogiva");
        btnOgiva.setFocusable(false);
        btnOgiva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOgiva.setMaximumSize(new java.awt.Dimension(78, 48));
        btnOgiva.setMinimumSize(new java.awt.Dimension(78, 48));
        btnOgiva.setPreferredSize(new java.awt.Dimension(78, 48));
        btnOgiva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOgiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgivaActionPerformed(evt);
            }
        });
        barraFerramenta.add(btnOgiva);

        btnPoligono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chart_curve.png"))); // NOI18N
        btnPoligono.setText("Polígono");
        btnPoligono.setFocusable(false);
        btnPoligono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPoligono.setMaximumSize(new java.awt.Dimension(78, 48));
        btnPoligono.setMinimumSize(new java.awt.Dimension(78, 48));
        btnPoligono.setPreferredSize(new java.awt.Dimension(78, 48));
        btnPoligono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoligonoActionPerformed(evt);
            }
        });
        barraFerramenta.add(btnPoligono);

        panelElementosConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elementos do conjunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        botaoAlterarDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_edit.png"))); // NOI18N
        botaoAlterarDist.setText("Alterar");
        botaoAlterarDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarDistActionPerformed(evt);
            }
        });

        botaoExcluirDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_delete.png"))); // NOI18N
        botaoExcluirDist.setText("Excluir");
        botaoExcluirDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirDistActionPerformed(evt);
            }
        });

        botaoCalcularDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table.png"))); // NOI18N
        botaoCalcularDist.setText("Montar Tabela");
        botaoCalcularDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularDistActionPerformed(evt);
            }
        });

        caixaDeTextoDist.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaDeTextoDist.setOpaque(false);
        caixaDeTextoDist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaDeTextoDistKeyPressed(evt);
            }
        });

        botaoEnviarDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_go.png"))); // NOI18N
        botaoEnviarDist.setText("Enviar");
        botaoEnviarDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarDistActionPerformed(evt);
            }
        });

        distInfoLabel.setForeground(java.awt.Color.red);

        btnDeleteConj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btnDeleteConj.setText("Deletar conjunto");
        btnDeleteConj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteConjActionPerformed(evt);
            }
        });

        btnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_sort.png"))); // NOI18N
        btnOrdenar.setText("Ordenar tabela");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Elementos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabelaElementos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaElementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaElementos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaElementosKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaElementos);
        if (tabelaElementos.getColumnModel().getColumnCount() > 0) {
            tabelaElementos.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelElementosConjuntoLayout = new javax.swing.GroupLayout(panelElementosConjunto);
        panelElementosConjunto.setLayout(panelElementosConjuntoLayout);
        panelElementosConjuntoLayout.setHorizontalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                        .addComponent(distInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelElementosConjuntoLayout.createSequentialGroup()
                        .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                                .addComponent(caixaDeTextoDist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoEnviarDist, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                                .addComponent(botaoCalcularDist, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluirDist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAlterarDist, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelElementosConjuntoLayout.createSequentialGroup()
                        .addComponent(btnDeleteConj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenar)
                        .addGap(100, 100, 100)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelElementosConjuntoLayout.setVerticalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEnviarDist)
                    .addComponent(caixaDeTextoDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(distInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluirDist)
                    .addComponent(botaoAlterarDist)
                    .addComponent(botaoCalcularDist))
                .addGap(18, 18, 18)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteConj)
                    .addComponent(btnOrdenar))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tipoFrequencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de frequência", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        freqAbsoluta.setText("Absoluta");
        freqAbsoluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freqAbsolutaActionPerformed(evt);
            }
        });

        freqRelativa.setSelected(true);
        freqRelativa.setText("Relativa");
        freqRelativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freqRelativaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tipoFrequenciaLayout = new javax.swing.GroupLayout(tipoFrequencia);
        tipoFrequencia.setLayout(tipoFrequenciaLayout);
        tipoFrequenciaLayout.setHorizontalGroup(
            tipoFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoFrequenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(freqRelativa)
                .addGap(18, 18, 18)
                .addComponent(freqAbsoluta)
                .addContainerGap())
        );
        tipoFrequenciaLayout.setVerticalGroup(
            tipoFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipoFrequenciaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(tipoFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freqRelativa)
                    .addComponent(freqAbsoluta))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Distribuião de frequências", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabelaDistFreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Classe", "Frequência", "Freq. Acumulada", "Freq. Absoluta", "Freq. Absol. Acum."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDistFreq.setName(""); // NOI18N
        tabelaDistFreq.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaDistFreq);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráfico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelAnaliseDadosLayout = new javax.swing.GroupLayout(painelAnaliseDados);
        painelAnaliseDados.setLayout(painelAnaliseDadosLayout);
        painelAnaliseDadosLayout.setHorizontalGroup(
            painelAnaliseDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAnaliseDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAnaliseDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAnaliseDadosLayout.createSequentialGroup()
                        .addComponent(panelElementosConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAnaliseDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelAnaliseDadosLayout.createSequentialGroup()
                        .addComponent(barraFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipoFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelAnaliseDadosLayout.setVerticalGroup(
            painelAnaliseDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAnaliseDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAnaliseDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAnaliseDadosLayout.createSequentialGroup()
                        .addComponent(panelElementosConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelAnaliseDadosLayout.createSequentialGroup()
                        .addGroup(painelAnaliseDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(barraFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipoFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAnaliseDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAnaliseDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("telaDadosAgrupados");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método chamado ao clicar no botão Histograma.
     * Exibe o histograma utilizando os dados inseridos na tabela.
     * @param evt 
     */
    private void btnHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistogramaActionPerformed

        try {
            // Remove os componentes dependentes do painelGrafico.
            painelGrafico.removeAll();
            
            // Cria a nova tela que ficará contido o gráfico.
            JInternalFrame frame = new JInternalFrame();
            frame.setResizable(false);
            
            // Remove as bordas da nova tela criada.
            ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null);
            frame.setBorder(null);
            
            // Adiciona a tela criada no painelGrafico.
            painelGrafico.add(frame);

            /**
             * Criação do painel que herdará o gráfico.
             */
            JPanel raiz = new JPanel();
            raiz.setLayout(new BorderLayout());
            Dimension tamanho = new Dimension(590, 470);
            raiz.setPreferredSize(tamanho);
            raiz.setMinimumSize(tamanho);
            frame.add(raiz);
            frame.pack();

            // Posiciona no local adequado.
            frame.setLocation(7, 20);

            // Cria o painel aonde o gráfico será mostrado.
            JPanel primeiroGrafico = new JPanel();
            Dimension tamanhoArea = new Dimension(590, 470);
            primeiroGrafico.setPreferredSize(tamanhoArea);
            primeiroGrafico.setMinimumSize(tamanhoArea);
            raiz.add(primeiroGrafico, BorderLayout.CENTER);
            Calculos calc = new Calculos();

            // Obtém o tamanho da tabela.
            int tamTabela = tabelaElementos.getRowCount();
            
///* Vetor utilizado para testes. */
//            double value[] = {89.0, 68.0, 65.0, 61.0, 63.0, 63.0, 61.0, 61.0, 59.0, 60.0, 54.0, 55.0, 54.0, 49.0, 53.0, 55.0, 59.0, 50.0,
//                52.0, 48.0, 53.0, 46.0, 55.0, 57.0, 48.0, 47.0, 48.0, 46.0, 44.0, 50.0, 55.0, 48.0, 45.0, 44.0, 46.0, 46.0,
//                47.0, 41.0, 39.0, 41.0, 45.0, 44.0, 45.0, 43.0, 42.0, 42.0, 48.0, 43.0, 40.0, 39.0, 44.0, 37.0, 40.0, 45.0,
//                43.0, 37.0, 38.0, 38.0, 36.0, 34.0, 37.0, 36.0, 35.0, 35.0, 35.0, 40.0, 31.0, 34.0, 35.0, 39.0, 38.0, 32.0,
//                35.0, 32.0, 32.0, 32.0, 33.0, 33.0, 33.0, 32.0, 34.0, 31.0, 31.0, 30.0, 34.0, 32.0, 31.0, 27.0, 32.0, 26.0,
//                28.0, 29.0, 28.0, 29.0, 31.0, 27.0, 29.0, 28.0, 27.0, 30.0, 25.0, 23.0, 24.0, 26.0, 22.0, 25.0, 20.0, 21.0,
//                21.0, 22.0, 21.0, 24.0, 21.0, 17.0, 15.0, 18.0, 18.0, 15.0, 15.0,};

            double value[] = new double[tamTabela];

            // Obtém os dados inserídos na tabela.
            for (int i = 0; i < tamTabela; i++) {
                value[i] = Double.parseDouble(tabelaElementos.getValueAt(i, 0).toString());
            }
            // Ordena os valores.
            Arrays.sort(value);
            
            // Inicia os cálculos.
            calc.iserirDados(value, false);
            
            // Obtém o número de classes.
            int number = calc.getNumClasses();

            // String que armazenará o tipo de frequência.
            String yaxis;

            // Dados do histograma.
            HistogramDataset dataset = new HistogramDataset();

            /**
             * Define se deverá montar o gráfico utilizando frequência 
             * absoluta ou não;
             */
            if (freqAbsoluta.isSelected()) {
                dataset.setType(HistogramType.RELATIVE_FREQUENCY);
                yaxis = "Frequência Absoluta";
            } else {
                dataset.setType(HistogramType.FREQUENCY);
                yaxis = "Frequência Relativa";
            }

            // Adiciona a o vetor nos dados do histograma.
            dataset.addSeries("", value, number);

            // Título do gráfico.
            String plotTitle = "Histograma";
            
            // Nome do eixo X.
            String xaxis = "Dados";
            
            // Define o gráfico como vertical.
            PlotOrientation orientation = PlotOrientation.VERTICAL;

            boolean show = false;
            boolean toolTips = false;
            boolean urls = false;
            int tamX = 590;
            int tamY = 450;
            
            // Cria o gráfico.
            JFreeChart chart = ChartFactory.createHistogram(plotTitle, xaxis, yaxis,
                    dataset, orientation, show, toolTips, urls);
            
            // Define a cor de fundo do gráfico.
            chart.setBackgroundPaint(Color.GRAY);

            // Criação do painél do gráfico.
            ChartPanel chartPanel = new ChartPanel(chart, tamX, tamY, tamX,
                    tamY, tamX, tamY, urls, toolTips, show, urls, show, true);
            
            // Define a cor do painel.
            chartPanel.setBackground(Color.GRAY);

            // Adiciona o painel.
            primeiroGrafico.add(chartPanel);

            primeiroGrafico.validate();

            frame.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Se a tabela estiver vazia exibirá o erro.
            distInfoLabel.setText("Tabela Vazia!");
        }

    }//GEN-LAST:event_btnHistogramaActionPerformed

    /**
     * Método chamado ao precionar o botão Alterar.
     * Altera a linha selecionada na tabela.
     * @param evt 
     */
    private void botaoAlterarDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarDistActionPerformed

        if (tabelaElementos.getSelectedRow() != -1) {

            modeloTabela.setValueAt(caixaDeTextoDist.getText(), tabelaElementos.getSelectedRow(), 0);

        }
    }//GEN-LAST:event_botaoAlterarDistActionPerformed

    /**
     * Método chamado ao clicar no botão Excluir.
     * Exclúi a linha selecionada na tabela.
     * @param evt 
     */
    private void botaoExcluirDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirDistActionPerformed

        if (tabelaElementos.getSelectedRow() != -1) {

            modeloTabela.removeRow(tabelaElementos.getSelectedRow());
        }
    }//GEN-LAST:event_botaoExcluirDistActionPerformed

    /**
     * Método chamado ao clicar no botão Montar tabela.
     * Obtém os valores contidos na tabela de elemtos para montar a tabela
     * de distribuição de frequências.
     * @param evt 
     */
    private void botaoCalcularDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularDistActionPerformed

        try {
            // Obtém o tamanho da tabela.
            int tamTabela = tabelaElementos.getRowCount();
            Object[] novaLinha = {"", "", "", "", ""};
            double intervalo;
            double qtdeClasse;
            double menorValor;

            double valor[] = new double[tamTabela];
            /* Vetor utilizado para testes */
//            double valor[] = {89.0, 68.0, 65.0, 61.0, 63.0, 63.0, 61.0, 61.0, 59.0, 60.0, 54.0, 55.0, 54.0, 49.0, 53.0, 55.0, 59.0, 50.0,
//                52.0, 48.0, 53.0, 46.0, 55.0, 57.0, 48.0, 47.0, 48.0, 46.0, 44.0, 50.0, 55.0, 48.0, 45.0, 44.0, 46.0, 46.0,
//                47.0, 41.0, 39.0, 41.0, 45.0, 44.0, 45.0, 43.0, 42.0, 42.0, 48.0, 43.0, 40.0, 39.0, 44.0, 37.0, 40.0, 45.0,
//                43.0, 37.0, 38.0, 38.0, 36.0, 34.0, 37.0, 36.0, 35.0, 35.0, 35.0, 40.0, 31.0, 34.0, 35.0, 39.0, 38.0, 32.0,
//                35.0, 32.0, 32.0, 32.0, 33.0, 33.0, 33.0, 32.0, 34.0, 31.0, 31.0, 30.0, 34.0, 32.0, 31.0, 27.0, 32.0, 26.0,
//                28.0, 29.0, 28.0, 29.0, 31.0, 27.0, 29.0, 28.0, 27.0, 30.0, 25.0, 23.0, 24.0, 26.0, 22.0, 25.0, 20.0, 21.0,
//                21.0, 22.0, 21.0, 24.0, 21.0, 17.0, 15.0, 18.0, 18.0, 15.0, 15.0,};

            // Obtém os dados da tabela.
            for (int i = 0; i < tamTabela; i++) {
                valor[i] = Double.parseDouble(tabelaElementos.getValueAt(i, 0).toString());
            }

            // Ordena os valores.
            Arrays.sort(valor);

            Calculos CalculosEstat = new Calculos();
            CalculosEstat.iserirDados(valor, false);
            
            // Armazena o número de classes.
            qtdeClasse = CalculosEstat.getNumClasses();
            
            // Obtém o menor valor do conjunto.
            menorValor = DistribuicaoDeFrequencias.truncate(valor[0]);
            
            // Obtém o valor do intervalo das classes.
            intervalo = CalculosEstat.getIntervalo();

            /**
             * Repetição contrutora da tabela de distribuição de frequências.
             * Nela os dados são posicionados para exibição correta da tabela.
             */
            for (int i = 0; i < qtdeClasse; i++) {

                // Finaliza com o maior valor do conjunto.
                if (qtdeClasse - 1 == i) {
                    novaLinha[0] = "" + DistribuicaoDeFrequencias.truncate(
                            menorValor) + " |-- " + DistribuicaoDeFrequencias.truncate(
                                    valor[valor.length - 1]);
                } else {
                    // Monta linha (i) ca coluna 0 (Classes).
                    novaLinha[0] = "" + DistribuicaoDeFrequencias.truncate(
                            menorValor) + " |-- " + DistribuicaoDeFrequencias.truncate(
                                    menorValor + intervalo);

                    menorValor += intervalo;
                }

                // Monta a linha (i) da coluna 1 (Frequências).
                novaLinha[1] = (int) CalculosEstat.getFrequencias()[i];

                // Monta a linha (i) da coluna 2 (Frequencias acumuladas).
                novaLinha[2] = (int) CalculosEstat.getFrequenciasAcumuladas()[i];

                // Monta a linha (i) da coluna 3 (Frequencia Absoluta).
                novaLinha[3] = DistribuicaoDeFrequencias.truncate(
                        CalculosEstat.getFrequenciaAbsoluta()[i]);

                // Monta a linha (i) da coluna 4 (Frequência absoluta acumulada).
                novaLinha[4] = DistribuicaoDeFrequencias.truncate(
                        CalculosEstat.getFrequenciaAbsolutaAcumulada()[i]);

                // Inclúi a primeira linha.
                modelDefault.addRow(novaLinha);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Se a tabela estiver vazia exibe o erro.
            distInfoLabel.setText("Tabela Vazia!");
        }


    }//GEN-LAST:event_botaoCalcularDistActionPerformed

    /**
     * Evento gerado ao precinar uma tecla na caixa de text.
     * Insere o valor na tabela se precionou a tecla Enter.
     * @param evt 
     */
    private void caixaDeTextoDistKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaDeTextoDistKeyPressed

        // Precionou a tecla "enter"?
        if (evt.getKeyCode() == 10) {
            // Verifica se há alguma coisa na caixa de texto.
            if (!caixaDeTextoDist.getText().isEmpty()) {

                // Tenta inserir na tabela o que foi digitado.
                try {
                    elementos e = new elementos();
                    e.setNumeros(Double.parseDouble(caixaDeTextoDist.getText()));
                    modeloTabela.addrow(e);
                    caixaDeTextoDist.setText("");
                    distInfoLabel.setText("");
                } catch (NumberFormatException exception) {
                    distInfoLabel.setText("Entrada Inválida!");
                }
            }
        }
    }//GEN-LAST:event_caixaDeTextoDistKeyPressed

    /**
     * Método utilizado para enviar o valor digitado na caixa de texto 
     * para a tabela.
     * @param evt 
     */
    private void botaoEnviarDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarDistActionPerformed

        // Verifica se há alguma coisa na caixa de texto.
        if (!caixaDeTextoDist.getText().isEmpty()) {

            // Tenta inserir na tabela o que foi digitado.
            try {
                elementos e = new elementos();
                e.setNumeros(Double.parseDouble(caixaDeTextoDist.getText()));
                modeloTabela.addrow(e);
                caixaDeTextoDist.setText("");
                distInfoLabel.setText("");
            } catch (NumberFormatException exception) {
                distInfoLabel.setText("Entrada Inválida!");
            }
        }
    }//GEN-LAST:event_botaoEnviarDistActionPerformed

    /**
     * Método chamado ao clicar no botão Ogiva.
     * Obtém os valores digitados na tabela e monta o gráfico de ogiva.
     * @param evt 
     */
    private void btnOgivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgivaActionPerformed

        try {
            // Remove todas dependências do painelGrafico.
            painelGrafico.removeAll();
            Calculos calc = new Calculos();

            JInternalFrame frame = new JInternalFrame("Ogiva");
            frame.setResizable(false);
            ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null);
            frame.setBorder(null);
            
            // Adiciona o componente criado.
            painelGrafico.add(frame);

            JPanel raiz = new JPanel();
            raiz.setLayout(new BorderLayout());
            Dimension tamanho = new Dimension(590, 470);
            raiz.setPreferredSize(tamanho);
            raiz.setMinimumSize(tamanho);
            frame.add(raiz);
            frame.pack();

            // Posiciona no local ideal.
            frame.setLocation(7, 20);

            // Cria o painel aonde o gráfico será mostrado.
            JPanel primeiroGrafico = new JPanel();
            Dimension tamanhoArea = new Dimension(590, 470);
            primeiroGrafico.setPreferredSize(tamanhoArea);
            primeiroGrafico.setMinimumSize(tamanhoArea);
            raiz.add(primeiroGrafico, BorderLayout.CENTER);

            int tamTabela = tabelaElementos.getRowCount();

            /* Vetor utilizado para testes */
//            double value[] = {89.0, 68.0, 65.0, 61.0, 63.0, 63.0, 61.0, 61.0, 59.0, 60.0, 54.0, 55.0, 54.0, 49.0, 53.0, 55.0, 59.0, 50.0,
//                52.0, 48.0, 53.0, 46.0, 55.0, 57.0, 48.0, 47.0, 48.0, 46.0, 44.0, 50.0, 55.0, 48.0, 45.0, 44.0, 46.0, 46.0,
//                47.0, 41.0, 39.0, 41.0, 45.0, 44.0, 45.0, 43.0, 42.0, 42.0, 48.0, 43.0, 40.0, 39.0, 44.0, 37.0, 40.0, 45.0,
//                43.0, 37.0, 38.0, 38.0, 36.0, 34.0, 37.0, 36.0, 35.0, 35.0, 35.0, 40.0, 31.0, 34.0, 35.0, 39.0, 38.0, 32.0,
//                35.0, 32.0, 32.0, 32.0, 33.0, 33.0, 33.0, 32.0, 34.0, 31.0, 31.0, 30.0, 34.0, 32.0, 31.0, 27.0, 32.0, 26.0,
//                28.0, 29.0, 28.0, 29.0, 31.0, 27.0, 29.0, 28.0, 27.0, 30.0, 25.0, 23.0, 24.0, 26.0, 22.0, 25.0, 20.0, 21.0,
//                21.0, 22.0, 21.0, 24.0, 21.0, 17.0, 15.0, 18.0, 18.0, 15.0, 15.0,};
            double value[] = new double[tamTabela];

            // Obtém os valores da tabela.
            for (int i = 0; i < tamTabela; i++) {
                value[i] = Double.parseDouble(tabelaElementos.getValueAt(i, 0).toString());
            }
            
            // Ordena os valores.
            Arrays.sort(value);

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            // Insere os dados para serem calculados.
            calc.iserirDados(value, false);

            // Inicialização das variáveis.
            int numClasses = calc.getNumClasses();
            double frequencia[] = new double[numClasses];
            double menorValor = value[0];
            double intervalo = calc.getIntervalo();
            String yaxis;

            // Define se utilizará a frequência absoluta ou relativa.
            if (freqAbsoluta.isSelected()) {
                frequencia = calc.getFrequenciaAbsolutaAcumulada();
                yaxis = "Frequência Absoluta Acumuladas";
            } else {
                frequencia = calc.getFrequenciasAcumuladas();
                yaxis = "Frequência Relativa Acumuladas";
            }

            // Adiciona o menor valor no inicio do gráfico.
            dataset.addValue(0, "", Double.toString(
                    DistribuicaoDeFrequencias.truncate(value[0])));

            /**
             * Insere os valores no gráfico.
             */
            for (int i = 0; i < numClasses; i++) {
                String text = Double.toString(DistribuicaoDeFrequencias.truncate(menorValor + intervalo));
                dataset.addValue((DistribuicaoDeFrequencias.truncate(
                        frequencia[i])), "", text);

                menorValor = DistribuicaoDeFrequencias.truncate(intervalo + menorValor);
            }
            // Finaliza o gráfico com o valor máximo + 0.5.
            dataset.addValue(
                    (DistribuicaoDeFrequencias.truncate(frequencia[numClasses - 1])),
                    "", Double.toString(value[value.length - 1] + 0.5));

            // Título do gráfico.
            String plotTitle = "Ogiva";
            
            // Nome do eixo X.
            String xaxis = "Limite Superior da Classe";
            PlotOrientation orientation = PlotOrientation.VERTICAL;
            boolean show = false;
            boolean toolTips = false;
            boolean urls = false;
            int tamX = 590;
            int tamY = 450;

            // Cria o gráfico.
            JFreeChart lineChart = ChartFactory.createLineChart(plotTitle,
                    xaxis, yaxis, dataset, orientation, urls, toolTips, urls);
            
            // Define a cor do gráfico.
            lineChart.setBackgroundPaint(Color.GRAY);

            // Cria o painel do gráfico.
            ChartPanel chartPanel = new ChartPanel(lineChart, tamX, tamY,
                    tamX, tamY, tamX, tamY, urls, toolTips, show, urls, show, true);
            
            // Define a cor do painel.
            chartPanel.setBackground(Color.GRAY);

            primeiroGrafico.add(chartPanel);
            primeiroGrafico.validate();

            frame.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException exception) {
            distInfoLabel.setText("Tabela Vazia!");
        }

    }//GEN-LAST:event_btnOgivaActionPerformed

     /**
     * Método chamado ao precionar alguma tecla na tabela.
     * Exclúi o elemento da tabela selecionado.
     * @param evt 
     */
    private void tabelaElementosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaElementosKeyPressed

        // A tecla precionada foi a tecla "delete"?
        if (evt.getKeyCode() == 127) {
            modeloTabela.removeRow(tabelaElementos.getSelectedRow());
        }
    }//GEN-LAST:event_tabelaElementosKeyPressed

    /**
     * Método chamado ao precionar o botão Polígono.
     * Contrói o gráfico polígono de frequência.
     * @param evt 
     */
    private void btnPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoligonoActionPerformed
        try {
            // Remove as dependências do painelGrafico.
            painelGrafico.removeAll();
            
            Calculos calc = new Calculos();

            // Contrução do painel que armazenará as dependências do gráfico.
            JInternalFrame frame = new JInternalFrame();
            frame.setResizable(false);
            ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null);
            frame.setBorder(null);
            painelGrafico.add(frame);

            JPanel raiz = new JPanel();
            raiz.setLayout(new BorderLayout());
            Dimension tamanho = new Dimension(590, 470);
            raiz.setPreferredSize(tamanho);
            raiz.setMinimumSize(tamanho);
            frame.add(raiz);
            frame.pack();

            // Posiciona o painel no local ideal.
            frame.setLocation(7, 20);

            // Cria o painel aonde o gráfico será mostrado.
            JPanel primeiroGrafico = new JPanel();
            Dimension tamanhoArea = new Dimension(590, 470);
            primeiroGrafico.setPreferredSize(tamanhoArea);
            primeiroGrafico.setMinimumSize(tamanhoArea);
            raiz.add(primeiroGrafico, BorderLayout.CENTER);

            int tamTabela = tabelaElementos.getRowCount();

            /* Vetor utilizado para testes */
//            double value[] = {89.0, 68.0, 65.0, 61.0, 63.0, 63.0, 61.0, 61.0, 59.0, 60.0, 54.0, 55.0, 54.0, 49.0, 53.0, 55.0, 59.0, 50.0,
//                52.0, 48.0, 53.0, 46.0, 55.0, 57.0, 48.0, 47.0, 48.0, 46.0, 44.0, 50.0, 55.0, 48.0, 45.0, 44.0, 46.0, 46.0,
//                47.0, 41.0, 39.0, 41.0, 45.0, 44.0, 45.0, 43.0, 42.0, 42.0, 48.0, 43.0, 40.0, 39.0, 44.0, 37.0, 40.0, 45.0,
//                43.0, 37.0, 38.0, 38.0, 36.0, 34.0, 37.0, 36.0, 35.0, 35.0, 35.0, 40.0, 31.0, 34.0, 35.0, 39.0, 38.0, 32.0,
//                35.0, 32.0, 32.0, 32.0, 33.0, 33.0, 33.0, 32.0, 34.0, 31.0, 31.0, 30.0, 34.0, 32.0, 31.0, 27.0, 32.0, 26.0,
//                28.0, 29.0, 28.0, 29.0, 31.0, 27.0, 29.0, 28.0, 27.0, 30.0, 25.0, 23.0, 24.0, 26.0, 22.0, 25.0, 20.0, 21.0,
//                21.0, 22.0, 21.0, 24.0, 21.0, 17.0, 15.0, 18.0, 18.0, 15.0, 15.0,};

            double value[] = new double[tamTabela];

            // Obtém os valores da tabela.
            for (int i = 0; i < tamTabela; i++) {
                value[i] = Double.parseDouble(tabelaElementos.getValueAt(i, 0).toString());
            }
            
            // Ordena os valores.
            Arrays.sort(value);

            // Conjunto de dados para o gráfico.
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            // Insere os valores para serem calculados.
            calc.iserirDados(value, false);

            // Obtém o número de classes.
            int numClasses = calc.getNumClasses();

            double frequencia[] = new double[numClasses];

            String yaxis;

            // Define se utilizará frequência absoluta ou relativa.
            if (freqAbsoluta.isSelected()) {
                frequencia = calc.getFrequenciaAbsoluta();
                yaxis = "Frequência Absoluta";
            } else {
                frequencia = calc.getFrequencias();
                yaxis = "Frequência Relativa";
            }

            String text;

            // Inicia o gráfico com: (o menor valor) - (o intervalo de classes).
            dataset.addValue(0, "", Double.toString(
                    DistribuicaoDeFrequencias.truncate(value[0]
                            - calc.getIntervalo())));

            // Monta o meio do gráfico.
            for (int i = 0; i < numClasses; i++) {
                text = Double.toString(DistribuicaoDeFrequencias.truncate(calc.getMediaClasses()[i]));
                dataset.addValue((DistribuicaoDeFrequencias.truncate(frequencia[i])), "", text);
            }

            // Finaliza os dados com: (o maior valor) + (o intervalo de classes).
            dataset.addValue(0, "", Double.toString(
                    DistribuicaoDeFrequencias.truncate(calc.getMediaClasses()[numClasses - 1] + calc.getIntervalo())));

            // Título do gráfico.
            String plotTitle = "Polígono de frequência";
            
            // Nome do eixo X.
            String xaxis = "Ponto Médio da classe";
            PlotOrientation orientation = PlotOrientation.VERTICAL;
            boolean show = false;
            boolean toolTips = false;
            boolean urls = false;
            int tamX = 590;
            int tamY = 450;

            // Cria o gráfico.
            JFreeChart lineChart = ChartFactory.createLineChart(plotTitle, 
                    xaxis, yaxis, dataset, orientation, urls, toolTips, urls);
            
            // Define a cor do gráfico.
            lineChart.setBackgroundPaint(Color.GRAY);
            
            // Cria o painel do gráfico.
            ChartPanel chartPanel = new ChartPanel(lineChart, tamX, tamY, tamX,
                    tamY, tamX, tamY, urls, toolTips, show, urls, show, true);
            
            // Define a cor do painel.
            chartPanel.setBackground(Color.GRAY);
            
            primeiroGrafico.add(chartPanel);
            primeiroGrafico.validate();

            frame.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Exibe o erro se a tabela estiver vazia.
            distInfoLabel.setText("Tabela Vazia!");
        }
    }//GEN-LAST:event_btnPoligonoActionPerformed

    /**
     * Método chamado ao precionar o botao Absoluta.
     * Define o tipo de frequência na montagem de gráficos.
     * @param evt 
     */
    private void freqAbsolutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freqAbsolutaActionPerformed
        freqRelativa.setSelected(false);
        freqAbsoluta.setSelected(true);
    }//GEN-LAST:event_freqAbsolutaActionPerformed

     /**
     * Método chamado ao precionar o botao Relativa.
     * Define o tipo de frequência na montagem de gráficos.
     * @param evt 
     */
    private void freqRelativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freqRelativaActionPerformed
        freqAbsoluta.setSelected(false);
        freqRelativa.setSelected(true);
    }//GEN-LAST:event_freqRelativaActionPerformed

    /**
     * Método chamado ao precionar o botão Deletar conjunto.
     * Remove todos elementos de todas as tabelas e remove o gráfico exibido.
     * @param evt 
     */
    private void btnDeleteConjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteConjActionPerformed
        
        // Deleta a tabela de elementos.
        int tamTabela = modeloTabela.getRowCount();
        for (int i = 0; i < tamTabela; i++) {
            modeloTabela.removeRow(0);
        }
        
        // Deleta a tabela de distribuição de frequências.
        tamTabela = modelDefault.getRowCount();
        for (int i = 0; i < tamTabela; i++) {
            modelDefault.removeRow(0);
        }
        // Deleta o gráfico exibido
        painelGrafico.removeAll();
        painelGrafico.revalidate();
        painelGrafico.repaint();
    }//GEN-LAST:event_btnDeleteConjActionPerformed

    /**
     * Método chamado ao precionar o botão Ordenar.
     * Ordena a tablela.
     * @param evt 
     */
    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // Método responsável por ordenar a tabela.
        ordenaTabela();
    }//GEN-LAST:event_btnOrdenarActionPerformed
    
    /**
     * Método utilizado para ordenar os elementos da tabela.
     * @param void
     * @return
     */
    private void ordenaTabela() {
        int tamTabela = modeloTabela.getRowCount();
        double valor[] = new double[tamTabela];
        // Copia os elementos da tabela para um vetor.
        for (int i = 0; i < tamTabela; i++) {
            valor[i] = Double.parseDouble(modeloTabela.getValueAt(i, 0).toString());
        }
        // Ordena o Vetor.
        Arrays.sort(valor);

        for (int i = 0; i < tamTabela; i++) {
            modeloTabela.removeRow(0);
        }

        // Adiciona os valores ordenados na tabela.
        for (int i = 0; i < tamTabela; i++) {
            elementos e = new elementos();
            e.setNumeros(valor[i]);
            modeloTabela.addrow(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramenta;
    private javax.swing.JButton botaoAlterarDist;
    private javax.swing.JButton botaoCalcularDist;
    private javax.swing.JButton botaoEnviarDist;
    private javax.swing.JButton botaoExcluirDist;
    private javax.swing.JButton btnDeleteConj;
    private javax.swing.JButton btnHistograma;
    private javax.swing.JButton btnOgiva;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPoligono;
    private javax.swing.JTextField caixaDeTextoDist;
    private javax.swing.JLabel distInfoLabel;
    private javax.swing.JRadioButton freqAbsoluta;
    private javax.swing.JRadioButton freqRelativa;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel painelAnaliseDados;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JPanel panelElementosConjunto;
    private javax.swing.JTable tabelaDistFreq;
    private javax.swing.JTable tabelaElementos;
    private javax.swing.JPanel tipoFrequencia;
    // End of variables declaration//GEN-END:variables
}
