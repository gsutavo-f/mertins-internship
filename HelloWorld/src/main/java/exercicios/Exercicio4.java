package exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        
        mat.setValor(10);
        mat.dobra();
        if(mat.getValor() != 20) {
            System.out.println("--- Erro, metodo dobra() nao funciona");
            System.exit(1);
        }
        
        mat.setValor(34);
        mat.quadruplica();
        if(mat.getValor() != 136) {
            System.out.println("--- Erro, metodo quadruplica() nao funciona");
            System.exit(2);
        }
        
        mat.soma(4);
        if(mat.getValor() != 140) {
            System.out.println("--- Erro, metodo soma(int) nao funciona");
            System.exit(3);
        }
        System.out.println("--- Todos os testes foram bem sucedidos!");
    }
    
}

class Matematica {
    private int valor;

    public Matematica() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void dobra() {
        this.valor *= 2;
    }
    
    public void quadruplica() {
        this.valor *= 4;
    }
    
    public void soma(int numero) {
        this.valor += numero;
    }
    
    
}
