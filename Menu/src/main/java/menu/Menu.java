package menu;

import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        txtMessage = new javax.swing.JLabel();
        buttonMessage = new javax.swing.JButton();
        JTabbedPane = new javax.swing.JTabbedPane();
        JTextField = new javax.swing.JLayeredPane();
        radioMaiuscula = new javax.swing.JRadioButton();
        radioMinuscula = new javax.swing.JRadioButton();
        txtFrase = new javax.swing.JTextField();
        bumperSticker1 = new bumpersticker.BumperSticker();
        jButton1 = new javax.swing.JButton();
        JCombo = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        buttonCombo = new javax.swing.JButton();
        JTextArea = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        buttonClear = new javax.swing.JButton();
        buttonWindow1 = new javax.swing.JButton();
        buttonWindow2 = new javax.swing.JButton();
        buttonWindow3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        txtMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMessage.setText("jLabel3");
        txtMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonMessage.setText("OK");
        buttonMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMessageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtMessage)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonMessage)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(buttonMessage)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(radioMaiuscula);
        radioMaiuscula.setText("Maiuscula");
        radioMaiuscula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMaiusculaMouseClicked(evt);
            }
        });

        buttonGroup1.add(radioMinuscula);
        radioMinuscula.setText("Minuscula");
        radioMinuscula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMinusculaMouseClicked(evt);
            }
        });

        txtFrase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFraseKeyReleased(evt);
            }
        });

        jButton1.setText("BORA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JTextField.setLayer(radioMaiuscula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JTextField.setLayer(radioMinuscula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JTextField.setLayer(txtFrase, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JTextField.setLayer(bumperSticker1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JTextField.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JTextFieldLayout = new javax.swing.GroupLayout(JTextField);
        JTextField.setLayout(JTextFieldLayout);
        JTextFieldLayout.setHorizontalGroup(
            JTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTextFieldLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(JTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JTextFieldLayout.createSequentialGroup()
                        .addComponent(radioMaiuscula)
                        .addGap(44, 44, 44)
                        .addComponent(radioMinuscula)))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTextFieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTextFieldLayout.createSequentialGroup()
                        .addComponent(bumperSticker1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTextFieldLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(198, 198, 198))))
        );
        JTextFieldLayout.setVerticalGroup(
            JTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTextFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMaiuscula)
                    .addComponent(radioMinuscula))
                .addGap(18, 18, 18)
                .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(bumperSticker1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        JTabbedPane.addTab("JTextField", JTextField);

        jLabel1.setText("Combo1");

        jLabel2.setText("Combo2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula 1", "Aula 2", "Aula 3", "Aula 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula 1 opcao 1", "Aula 1 opcao 2", "Aula 1 opcao 3" }));

        buttonCombo.setText("Mostrar Valores das Combos");
        buttonCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonComboMouseClicked(evt);
            }
        });

        JCombo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JCombo.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JCombo.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JCombo.setLayer(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JCombo.setLayer(buttonCombo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JComboLayout = new javax.swing.GroupLayout(JCombo);
        JCombo.setLayout(JComboLayout);
        JComboLayout.setHorizontalGroup(
            JComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JComboLayout.createSequentialGroup()
                .addGroup(JComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JComboLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JComboLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JComboLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JComboLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(buttonCombo)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        JComboLayout.setVerticalGroup(
            JComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JComboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(JComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(buttonCombo)
                .addGap(54, 54, 54))
        );

        JTabbedPane.addTab("JCombo", JCombo);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAreaMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAreaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        JTextArea.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JTextAreaLayout = new javax.swing.GroupLayout(JTextArea);
        JTextArea.setLayout(JTextAreaLayout);
        JTextAreaLayout.setHorizontalGroup(
            JTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTextAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );
        JTextAreaLayout.setVerticalGroup(
            JTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTextAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabbedPane.addTab("JTextArea", JTextArea);

        jToolBar1.setRollover(true);

        buttonClear.setText("Limpar");
        buttonClear.setFocusable(false);
        buttonClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonClear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonClearMouseReleased(evt);
            }
        });
        jToolBar1.add(buttonClear);

        buttonWindow1.setText("Aba1");
        buttonWindow1.setFocusable(false);
        buttonWindow1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonWindow1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonWindow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonWindow1MouseReleased(evt);
            }
        });
        jToolBar1.add(buttonWindow1);

        buttonWindow2.setText("Aba2");
        buttonWindow2.setFocusable(false);
        buttonWindow2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonWindow2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonWindow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonWindow2MouseReleased(evt);
            }
        });
        jToolBar1.add(buttonWindow2);

        buttonWindow3.setText("Aba3");
        buttonWindow3.setFocusable(false);
        buttonWindow3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonWindow3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonWindow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonWindow3MouseReleased(evt);
            }
        });
        jToolBar1.add(buttonWindow3);

        jMenu1.setText("Arquivo");

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuSairMouseReleased(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        menuSobre.setText("Sobre");
        menuSobre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menuSobreMouseMoved(evt);
            }
        });
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuSobreMouseReleased(evt);
            }
        });

        jMenuItem1.setText("JTextField");
        menuSobre.add(jMenuItem1);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void menuSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseReleased
        this.dispose();
    }//GEN-LAST:event_menuSairMouseReleased

    private void buttonComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonComboMouseClicked
        txtMessage.setText("Combo 1 [" + jComboBox1.getSelectedItem() + "] Combo 2 [" + jComboBox2.getSelectedItem() +"]");
        jDialog1.setSize(350, 200);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_buttonComboMouseClicked

    private void txtFraseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFraseKeyReleased
        if(radioMaiuscula.isSelected()) {
            txtFrase.setText((txtFrase.getText()).toUpperCase());
        }
        if(radioMinuscula.isSelected()) {
            txtFrase.setText((txtFrase.getText()).toLowerCase());
        }
    }//GEN-LAST:event_txtFraseKeyReleased

    private void radioMinusculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMinusculaMouseClicked
        if(radioMaiuscula.isSelected()) {
            txtFrase.setText((txtFrase.getText()).toUpperCase());
        }
        if(radioMinuscula.isSelected()) {
            txtFrase.setText((txtFrase.getText()).toLowerCase());
        }
    }//GEN-LAST:event_radioMinusculaMouseClicked

    private void radioMaiusculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMaiusculaMouseClicked
        if(radioMaiuscula.isSelected()) {
            txtFrase.setText((txtFrase.getText()).toUpperCase());
        }
        if(radioMinuscula.isSelected()) {
            txtFrase.setText((txtFrase.getText()).toLowerCase());
        }
    }//GEN-LAST:event_radioMaiusculaMouseClicked

    private void buttonClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClearMouseReleased
        txtFrase.setText("");
        buttonGroup1.clearSelection();
        
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        
        jDialog1.setVisible(false);
        
        txtArea.setText("");
    }//GEN-LAST:event_buttonClearMouseReleased

    private void buttonWindow1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWindow1MouseReleased
        JTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_buttonWindow1MouseReleased

    private void buttonWindow2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWindow2MouseReleased
        JTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_buttonWindow2MouseReleased

    private void buttonWindow3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWindow3MouseReleased
        JTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_buttonWindow3MouseReleased

    private void menuSobreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseMoved
        this.jMenuItem1.setVisible(true);
        if(JTabbedPane.getSelectedIndex() == 0) {
            this.jMenuItem1.setText("JTextField");
        }
        if(JTabbedPane.getSelectedIndex() == 1) {
            this.jMenuItem1.setText("JCombo");
        }
        if(JTabbedPane.getSelectedIndex() == 2) {
            this.jMenuItem1.setText("JTextArea");
        }
    }//GEN-LAST:event_menuSobreMouseMoved

    private void menuSobreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseReleased
        this.jMenuItem1.setVisible(false);
    }//GEN-LAST:event_menuSobreMouseReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String[] newEntries1 = new String[] {"Aula 1 opcao 1", "Aula 1 opcao 2", "Aula 1 opcao 3"};
        String[] newEntries2 = new String[] {"Aula 2 opcao 1", "Aula 2 opcao 2", "Aula 2 opcao 3"};
        String[] newEntries3 = new String[] {"Aula 3 opcao 1", "Aula 3 opcao 2", "Aula 3 opcao 3"};
        String[] newEntries4 = new String[] {"Aula 4 opcao 1", "Aula 4 opcao 2", "Aula 4 opcao 3"};
        
        if(jComboBox1.getSelectedIndex() == 0) {
            jComboBox2.removeAllItems();
            for(String s : newEntries1) {
                jComboBox2.insertItemAt(s, jComboBox2.getItemCount());
            }
            jComboBox2.setSelectedIndex(0);
        }
        if(jComboBox1.getSelectedIndex() == 1) {
            jComboBox2.removeAllItems();
            for(String s : newEntries2) {
                jComboBox2.insertItemAt(s, jComboBox2.getItemCount());
            }
            jComboBox2.setSelectedIndex(0);
        }
        if(jComboBox1.getSelectedIndex() == 2) {
            jComboBox2.removeAllItems();
            for(String s : newEntries3) {
                jComboBox2.insertItemAt(s, jComboBox2.getItemCount());
            }
            jComboBox2.setSelectedIndex(0);
        }
        if(jComboBox1.getSelectedIndex() == 3) {
            jComboBox2.removeAllItems();
            for(String s : newEntries4) {
                jComboBox2.insertItemAt(s, jComboBox2.getItemCount());
            }
            jComboBox2.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void buttonMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMessageMouseClicked
        jDialog1.setVisible(false);
    }//GEN-LAST:event_buttonMessageMouseClicked

    private void txtAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaMouseEntered
        Color c = txtArea.getBackground();
        txtArea.setBackground(txtArea.getForeground());
        txtArea.setForeground(c);
    }//GEN-LAST:event_txtAreaMouseEntered

    private void txtAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaMouseReleased
        Color c = txtArea.getBackground();
        txtArea.setBackground(txtArea.getForeground());
        txtArea.setForeground(c);
    }//GEN-LAST:event_txtAreaMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bumperSticker1.go();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane JCombo;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JLayeredPane JTextArea;
    private javax.swing.JLayeredPane JTextField;
    private bumpersticker.BumperSticker bumperSticker1;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonCombo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonMessage;
    private javax.swing.JButton buttonWindow1;
    private javax.swing.JButton buttonWindow2;
    private javax.swing.JButton buttonWindow3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JRadioButton radioMaiuscula;
    private javax.swing.JRadioButton radioMinuscula;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtFrase;
    private javax.swing.JLabel txtMessage;
    // End of variables declaration//GEN-END:variables
}
