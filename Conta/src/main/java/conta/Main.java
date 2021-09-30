/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta(10, 0.0);
        Conta c2 = new Conta(10, 50.0);
        
        System.out.println(c1.equals(c2));
        c2.deposito(25.0);
        c2.saque(15.0);
        c2.atualiza(0.15);
        System.out.println(c2.getSaldo());
        
        ContaEspecial ce1 = new ContaEspecial(15, 150.0);
        
        System.out.println(ce1.getSaldo());
        ce1.saque(20.0);
        System.out.println(ce1.getSaldo());
        ce1.atualiza(0.25);
        System.out.println(ce1.getSaldo());
    }
}
