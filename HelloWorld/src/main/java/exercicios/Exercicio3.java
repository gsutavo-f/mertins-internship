package exercicios;

public class Exercicio3 {
    
    public int processaValor(int val) {
        int temp1 = val + 20;
        int temp2 = temp1 * 9;
        int temp3 = temp2 + temp1 * 3;
        int temp4 = temp3 % temp2;
        return temp4;                   // temp1 = 35 temp2 = 315 temp3 = 420 temp4 = 105
    }
    
    public static void main(String[] args) {
        int temp1 = 15;
        Exercicio3 exercicio = new Exercicio3();
        int temp2 = exercicio.processaValor(temp1);
        System.out.printf("Exercicio 3: %d\n", temp2); // temp1 = 15 temp2 = 105
    }
    
}
