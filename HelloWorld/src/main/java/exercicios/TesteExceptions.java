package exercicios;

public class TesteExceptions {
    
    public static void main(String[] args) {
        int c = 11;
        
        try {
            c += 1;
            while(c < 14) {
                if(c == 13) {
                    throw new Exception();
                }
                c += 3;
            }
        } catch (Exception e) {
            c += 5;
        } finally {
            c += 6;
        }
        System.out.println("Valor = " + c);
    }
    
}
