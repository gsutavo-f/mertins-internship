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
public interface IConta {
    
    public abstract void deposito(double valor);
    public abstract void saque(double valor);
    public abstract void atualiza(double taxa);
    @Override
    public abstract String toString();
    public abstract boolean equals(Conta c);
    
}
