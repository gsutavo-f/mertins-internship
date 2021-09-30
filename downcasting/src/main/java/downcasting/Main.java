package downcasting;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
        Classe1[] x = {new Classe1(), new Classe2()};
                
        for(int i = 0; i < x.length; i++) {
            x[i].metodo1();
            x[i].metodo2();
            if(x[i] instanceof Classe2) {
                x[i].metodo3();
            }
        }
    }
    
}
