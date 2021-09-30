package serializacao;

import java.io.Serializable;

/**
 *
 * @author gsutavo
 */
public class Pessoa implements Serializable {
    private long id;
    private String nome;

    public Pessoa() {
        System.out.println("Executou construtor");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
