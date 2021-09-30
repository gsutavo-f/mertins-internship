package contaexception;

/**
 *
 * @author gsutavo
 */
public class Conta implements IConta {
    private int numconta;
    private double saldo;

    public Conta(int numconta) {
        this.numconta = numconta;
        this.saldo = 0.0;
    }

    public Conta(int numconta, double saldo) {
        this.numconta = numconta;
        this.saldo = saldo;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void deposito(double valor) throws ValorInvalidoException {
        if(valor <= 0.0) {
            throw new ValorInvalidoException("Valor invalido");
        }
        this.saldo += valor;
    }
    
}
