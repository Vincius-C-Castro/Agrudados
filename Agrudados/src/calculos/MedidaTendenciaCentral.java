/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import java.util.Arrays;

/**
 *
 * @author viny-
 */
public class MedidaTendenciaCentral {

    private double media;
    private double mediana;
    private double moda;
    private int indiceModa;
    private double variancia;
    private double desvioMedio;
    private double desvioPadrao;
    private boolean conjuntoAmostral;
    private double amplitude;
    private double coeficienteVariacao;

    public void realizarCalculos(double valores[]) {

        calcularMedia(valores);
        calcularModa(valores);
        calcularMediana(valores);
        calcularVariancia(valores);
        calcularDesvioMedio(valores);
        calcularDesvioPadrao(valores);
        calcularAmplitude(valores);
        calcularCoeficienteVariacao();
    }

    private void calcularMedia(double valores[]) {
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        this.setMedia(soma / valores.length);

    }

    private void calcularModa(double valores[]) {
        int[] cont = new int[valores.length];
        int vezes = 0;
        int indice = 0;
        int repeat = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                    cont[i] = cont[i] + 1;
                }
            }
        }
        vezes = cont[0];
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }

        if (vezes > 1) {
            for (int i = 0; i < cont.length; i++) {
                if (cont[i] == vezes) {
                    repeat++;
                }
            }

            repeat /= cont[indice];
        } else {
            repeat = 0;
        }

        switch (repeat) {
            case 0: {
                this.setIndiceModa(-1);
            }
            break;

            case 1: {
                this.setModa(valores[indice]);
                this.setIndiceModa(indice);
            }
            break;

            case 2: {
                this.setIndiceModa(-2);
            }
            break;

            default: {
                this.setIndiceModa(-3);
            }
            break;

        }
    }

    private void calcularMediana(double valores[]) {
        int esq = 0;
        int dir = valores.length - 1;
        int meio;
        meio = (esq + dir) / 2;

        this.setMediana(valores[meio]);
    }

    private void calcularDesvioPadrao(double valores[]) {
        if (valores.length == 1) {
            this.setDesvioPadrao(0.0);
        } else {
            double soma = 0l;
            for (int i = 0; i < valores.length; i++) {
                double result = valores[i] - this.getMedia();
                soma = soma + result * result;
            }

            if (isConjuntoAmostral()) {
                this.setDesvioPadrao(Math.sqrt(((double) 1 / (valores.length - 1))
                        * soma));
            } else {
                this.setDesvioPadrao(Math.sqrt(((double) 1 / (valores.length))
                        * soma));
            }

        }
    }

    private void calcularVariancia(double valores[]) {
        if (valores.length == 1) {
            this.setVariancia(0.0);
        } else {
            double soma = 0l;
            for (int i = 0; i < valores.length; i++) {
                double result = valores[i] - this.getMedia();
                soma = soma + result * result;
            }

            if (isConjuntoAmostral()) {
                this.setVariancia(((double) 1 / (valores.length - 1))
                        * soma);
            } else {
                this.setVariancia(((double) 1 / (valores.length))
                        * soma);
            }

        }
    }

    private void calcularDesvioMedio(double valores[]) {
        if (valores.length == 1) {
            this.setDesvioMedio(0.0);
        } else {
            double soma = 0l;
            for (int i = 0; i < valores.length; i++) {
                double result = valores[i] - this.getMedia();
                soma = soma + Math.abs(result);
            }
            this.setDesvioMedio(soma/valores.length);
        }

    }
    
    private void calcularAmplitude(double valores[])
    {
        this.setAmplitude(valores[valores.length-1] - valores[0]);
    }
    
    private void calcularCoeficienteVariacao()
    {
        this.setCoeficienteVariacao((this.getDesvioPadrao() / this.getMedia()) * 100);
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
