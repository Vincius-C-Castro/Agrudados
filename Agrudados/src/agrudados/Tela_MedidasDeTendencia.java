package agrudados;

import estatistica.Calculos;
import model.ElementosModel;
import model.elementos;
import estatistica.Central;
import estatistica.DistribuicaoDeFrequencias;
import java.beans.PropertyVetoException;
import java.util.Arrays;
import javax.swing.table.TableRowSorter;

public class Tela_MedidasDeTendencia extends javax.swing.JInternalFrame {

    String[] colunas = {"Elementos"};
    ElementosModel modeloTabela = new ElementosModel(colunas);

    @Override
    public void setMaximum(boolean bln) throws PropertyVetoException {
        super.setMaximum(bln); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaximizable(boolean maximizable) {
        this.maximizable = maximizable;
    }

    /**
     * Creates new form medidasdetendenciacentralSimpes
     */
    public Tela_MedidasDeTendencia() {
        initComponents();
        tabela.setModel(modeloTabela);
        tabela.setRowSorter(new TableRowSorter(modeloTabela));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        panelPrincipalMTS = new javax.swing.JPanel();
        PainelMedTend = new javax.swing.JPanel();
        panelCentrais = new javax.swing.JPanel();
        resultMedia = new javax.swing.JLabel();
        resultModa = new javax.swing.JLabel();
        resultMediana = new javax.swing.JLabel();
        panelTipoConjunto = new javax.swing.JPanel();
        conjuntoPopulacional = new javax.swing.JRadioButton();
        conjuntoAmostral = new javax.swing.JRadioButton();
        panelDispersao = new javax.swing.JPanel();
        resultVar = new javax.swing.JLabel();
        resultDP = new javax.swing.JLabel();
        resultDM = new javax.swing.JLabel();
        resultAmplitude = new javax.swing.JLabel();
        resultCV = new javax.swing.JLabel();
        panelElementosConjunto = new javax.swing.JPanel();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoCalcular = new javax.swing.JButton();
        caixaDeTexto = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        panelConjunto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        jLabel8.setText("jLabel7");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Medidas de tendência");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table.png"))); // NOI18N
        setName("telaInternaMTC"); // NOI18N
        setNextFocusableComponent(caixaDeTexto);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        PainelMedTend.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medidas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        PainelMedTend.setForeground(java.awt.Color.gray);

        panelCentrais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Central", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelCentrais.setForeground(java.awt.Color.darkGray);

        resultMedia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Media", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultMedia.setName("resultMedia"); // NOI18N

        resultModa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Moda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultModa.setName("resultModa"); // NOI18N

        resultMediana.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mediana", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultMediana.setName("resultMediana"); // NOI18N

        panelTipoConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de conjunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        conjuntoPopulacional.setText("Conjunto Populacional");
        conjuntoPopulacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoPopulacionalActionPerformed(evt);
            }
        });

        conjuntoAmostral.setSelected(true);
        conjuntoAmostral.setText("Conjunto Amostral");
        conjuntoAmostral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoAmostralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTipoConjuntoLayout = new javax.swing.GroupLayout(panelTipoConjunto);
        panelTipoConjunto.setLayout(panelTipoConjuntoLayout);
        panelTipoConjuntoLayout.setHorizontalGroup(
            panelTipoConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTipoConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conjuntoAmostral)
                    .addComponent(conjuntoPopulacional))
                .addContainerGap())
        );
        panelTipoConjuntoLayout.setVerticalGroup(
            panelTipoConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conjuntoAmostral)
                .addGap(6, 6, 6)
                .addComponent(conjuntoPopulacional)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCentraisLayout = new javax.swing.GroupLayout(panelCentrais);
        panelCentrais.setLayout(panelCentraisLayout);
        panelCentraisLayout.setHorizontalGroup(
            panelCentraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultMedia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultMediana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCentraisLayout.createSequentialGroup()
                        .addComponent(panelTipoConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCentraisLayout.setVerticalGroup(
            panelCentraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentraisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultModa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTipoConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        resultMedia.getAccessibleContext().setAccessibleName("resultMedia");
        resultModa.getAccessibleContext().setAccessibleName("resultModa");
        resultMediana.getAccessibleContext().setAccessibleName("resultMediana");

        panelDispersao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispersão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelDispersao.setForeground(java.awt.Color.darkGray);

        resultVar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Variância", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultVar.setName("resultVar"); // NOI18N

        resultDP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desvio padrão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultDP.setName("resultDP"); // NOI18N
        resultDP.setRequestFocusEnabled(false);

        resultDM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desvio médio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultDM.setName("resultDM"); // NOI18N

        resultAmplitude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Amplitude", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultAmplitude.setName("resultAmplitude"); // NOI18N
        resultAmplitude.setRequestFocusEnabled(false);

        resultCV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coeficiênte de variação", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultCV.setName("resultCV"); // NOI18N
        resultCV.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelDispersaoLayout = new javax.swing.GroupLayout(panelDispersao);
        panelDispersao.setLayout(panelDispersaoLayout);
        panelDispersaoLayout.setHorizontalGroup(
            panelDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDispersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultDM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultVar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultDP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultAmplitude, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultCV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelDispersaoLayout.setVerticalGroup(
            panelDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDispersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultDM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultVar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultDP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultAmplitude, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(resultCV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        resultVar.getAccessibleContext().setAccessibleName("resultVar");
        resultDP.getAccessibleContext().setAccessibleName("resultDP");
        resultDM.getAccessibleContext().setAccessibleName("resultDM");

        javax.swing.GroupLayout PainelMedTendLayout = new javax.swing.GroupLayout(PainelMedTend);
        PainelMedTend.setLayout(PainelMedTendLayout);
        PainelMedTendLayout.setHorizontalGroup(
            PainelMedTendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMedTendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentrais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(panelDispersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PainelMedTendLayout.setVerticalGroup(
            PainelMedTendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMedTendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelMedTendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDispersao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCentrais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelElementosConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elementos do conjunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        botaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_edit.png"))); // NOI18N
        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_delete.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculator.png"))); // NOI18N
        botaoCalcular.setText("Calcular");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        caixaDeTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaDeTexto.setOpaque(false);
        caixaDeTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaDeTextoActionPerformed(evt);
            }
        });
        caixaDeTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaDeTextoKeyPressed(evt);
            }
        });

        botaoEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_go.png"))); // NOI18N
        botaoEnviar.setText("Enviar");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelElementosConjuntoLayout = new javax.swing.GroupLayout(panelElementosConjunto);
        panelElementosConjunto.setLayout(panelElementosConjuntoLayout);
        panelElementosConjuntoLayout.setHorizontalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                        .addComponent(botaoCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluir))
                    .addComponent(caixaDeTexto))
                .addGap(18, 18, 18)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(botaoEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelElementosConjuntoLayout.setVerticalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaDeTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnviar))
                .addGap(18, 18, 18)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoCalcular))
                .addContainerGap())
        );

        panelConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conjunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Elementos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela.setColumnSelectionAllowed(true);
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        tabela.setRowSorter(new TableRowSorter(modeloTabela));
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
        }
        tabela.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout panelConjuntoLayout = new javax.swing.GroupLayout(panelConjunto);
        panelConjunto.setLayout(panelConjuntoLayout);
        panelConjuntoLayout.setHorizontalGroup(
            panelConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelConjuntoLayout.setVerticalGroup(
            panelConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConjuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalMTSLayout = new javax.swing.GroupLayout(panelPrincipalMTS);
        panelPrincipalMTS.setLayout(panelPrincipalMTSLayout);
        panelPrincipalMTSLayout.setHorizontalGroup(
            panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalMTSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelElementosConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PainelMedTend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalMTSLayout.setVerticalGroup(
            panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalMTSLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalMTSLayout.createSequentialGroup()
                        .addComponent(panelElementosConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PainelMedTend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PainelMedTend.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalMTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(panelPrincipalMTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed

        elementos e = new elementos();
        e.setNumeros(Double.parseDouble(caixaDeTexto.getText()));
        modeloTabela.addrow(e);
        caixaDeTexto.setText("");
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void caixaDeTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaDeTextoKeyPressed

        if (evt.getKeyCode() == 10) {
            elementos e = new elementos();
            e.setNumeros(Double.parseDouble(caixaDeTexto.getText()));
            modeloTabela.addrow(e);
            caixaDeTexto.setText("");
        }
    }//GEN-LAST:event_caixaDeTextoKeyPressed

    private void caixaDeTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaDeTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaDeTextoActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed

        int tamTabela = tabela.getRowCount();
        double valor[] = new double[tamTabela];
        boolean isConjuntoAmostral = conjuntoAmostral.isSelected();

        for (int i = 0; i < tamTabela; i++) {
            valor[i] = Double.parseDouble(tabela.getValueAt(i, 0).toString());
        }

        Arrays.sort(valor);

        Calculos CalculosEstat = new Central();

        /**
        * Insere todos valores necessários para realização de cálculos.
        */
        CalculosEstat.iserirDados(valor, isConjuntoAmostral);

        /**
        * Insere os valores obtidos nos cálculos nas labels da tela.
        */
        {
            resultMedia.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getMedia())));
            //resultMedia.setText(String.valueOf(CalculosEstat.getNumClasses()));

            if (CalculosEstat.getIndiceModa() >= 0) {
                resultModa.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getModa())));
            } else if (CalculosEstat.getIndiceModa() == -1) {
                resultModa.setText("Amodal");
            } else if (CalculosEstat.getIndiceModa() == -2) {
                resultModa.setText("Bimodal");
            } else {
                resultModa.setText("Multimodal");
            }

            resultMediana.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getMediana())));

            resultVar.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getVariancia())));
            
            resultDP.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getDesvioPadrao())));

            resultDM.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getDesvioMedio())));

            resultAmplitude.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getAmplitude())));

            resultCV.setText(String.valueOf(DistribuicaoDeFrequencias.truncate(CalculosEstat.getCoeficienteVariacao())) + " %");
        }
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

        if (tabela.getSelectedRow() != -1) {

            modeloTabela.removeRow(tabela.getSelectedRow());
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed

        if (tabela.getSelectedRow() != -1) {

            modeloTabela.setValueAt(caixaDeTexto.getText(), tabela.getSelectedRow(), 0);

        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void conjuntoAmostralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoAmostralActionPerformed
        conjuntoPopulacional.setSelected(false);
    }//GEN-LAST:event_conjuntoAmostralActionPerformed

    private void conjuntoPopulacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoPopulacionalActionPerformed
        conjuntoAmostral.setSelected(false);
    }//GEN-LAST:event_conjuntoPopulacionalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMedTend;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField caixaDeTexto;
    private javax.swing.JRadioButton conjuntoAmostral;
    private javax.swing.JRadioButton conjuntoPopulacional;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCentrais;
    private javax.swing.JPanel panelConjunto;
    private javax.swing.JPanel panelDispersao;
    private javax.swing.JPanel panelElementosConjunto;
    private javax.swing.JPanel panelPrincipalMTS;
    private javax.swing.JPanel panelTipoConjunto;
    private javax.swing.JLabel resultAmplitude;
    private javax.swing.JLabel resultCV;
    private javax.swing.JLabel resultDM;
    private javax.swing.JLabel resultDP;
    private javax.swing.JLabel resultMedia;
    private javax.swing.JLabel resultMediana;
    private javax.swing.JLabel resultModa;
    private javax.swing.JLabel resultVar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
