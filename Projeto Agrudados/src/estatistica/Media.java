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
public class Media extends Calculos {
    
    
    public double calculaMedia(double vetor[])
    {
        double media = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            
            media += vetor[i];
            
        }
        
        media = media/vetor.length;
        
        return media;
    }
    
}
