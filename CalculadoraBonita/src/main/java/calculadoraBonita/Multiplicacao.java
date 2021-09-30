/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraBonita;

/**
 *
 * @author gsutavo
 */
public class Multiplicacao extends OperMatematica {
    
    public Multiplicacao() {
        
    }

    /**
     *
     * @param x
     * @param y
     * @return x*y
     */
    @Override
    public double calcular(double x, double y) {
        return x * y;
    }
    
}
