
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author gsutavo
 */
public class Navegador extends javax.swing.JFrame {
    
    public Navegador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        htmlPanel = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        txtPagina = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        htmlPanel.setEditable(false);
        jScrollPane1.setViewportView(htmlPanel);

        jButton1.setText("Carregar");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPagina)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    HyperlinkListener hyperLinkListener = new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                try {
                    System.out.println(e.getURL());
                    htmlPanel.setPage(e.getURL());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    };
    
    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        try {
            this.htmlPanel.setPage(this.txtPagina.getText());
        } catch(IOException ex) {
            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1FocusGained

    public static void main(String args[]) throws Exception {
        URL url = new URL("http://www.google.com.br");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        
        String inputLine;
        while((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navegador().setVisible(true);
            }
        });
        
        in.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane htmlPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPagina;
    // End of variables declaration//GEN-END:variables
}
