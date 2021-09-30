package Thread;

/**
 *
 * @author gsutavo
 */
public class Sleeper extends Thread {
    
    public Sleeper(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println("Thread: " + getId() + " " + getName() + " dormiu!");
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(getId() + " " + getName() + " foi interrompida!");
            return;
        }
        System.out.println(getId() + " " + getName() + " despertou");
    }
    
}
