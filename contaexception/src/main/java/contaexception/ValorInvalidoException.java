package contaexception;

/**
 *
 * @author gsutavo
 */
public class ValorInvalidoException extends Exception {

    ValorInvalidoException(String valor_invalido) {
        System.out.println("Valor inserido como argumento invalido para o metodo");
    }
    
}
