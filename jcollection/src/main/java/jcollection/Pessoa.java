package jcollection;

public class Pessoa {
    private String codigo;
    private String nome;
    private String dtNascimento;
    private String cidade;
    private String sexo;

    public Pessoa(String codigo, String nome, String dtNascimento, String cidade, String sexo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cidade = cidade;
        this.sexo = sexo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
