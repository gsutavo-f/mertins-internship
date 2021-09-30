
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author gsutavo
 */
public class TextEditor extends javax.swing.JFrame {

    public TextEditor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtEditor = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openItem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEditor.setColumns(20);
        txtEditor.setRows(5);
        jScrollPane1.setViewportView(txtEditor);

        jMenu1.setText("Arquivo");

        openItem.setText("Abrir");
        openItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openItemActionPerformed(evt);
            }
        });
        jMenu1.add(openItem);

        saveItem.setText("Salvar");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
        FileInputStream fis = null;
        try {
            File arquivo = new File("/home/gsutavo/text.txt");
            fis = new FileInputStream(arquivo);
            txtEditor.setText("");
            int leitura = -1;
            do {
              leitura = fis.read();
              if(leitura != -1) {
                  txtEditor.setText(txtEditor.getText() + (char)leitura);
              }
            } while(leitura != -1);
            fis.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_openItemActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        String text = txtEditor.getText();
        FileOutputStream fos = null;
        try {
            File arquivo = new File("/home/gsutavo/text.txt");
            fos = new FileOutputStream(arquivo);
            byte[] dados = text.getBytes();
            fos.write(dados);
            fos.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_saveItemActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditor().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JTextArea txtEditor;
    // End of variables declaration//GEN-END:variables
}
