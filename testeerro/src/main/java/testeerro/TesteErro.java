package testeerro;

/**
 *
 * @author gsutavo
 */
public class TesteErro {
    
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Final do main");
    }
    
    static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Final do metodo1");
    }
    
    static void metodo2() {
        System.out.println("Inicio do metodo2");
        int[] array = new int[10];
        for(int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("Final do metodo2");  
    }
    
}

// linha 25
// java.lang.ArrayIndexOutOfBoundsException
// metodo2, metodo1, main