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
public class Moda extends Calculos {
    
    public int calculaModa (double vetor[])
    {
        int[] cont = new int[6];
        int vezes = 0;
        int indice = 0;
        boolean amodal = true;
        
        for (int i=0; i < 6; i++) {
            for (int j=0;j <6; j++) {
                
                if(vetor[i] == vetor[j]) {
                    cont[i] = cont[i] + 1;
                }
            }
        }
        
        vezes = cont[0];
        for (int i=0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
                amodal = false;
            }
        }
        
        if(amodal)
        {
            indice = -1;
        }
        
        return indice;
    }
    
}
