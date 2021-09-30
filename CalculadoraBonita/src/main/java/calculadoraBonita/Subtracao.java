package calculadoraBonita;

public class Subtracao extends OperMatematica {
    
    public Subtracao() {

    }
    
    /**
     *
     * @param x
     * @param y
     * @return x-y
     */
    @Override
    public double calcular(double x, double y) {
        return x - y;
    }
    
}
