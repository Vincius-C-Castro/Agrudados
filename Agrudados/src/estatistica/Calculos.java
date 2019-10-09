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
public class Calculos {

    // Conjunto de valores digitados na tabela.
    private static double conjunto[];

    // Atributos utilizados nos cálculos de medidas centrais.   
    private static double media;
    private static double mediana;
    private static double moda;
    private static int indiceModa;

    // Atributos utilizados nos cálculos de medidas de dispersão.
    private static double variancia;
    private static double desvioMedio;
    private static double desvioPadrao;
    private static boolean conjuntoAmostral;
    private static double amplitude;
    private static double coeficienteVariacao;


    /**
     * Classe inicializadora dos dados necessários para realizar os cálculos.
     * @param conjunto : Vetor contendo todos elementos do conjunto.
     * @param isAmostral : Boolean que indica se o conjunto é amostral ou
     * populacional.
     * 
     * Obs.: Este método executa os cálculos automáticamente.
     */
    public void iserirDados(double conjunto[], boolean isAmostral) {
        setConjuntoAmostral(isAmostral);
        setConjunto(conjunto);
        calcularTudo();
    }

    private void calcularTudo() {
        
        Central medidasCentral = new Central();
        Dispersao medidasDispersao = new Dispersao();
        
        // Realiza os cálculos das medidas centrais.
        medidasCentral.calcular();
        // Realiza os cálculos das medidas de dispersao.
        medidasDispersao.calcular();
    }

    public void setConjunto(double[] conjunto) {
        this.conjunto = conjunto;
    }

    public double[] getConjunto() {
        return this.conjunto;
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

    public int getIndiceModa() {
        return indiceModa;
    }

    public void setIndiceModa(int indiceModa) {
        this.indiceModa = indiceModa;
    }

    public double getVariancia() {
        return variancia;
    }

    public void setVariancia(double variancia) {
        this.variancia = variancia;
    }

    public double getDesvioMedio() {
        return desvioMedio;
    }

    public void setDesvioMedio(double desvioMedio) {
        this.desvioMedio = desvioMedio;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public boolean isConjuntoAmostral() {
        return conjuntoAmostral;
    }

    public void setConjuntoAmostral(boolean conjuntoAmostral) {
        this.conjuntoAmostral = conjuntoAmostral;
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public double getCoeficienteVariacao() {
        return coeficienteVariacao;
    }

    public void setCoeficienteVariacao(double coeficienteVariacao) {
        this.coeficienteVariacao = coeficienteVariacao;
    }

}
