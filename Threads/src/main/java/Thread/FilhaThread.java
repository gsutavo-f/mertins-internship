package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gsutavo
 */
public class FilhaThread extends Thread {
    private int count = 100;
    
    public FilhaThread(String nome) {
        super(nome);
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                System.out.println(this.getId() + " " + this.getName());
                Thread.sleep(1000);
                if(--count == 0) {
                    return;
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
