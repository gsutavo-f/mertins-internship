package Thread;

/**
 *
 * @author gsutavo
 */
public class WithSync {
    private static int nextSerialNum = 10001;
    
    public synchronized int getNextSerialNum() {
        int sn = nextSerialNum;
        
        try {
            Thread.sleep(1000);
        } catch(InterruptedException x) {
            
        }
        
        nextSerialNum++;
        return sn;
    }
    
    public void print(String msg) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ": " + msg);
    }
}
