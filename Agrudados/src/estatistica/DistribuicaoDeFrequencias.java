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
    
    public void calcular()
    {
        calcularNumeroClasses();
        calcularIntervalo();
        calcularFrequencia();
        calcularFreqAcumulada();
        calcularFreqAbsoluta();
        calcularFreqAbsolutaAcumulada();
    }
    public void calcularNumeroClasses()
    {
        double valores[] = this.getConjunto();
        double log = Math.log10(valores.length);
        this.setNumClasses((int) ( 1 + 3.3 * log)); 
    }
    
    public void calcularIntervalo()
    {
        this.setIntervalo(truncate((this.getAmplitude() / (double)this.getNumClasses())));
    }
    
    public void calcularFrequencia()
    {
        int qtdeClasses = this.getNumClasses();
        
        double valIntervalo = truncate(this.getIntervalo());
        double valores[] = this.getConjunto();
        int frequencias[] = new int[qtdeClasses];
        double intervalo = truncate(valores[0]);
        
        for(int i = 0; i < qtdeClasses; i++)
        {
            for(int j = 0; j < valores.length; j++)
            {
                if( (valores[j] >= intervalo) && (valores[j] < intervalo + valIntervalo))
                {
                   frequencias[i]++;
                }
                else if (i == qtdeClasses - 1)
                {
                    if ((valores[j] >= truncate(intervalo)) && (valores[j] <= truncate(intervalo + valIntervalo))) {
                        frequencias[i]++;
                    }
                }
            }
            
            intervalo = truncate(this.getIntervalo() + intervalo);
            
        }
        this.setFrequencias(frequencias);
    }
    
    public void calcularFreqAcumulada()
    {
        int freqAcumulada[] = this.getFrequencias().clone();
        int anterior = 0;
        
        for(int i = 0; i < freqAcumulada.length; i++)
        {
            freqAcumulada[i] += anterior;
            anterior = freqAcumulada[i];
        }
        
        this.setFrequenciasAcumuladas(freqAcumulada);
    }
    
    public void calcularFreqAbsoluta()
    {
        int freq[] = this.getFrequencias().clone();
        double freqAbsoluta[] = new double[freq.length];
        int somatorio = 0;
        
        for(int i = 0; i < freq.length; i++)
        {
            somatorio += freq[i];
        }
        
        for(int i = 0; i < freq.length; i++)
        {
            freqAbsoluta[i] = truncate((double) freq[i] / somatorio);
        }
        
        this.setFrequenciaAbsoluta(freqAbsoluta);
    }
    
    public void calcularFreqAbsolutaAcumulada()
    {
        double freqAcumulada[] = this.getFrequenciaAbsoluta().clone();
        double anterior = 0;
        
        for(int i = 0; i < freqAcumulada.length; i++)
        {
            freqAcumulada[i] += anterior;
            anterior = freqAcumulada[i];
        }
        
        this.setFrequenciaAbsolutaAcumulada(freqAcumulada);
    }
    
    public static double truncate(double value) {
        double valor = Math.round(value * 1000) / 1000d;
        return valor;
    }

}
