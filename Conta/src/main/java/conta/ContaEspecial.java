package conta;

/**
 *
 * @author gsutavo
 */
public class ContaEspecial extends Conta {
    
    public ContaEspecial() {
        super();
    }
    
    public ContaEspecial(int numeroConta) {
        super(numeroConta);
    }
    
    public ContaEspecial(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
    
    /**
     * @param taxa
     */
    @Override
    public void atualiza(double taxa) {
        super.setSaldo(this.getSaldo() * ((taxa*2) + 1.0));
    }
    
    /**
     * @param valor
     */
    @Override
    public void saque(double valor) {
        super.setSaldo(this.getSaldo() - valor - 0.10);
    }
    
}
