package Thread;

/**
 *
 * @author gsutavo
 */
public class WithoutSync {
    private int nextSerialNum = 10001;
    
    public int getNextSerialNum() {
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
