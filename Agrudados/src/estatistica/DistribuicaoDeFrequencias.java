/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatistica;

/**
 *
 * @author viny-
 */
public class DistribuicaoDeFrequencias extends Calculos {
    
    public void calcularNumeroClasses()
    {
        double valores[] = this.getConjunto();
        double log = Math.log10(valores.length);
        this.setNumClasses((int) ( 1 + 3.3 * log)); 
    }
    
    public void calcularIntervalo()
    {
        this.setIntervalo(this.getAmplitude() / this.getNumClasses());
    }
}
