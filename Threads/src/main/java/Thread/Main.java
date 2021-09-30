package Thread;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
//        ImplementaRunnable i1 = new ImplementaRunnable();
//        ImplementaRunnable i2 = new ImplementaRunnable();
//        ImplementaRunnable i3 = new ImplementaRunnable();
//        ImplementaRunnable i4 = new ImplementaRunnable();
//        Thread t1 = new Thread(i1, "primeira");
//        Thread t2 = new Thread(i2, "segunda");
//        Thread t3 = new Thread(i3, "terceira");
//        Thread t4 = new Thread(i4, "quarta");
//        
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        
//        Thread ts1 = new Sleeper("T1");
//        ts1.start();
//        try {
//            System.out.println("Aguardando a thread terminar");
//            ts1.join();
//        } catch(InterruptedException e) {
//            System.out.println("Thread principal interrompida");
//        }
//        System.out.println("Fim da Thread principal");
        
//        try {
//            Thread ti1 = new Sleeper("T1");
//            ti1.start();
//            Thread.sleep(1000);
//            ti1.interrupt();
//            System.out.println("Fim da Thread principal");
//        } catch(InterruptedException e) {
//            System.out.println("Thread principal interrompida");
//        }
        
//        // ?????
//        System.out.println("Inicio da thread principal");
//        Thread td1 = new Sleeper("T1");
//        td1.setDaemon(true);
//        td1.start();
//        System.out.println("Fim da thread principal");

//        final WithoutSync ws = new WithoutSync();
//        try {
//            Runnable r = new Runnable() {
//                public void run() {
//                    ws.print("getNextSerialNum()=" + ws.getNextSerialNum());
//                }
//            };
//            Thread threadA = new Thread(r, "threadA");
//            threadA.start();
//            Thread.sleep(1500);
//            Thread threadB = new Thread(r, "threadB");
//            threadB.start();
//            Thread.sleep(500);
//            Thread threadC = new Thread(r, "threadC");
//            threadC.start();
//            Thread.sleep(2500);
//            Thread threadD = new Thread(r, "threadD");
//            threadD.start();
//        } catch(InterruptedException x) {
//            
//        }
        
//        final WithSync ws = new WithSync();
//        try {
//            Runnable r = new Runnable() {
//                public void run() {
//                    ws.print("getNextSerialNum()=" + ws.getNextSerialNum());
//                }
//            };
//            Thread threadA = new Thread(r, "threadA");
//            threadA.start();
//            Thread.sleep(1500);
//            Thread threadB = new Thread(r, "threadB");
//            threadB.start();
//            Thread.sleep(500);
//            Thread threadC = new Thread(r, "threadC");
//            threadC.start();
//            Thread.sleep(2500);
//            Thread threadD = new Thread(r, "threadD");
//            threadD.start();
//        } catch(InterruptedException x) {
//            
//        }

        new TarefasParalelas().executar();

    }
    
}
