package calculadoraBonita;

public class Soma extends OperMatematica {
    
    public Soma() {
        
    }
    
    /**
     *
     * @param x
     * @param y
     * @return x+y
     */
    @Override
    public double calcular(double x, double y) {
        return x + y;
    }
    
}
