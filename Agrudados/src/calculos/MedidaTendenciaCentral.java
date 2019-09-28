/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author viny-
 */
public class MedidaTendenciaCentral {
    
    private double media;
    private double mediana;
    private double moda;
    
    public void realizarCalculos(double valores[]){
        
        calcularMedia(valores);
        calcularModa(valores);
    }
    
    private void calcularMedia(double valores[])
    {
        double soma = 0;
        
        for(int i = 0; i < valores.length; i++)
        {
            soma += valores[i];
        }
        
        this.setMedia(soma/valores.length);
           
    }

    private void calcularModa(double valores[])        
    {
        int[] cont = new int[valores.length];
        int vezes = 0;
        int indice = 0;
        for (int i=0; i < valores.length; i++) {
            for (int j=0;j < valores.length; j++) {
                if(valores[i] == valores[j]) {
                    cont[i] = cont[i] + 1;
                }
            }
        }
        vezes = cont[0];
        for (int i=0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }
        
        this.setModa(valores[indice]);
    }
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }
    
}
