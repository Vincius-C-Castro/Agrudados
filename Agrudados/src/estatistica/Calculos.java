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

    // Atributos utilizados nos cálculos da distribuição de frequências.
    private static int      numClasses;
    private static int      intervalo;
    private static int[]    frequencias;
    private static int[]    frequenciasAcumuladas;
    private static double[] frequenciaAbsoluta;
    private static double[] frequenciaAbsolutaAcumulada;

    /**
     * Classe inicializadora dos dados necessários para realizar os cálculos.
     *
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
        DistribuicaoDeFrequencias distFreq = new DistribuicaoDeFrequencias();

        // Realiza os cálculos das medidas centrais.
        medidasCentral.calcular();
        // Realiza os cálculos das medidas de dispersao.
        medidasDispersao.calcular();
        
        /**
         * Realiza os cálculos para montagem da tabela de distribuição de 
         * frequências.
         */
        distFreq.calcular();

    }

    public void setConjunto(double[] conjunto) {
        Calculos.conjunto = conjunto;
    }

    public double[] getConjunto() {
        return Calculos.conjunto;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        Calculos.media = media;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        Calculos.mediana = mediana;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        Calculos.moda = moda;
    }

    public int getIndiceModa() {
        return indiceModa;
    }

    public void setIndiceModa(int indiceModa) {
        Calculos.indiceModa = indiceModa;
    }

    public double getVariancia() {
        return variancia;
    }

    public void setVariancia(double variancia) {
        Calculos.variancia = variancia;
    }

    public double getDesvioMedio() {
        return desvioMedio;
    }

    public void setDesvioMedio(double desvioMedio) {
        Calculos.desvioMedio = desvioMedio;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(double desvioPadrao) {
        Calculos.desvioPadrao = desvioPadrao;
    }

    public boolean isConjuntoAmostral() {
        return conjuntoAmostral;
    }

    public void setConjuntoAmostral(boolean conjuntoAmostral) {
        Calculos.conjuntoAmostral = conjuntoAmostral;
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        Calculos.amplitude = amplitude;
    }

    public double getCoeficienteVariacao() {
        return coeficienteVariacao;
    }

    public void setCoeficienteVariacao(double coeficienteVariacao) {
        Calculos.coeficienteVariacao = coeficienteVariacao;
    }

    public int getNumClasses() {
        return numClasses;
    }

    public void setNumClasses(int numClasses) {
        Calculos.numClasses = numClasses;
    }

    public int getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(int intervalo) {
        Calculos.intervalo = intervalo;
    }
    
    public int[] getFrequencias() {
        return frequencias;
    }

    public void setFrequencias(int[] frequencias) {
        Calculos.frequencias = frequencias;
    }

    public int[] getFrequenciasAcumuladas() {
        return frequenciasAcumuladas;
    }

    public void setFrequenciasAcumuladas(int[] frequenciasAcumuladas) {
        Calculos.frequenciasAcumuladas = frequenciasAcumuladas;
    }

    public double[] getFrequenciaAbsoluta() {
        return frequenciaAbsoluta;
    }

    public void setFrequenciaAbsoluta(double[] frequenciaAbsoluta) {
        Calculos.frequenciaAbsoluta = frequenciaAbsoluta;
    }

    public double[] getFrequenciaAbsolutaAcumulada() {
        return frequenciaAbsolutaAcumulada;
    }

    public void setFrequenciaAbsolutaAcumulada(double[] frequenciaAbsolutaAcumulada) {
        Calculos.frequenciaAbsolutaAcumulada = frequenciaAbsolutaAcumulada;
    }
    
}
