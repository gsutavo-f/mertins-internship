package exemplo.teste;

import exemplo.ejb.PessoaRemote;
import exemplo.modelo.Pessoa;
import javax.naming.InitialContext;

public class CadastroPessoa {
    public static void main(String[] args) throws Exception {
        InitialContext ctx = new InitialContext();
        PessoaRemote ejb = (PessoaRemote) ctx.lookup("exemplo.ejb.PessoaRemote");
        
        Pessoa p = new Pessoa();
        p.setNome("Gustavo Fernandes");
        p.setEmail("email@gmail.com");
        
        p = ejb.salvar(p);
        System.out.println("Pessoa salva: " + p.getId() + " - " + p.getNome());
    }
}
