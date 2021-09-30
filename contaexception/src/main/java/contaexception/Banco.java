package contaexception;

/**
 *
 * @author gsutavo
 */
public class Banco {
    
    public static void main(String[] args) throws ValorInvalidoException {
        Conta c = new Conta(15);
        
        System.out.println(c.getNumconta() + " -> R$" + c.getSaldo());
        c.deposito(15.0);
        System.out.println(c.getNumconta() + " -> R$" + c.getSaldo());
        c.deposito(2.0);
        System.out.println(c.getNumconta() + " -> R$" + c.getSaldo());
        c.deposito(-3.0);
        System.out.println(c.getNumconta() + " -> R$" + c.getSaldo());
        c.deposito(-15.0);
        System.out.println(c.getNumconta() + " -> R$" + c.getSaldo());
        c.deposito(-2.6);
        System.out.println(c.getNumconta() + " -> R$" + c.getSaldo());
        c.deposito(4.2);
        System.out.println(c.getNumconta() + " -> R$" + c.getSaldo());
    }
    
}

// excecao nao checada
