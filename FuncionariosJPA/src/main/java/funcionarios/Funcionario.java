package funcionarios;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="jpa_funcionario")
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod;
    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_contratacao")
    private Date dtContratacao;
    private double salario;
    @ManyToOne
    private Departamento departamento;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtContratacao() {
        return dtContratacao;
    }

    public void setDtContratacao(Date dtContratacao) {
        this.dtContratacao = dtContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cod=" + cod + ", nome=" + nome + ", dtContratacao=" + dtContratacao + ", salario=" + salario + ", departamento=" + departamento + '}';
    }
    
}
