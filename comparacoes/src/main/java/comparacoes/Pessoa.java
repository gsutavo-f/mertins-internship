package comparacoes;

/**
 *
 * @author gsutavo
 */
public class Pessoa implements Comparable {
    private String primeiroNome;
    private String ultimoNome;
    
    public Pessoa(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    
    public String toString() {
        return String.format("[primeiroNome=%s %s]", this.primeiroNome, this.ultimoNome);
    }
    
    @Override
    public boolean equals (Object obj) {
        if(!(obj instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) obj;
        
        return this.primeiroNome.equals(pessoa.getPrimeiroNome()) && this.ultimoNome.equals(pessoa.getUltimoNome());
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.primeiroNome != null ? this.primeiroNome.hashCode() : 0);
        hash = 79 * hash + (this.ultimoNome != null ? this.ultimoNome.hashCode() : 0);
        
        return hash;
    }
    

    @Override
    public int compareTo(Object o) {
        Pessoa pessoa = (Pessoa) o;
        int ultimoNome = this.ultimoNome.compareTo(pessoa.getUltimoNome());
        return ((ultimoNome == 0) ? this.primeiroNome.compareTo(pessoa.getPrimeiroNome()) : ultimoNome);
    }
    
}
