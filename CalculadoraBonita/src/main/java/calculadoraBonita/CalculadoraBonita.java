package calculadoraBonita;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CalculadoraBonita extends javax.swing.JFrame {
    Soma soma = new Soma();
    Subtracao sub = new Subtracao();
    Multiplicacao mult = new Multiplicacao();
    Divisao div = new Divisao();

    public CalculadoraBonita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelVariaveis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        panelSelecao = new javax.swing.JPanel();
        radioSoma = new javax.swing.JRadioButton();
        radioSub = new javax.swing.JRadioButton();
        radioMult = new javax.swing.JRadioButton();
        radioDiv = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        panelResultado = new javax.swing.JPanel();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Bonita");
        setName("Calculadora Bonita"); // NOI18N
        setResizable(false);

        panelVariaveis.setBorder(javax.swing.BorderFactory.createTitledBorder("Preencha os valores"));
        panelVariaveis.setToolTipText("");
        panelVariaveis.setName("Preencha os Valores"); // NOI18N

        jLabel1.setText("Primeiro Valor");

        jLabel2.setText("Segundo Valor");

        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum1KeyReleased(evt);
            }
        });

        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelVariaveisLayout = new javax.swing.GroupLayout(panelVariaveis);
        panelVariaveis.setLayout(panelVariaveisLayout);
        panelVariaveisLayout.setHorizontalGroup(
            panelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVariaveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelVariaveisLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(panelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNum1)
                            .addComponent(txtNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVariaveisLayout.setVerticalGroup(
            panelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVariaveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelVariaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelSelecao.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha a operacao"));

        buttonGroup1.add(radioSoma);
        radioSoma.setText("Soma");
        radioSoma.setName("radioSoma"); // NOI18N

        buttonGroup1.add(radioSub);
        radioSub.setText("Subtracao");
        radioSub.setName("rasioSub"); // NOI18N

        buttonGroup1.add(radioMult);
        radioMult.setText("Multiplicacao");
        radioMult.setName("radioMult"); // NOI18N

        buttonGroup1.add(radioDiv);
        radioDiv.setText("Divisao");
        radioDiv.setName("radioDiv"); // NOI18N

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSelecaoLayout = new javax.swing.GroupLayout(panelSelecao);
        panelSelecao.setLayout(panelSelecaoLayout);
        panelSelecaoLayout.setHorizontalGroup(
            panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSelecaoLayout.createSequentialGroup()
                        .addComponent(radioSoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioSub))
                    .addGroup(panelSelecaoLayout.createSequentialGroup()
                        .addComponent(radioMult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(radioDiv)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelSelecaoLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelSelecaoLayout.setVerticalGroup(
            panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSoma)
                    .addComponent(radioSub))
                .addGap(18, 18, 18)
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMult)
                    .addComponent(radioDiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        panelResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        panelResultado.setName("Resultado"); // NOI18N

        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("resultado");

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelVariaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(radioSoma.isSelected()) {
            result.setText(String.valueOf(soma.calcular(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()))));
        }
        if(radioSub.isSelected()) {
            result.setText(String.valueOf(sub.calcular(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()))));
        }
        if(radioMult.isSelected()) {
            result.setText(String.valueOf(mult.calcular(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()))));
        }
        if(radioDiv.isSelected()) {
            result.setText(String.valueOf(div.calcular(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()))));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyReleased
        // TODO add your handling code here:
        try {
            long number = Long.parseLong(txtNum1.getText());
        } catch (Exception e) {
            txtNum1.setText(txtNum1.getText().substring(0, txtNum1.getText().length() - 1) + "");
        }
    }//GEN-LAST:event_txtNum1KeyReleased

    private void txtNum2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyReleased
        // TODO add your handling code here:
        try {
            long number = Long.parseLong(txtNum2.getText());
        } catch (Exception e) {
            txtNum2.setText(txtNum2.getText().substring(0, txtNum2.getText().length() - 1) + "");
        }
    }//GEN-LAST:event_txtNum2KeyReleased

    public static void main(String args[]) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBonita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBonita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBonita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBonita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraBonita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JPanel panelSelecao;
    private javax.swing.JPanel panelVariaveis;
    private javax.swing.JRadioButton radioDiv;
    private javax.swing.JRadioButton radioMult;
    private javax.swing.JRadioButton radioSoma;
    private javax.swing.JRadioButton radioSub;
    private javax.swing.JLabel result;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
