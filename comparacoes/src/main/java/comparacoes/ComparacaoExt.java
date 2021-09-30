package comparacoes;

import java.util.Comparator;

/**
 *
 * @author gsutavo
 */
public class ComparacaoExt implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Pessoa pessoa1 = (Pessoa) o1;
        Pessoa pessoa2 = (Pessoa) o2;
        
        int primComp = pessoa1.getPrimeiroNome().compareTo(pessoa2.getPrimeiroNome());
        return ((primComp == 0) ? pessoa1.getUltimoNome().compareTo(pessoa2.getUltimoNome()) : primComp);
    }

}
