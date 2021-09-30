package semprefinally;

/**
 *
 * @author gsutavo
 */
public class SempreFinally {
    
    public static void main(String[] args) {
        System.out.println("------");
        System.out.println("Entrando no primeiro bloco try");
        try {
            System.out.println("Entrando no segundo bloco try");
            try {
                throw new MinhaException();
            } finally {
                System.out.println("FINALLY do segundo bloco TRY");
            }
        } catch(MinhaException e) {
            System.out.println("Capturando MinhaException no primeiro bloco TRY");
        } finally {
            System.out.println("FINALLY do primeiro bloco TRY");
            System.out.println("------");
        }
    }
    
}
