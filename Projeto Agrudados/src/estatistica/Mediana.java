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
public class Mediana extends Calculos {
    
    public double calculaMediana(double vetor[])
    {
        double mediana;
        
        if(vetor.length%2 == 0)
        {
            mediana = (vetor[vetor.length/2] + vetor[vetor.length/2 -1])/2;
        }
        else
        {
            mediana = vetor[vetor.length/2 +1];
        }
        
        return mediana;
    }
    
}
