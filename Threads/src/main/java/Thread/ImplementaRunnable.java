package Thread;

/**
 *
 * @author gsutavo
 */
public class ImplementaRunnable implements Runnable {
    private int count = 57678;
    
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName());
            if(--count == 0) {
                return;
            }
        }
    }
}
