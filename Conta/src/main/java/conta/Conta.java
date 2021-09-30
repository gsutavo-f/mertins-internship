package conta;

/**
 *
 * @author gsutavo
 */
public class Conta implements IConta {
    private int numeroConta;
    private double saldo;
    
    /**
     * Constructor Methods
     */
    public Conta() {
        this.numeroConta = 0;
        this.saldo = 0.0;
    }
    
    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    
    /**
     * Getters and Setters
     * @return 
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param valor 
     */
    @Override
    public void deposito(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    /**
     * @param valor
     */
    @Override
    public void saque(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }
    
    /**
     * @param taxa
     */
    @Override
    public void atualiza(double taxa) {
        this.setSaldo(this.getSaldo() * (taxa + 1.0));
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Conta numero: " + this.numeroConta;
    }
    
    /**
     * @param c
     * @return
     */
    @Override
    public boolean equals(Conta c) {
        if(this.numeroConta == c.numeroConta) { return true; }
        return false;
    }
}
