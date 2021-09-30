package drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author gsutavo
 */
public class Desenho extends JPanel {
    private final int DEFAULT_WIDTH = 720;
    private final int DEFAULT_HEIGHT = 480;
    private final Color BACK_COLOR = Color.white;
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    private MyMouseHandler handler;
    private Graphics g;
    
    public Desenho() {
        setBackground(BACK_COLOR);
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        
        handler = new MyMouseHandler();
        
        this.addMouseListener(handler);
        this.addMouseMotionListener(handler);
    }
    
    private void setUpDrawingGraphics() {
        g = getGraphics();
    }
    
    private class MyMouseHandler extends MouseAdapter {
        
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            
            System.out.println("Mouse is being pressed at X: " + x1 + " Y: " + y1);
            
            setUpDrawingGraphics();
            
            x2 = x1;
            y2 = y1;
        }
        
        public void mouseDragged(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
                        
            g.setColor(Color.MAGENTA);
            g.drawLine(x1, y1, x2, y2);
            
            x2 = x1;
            y2 = y1;
        }
    }
    
}
