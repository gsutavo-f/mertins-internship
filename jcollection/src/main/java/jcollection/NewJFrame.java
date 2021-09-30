package jcollection;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class NewJFrame extends javax.swing.JFrame {
   
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        txtData = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        estadoCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cidadeCombo = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sorterCodigo = new javax.swing.JButton();
        sorterNome = new javax.swing.JButton();
        SorterCidade = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        clearButton.setText("Limpar");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.setFocusable(false);
        clearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(clearButton);

        saveButton.setText("Salvar");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.setFocusable(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(saveButton);

        deleteButton.setText("Excluir");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(deleteButton);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacoes Gerais"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        txtCodigo.setEditable(false);
        txtCodigo.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        groupSexo.add(radioMasc);
        radioMasc.setText("Masculino");

        groupSexo.add(radioFem);
        radioFem.setText("Feminino");
        radioFem.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioMasc)
                    .addComponent(radioFem))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioMasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioFem)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dt Nascimento"));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtData)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereco"));

        jLabel3.setText("Estado");

        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Bahia", "Ceara", "Espirito Santo", "Goias", "Maranhao", "Para", "Rio de Janeiro", "Sao Paulo", "Tocantins", "Distrito Federal" }));
        estadoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoComboActionPerformed(evt);
            }
        });

        jLabel4.setText("Cidade");

        cidadeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acrelandia", "Brasileia", "Capixaba", "Epitaciolandia", "Feijo", "Jordao", "Manoel Urbano", "Placido de Castro", "Rio Branco", "Sena Madeureira", "Tarauaca", "Xapuri" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeCombo, 0, 256, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecao"));

        jLabel5.setText("Ordem de Apresentacao");

        sorterCodigo.setText("Codigo");
        sorterCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sorterCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorterCodigoActionPerformed(evt);
            }
        });

        sorterNome.setText("Nome");

        SorterCidade.setText("Cidade");

        tabela.setAutoCreateRowSorter(true);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Dt Nascimento", "Cidade", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sorterCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sorterNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SorterCidade)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sorterCodigo)
                    .addComponent(sorterNome)
                    .addComponent(SorterCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Look and Feel");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoComboActionPerformed
        String[] cidadesAcre = new String[] {"Acrelandia", "Brasileia", "Capixaba", "Epitaciolandia", "Feijo", "Jordao", "Manoel Urbano", "Placido de Castro", "Rio Branco", "Sena Madeureira", "Tarauaca", "Xapuri"};
        String[] cidadesBahia = new String[] {"Salvador"};
        String[] cidadesCeara = new String[] {"Fortaleza"};
        String[] cidadesEspirito = new String[] {"Espirito Santo"};
        String[] cidadesGoias = new String[] {"Goiania"};
        String[] cidadesMaranhao = new String[] {"Sao Luis"};
        String[] cidadesPara = new String[] {"Belem"};
        String[] cidadesRio = new String[] {"Rio de Janeiro"};
        String[] cidadesSaoPaulo = new String[] {"Sao Paulo"};
        String[] cidadesTocantins = new String[] {"Palmas"};
        String[] cidadesDF = new String[] {"Brasilia"};
        
        if(estadoCombo.getSelectedIndex() == 0) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesAcre) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 1) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesBahia) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 2) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesCeara) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 3) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesEspirito) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 4) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesGoias) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 5) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesMaranhao) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 6) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesPara) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 7) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesRio) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 8) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesSaoPaulo) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 9) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesTocantins) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
        if(estadoCombo.getSelectedIndex() == 10) {
            cidadeCombo.removeAllItems();
            for(String s : cidadesDF) {
                cidadeCombo.insertItemAt(s, cidadeCombo.getItemCount());
            }
            cidadeCombo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_estadoComboActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        radioMasc.setActionCommand("Masculino");
        radioFem.setActionCommand("Feminino");
        DefaultTableModel tPessoas = (DefaultTableModel) tabela.getModel();
        Object[] dados = {txtCodigo.getText(), txtNome.getText(), txtData.getText(), cidadeCombo.getItemAt(cidadeCombo.getSelectedIndex()), groupSexo.getSelection().getActionCommand()};
        tPessoas.addRow(dados);
        
        int count = Integer.parseInt(txtCodigo.getText());
        count++;
        txtCodigo.setText(String.valueOf(count));
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void sorterCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorterCodigoActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela.getModel());
        tabela.setRowSorter(sorter);
    }//GEN-LAST:event_sorterCodigoActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        DefaultTableModel tPessoas = (DefaultTableModel) tabela.getModel();
        int rowCount = tPessoas.getRowCount();
        
        for(int i = rowCount - 1; i >= 0; i--) {
            tPessoas.removeRow(i);
        }
        
        txtCodigo.setText("1");
        txtNome.setText("");
        groupSexo.clearSelection();
        
        estadoCombo.setSelectedIndex(0);
        cidadeCombo.setSelectedIndex(0);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel tPessoas = (DefaultTableModel)tabela.getModel();
        int[] rows = tabela.getSelectedRows();
        
        for(int i = 0; i < rows.length; i++) {
            System.out.println("linhas a deletar: " + (rows[i] + 1));
            tPessoas.removeRow(rows[i]);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SorterCidade;
    private javax.swing.JComboBox<String> cidadeCombo;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> estadoCombo;
    private javax.swing.ButtonGroup groupSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton sorterCodigo;
    private javax.swing.JButton sorterNome;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
