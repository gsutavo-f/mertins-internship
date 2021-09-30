package exercicios;

public class Exercicio2 {
    
    public static void main(String[] args) {
        int x = 12;
        int i = 0;
        fim:
        while(i < 10) {
            i++;
            x--;
            if(i == 4) {
                break fim;
            }
        }
        switch(x) { // x = 8 i = 4
            case 8:
                System.out.println("8");
            case 7:
                System.out.println("7"); // sim, pois n~ao tem um break apos o case 8
                break;
            default:
                System.out.println("--- Default ---");
        }
    } // 8 e 7
    
}
