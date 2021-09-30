import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author gsutavo
 */
public class ThreadSwing extends javax.swing.JFrame {

    private Thread t1;

    public ThreadSwing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCont = new javax.swing.JTextField();
        buttonStart = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        pbValor = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor do contador:");

        txtCont.setEditable(false);
        txtCont.setText("0");

        buttonStart.setText("Comecar");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancelar");
        buttonCancel.setEnabled(false);
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        pbValor.setMaximum(900000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonStart)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCont, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtCont, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonStart)
                    .addComponent(buttonCancel))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
        this.buttonStart.setEnabled(false);
        this.buttonCancel.setEnabled(true);
        
        final int contador = 900000;
        
        System.out.println("Thread Swing: " + Thread.currentThread().getId());
        
        final JFrame janela = this;
        
        Runnable showContador;
        showContador = () -> {
            try {
                System.out.println("Thread Contador: " + Thread.currentThread().getId());
                for(int i = 1; i <= contador; i++) {
                    txtCont.setText(Integer.toString(i));
                    pbValor.setValue(i);
                }
            } catch (Error ex) {                
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(janela, "Operacao Cancelada");
                });
            }
        };
        
        this.t1 = new Thread(showContador);
        t1.start();
    }//GEN-LAST:event_buttonStartActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.buttonStart.setEnabled(true);
        this.buttonCancel.setEnabled(false);
        
        if(t1.isAlive()) {
            t1.interrupt();
        } else {
            final JFrame janela = this;
            JOptionPane.showMessageDialog(janela, "Operacao Cancelada");
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ThreadSwing().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pbValor;
    private javax.swing.JTextField txtCont;
    // End of variables declaration//GEN-END:variables
}
