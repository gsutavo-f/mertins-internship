package drawing;

import javax.swing.JFrame;

/**
 *
 * @author gsutavo
 */
public class RunDesenho {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Run Panel");
        frame.setDefaultCloseOperation(3);
        
        Desenho panel = new Desenho();
        frame.add(panel);
        
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
