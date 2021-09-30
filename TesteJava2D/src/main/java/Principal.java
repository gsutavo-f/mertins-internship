
import java.awt.Graphics;

/**
 *
 * @author gsutavo
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel2D = new Painel2D();
        leftButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("JDegrade"); // NOI18N

        painel2D.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painel2D.setPreferredSize(new java.awt.Dimension(492, 276));

        javax.swing.GroupLayout painel2DLayout = new javax.swing.GroupLayout(painel2D);
        painel2D.setLayout(painel2DLayout);
        painel2DLayout.setHorizontalGroup(
            painel2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        painel2DLayout.setVerticalGroup(
            painel2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        leftButton.setText("Left");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        rightButton.setText("Right");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        upButton.setText("Up");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        downButton.setText("Down");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rightButton)
                        .addGap(51, 51, 51)
                        .addComponent(downButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(leftButton)
                        .addGap(74, 74, 74)
                        .addComponent(upButton))
                    .addComponent(painel2D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(painel2D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rightButton)
                    .addComponent(downButton)
                    .addComponent(leftButton)
                    .addComponent(upButton))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        if(painel2D.getPosX() > 0) {
            painel2D.setPosX(painel2D.getPosX() - 12);
        } else {
            painel2D.setPosX(0);
        }
    }//GEN-LAST:event_leftButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        if(painel2D.getPosX() < 480) {
            painel2D.setPosX(painel2D.getPosX() + 12);
        } else {
            painel2D.setPosX(480);
        }
    }//GEN-LAST:event_rightButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        if(painel2D.getPosY() > 0) {
            painel2D.setPosY(painel2D.getPosY() - 12);
        } else {
            painel2D.setPosY(0);
        }
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        if(painel2D.getPosY() < 264) {
            painel2D.setPosY(painel2D.getPosY() + 12);
        } else {
            painel2D.setPosY(264);
        }
            
    }//GEN-LAST:event_downButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downButton;
    private javax.swing.JButton leftButton;
    private Painel2D painel2D;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
