package exemplo.ejb;

import exemplo.modelo.Pessoa;
import javax.ejb.Remote;

@Remote
public interface PessoaRemote {
    public Pessoa salvar(Pessoa p) throws Exception;
    public Pessoa consultarPorId(Long id);
    public void remover(Long id);
}
