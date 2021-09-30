package comparacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(new Pessoa("Raimundo", "Donato"));
        lista.add(new Pessoa("Heleonora", "Silva"));
        lista.add(new Pessoa("Armindo", "Donato"));
        lista.add(new Pessoa("Tadeu", "Silva"));
        lista.add(new Pessoa("Armindo", "Silva"));
        System.out.printf("\n--------- Lista desordenada ---------\n");
        for(Pessoa p : lista) {
            System.out.printf("Nome: %s\n", p);
        }
        
        Collections.sort(lista);
        System.out.printf("\n---Ordenada pelo UltimoNome/PrimeiroNome - Padrão do Pessoa---------\n");
        for(Pessoa p : lista) {
            System.out.printf("Nome: %s\n", p);
        }
        
        Collections.sort(lista, new ComparacaoExt());
        System.out.printf("\n--- Ordenada pelo PrimeiroNom/UltimoNome ---------\n");
        for(Pessoa p : lista) {
            System.out.printf("Nome: %s\n", p);
        }
    }
    
}
