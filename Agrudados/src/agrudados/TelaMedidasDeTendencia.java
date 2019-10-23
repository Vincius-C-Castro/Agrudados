package agrudados;

import estatistica.Calculos;
import modelostabelas.ElementosModel;
import modelostabelas.elementos;
import estatistica.Central;
import estatistica.DistribuicaoDeFrequencias;
import java.util.Arrays;

public class TelaMedidasDeTendencia extends javax.swing.JInternalFrame {

    // Inicializa o modelo da tabela.
    String[] colunas = {""};
    ElementosModel modeloTabela = new ElementosModel(colunas);

    /**
     * Inicializa os componentes da tela de medidas de tendências.
     */
    public TelaMedidasDeTendencia() {
        initComponents();
        tabela.setModel(modeloTabela);
        
    }

    /**
     * Inicialização dos componentes.
     */
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
        infoLabel = new javax.swing.JLabel();
        btnDeletConj = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnOrdenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        panelPrincipalMTS.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        panelPrincipalMTS.setForeground(new java.awt.Color(51, 102, 255));

        PainelMedTend.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        PainelMedTend.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medidas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        PainelMedTend.setForeground(java.awt.Color.gray);

        panelCentrais.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        panelCentrais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Central", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelCentrais.setForeground(java.awt.Color.darkGray);

        resultMedia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultMedia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Media", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultMedia.setName("resultMedia"); // NOI18N

        resultModa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultModa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Moda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultModa.setName("resultModa"); // NOI18N

        resultMediana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultMediana.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mediana", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultMediana.setName("resultMediana"); // NOI18N

        panelTipoConjunto.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        panelTipoConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de conjunto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        conjuntoPopulacional.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        conjuntoPopulacional.setText("Conjunto Populacional");
        conjuntoPopulacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntoPopulacionalActionPerformed(evt);
            }
        });

        conjuntoAmostral.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
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
                .addGap(18, 18, 18)
                .addComponent(panelTipoConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultMedia.getAccessibleContext().setAccessibleName("resultMedia");
        resultModa.getAccessibleContext().setAccessibleName("resultModa");
        resultMediana.getAccessibleContext().setAccessibleName("resultMediana");

        panelDispersao.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        panelDispersao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dispersão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelDispersao.setForeground(java.awt.Color.darkGray);

        resultVar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultVar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Variância", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultVar.setName("resultVar"); // NOI18N

        resultDP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultDP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desvio padrão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultDP.setName("resultDP"); // NOI18N
        resultDP.setRequestFocusEnabled(false);

        resultDM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultDM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desvio médio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultDM.setName("resultDM"); // NOI18N

        resultAmplitude.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultAmplitude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Amplitude", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        resultAmplitude.setName("resultAmplitude"); // NOI18N
        resultAmplitude.setRequestFocusEnabled(false);

        resultCV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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
                .addGap(18, 18, 18)
                .addComponent(resultCV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        panelElementosConjunto.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        panelElementosConjunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira os elementos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

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
        botaoCalcular.setText("Calcular medidas");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        caixaDeTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        caixaDeTexto.setOpaque(false);
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

        infoLabel.setForeground(java.awt.Color.red);

        btnDeletConj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btnDeletConj.setText("Deletar conjunto");
        btnDeletConj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletConjActionPerformed(evt);
            }
        });

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Elementos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabela.setBorder(new javax.swing.border.MatteBorder(null));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.setAutoscrolls(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setUpdateSelectionOnSort(false);
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/table_sort.png"))); // NOI18N
        btnOrdenar.setText("Ordenar tabela");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelElementosConjuntoLayout = new javax.swing.GroupLayout(panelElementosConjunto);
        panelElementosConjunto.setLayout(panelElementosConjuntoLayout);
        panelElementosConjuntoLayout.setHorizontalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caixaDeTexto))
                    .addComponent(btnDeletConj, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                        .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEnviar)
                            .addComponent(botaoExcluir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAlterar))
                    .addComponent(btnOrdenar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        panelElementosConjuntoLayout.setVerticalGroup(
            panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaDeTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnviar)
                    .addComponent(botaoAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoCalcular))
                .addGap(18, 18, 18)
                .addGroup(panelElementosConjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletConj)
                    .addComponent(btnOrdenar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelElementosConjuntoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2"));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agrudados.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalMTSLayout = new javax.swing.GroupLayout(panelPrincipalMTS);
        panelPrincipalMTS.setLayout(panelPrincipalMTSLayout);
        panelPrincipalMTSLayout.setHorizontalGroup(
            panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalMTSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalMTSLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelElementosConjunto, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PainelMedTend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelPrincipalMTSLayout.setVerticalGroup(
            panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalMTSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalMTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelMedTend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalMTSLayout.createSequentialGroup()
                        .addComponent(panelElementosConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );

        PainelMedTend.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipalMTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalMTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Tratamento do botão que indica que o conjunto é amostral.
     * @param evt 
     */
    private void conjuntoAmostralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoAmostralActionPerformed
        conjuntoPopulacional.setSelected(false);
        conjuntoAmostral.setSelected(true);
    }//GEN-LAST:event_conjuntoAmostralActionPerformed

    /**
     * Tratamento do botão que indica que o conjunto é populacional.
     * @param evt 
     */
    private void conjuntoPopulacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntoPopulacionalActionPerformed
        conjuntoAmostral.setSelected(false);
        conjuntoPopulacional.setSelected(true);
    }//GEN-LAST:event_conjuntoPopulacionalActionPerformed

    /**
     * Método utilizado para enviar o valor digitado na caixa de texto 
     * para a tabela.
     * @param evt 
     */
    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed

        // Verifica se há alguma coisa na caixa de texto.
        if (!caixaDeTexto.getText().isEmpty()) {

            // Tenta inserir na tabela o que foi digitado.
            try {
                elementos e = new elementos();
                e.setNumeros(Double.parseDouble(caixaDeTexto.getText()));
                modeloTabela.addrow(e);
                caixaDeTexto.setText("");
                infoLabel.setText("");
            } catch (NumberFormatException exception) {
                // Se foi algum caractere inválido exibirá o erro.
                infoLabel.setText("Entrada Inválida!");
            }
        }

    }//GEN-LAST:event_botaoEnviarActionPerformed

    /**
     * Método utilizado para captar os comandos dados na caixa de texto.
     * Se precionou a tecla Enter, envia o valor para a tabela automaticamente.
     * @param evt 
     */
    private void caixaDeTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaDeTextoKeyPressed
        // Precionou a tecla "enter"?
        if (evt.getKeyCode() == 10) {
            // Verifica se há alguma coisa na caixa de texto.
            if (!caixaDeTexto.getText().isEmpty()) {

                // Tenta inserir na tabela o que foi digitado.
                try {
                    elementos e = new elementos();
                    e.setNumeros(Double.parseDouble(caixaDeTexto.getText()));
                    modeloTabela.addrow(e);
                    caixaDeTexto.setText("");
                    infoLabel.setText("");
                } catch (NumberFormatException exception) {
                    // Se foi digitado um caractere inválido exibe o erro.
                    infoLabel.setText("Entrada Inválida!");
                }
            }
        }
    }//GEN-LAST:event_caixaDeTextoKeyPressed

    /**
     * Método que é chamado ao clicar no botão Calcular medidas.
     * Realiza todos os cálculos necessário e exibe os resultados obtidos.
     * @param evt 
     */
    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed

        try {
            // Obtém o tamanho da tabela.
            int tamTabela = tabela.getRowCount();
            double valor[] = new double[tamTabela];
            // Verifica se o conjunto é amostral ou não.
            boolean isConjuntoAmostral = conjuntoAmostral.isSelected();

            // Copia os valores presentes na tabela para o vetor.
            for (int i = 0; i < tamTabela; i++) {
                valor[i] = Double.parseDouble(tabela.getValueAt(i, 0).toString());
            }

            // Ordena o vetor.
            Arrays.sort(valor);

            // Instancia da classe que realiazará os cálculos.
            Calculos CalculosEstat = new Central();

            /**
             * Insere todos valores necessários para realização de cálculos.
             */
            CalculosEstat.iserirDados(valor, isConjuntoAmostral);

            /**
             * Insere os valores obtidos nos cálculos nas labels da tela.
             */
            resultMedia.setText(String.valueOf(
                    DistribuicaoDeFrequencias.truncate(CalculosEstat.getMedia())));

            /**
             * Obtém o índice no vetor que corresponde ao valor modal.
             * Se o índice for menor que zero, quer dizer que o conjunto
             * é amodal, bimodal ou multimodal.
             */
            if (CalculosEstat.getIndiceModa() >= 0) {
                resultModa.setText(String.valueOf(
                        DistribuicaoDeFrequencias.truncate(CalculosEstat.getModa())));
            } else if (CalculosEstat.getIndiceModa() == -1) {
                resultModa.setText("Amodal");
            } else if (CalculosEstat.getIndiceModa() == -2) {
                resultModa.setText("Bimodal");
            } else {
                resultModa.setText("Multimodal");
            }

            /**
             * Inserção dos demais valores obtidos nas devidas labels.
             */
            resultMediana.setText(String.valueOf(
                    DistribuicaoDeFrequencias.truncate(CalculosEstat.getMediana())));
            resultVar.setText(String.valueOf(
                    DistribuicaoDeFrequencias.truncate(CalculosEstat.getVariancia())));
            resultDP.setText(String.valueOf(
                    DistribuicaoDeFrequencias.truncate(CalculosEstat.getDesvioPadrao())));
            resultDM.setText(String.valueOf(
                    DistribuicaoDeFrequencias.truncate(CalculosEstat.getDesvioMedio())));
            resultAmplitude.setText(String.valueOf(
                    DistribuicaoDeFrequencias.truncate(CalculosEstat.getAmplitude())));
            resultCV.setText(String.valueOf(
                    DistribuicaoDeFrequencias.truncate(
                            CalculosEstat.getCoeficienteVariacao())) + " %");
            
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Indica erro caso a tabela de elementos esteja vazia.
            infoLabel.setText("Tabela Vazia!");
        }


    }//GEN-LAST:event_botaoCalcularActionPerformed

    /**
     * Método chamado ao clicar no botão Excluir.
     * Remove o elemento selecionado na tabela.
     * @param evt 
     */
    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

        if (tabela.getSelectedRow() != -1) {

            modeloTabela.removeRow(tabela.getSelectedRow());
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    /**
     * Método chamado ao clicar no botão Alterar.
     * Insere o valor digitado na caixa de texto na linha selecionada na tabela.
     * @param evt 
     */
    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed

        if (tabela.getSelectedRow() != -1) {

            modeloTabela.setValueAt(caixaDeTexto.getText(), tabela.getSelectedRow(), 0);

        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    /**
     * Método chamado ao precionar alguma tecla na tabela.
     * Exclúi o elemento da tabela selecionado.
     * @param evt 
     */
    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
        // A tecla precionada foi a tecla "delete"?
        if (evt.getKeyCode() == 127) {
            modeloTabela.removeRow(tabela.getSelectedRow());
        }
    }//GEN-LAST:event_tabelaKeyPressed

    /**
     * Método chamado ao precinar o botão Deletar conjunto.
     * Remove todos elementos da tabela.
     * @param evt 
     */
    private void btnDeletConjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletConjActionPerformed
        int tamTabela = modeloTabela.getRowCount();
        for (int i = 0; i < tamTabela; i++) {
            modeloTabela.removeRow(0);
        }
    }//GEN-LAST:event_btnDeletConjActionPerformed

    /**
     * Método chamado ao precionar o botão Ordenar tabela.
     * Ordena a tabela.
     * @param evt 
     */
    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        ordenaTabela();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    /**
     * Método responsável por ordenar a tabela.
     * Remove todos elementos da tabela e insere ordenadamente.
     */
    private void ordenaTabela() {
        // Obtèm o tamanho da tabela.
        int tamTabela = modeloTabela.getRowCount();
        double valor[] = new double[tamTabela];
        // Copia os elementos da tabela para o vetor.
        for (int i = 0; i < tamTabela; i++) {
            valor[i] = Double.parseDouble(modeloTabela.getValueAt(i, 0).toString());
        }
        // Ordena os dados no vetor.
        Arrays.sort(valor);

        // Remove todos elementos da tabela.
        for (int i = 0; i < tamTabela; i++) {
            modeloTabela.removeRow(0);
        }

        // Insere os valores ordenados na tabela.
        for (int i = 0; i < tamTabela; i++) {
            elementos e = new elementos();
            e.setNumeros(valor[i]);
            modeloTabela.addrow(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMedTend;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton btnDeletConj;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField caixaDeTexto;
    private javax.swing.JRadioButton conjuntoAmostral;
    private javax.swing.JRadioButton conjuntoPopulacional;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCentrais;
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
