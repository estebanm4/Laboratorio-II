/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.ii;

/**
 *
 * @author FLIA. ESCAMAL
 */
public class Caja {
    private double dinero;

    public Caja(double dinero) {
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Dinero en caja: " + dinero;
    }
    
    
    
}
