package funcionarios;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jpa_departamento")
public class Departamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod;
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="departamento")
    @JoinColumn(name="cod_departamento")
    private List<Funcionario> funcionarios;

    public Departamento() {
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
