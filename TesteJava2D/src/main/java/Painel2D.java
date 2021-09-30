
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author gsutavo
 */
public class Painel2D extends javax.swing.JPanel {

    public Painel2D() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint cyanToYellow = new GradientPaint(50, 50, Color.cyan, 488, 272, Color.yellow);
        g2.setPaint(cyanToYellow);
        g2.fill(new Rectangle2D.Double(2, 2, 488, 272));
        
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.red);
        g2d.fillArc(posX, posY, 10, 10, 0, 360);
        g2d.dispose();
    }
    private int posX = 0;
    private int posY = 0;

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
        this.repaint();
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
